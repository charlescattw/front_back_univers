package fr.cattieuw.universite.enseignant.controller.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import fr.cattieuw.universite.enseignant.controller.IEnseignantController;
import fr.cattieuw.universite.enseignant.domain.Enseignant;
import fr.cattieuw.universite.enseignant.service.impl.EnseignantServiceImpl;

@Controller
public class EnseignantControllerImpl implements IEnseignantController {

	Logger log = LoggerFactory.getLogger(EnseignantControllerImpl.class);

	@Autowired
	EnseignantServiceImpl enseignantService;

	@Override //renvois la liste des enseignants de la base universite
	@RequestMapping("/Enseignant")
	public String getAll(Model model) {
		List<Enseignant> liste = enseignantService.findAll();
		log.info("Nombre enseignants: {}", liste.size());
		model.addAttribute("enseignants", liste);
		return "enseignant/enseignants";
	}

	@Override
	@RequestMapping("/enseignant-info")
	public String infoEnseignant (Model model, @RequestParam("id") Integer id) {
		Enseignant enseignant = enseignantService.findOne(id);
		model.addAttribute("enseignant", enseignant);
		return "enseignant/enseignant-info";

	}

	@Override
	@GetMapping("/ajouter-enseignant")
	public String ajouterEnseignant(Model model) {
		Enseignant enseignant = new Enseignant();
		model.addAttribute("enseignant", enseignant);
		return "enseignant/ajout-formulaire-ENS";
	}
	
	@Override
	@PostMapping("/valider-enseigant")
	public String validerEnseignant(Model model, @ModelAttribute Enseignant enseignant) {
	log.info("nom enseignant : {}" , enseignant.getNom_enseignant());
	System.out.println("nom enseignant : " + enseignant.getNom_enseignant());
	log.info("prenom enseignant : {}" , enseignant.getPrenom());
	//appel du service développé pour sauvegarder l'enseignant dans la bdd.
	Enseignant en = enseignantService.AjoutEnseignant(enseignant);
	
	if(en== null) {
		return "redirect:/ajouter-enseignant";
	}else  
	return "redirect:/enseignants";
	}
	
}

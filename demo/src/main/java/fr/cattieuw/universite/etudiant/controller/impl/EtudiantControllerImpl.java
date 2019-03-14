package fr.cattieuw.universite.etudiant.controller.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import fr.cattieuw.universite.enseignant.domain.Enseignant;
import fr.cattieuw.universite.etudiant.controller.IEtudiantController;
import fr.cattieuw.universite.etudiant.domain.Etudiant;
import fr.cattieuw.universite.etudiant.service.impl.EtudiantServiceImpl;

@Controller
public class EtudiantControllerImpl implements IEtudiantController {

	Logger log = LoggerFactory.getLogger(EtudiantControllerImpl.class);

	@Autowired
	EtudiantServiceImpl etudiantService;

	@Override
	@RequestMapping("/Etudiant")
	public String getAll(Model model) {
		List<Etudiant> liste = etudiantService.findAll();
		log.info("Nombre enseignants: {}", liste.size());
		model.addAttribute("etudiants", liste);
		return "etudiant/etudiants";
	}
	
	@Override
	@RequestMapping("/info-etudiant")
	public String infoEtudiant (Model model, @RequestParam("id") Integer id) {
		Enseignant etudiant = etudiantService.findOne(id);
		model.addAttribute("etudiants", etudiant);
		return "etudiant/info-etudiant";
	}

}

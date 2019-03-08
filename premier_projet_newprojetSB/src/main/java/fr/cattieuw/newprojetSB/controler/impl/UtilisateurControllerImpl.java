package fr.cattieuw.newprojetSB.controler.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import fr.cattieuw.newprojetSB.controler.IUtilisateurControllerImpl;
import fr.cattieuw.newprojetSB.domaine.Utilisateur;
import fr.cattieuw.newprojetSB.service.impl.UtilisateurServiceImpl;

@Controller
public class UtilisateurControllerImpl implements IUtilisateurControllerImpl{

	@Autowired
	UtilisateurServiceImpl utilisateurService;

	@Override
	@RequestMapping("/Utilisateur")
	public String GetUser(Model model) {
		List<Utilisateur> ListU = utilisateurService.findAllUser();
		model.addAttribute("users", ListU);
		return "Utilisateur_html";
	}

	@Override
	@RequestMapping("/utilisateur-info")
	public String infoUtilisateur(Model model, @RequestParam("id") Integer id) {

		Utilisateur user = utilisateurService.findOneuser(id);
		model.addAttribute("utilisateur", user);
		return "utilisateur-info";
	}

	@Override
	@RequestMapping("/supprimer")
	public String supprimer(Model model, @RequestParam("id") Integer id) {
		utilisateurService.supprimer(id);
		return "redirect:/Utilisateur"; 
	}

	@Override
	@GetMapping("/ajouter") //aporte une méthode Get qui appel le request mapping. Elle renvoie le formulaire.
	public String ajouterUtilisateur(Model model) {
		Utilisateur u = new Utilisateur();
		model.addAttribute("u", u);
		return "AjouterP"; 
	}

	@Override
	@PostMapping("/ajouter-pizza")
	public String ajouterUtilisateurValidation(Model model, @ModelAttribute Utilisateur u) {
		utilisateurService.AjouterUtilisateur(u);
		return "redirect:/Pizza";
	}

	@Override
	@GetMapping("/modifier")
	public String modifierForm(Model model, @RequestParam( "id" ) Integer id) {
		Utilisateur u = utilisateurService.findOneuser(id);
		model.addAttribute("u", u);
		return "modifierForm";
	}

	@Override
	@PostMapping("/validerModification")
	public String valideModification(Model model, @ModelAttribute("u") Utilisateur u) {
		utilisateurService.modifierU(u);
		return "redirect:/Utilisateur";
	}




}

package fr.cattieuw.newprojetSB.controler.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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


}

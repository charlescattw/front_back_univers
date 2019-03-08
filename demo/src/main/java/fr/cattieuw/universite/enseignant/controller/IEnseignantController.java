package fr.cattieuw.universite.enseignant.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

import fr.cattieuw.universite.enseignant.domain.Enseignant;

public interface IEnseignantController {

	public String getAll(Model model);
	public String infoEnseignant (Model model, @RequestParam("id") Integer id);
	public String ajouterEnseignant(Model model);
	public String validerEnseignant(Model model, @ModelAttribute Enseignant enseignant);
	}

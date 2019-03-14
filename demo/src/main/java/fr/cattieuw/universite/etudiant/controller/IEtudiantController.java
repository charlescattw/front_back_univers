package fr.cattieuw.universite.etudiant.controller;

import java.util.List;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;

import fr.cattieuw.universite.etudiant.domain.Etudiant;

public interface IEtudiantController {

	public List<Etudiant> findAll();
	public String infoEtudiant (Model model, @RequestParam("id") Integer id);
	
	
}

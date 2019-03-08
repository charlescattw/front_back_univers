package fr.cattieuw.newprojetSB.controler;

import org.springframework.ui.Model;

import fr.cattieuw.newprojetSB.domaine.Utilisateur;

public interface IUtilisateurControllerImpl {

	public String GetUser(Model model);
	
	public String infoUtilisateur(Model model, Integer id);

	public String supprimer(Model model, Integer id);
	
	public String ajouterUtilisateur(Model model);

	public String ajouterUtilisateurValidation(Model model, Utilisateur user);
	
	public String modifierForm(Model model, Integer id);
	
	public String valideModification(Model model, Utilisateur user);
}

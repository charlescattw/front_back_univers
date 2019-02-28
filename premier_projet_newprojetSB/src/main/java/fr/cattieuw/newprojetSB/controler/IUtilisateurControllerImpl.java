package fr.cattieuw.newprojetSB.controler;

import org.springframework.ui.Model;

public interface IUtilisateurControllerImpl {

	public String GetUser(Model model);
	
	public String infoUtilisateur(Model model, Integer id);
	
}

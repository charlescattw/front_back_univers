package fr.cattieuw.newprojetSB.service;

import java.util.List;


import fr.cattieuw.newprojetSB.domaine.Utilisateur;


public interface IUtilisateurServiceImpl {

	 public List<Utilisateur> findAllUser(); 
	
	public Utilisateur findOneuser(Integer id);
}

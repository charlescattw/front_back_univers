package fr.cattieuw.newprojetSB.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.cattieuw.newprojetSB.domaine.Utilisateur;
import fr.cattieuw.newprojetSB.repository.IRepositoryImpl;
import fr.cattieuw.newprojetSB.service.IUtilisateurServiceImpl;

@Service
public class UtilisateurServiceImpl implements IUtilisateurServiceImpl{

	@Autowired
	IRepositoryImpl repository;

	@Override
	public List<Utilisateur> findAllUser(){
		List<Utilisateur> listUserBdd = repository.findAll();
		return listUserBdd;
	}

	@Override
	public Utilisateur findOneuser(Integer id) {
		Utilisateur u = repository.findOne(id);
		return u;
	}

	@Override
	public void supprimer(Integer Id) {
		repository.delete(Id);
	}

	@Override
	public void AjouterUtilisateur(Utilisateur u) {
		repository.save(u);
	}

	@Override
	public void modifierU(Utilisateur u) {
		repository.save(u);
	}

}

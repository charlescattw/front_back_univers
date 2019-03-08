package fr.cattieuw.universite.enseignant.service;

import java.util.List;

import fr.cattieuw.universite.enseignant.domain.Enseignant;

public interface IEnseignantService {

	public List<Enseignant> findAll();
	public Enseignant findOne (Integer id);
	public Enseignant AjoutEnseignant(Enseignant enseignant);
}

package fr.cattieuw.universite.etudiant.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.cattieuw.universite.enseignant.domain.Enseignant;
import fr.cattieuw.universite.etudiant.domain.Etudiant;
import fr.cattieuw.universite.etudiant.service.IEtudiantService;

@Service
public class EtudiantServiceImpl {

	Logger log = LoggerFactory.getLogger(EtudiantServiceImpl.class);
	
	@Autowired 
	IEtudiantService etudiantService;
	
	@Override
	public List<Etudiant> findAll(){
		List<Etudiant> liste = etudiantRepository.findAll(); //vérifieL'iNE de chaque etudiant en plus de les afficher 
		for (int i = 0 ; i < liste.size(); i++) {				// si l'enseignant n'a pas de photo une image poar défaut est affectée. 
			Etudiant e = liste.get(i); 						// le but est de parcourir la liste et de faire appel au log déclaré avant @autowired
			log.info("INE de l'étudiant :{}", e.getINE() );
			if(e.getINE() == null || e.getINE().equals("") ) { //que le champ de la colonne soit null ou vide.
				liste.get(i).setINE("veuillez saisir un INE valide pour l'identifaiction du dossier");
			}
		}
		return liste; 
	}
	
	@Override
	public Enseignant findOne(Integer id) {
		Enseignant e = etudiantRepository.getOne(id); 	//la methode est bien celle du repository elle est publique
		return e;
	}
	
	@Override
	public Enseignant AjoutEnseignant(Enseignant enseignant) {
		Enseignant e = etudiantRepository.save(enseignant);
		return e;
	}
	
}

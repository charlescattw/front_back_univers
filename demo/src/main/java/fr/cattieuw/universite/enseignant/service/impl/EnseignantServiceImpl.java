package fr.cattieuw.universite.enseignant.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.cattieuw.universite.enseignant.domain.Enseignant;
import fr.cattieuw.universite.enseignant.repository.IEnseignantRepository;
import fr.cattieuw.universite.enseignant.service.IEnseignantService;

@Service
public class EnseignantServiceImpl implements IEnseignantService{


	Logger log = LoggerFactory.getLogger(EnseignantServiceImpl.class);

	@Autowired
	IEnseignantRepository enseignantRepository;

	@Override
	public List<Enseignant> findAll(){
		List<Enseignant> liste = enseignantRepository.findAll(); //vérifie l'image de chaque enseignant en plus de les afficher 
		for (int i = 0 ; i < liste.size(); i++) {				// si l'enseignant n'a pas de photo une image poar défaut est affectée. 
			Enseignant e = liste.get(i); 						// le but est de parcourir la liste et de faire appel au log déclaré avant @autowired
			log.info("Image de l'enseignant :{}", e.getPhoto() );
			if(e.getPhoto() == null || e.getPhoto().equals("") ) { //que le champ de la colonne soit null ou vide.
				liste.get(i).setPhoto("http://bibliotheque.sciencespo-lyon.fr/wp-content/uploads/2018/10/des-enseignants-de-lecture_318-28655.jpg");
			}
		}
		return liste; 
	}

	@Override
	public Enseignant findOne(Integer id) {
		Enseignant e = enseignantRepository.getOne(id); 	//la methode est bien celle du repository elle est publique
		return e;
	}
	
	@Override
	public Enseignant AjoutEnseignant(Enseignant enseignant) {
		Enseignant e = enseignantRepository.save(enseignant);
		return e;
	}

}


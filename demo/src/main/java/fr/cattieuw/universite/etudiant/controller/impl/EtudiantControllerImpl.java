package fr.cattieuw.universite.etudiant.controller.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import fr.cattieuw.universite.etudiant.controller.IEtudiantController;
import fr.cattieuw.universite.etudiant.service.impl.EtudiantServiceImpl;

@Controller
public class EtudiantControllerImpl implements IEtudiantController {

	Logger log = LoggerFactory.getLogger(EtudiantControllerImpl.class);

	@Autowired
	EtudiantServiceImpl etudiantService;

	@Override
	@RequestMapping("/Etudiant")
	public String getAll(Model model) {
		List<Etudiant> liste = etudiantService.findAll();
		
		
	}

}

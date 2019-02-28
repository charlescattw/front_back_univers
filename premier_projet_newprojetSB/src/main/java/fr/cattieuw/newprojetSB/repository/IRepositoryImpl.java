package fr.cattieuw.newprojetSB.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.cattieuw.newprojetSB.domaine.Utilisateur;

public interface IRepositoryImpl extends JpaRepository<Utilisateur, Integer> {

}

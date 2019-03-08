package fr.cattieuw.universite.etudiant.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="t_etudiant")
public class Etudiant {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	@Column
	private Integer id;
	@Column
	private String INE;
	@Column
	private String prenom_etudiant;
	@Column
	private String nom_etudiant;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getINE() {
		return INE;
	}
	public void setINE(String iNE) {
		INE = iNE;
	}
	public String getPrenom_etudiant() {
		return prenom_etudiant;
	}
	public void setPrenom_etudiant(String prenom_etudiant) {
		this.prenom_etudiant = prenom_etudiant;
	}
	public String getNom_etudiant() {
		return nom_etudiant;
	}
	public void setNom_etudiant(String nom_etudiant) {
		this.nom_etudiant = nom_etudiant;
	}
	
	
	
}

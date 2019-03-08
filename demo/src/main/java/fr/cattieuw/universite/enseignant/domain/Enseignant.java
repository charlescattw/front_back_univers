package fr.cattieuw.universite.enseignant.domain;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="t_enseignant")
public class Enseignant {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)

	@Column(name="id")
	private Integer id;

	@Column(name="numero_enseignant") //le nom des colonnes sont ceux de la base de données. respectent pas la casse. 
	private Integer numero_enseignant;

	@Column(name="nom_enseignant")
	private String nom_enseignant;

	@Column(name="prenom")
	private String prenom;

	@Column(name="date_naissance")
	private Date date_naissance;

	@Column(name="grade")
	private String grade;

	@Column(name="date_embauche")
	private Date date_embauche;

	@Column(name="photo")
	private String photo;


	public Integer getNumero_enseignant() {
		return numero_enseignant;
	}
	public void setNumero_enseignant(Integer numero_enseignant) {
		this.numero_enseignant = numero_enseignant;
	}
	public String getNom_enseignant() {
		return nom_enseignant;
	}
	public void setNom_enseignant(String nom_enseignant) {
		this.nom_enseignant = nom_enseignant;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public Date getDate_naissance() {
		return date_naissance;
	}
	public void setDate_naissance(Date date_naissance) {
		this.date_naissance = date_naissance;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public Date getDate_embauche() {
		return date_embauche;
	}
	public void setDate_embauche(Date date_embauche) {
		this.date_embauche = date_embauche;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public Integer getId() {
		return id;
	}


}
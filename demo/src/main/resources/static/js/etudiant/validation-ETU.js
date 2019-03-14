function validerLeFormulaire2() {

	//check l'INE

	let INElement = document.getElementById("INE");
	let INE = INElement.value;

	if(INE == "" || INE.length != 9){
		console.log("INE non valide");
		gradeElement.classList.add("erreur");
	}else{
		INElement.classList.remove("erreur");
	}

	//check nom
	
	let nomElement = document.getElementById("nom_etudiant");
	let nom = nomElement.value;
	if(nom === ""){
		nomElement.classList.add("erreur");
	}else{
		nomElement.classList.remove("erreur");
	}

	//check prenom
	
	let prenomBlock =
		document.getElementById("prenom_etudiant");
	let prenom = prenomBlock.value

	if(prenom === ""){
		prenomBlock.classList.add("erreur");
	}else{
		prenomBlock.classList.remove("erreur");
	}

}
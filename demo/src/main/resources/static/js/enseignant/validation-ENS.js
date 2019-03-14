function validerLeFormulaire() {
   
	   // check grade
	
	let gradeElement =
        document.getElementById("grade");
    let grade = gradeElement.value;

    if(grade == "" || grade.length > 3){
        console.log("Grade non valide");
        gradeElement.classList.add("erreur");
    }else{
    	gradeElement.classList.remove("erreur");
    }

    // check nom
    let nomElement = document.getElementById("nom");
    let nom = nomElement.value;
    if(nom === ""){
        nomElement.classList.add("erreur");
    }else{
        nomElement.classList.remove("erreur");
    }

    // check prenom
    let prenomBlock =
        document.getElementById("prenom");
    let prenom = prenomBlock.value

    if(prenom === ""){
        prenomBlock.classList.add("erreur");
    }else{
        prenomBlock.classList.remove("erreur");
    }
    
 // check numero
    let numeroBlock =
        document.getElementById("numero");
    let numero = numeroBlock.value

    if(numero === ""){
    	numeroBlock.classList.add("erreur");
    }else{
    	numeroBlock.classList.remove("erreur");
    }

    // check Photo
    
    let lesClassErreur = document.getElementsByClassName("erreur");
    console.log(lesClassErreur);
    console.log("taille du tableau" + lesClassErreur.length);
    
    if(lesClassErreur.length === 0) {
    	console.log("Envoyer le formulaire");
    	document.getElementById("formulaire1")
    }
    
}
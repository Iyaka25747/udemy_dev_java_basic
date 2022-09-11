package dev_java_basic.demo_examples;

import dev_java_basic.demo_examples.Moteur;

public class VehiculeAMoteur {
    Moteur moteur;
    int vitesse;

    int accelerer(int vitesseSupplementaire) {
        System.out.println("j accélère ...");
        this.vitesse = this.vitesse + vitesseSupplementaire;
        return this.vitesse;
    }

    Ville transporter(Passager passager, Ville villeDeDepart){
        System.out.println("Je transport un passager: "+passager.prenom + " "+ passager.nom);
        System.out.println("Le passager est parti de "+villeDeDepart.nom);
        Ville villeDeDestination = new Ville();
        villeDeDestination.nom = "Wilington";
        return villeDeDestination;
    }
}

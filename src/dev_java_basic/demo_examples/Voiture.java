package dev_java_basic.demo_examples;

public class Voiture extends VehiculeAMoteur {

    static int nbRoues=4;
    int nbPortes = 5;
    boolean automatique;
    String couleur;

    Voiture(){
        System.out.println("Une voiture est consutruite sans paramètre");
    }

    Voiture(String couleur, int nbPortes){
        this.couleur = couleur;
        this.nbPortes = nbPortes;
        System.out.println("une voiture est constuite avec la couleur");
    }


}

package dev_java_basic.demo_examples;

public class HelloWorld {
    public static void main (String... args){
        System.out.println("let s try this ...");

        Voiture voitureDeMichel = new Voiture("Jaune", 3);
        voitureDeMichel.nbPortes = 3;
        System.out.println("Nb Portes: " + voitureDeMichel.nbPortes);

        int nouvelleVitesse = voitureDeMichel.accelerer(50);
        System.out.println("La nouvelle vitesse est: "+ voitureDeMichel.vitesse);

    }
}

package ex3;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

    //TODO remplacer les 3 listes par la liste animaux
    private String nom;

    //Nouvelle Liste
    protected List<Animal> animaux;

    public Zoo(String nom) {
        this.nom = nom;
        this.animaux = new ArrayList<Animal>();
    }

    //TODO mettre en place une classe Animal
    //TODO remplacer les 3 listes par une liste<Animal>

    public void addAnimal(Animal animal) {
        animaux.add(animal);
    }


    public void afficherListeAnimaux() {
        for (int i = 0; i < animaux.size(); i++) {
            System.out.println(animaux.get(i));
        }
    }

    /**
     * Getter for nom     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * Setter     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }
}
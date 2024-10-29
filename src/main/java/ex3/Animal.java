package ex3;

/**
 * La classe Animal représente un animal du zoo avec son nom, son type et son comportement.
 */
public class Animal {
    private String nom;
    private String type;
    private String comportement;

    /**
     * Constructeur de la classe Animal.
     *
     * @param nom Le nom de l'animal
     * @param type Le type de l'animal
     * @param comportement Le comportement de l'animal
     */
    public Animal(String nom, String type, String comportement) {
        this.nom = nom;
        this.type = type;
        this.comportement = comportement;
    }

    /**
     * Getter pour le nom de l'animal.
     *
     * @return le nom de l'animal
     */
    public String getNom() {
        return nom;
    }

    /**
     * Getter pour le type de l'animal.
     *
     * @return le type de l'animal
     */
    public String getType() {
        return type;
    }

    /**
     * Getter pour le comportement de l'animal.
     *
     * @return le comportement de l'animal
     */
    public String getComportement() {
        return comportement;
    }

    /**
     * Retourne une représentation en chaîne de caractères de l'animal.
     *
     * @return une chaîne décrivant l'animal
     */
    @Override
    public String toString() {
        return nom + " " + type + " " + comportement;
    }
}

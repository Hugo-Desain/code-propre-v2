package ex1;

import java.util.Date;

/**
 * Classe représentant une entreprise avec ses attributs principaux.
 */

public class Entreprise {

    /**
     * siret : Numéro SIRET de l'entreprise.
     * nom : Nom de l'entreprise.
     * adresse : Adresse de l'entreprise.
     * dateCreation : Date de création de l'entreprise.
     */

    /** Numéro SIRET de l'entreprise*/
    public double siret;

    /** Nom de l'entreprise*/
    public String nom;

    /** Adresse de l'entreprise*/
    public String adresse;

    /** Date de création de l'entreprise*/
    public Date dateCreation;

    /** Capital maximum de l'entreprise*/
    public static final int CAPITAL_MAX = 3_000_000;

    /**
     * Getter
     *
     * @return siret
     */
    public double getSiret() {
        return siret;
    }

    /**
     * Getter
     *
     * @return nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * Getter
     *
     * @return adresse
     */
    public String getAdresse() {
        return adresse;
    }

    /**
     * Getter
     *
     * @return dateCreation
     */
    public Date getDateCreation() {
        return dateCreation;
    }

    /**
     * Constructeur de l'entreprise.
     *
     * @param siret        Numéro SIRET de l'entreprise.
     * @param nom          Nom de l'entreprise.
     * @param adresse      Adresse de l'entreprise.
     * @param dateCreation Date de création de l'entreprise.
     */
    public Entreprise(double siret, String nom, String adresse, Date dateCreation) {
        this.siret = siret;
        this.nom = nom;
        this.adresse = adresse;
        this.dateCreation = new Date(dateCreation.getTime());
    }


    /**
     * Affiche le statut de l'entreprise.
     */
    public void afficherStatut() {
        System.out.println("Entreprise : " + nom);
        System.out.println("SIRET : " + siret);
        System.out.println("Adresse : " + adresse);
        System.out.println("Date de création : " + dateCreation);
    }


    /**
     * Setter
     *
     * @param siret siret
     */
    public void setSiret(double siret) {
        this.siret = siret;
    }

    /**
     * Setter
     *
     * @param nom nom
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Setter
     *
     * @param adresse adresse
     */
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    /**
     * Setter
     *
     * @param dateCreation dateCreation
     */
    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }
}

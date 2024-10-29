package ex2;

/**
 * Représente un compte bancaire de type compte courante (type=CC) ou livret A (type=LA)
 *
 * @author DIGINAMIC
 */

public class CompteBancaire {

    /**
     * solde : solde du compte
     */
    protected double solde;

    /**
     * decouvert : un découvert est autorisé seulement pour les comptes courants
     */
    protected double decouvert;

    /**
     * Le type vaut soit CC=Compte courant, ou soit LA=Livret A
     */
    protected String type;


    /**
     * Ce constructeur est utilisé pour créer un compte bancaire
     *
     * @param type      Le type vaut soit CC=Compte courant, ou soit LA=Livret A
     * @param solde     représente le solde du compte
     * @param decouvert représente le découvert autorisé
     */
    public CompteBancaire(String type, double solde, double decouvert) {
        super();
        this.type = type;
        this.solde = solde;
        this.decouvert = decouvert;
    }


    /**
     * Ajoute un montant au solde
     *
     * @param montant : le montant à ajouter
     */
    public void ajouterMontant(double montant) {
        this.solde += montant;
    }

    /**
     * Enlève un montant au solde
     *
     * @param montant : le montant à débiter
     */
    public void debiterMontant(double montant) {
        if (type.equals("CC")) {
            if (this.solde - montant > decouvert) {
                this.solde = solde - montant;
            }
        } else if (type.equals("LA")) {
            if (this.solde - montant > 0) {
                this.solde = solde - montant;
            }
        }
    }

    /**
     * Getter solde
     *
     * @return solde
     */
    public double getSolde() {
        return solde;
    }

    /**
     * Setter
     *
     * @param solde solde
     */
    public void setSolde(double solde) {
        this.solde = solde;
    }

    /**
     * Getter decouvert
     *
     * @return decouvert
     */
    public double getDecouvert() {
        return decouvert;
    }

    /**
     * Setter
     *
     * @param decouvert decouvert
     */
    public void setDecouvert(double decouvert) {
        this.decouvert = decouvert;
    }

    /**
     * Getter type
     *
     * @return type
     */
    public String getType() {
        return type;
    }

    /**
     * Setter
     *
     * @param type type
     */
    public void setType(String type) {
        this.type = type;
    }
}

package ex2;

/**
 * Représente un compte bancaire de type livret A (type=LA)
 */
public class LivretA extends CompteBancaire {

    /**
     * tauxRemuneration : représente le taux de rémunération du livret A
     */
    private double tauxRemuneration;

    /**
     * Ce constructeur est utilisé pour créer un compte de type Livret A
     *
     * @param solde            : représente le solde du compte
     * @param tauxRemuneration : représente le taux de rémunération du livret A
     */
    public LivretA(double solde, double tauxRemuneration) {
        super("LA", solde, 0);
        this.tauxRemuneration = tauxRemuneration;
    }


    /**
     * Enlève un montant au solde
     *
     * @param montant : le montant à débiter
     */
    @Override
    public void debiterMontant(double montant) {
        if (this.solde - montant >= 0) {
            this.solde -= montant;
        }
    }

    /**
     * Applique la rémunération annuelle au solde du livret A.
     */
    public void appliquerRemunerationAnnuelle() {
        this.solde += this.solde * this.tauxRemuneration;
    }

    /**
     * Getter tauxRemuneration
     *
     * @return tauxRemuneration
     */
    public double getTauxRemuneration() {
        return tauxRemuneration;
    }

    /**
     * Setter
     *
     * @param tauxRemuneration tauxRemuneration
     */
    public void setTauxRemuneration(double tauxRemuneration) {
        this.tauxRemuneration = tauxRemuneration;
    }
}

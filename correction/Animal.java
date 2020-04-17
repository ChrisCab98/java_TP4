public abstract class Animal implements Entite {

    protected String espece;
    protected boolean aimeLeJour;

    public Animal(String pEspece, boolean pAimeLeJour) {
        espece = pEspece;
        aimeLeJour = pAimeLeJour;
    }

    public String espece() {
        return (espece);
    }

    public boolean aimeLeJour() {
        return (aimeLeJour);
    }

    public void mute() {

    }

    public String toString() {
        return ("Je suis " + espece + " j'aime le jour " + aimeLeJour);
    }

}
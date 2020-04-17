public abstract class Animal implements Entite {

    protected String mEspece;
    protected boolean mAimeLeJour;
    protected boolean mMute;

    public Animal() {
        mEspece = "undefined";
        mAimeLeJour = true;
        mMute = true;
    }

    public Animal(String pEspece, boolean pAimeLejour, boolean pMute) {
        mEspece = pEspece;
        mAimeLeJour = pAimeLejour;
        mMute = pMute;
    }

    public String espece() {
        String str = "";
        str += mEspece;
        System.out.println(mEspece);
        return str;
    }

    public boolean aimeLeJour() {
        return mAimeLeJour;
    }

    public void mute() {

    }

}
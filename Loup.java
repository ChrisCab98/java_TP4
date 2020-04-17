public class Loup extends Animal{

    public Loup(){
    }

    public Loup (String pEspece, boolean pAimeLejour, boolean pmute){
        
    }

    public String toString(){
        String str = "";
        str +="Je suis un Loup";
        return str;
    }

    public static void main (String arguments[]){
        Loup chris = new Loup();
        System.out.println(chris);
    }

}
public class ChauveSouris implements Entite{

    public ChauveSouris(){
    }

    public String espece(){
        String str="";
        str += "ChauveSouris";
        System.out.println("ChauveSouris");
        return str;
    }

    public boolean aimeLeJour(){
        return false;
    }

    public void mute(){

    }

    public String toString(){
        String str = "";
        str +="Je suis une Chauve Souris";
        return str;
    }

    public static void main (String arguments[]){
        ChauveSouris chris = new ChauveSouris();
        System.out.println(chris);
    }

}
public class Humain implements Entite {
    
    public Humain (){
    }

    public String espece(){
        String str="";
        str += "Humain";
        System.out.println("Humain");
        return str;
    }

    public boolean aimeLeJour(){
        return true;
    }

    public void mute(){

    }

    public String toString(){
        String str = "";
        str +="Je suis un Humain";
        return str;
    }

    public static void main (String arguments[]){
        Humain chris = new Humain();
        System.out.println(chris);
    }
}
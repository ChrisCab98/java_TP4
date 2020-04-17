public class TestVivant {
    public TestVivant(){

    }

    public static void main (String arguments[]){
        Entite[] tableauEntite = {new Humain(),new Loup(),new ChauveSouris(), new Loup("Loup",false,false)};

        for (int i = 0; i < tableauEntite.length; i++)
        {
            System.out.println(tableauEntite[i]);
            tableauEntite[i].mute();
            System.out.println(tableauEntite[i]);
            System.out.println("");
        }

    }

}
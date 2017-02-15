import java.util.Random;

public class NameGenerator {

    private static Random rand = new Random();

    public static void main(String[] args) {

        String Begin[] = { "Kr", "Ca", "Ra", "Mrok", "Cru",
            "Ray", "Bre", "Zed", "Drak", "Mor", "Jag", "Mer", "Jar", "Mjol",
            "Zork", "Mad", "Cry", "Zur", "Creo", "Azak", "Azur", "Rei", "Cro",
            "Mar", "Luk" };
   
        String Middle[] = { "air", "ir", "mi", "sor", "mee", "clo",
            "red", "cra", "ark", "arc", "miri", "lori", "cres", "mur", "zer",
            "marac", "zoir", "slamar", "salmar", "urak" };
   
        String End[] = { "d", "ed", "ark", "arc", "es", "er", "der",
            "tron", "med", "ure", "zur", "cred", "mur" };
   
        for (int i=0; i<50; i++) {
            System.out.println(Begin[rand.nextInt(Begin.length)] + 
                Middle[rand.nextInt(Middle.length)]+
                End[rand.nextInt(End.length)]);
        }
    }
}

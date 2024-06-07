package Controller;

import java.util.ArrayList;
import Model.Functions_DAO;

public class dataBase {
    
    public static ArrayList<dbBeaches> beaches = new ArrayList<>();
    public static ArrayList<dbRivers> rivers= new ArrayList<>();
        
    public static void Beaches() {
        beaches.add(new dbBeaches("Peruibe", "embalagens", 8.0));
        beaches.add(new dbBeaches("Copacabana", "turistas", 8.1));
        beaches.add(new dbBeaches("Jericoacoara", "restos de alimentos", 8.2));
    }
    
     public static void Rivers() {
        rivers.add(new dbRivers("Peruibe", "embalagens", 8.0));
        rivers.add(new dbRivers("Copacabana", "turistas", 8.1));
        rivers.add(new dbRivers("Jericoacoara", "restos de alimentos", 8.2));
    }
}
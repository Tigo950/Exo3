package jeu.personnage;
//m.erritali@usms.ma
public class personnage {
    private int indexOrientation;
    private static final String[] ORIENTATIONS = {"NORD", "EST", "SUD", "OUEST"};

    public personnage() {
        this.indexOrientation = 0; // Initialisation à NORD (index 0)
    }

    public String tourner(int fois) {
        // Mise à jour de l'index de l'orientation
        //indexOrientation = (indexOrientation + fois) % ORIENTATIONS.length;
        //return ORIENTATIONS[indexOrientation];
       if (fois%4==1) return "EST";
       else if (fois%4==2) return "SUD";
       else if (fois%4==3) return "OUEST";
       else if ((fois%4)==0) return "NORD";
       return null;
    }

    public String getOrientation() {
        return ORIENTATIONS[indexOrientation];
    }
}




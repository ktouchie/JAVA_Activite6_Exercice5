import java.util.*;
class Exercice5 {

	public static void main(String[] args) {
       
	}

    public static boolean jour(int j) {
        if (j<=31 && j>0) {
            return true;
        }
    }
    
    public static boolean mois(int m) {
        if (m<=12 && m>0) {
            return true;
        }        
    }
    
    public static boolean annee(int a) {
        if (a>=-10000) {
            return true;
        }
        
    }
    
    public static boolean date(int day, int month, int year) {
        
        
    }
}
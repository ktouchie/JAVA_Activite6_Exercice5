import java.util.*;
class Exercice5 {

	public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("VALIDATION D'UNE DATE");
        System.out.println("---------------------");
        
        System.out.println("Veuillez saisir un jour:");
        int x = sc.nextInt();
        
        System.out.println("Veuillez saisir un mois:");
        int y = sc.nextInt();
        
        System.out.println("Veuillez saisir une annee:");
        int z = sc.nextInt();
        
        date(x,y,z);
       
	}

    public static boolean jour(int j) {
        if (j<=31 && j>0) {
            return true;
        } else{
            return false;
        }
    }
    
    public static boolean mois(int m) {
        if (m<=12 && m>0) {
            return true;
        } else {
            return false;
        }
    }
    
    public static boolean annee(int a) {
        if (a>=-10000) {
            return true;
        } else {
            return false;
        }
    }
    
    public static void date(int day, int month, int year) {
        
        boolean valid = true;
        if (jour(day)) {
            if (mois(month)) {
                if (annee(year)) {
                    if (day>30) {
                        if (month<8) {
                            if (month%2==1) {
                                valid = true;
                            } else {
                                valid = false;
                            }
                        } else {
                            if (month%2==1) {
                                valid = false;
                            } else {
                                valid = true;
                            }
                        }
                    } else if (day==29) {
                        if (month==2) {
                            if (year%100==0) {
                                if (year%400==0) {
                                    valid = true;
                                } else {
                                    valid = false;
                                }
                            } else {
                                if (year%4==0) {
                                    valid = true;
                                } else {
                                    valid = false;
                                }
                            }
                        } else {
                            valid = true;
                        }
                    } else {
                        valid = true;
                    }
                }
            }
        }
        
        if (valid) {
            System.out.println("La date est valide.");
        } else {
            System.out.println("La date n'est pas valide.");
        }
        
    }
}

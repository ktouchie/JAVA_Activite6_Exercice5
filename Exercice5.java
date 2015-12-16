import java.util.*;
class Exercice5 {

	public static void main(String[] args) {
        
        System.out.println("Veuillez saisir un jour:");
       
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
        if (jour(day)) {
            if (mois(month)) {
                if (annee(year)) {
                    if (jour>30) {
                        if (mois<8) {
                            if (mois%2==1) {
                                valid = true;
                            } else {
                                valid = false;
                            }
                        } else {
                            if (mois%2==1) {
                                valid = false;
                            } else {
                                valid = true;
                            }
                        }
                    } else if (jour==29) {
                        if (mois==2) {
                            if (annee%100==0) {
                                if (annee%400==0) {
                                    valid = true;
                                } else {
                                    valid = false;
                                }
                            } else {
                                if (annee%4==0) {
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
        
    }
}





if (jour>31) {
            valid = false;
        } else if (jour>30) {
            if (mois<8) {
                if (mois%2==1) {
                    valid = true;
                } else {
                    valid = false;
                }
            } else {
                if (mois%2==1) {
                    valid = false;
                } else {
                    valid = true;
                }
            }
        } else if (jour==29) {
            if (mois==2) {
                if (annee%100==0) {
                    if (annee%400==0) {
                        valid = true;
                    } else {
                        valid = false;
                    }
                } else {
                    if (annee%4==0) {
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
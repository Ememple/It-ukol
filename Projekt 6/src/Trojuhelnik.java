public class Trojuhelnik {
    private int stranaA;
    private int stranaB;
    private int stranaC;

    public Trojuhelnik(int stranaA, int stranaB, int stranaC) {
        this.stranaA = stranaA;
        this.stranaB = stranaB;
        this.stranaC = stranaC;
    }

    public int getStranaA() {
        return stranaA;
    }

    public void setStranaA(int stranaA) {
        this.stranaA = stranaA;
    }

    public int getStranaB() {
        return stranaB;
    }

    public void setStranaB(int stranaB) {
        this.stranaB = stranaB;
    }

    public int getStranaC() {
        return stranaC;
    }

    public void setStranaC(int stranaC) {
        this.stranaC = stranaC;
    }

    

    public Boolean realnostTrojuhelniku() {
        boolean nevim = true;
        if (stranaA + stranaB >= stranaC)
            return nevim == true;
        else if (stranaA + stranaC >= stranaB) {
            return nevim = true;
        }
        else if (stranaB + stranaC >= stranaA) {
            return nevim = true;
        }
        else
            return nevim == false;
    }

    public String vypsaniRealnostiTrojuhelniku() {
        if (realnostTrojuhelniku() == true) {
            return "Trojuhelník lze složit";
        }
        else if(realnostTrojuhelniku()==false)
            return "Trojuhelník nelze složit";
        else return null;

    }

    public String urceniTrojuhelniku(){
        int stranaA2 = stranaA * stranaA;
        int stranaB2 = stranaB * stranaB;
        int stranaC2 = stranaC * stranaC;
        if (realnostTrojuhelniku() ==true && stranaA2 + stranaB2 == stranaC2) {
            return " a Trojuhelník je pravoúhlý";
        }
        else if (realnostTrojuhelniku() ==true && stranaA == stranaB && stranaB == stranaC) {
            return " a Trojuhelník je rovnostranný";
        }
        else if (realnostTrojuhelniku() ==true && stranaA == stranaB || stranaA == stranaC || stranaB == stranaC) {
            return " a Trojuhelník je rovnoramenný";
        }  else
            return " a není speciální";


    }




}

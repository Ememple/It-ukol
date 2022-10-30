public class Interval {

    private int spodniInterval;
    private int horniInterval;
    private int hodnotaUzivatele;


    public Interval(int spodniInterval, int horniInterval, int hodnotaUzivatele) {

        this.spodniInterval = spodniInterval;
        this.horniInterval = horniInterval;
        this.hodnotaUzivatele = hodnotaUzivatele;

    }
    public int getHodnotaUzivatele() {
        return hodnotaUzivatele;
    }

    public void setHodnotaUzivatele(int hodnotaUzivatele) {
        this.hodnotaUzivatele = hodnotaUzivatele;
    }

    public int getSpodniInterval() {
        return spodniInterval;
    }

    public void setSpodniInterval(int spodniInterval) {
        this.spodniInterval = spodniInterval;
    }

    public int getHorniInterval() {
        return horniInterval;
    }

    public void setHorniInterval(int horniInterval) {
        this.horniInterval = horniInterval;
    }

    public String kontrolaHodnotyIntervalu(){
        if (hodnotaUzivatele<spodniInterval)
            return "Hodnota neleží v intervalu";
        else if(hodnotaUzivatele>horniInterval){
            return "Hodnota neleží v intervalu";
        }
        else {
            return "Hodnota leží v intervalu";
        }

    }


    public String kontrolaIntervalu(){
        if(spodniInterval>horniInterval){
            return "Interval nelze vytvořit";
        }
        else
            return "Interval lze vytvořit";

    }




}
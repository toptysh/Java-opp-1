package czwicz24.untitled.src;

public class Drzewo {

    boolean wiecznieZielo;
    int wysokosc;
    String przekrojDrzew;

    public Drzewo(boolean wiecznieZielo, int wysokosc, String przekrojDrzew) {
        this.wiecznieZielo = wiecznieZielo;
        this.wysokosc = wysokosc;
        this.przekrojDrzew = przekrojDrzew;
    }

    public boolean isWiecznieZielo() {
        return wiecznieZielo;
    }

    public void setWiecznieZielo(boolean wiecznieZielo) {
        this.wiecznieZielo = wiecznieZielo;
    }

    public int getWysokosc() {
        return wysokosc;
    }

    public void setWysokosc(int wysokosc) {
        this.wysokosc = wysokosc;
    }

    public String getPrzekrojDrzew() {
        return przekrojDrzew;
    }

    public void setPrzekrojDrzew(String przekrojDrzew) {
        this.przekrojDrzew = przekrojDrzew;
    }

    @Override
    public String toString() {
        return "Drzewo{" +
                "wiecznieZielo=" + wiecznieZielo +
                ", wysokosc=" + wysokosc +
                ", przekrojDrzew='" + przekrojDrzew + '\'' +
                '}';
    }

    public void zerwijOwoc( ) {
        System.out.printf("Dzrewo nie owocowe");
    }


}

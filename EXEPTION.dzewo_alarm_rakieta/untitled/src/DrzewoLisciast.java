package czwicz24.untitled.src;

public class DrzewoLisciast extends Drzewo{
    int ksztaltLisc;

    public DrzewoLisciast(boolean wiecznieZielo, int wysokosc, String przekrojDrzew, int ksztaltLisc) {
        super(wiecznieZielo, wysokosc, przekrojDrzew);
        this.ksztaltLisc = ksztaltLisc;
    }

    @Override
    public String toString() {
        return "DrzewoLisciast{" +
                "wiecznieZielo=" + wiecznieZielo +
                ", wysokosc=" + wysokosc +
                ", przekrojDrzew='" + przekrojDrzew + '\'' +
                ", ksztaltLisc=" + ksztaltLisc +
                '}';
    }
}

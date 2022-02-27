package czwicz24.untitled.src;

public class DrzewoIglast extends Drzewo {

    int iloscIgiel;
    double dlugscSzysz;

    @Override
    public String toString() {
        return "DrzewoIglast{" +
                "wiecznieZielo=" + wiecznieZielo +
                ", wysokosc=" + wysokosc +
                ", przekrojDrzew='" + przekrojDrzew + '\'' +
                ", iloscIgiel=" + iloscIgiel +
                ", dlugscSzysz=" + dlugscSzysz +
                '}';
    }

    public DrzewoIglast(boolean wiecznieZielo, int wysokosc, String przekrojDrzew, int iloscIgiel, double dlugscSzysz) {
        super(wiecznieZielo, wysokosc, przekrojDrzew);
        this.iloscIgiel = iloscIgiel;
        this.dlugscSzysz = dlugscSzysz;

    }
}

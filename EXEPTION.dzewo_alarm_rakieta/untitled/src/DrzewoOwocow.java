package czwicz24.untitled.src;

public class DrzewoOwocow extends DrzewoLisciast{
    String nazwaOwoca;

    public DrzewoOwocow(boolean wiecznieZielo, int wysokosc, String przekrojDrzew, int ksztaltLisc, String nazwaOwoca) {
        super(wiecznieZielo, wysokosc, przekrojDrzew, ksztaltLisc);
        this.nazwaOwoca = nazwaOwoca;
    }

    @Override
    public String toString() {
        return "DrzewoOwocow{" +
                "wiecznieZielo=" + wiecznieZielo +
                ", wysokosc=" + wysokosc +
                ", przekrojDrzew='" + przekrojDrzew + '\'' +
                ", ksztaltLisc=" + ksztaltLisc +
                ", nazwaOwoca='" + nazwaOwoca + '\'' +
                '}';
    }

    @Override
    public void zerwijOwoc() {
        System.out.println("owoc zostal zerwany!");

    }
}

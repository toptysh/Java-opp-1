class Osoba implements Comparable<Osoba> {

    String naz;
    int wiek;

    public Osoba(String nazwisko, int wiek) {
        this.naz = nazwisko;
        this.wiek = wiek;
    }

    // porównujemy 2 obiekty this, x
    // korzystamy z compareTo(...) z klasy String
    public int compareTo(Osoba x) {
        if(naz.compareTo(x.naz) == 0) {
            return wiek - x.wiek;
        }
        return naz.compareTo(x.naz);

    }



    @Override
    public String toString() {
        return "Osoba{" +
                "nazwisko=" + naz + '\'' +
                ", wiek=" + wiek +
                '}';
    }
}
class Student extends Osoba {
    int nG;
    public Student(String nazwisko, int wiek, int numerGrupy) {
        super(nazwisko, wiek);
        this.nG = numerGrupy;
    }

    public int compareTo(Osoba x) {
        // porównujemy 2 obiekty: this, x
        // jeśli x jest typu Student to
        if(x instanceof Student){         //instanceof sprawdza, czy obiekt jest instancją określonego typu
            if(super.compareTo(x) == 0) {
                return nG - ((Student) x).nG;
            }
           return super.compareTo(x);
        } else
            return super.compareTo(x);
        }

    @Override
    public String toString() {
        return "Student{" +
                "nazwisko=" + naz + '\'' +
                ", wiek=" + wiek +
                ", numerGrupy=" + nG +
                '}';
    }
}
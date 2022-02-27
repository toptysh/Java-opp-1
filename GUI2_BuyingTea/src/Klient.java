import java.util.List;

public class Klient {
    String Name;
    int stanKonta;
    ListaZakupow listik = new ListaZakupow();       //tworzymy nowy list zakupow
    Cennik cennik = Cennik.pobierzCennik();     //wywołanie singletona
    Koszyk koszyk;

    public Klient(String Name, int stanKonta) {
        this.Name = Name;
        this.stanKonta = stanKonta;
    }


    public void dodaj(Herbata udod) {
        listik.nat.add(udod);       //dodajemy do listy zakupów
    }

    public ListaZakupow pobierzListeZakupow() {
        return listik;
    }

    public void przepakuj(Koszyk koszykHerbala) {
        int i = 0;
        List<Herbata> natoptysh = listik.nat;
        //sprawdza, czy dany produkt znajduje się w cenniku
        for (Herbata a : natoptysh) {
            //jeżeli cena większa od zera, wtedy dodajemy do koszyka
            if (cennik.smakCenaZaKg.get(a.smak) > 0) {
                koszykHerbala.koszyk.add(a);
            } else {
                i++;

            }


        }
    }

    public int getStanKonta() {               //zwraca  ilość pieniędzy na koncie klienta
        return stanKonta;
    }

/* public void zaplac(String przelew) {
        double sum = 0;
        for (var a : koszyk.herbatalist) {
            sum += HerbalTest.wartosc(koszyk, a.smak);

        }
        //jesli pieniądze klienta na koncie po zakupach są mniejsze niz 0, to usuwamy po 0,5 kg od ostatniego produktu
          if (stanKonta - sum<0){

          }

          else {
              stanKonta -= sum;
              koszyk.herbataList.clear();
          }*/

    public Koszyk pobierzKoszyk() {
        return koszyk;
    }

}

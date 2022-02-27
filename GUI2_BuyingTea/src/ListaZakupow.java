import java.util.ArrayList;
import java.util.List;

public class ListaZakupow {


    List<Herbata> nat = new ArrayList<>();  //tworzymy nowy list zakupow
    String s = "\n";
    Cennik cennik = Cennik.pobierzCennik();         //wywołanie singletona




    @Override
    public String toString() {
        for (Herbata a : nat) {
            if (cennik.smakCenaZaKg.get(a.smak) == null) {   //jeśli smaku nie ma w cenniku,
                cennik.smakCenaZaKg.put(a.smak, -1);         //to cena ma przypisaną wartość -1
            }
            s += a.nameHerb + ", smak: "+a.smak +", ilość "+ a.kg+ ", cena: " + cennik.smakCenaZaKg.get(a.smak) + ", \n";  //wyświetla listę zakupów

        }

        return s;
    }

}


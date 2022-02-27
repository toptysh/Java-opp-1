import java.util.ArrayList;
import java.util.List;

public class Koszyk {


    List<Herbata> koszyk = new ArrayList<>();        //tworzymy nowy list
    String s = " ";
    Cennik cennik = Cennik.pobierzCennik();      //wywołanie singletona


    @Override
    public String toString() {
        for (Herbata a : koszyk) {
            s += "smak: "+a.smak +" ilość "+ a.kg+ ", cena: " + cennik.smakCenaZaKg.get(a.smak) + ", \n";   //wyświetla koszyk klienta

        }

        return  s;
    }


    public Koszyk(Klient herbal) {
    }

}



import java.util.HashMap;
import java.util.Map;

public class Cennik {                                                                                                    //klasa singleton
    private static Cennik s;
    String color;
    String taste;
    int cen1;
    int sales;
    int kg;

    Map<String, Integer> smakCenaZaKg = new HashMap<>();

    public void dodaj(String color, String taste, int cen1, int sales, int kg) { //sales- dla herbaty, która ma zniżkę
        this.color = color;
        this.taste = taste;
        this.cen1 = cen1;
        this.sales = sales;
        this.kg = kg;
        smakCenaZaKg.put(taste, cen1);
    }

    public void dodaj(String color, String taste, int cen1) {
        this.color = color;
        this.taste = taste;
        this.cen1 = cen1;
        smakCenaZaKg.put(taste, cen1);

    }


    public static Cennik pobierzCennik() {
        if (s == null) {
            s = new Cennik();
        }
        return s;
    }


}


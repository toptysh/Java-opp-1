package czwicz24.untitled.src;

public class Test {
    public static void main(String[] args) throws Exception {


        Drzewo[] tab = new Drzewo[4];

        tab[0] = new Drzewo(true, 5, "r");
        tab[1] = new DrzewoIglast(false, 2, "r2", 5, 5.7);
        tab[2] = new DrzewoLisciast(true, 4, "r3", 7);
        tab[3] = new DrzewoOwocow(false, 1, "r4", 5, "jablko");



     /*   for(Drzewo d: tab){
            System.out.printf(d);
        }*/
        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i].toString()+ " ");
            tab[i].zerwijOwoc();
            System.out.println();
        }


        try {
            metoda(tab, 0);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("=================================");

        DetektorDymu d =new DetektorDymu();
        d.sprawdz(false);

        System.out.println("=================================");

        Rakieta rakieta = new Rakieta("temp");
        System.out.println("waga poliwy - " +rakieta.zatankuj());
        rakieta.start();
    }


    public static void metoda(Drzewo[] tab, int i) throws DrzewoBezOwocoweExcrption {
        if (i >= tab.length)
            throw new DrzewoBezOwocoweExcrption("Dzrewo nie ma owocow");
    }

}

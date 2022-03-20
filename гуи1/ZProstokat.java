package гуи1;

public class ZProstokat {
    private int wysokosc, szerokosc;

    private char x;
    private char o;

    private static int prostCount = 1;
    private static int kwCount = 1;

    private int num;
 


    public ZProstokat(int wysokosc, int szerokosc, char x, char o) {
        this.wysokosc =wysokosc;
        this.szerokosc = szerokosc;
        this.x = x;
        this.o = o;
        if (szerokosc == wysokosc) {
            num = kwCount++;
        } else{
            num = prostCount++;
        }

    }

    public ZProstokat(int wysokosc, char x, char o) {
        this(wysokosc, wysokosc, x, o);
        //   System.out.println("Kwadrat (" + num + ") rozmiaru " + wysokosc + "x" + szerokosc);
    }


    public void rysuj() throws ZProstokatException {
        if (szerokosc == 1 && wysokosc == 1) {
            throw new ZProstokatException("Bledny prostokat");

        } else if (wysokosc != szerokosc) {
            System.out.println("Prostokąt (" + num + ") rozmiaru " + wysokosc + "x" + szerokosc);//+", "+x +"= "+", "+o+"= "
        } else {
            System.out.println("Kwadrat (" + num + ") rozmiaru " + wysokosc + "x" + szerokosc);

        }


        for (int i = 0; i < wysokosc; i++) {
            if (i == 0 || i + 1 == szerokosc || i + 1 == wysokosc) {
                for (int j = 0; (j < szerokosc && i == 0) || (j < szerokosc && i + 1 == wysokosc) || (j < szerokosc && i + 1 == wysokosc); j++)
                    System.out.print(x);
                System.out.println();
            } else {
                for (int j = 0; j < szerokosc; j++) {
                    if (j == 0 || j + 1 == szerokosc)
                        System.out.print(x);
                    else {
                        System.out.print(o);
                    }
                }
                System.out.println();
            }

        }
        System.out.println();
    }
}


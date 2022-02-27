package czwicz22;


//ровень доступа protected позволяет использовать методы только в наследуемых классах
// super - указывает в методе наследуемого класса на поля, класс которых стоит выше
public class Test {

    public static void main(String[] args) {

        Prostokat prostokat = new Prostokat(4, 7);
        prostokat.pole();
        prostokat.show();
        System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");

        Prostopadloscian pr = new Prostopadloscian(9, 5, 4);
        pr.obj();
        pr.show();
        System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");

        Trojkat trojkat = new Trojkat(8,4);
        trojkat.show();
        System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");

        Ostroslup os = new Ostroslup(8,4,5);
        os.show();
        System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");



    }


}

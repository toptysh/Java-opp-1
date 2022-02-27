package czwicz22;

public class Trojkat {
    private  int bok, pods;


    public Trojkat(int bok, int pods) {
        this.bok = bok;
        this.pods = pods;
    }

    public int pole(){
        return (pods*bok)/2;
    }

    public void show(){
        System.out.println("bok = "+bok+", "+ "podstawa = "+pods);
        System.out.println("Pole powierzchni Trojkąta = "+pole());
    }
}

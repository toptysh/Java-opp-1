package czwicz22;

public class Prostokat {

    private int sz, dl;

    public Prostokat(int sz, int dl) {
        this.sz = sz;
        this.dl = dl;
    }

    protected  int pole(){
        return sz*dl;
    }

    public void show(){
        System.out.println("szerokość = "+sz+", długość = "+dl);
    }

    @Override
    public String toString() {
        return "Prostokąt{" +
                "sz=" + sz +
                ", dl=" + dl +
                '}';
    }
}

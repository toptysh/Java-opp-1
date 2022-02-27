package czwicz22;

public class Prostopadloscian extends Prostokat{

    private int wys;
    public Prostopadloscian(int sz, int dl, int wys) {
        super(sz, dl);
        this.wys = wys;
    }

    public int obj(){
       return super.pole()*this.wys;
    }


    public void  show() {
        super.show();
        System.out.println("wysokość = "+wys);
    }
}

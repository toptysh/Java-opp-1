package czwicz22;

public class Ostroslup extends Trojkat{
private int wys;
    public Ostroslup(int bok, int pods, int wys) {
        super(bok, pods);
        this.wys = wys;
    }


    public int PPod(){
        return super.pole();
    }

    public int polePowierzchni(){
        return PPod()*wys;
    }


    public void show(){
        super.show();
        System.out.println("wysokość = "+wys);
        System.out.println("pole Powierzchni = "+polePowierzchni());
    }

}

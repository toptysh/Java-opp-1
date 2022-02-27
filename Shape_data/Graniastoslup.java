package czwicz22;

public class Graniastoslup extends  Ostroslup {

    public Graniastoslup(int bok, int pods, int wys) {
        super(bok, pods, wys);
    }

    public int obj(){
        return super.polePowierzchni();
    }
}

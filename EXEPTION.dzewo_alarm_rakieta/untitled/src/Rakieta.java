package czwicz24.untitled.src;

public class Rakieta {

    String nazwa;
    int wagaPaliwa;

    public Rakieta(String nazwa) {
        this.nazwa = nazwa;

    }

    public int zatankuj(){
        int k = (int) ((int)100+ (Math.random()*(90000+100)-100));
        wagaPaliwa = k;
     return wagaPaliwa;
    }

    public void start() throws Exception{
        if(wagaPaliwa >=5000) {
            System.out.println("start!");
        }else {
            throw new Exception("start anulowany - za mało paliwa");
        }
    }
}

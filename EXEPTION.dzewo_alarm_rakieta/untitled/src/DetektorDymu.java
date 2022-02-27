package czwicz24.untitled.src;

public class DetektorDymu {
    boolean czyJestSym;

    public DetektorDymu() {

    }

    public void sprawdz(boolean czyJestSym) throws Alarm{
        if (czyJestSym == true){
            throw new Alarm("Dym jest");
        } else {
            System.out.println("porzaru nie ma");
        }
    }
}

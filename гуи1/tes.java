package гуи1;

public class tes {
    public static void main(String[] args) {


        int szerokosc = 8;
        int wysokosc = 3;
        char x = 'x';
        char o = 'o';
        for (int i = 0; i < wysokosc; i++) {
 if (i ==0|| i+1 == szerokosc || i+1 ==wysokosc){
     for (int j =0; (j < szerokosc && i == 0) || (j < szerokosc && i + 1 == wysokosc) || (j < szerokosc && i + 1== wysokosc); j++)
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
    }
    }






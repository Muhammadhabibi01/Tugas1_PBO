/*
Nim  : 13020220117
Nama : Muh. Habibi
Jumat, 08/03/2024
 */
import java.util.Scanner;
public class PrintIterasi {
    public static void main(String[] args){
        int N;
        int i;
        Scanner masukan=new Scanner(System.in);

        System.out.print ("Nilai N >0 = ");
        N = masukan.nextInt();
        i = 1;

        System.out.print ("Print i dengan ITERATE : \n");
        for (;;){
            System.out.println(i); /* Proses */
            if (i == N)
                /* Kondisi Berhenti */ break;
            else {
                i++; /* Next Elmt */
            }
        }
    }
}

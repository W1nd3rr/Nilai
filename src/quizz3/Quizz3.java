
package quizz3;

import java.util.Scanner;

public class Quizz3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nilai;
        Scanner input = new Scanner (System.in);
        System.out.print("Masukkan nilai Anda : ");
        nilai = input.nextInt();
        if ( nilai >= 80 && nilai <= 100)
        {
            System.out.println(" Nilai A ");
        }
        else if (nilai >= 70 && nilai <= 79)
        {
            System.out.println(" Nilai B ");
        }
        else if (nilai >= 60 && nilai <= 69)
        {
            System.out.println(" Nilai C ");
        }
        else if (nilai >= 50 && nilai <= 59)
        {
            System.out.println(" Nilai D ");
        } 
        else if (nilai > 0 && nilai < 50 )
        {
            System.out.println(" Nilai E ");
        }
        else
        {
            System.out.println("Maaf Inputan Anda Salah ");
        }
    }
    
}

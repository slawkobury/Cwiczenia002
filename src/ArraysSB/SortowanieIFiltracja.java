package ArraysSB;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SortowanieIFiltracja {

    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj ilosc parametrow w twojej tablicy: ");
        int wielkoscTablicy= scanner.nextInt();

        int[] tablica = new int[wielkoscTablicy];
        ArrayList<Integer>  mniejszeOd50 = new ArrayList<>();
        ArrayList<Integer>  wiekszeRowne50 = new ArrayList<>();

        System.out.print("Oto twoja Tablica PRZED SORTOWANIEM : [" );
        for (int i = 0; i < wielkoscTablicy; i++) {
            tablica[i] = random.nextInt(100)+1;
            System.out.print(tablica[i]);
            if (i< wielkoscTablicy-1){
                System.out.print(", ");
            } else {
                System.out.print("]");
            }

            // Filtrowanie liczb mniejszych niż 50
            if (tablica[i]< 50){
                mniejszeOd50.add(tablica[i]);
            }else{
                wiekszeRowne50.add(tablica[i]);
            }

        }

        Arrays.sort(tablica);

        System.out.println("\nNowa posortowana tablica to: "+ Arrays.toString(tablica));

        System.out.println("\nA to lista wartosci mniejszych od 50: " + mniejszeOd50);

        System.out.println("\nA tu pozostale cyfrz wieksze lub rowne 50: " + wiekszeRowne50);




    }


}

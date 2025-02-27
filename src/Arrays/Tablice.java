package Arrays;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

//Zadanie 1: Stwórz tablicę 20 liczb całkowitych, wypełnij ją losowymi liczbami z zakresu 1–50 i wypisz liczby większe niż 25.
//Zadanie 2: Zrealizuj program, który oblicza średnią wartość liczb w tablicy.


public class Tablice {

    public static void main(String[] args) {

        int wielkoscTablicy;
        int sumaInt=0;
        Double srednia;
        Random random = new Random();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wielkosc tablicy: ");
        wielkoscTablicy = scanner.nextInt();

        int[] tablica = new int[wielkoscTablicy];
        ArrayList<Integer> wieksze25 = new ArrayList<>();
        ArrayList<Integer> mniejszeRowne25 = new ArrayList<>();



        System.out.print("Tablica: ");
        for (int i = 0; i < wielkoscTablicy; i++) {
            tablica[i] = random.nextInt(50)+1;
            sumaInt += tablica[i];

            System.out.print(tablica[i]+  " ");

            if (tablica[i]>25){
                wieksze25.add(tablica[i]);
            }else {
                mniejszeRowne25.add(tablica[i]);
            }


        }
        double sumaDouble = sumaInt;
        System.out.println();
        System.out.println("\nWylosowane liczby wieksze od 25 to: "+ wieksze25);
        System.out.println();
        System.out.println("Wylosowane liczby mniejsze i rowne  od 25 to: "+ mniejszeRowne25);


        System.out.println("Suma to: "+sumaInt);
        System.out.println("\nsrednia wartosc wylosowanych liczb to: "+ sumaDouble / wielkoscTablicy);






    }
}

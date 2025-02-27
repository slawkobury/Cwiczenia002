package ArraysSB;

import java.util.Random;
import java.util.Scanner;

// Zadanie 3: Napisz program, który tworzy tablicę 10 liczb, a następnie przesuwa wszystkie elementy o jedno miejsce w lewo
// (elementy na początku tablicy przesuwają się na koniec).
public class Tablica10 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int wielkoscTablicy;
        System.out.println("Podaj wielkosc tablicy: ");
        wielkoscTablicy = scanner.nextInt();  // tak sobie wymyslilem
        int[] tablica = new int[wielkoscTablicy];
        int i;

        System.out.print("Utworzono tablice: \t[");
        for (i = 0; i < wielkoscTablicy; i++) {
            tablica[i] = random.nextInt(50) + 1;
            System.out.print(tablica[i]);
            if (i < wielkoscTablicy - 1)
                System.out.print(", ");
            else System.out.print("]");
        }

        int[] nowaTablica = new int[wielkoscTablicy];
        int pierwszyElement = tablica[0];


        System.out.print("\nNowa Tablica to: \t[");
        for (int j = 0; j < wielkoscTablicy-1; j++) {

            tablica[j] = tablica[j + 1];
            System.out.print(tablica[j]);
            if (j < wielkoscTablicy-1) {
                System.out.print(", ");


            }
        }System.out.print(pierwszyElement + "]");

    }


}



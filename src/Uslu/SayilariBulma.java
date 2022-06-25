package Uslu;

import java.util.Scanner;

public class SayilariBulma {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int sayi;

        System.out.print("Lutfen bir sayi giriniz: ");
        sayi = input.nextInt();

        for (int i = 1; i<sayi; i*=4) {
            System.out.print(i + "--");
        }
        System.out.println();
        for (int k = 1; k<sayi; k*=5) {
            System.out.print(k + "--");
        }
    }
}

package Algoritma;

import java.util.Scanner;

public class luaspersegi {
    private static Scanner input;

    public static void main(String[] args) {
        int p,l,luas;
        input = new Scanner(System.in);

        System.out.printf("Nilai Panjang\t= ");
        p = input.nextInt();
        System.out.printf("Nilai Lebar\t= ");
        l = input.nextInt();
        luas = p*l;
        System.out.println("Nilai Luas Persegi = " +luas);
    }
}

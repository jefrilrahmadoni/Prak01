package Algoritma;

import java.util.Scanner;

public class luaspersegi {
    public static void main(String[] args) {
        int p,l,luas;
        Scanner input = new Scanner (System.in);
        
        System.out.printf("Input nilai Panjang\t= ");
        p = input.nextInt();
        System.out.printf("Input nilai Lebar\t= ");
        l = input.nextInt();
        luas = p*l;
        System.out.println("Luas Persegi\t\t= " +luas);
    }
}

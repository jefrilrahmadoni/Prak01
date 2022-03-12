package Stack;

import java.util.Scanner;
import java.util.Stack;

public class Belajar_stack {
    public static void main(String[] args) {
        Integer angka;
        int i=0;
        boolean bool = true;

        Stack<Integer> tumpukan = new Stack<Integer>(); //deklarasi stack
        
        Scanner pilih = new Scanner(System.in);

        System.out.println("BELAJAR STACK");
        System.out.println("-------------");

        do{
            System.out.println("1. PUSH");
            System.out.println("2. POP");
            System.out.println("3. Elemen Paling Atas");
            System.out.println("4. Posisi Angka");
            System.out.println("5. Apakah Stack Kosong? ");
            System.out.println("6. Tampilkan Stack");
            System.out.println("7. Selesai");
            System.out.print("MASUKAN PILIHAN [1-7]: ");
            int input=pilih.nextInt();
            switch(input){
                case 1:
                    System.out.print("Banyak data yang akan di PUSH: ");
                    i=0;
                    int h=pilih.nextInt();
                    do{
                        System.out.print("Masukan angka: ");
                        angka=pilih.nextInt();
                        tumpukan.push(angka);
                        i++;
                    }
                    while(i<h);
                    System.out.println("Stack: "+tumpukan);
                    System.out.println("");
                    break;

                case 2:
                    System.out.println("Ambil elemen paling atas: "+tumpukan.pop());
                    System.out.println("");
                    break;

                case 3:
                    System.out.println("Elemen paling atas sekarang: "+tumpukan.peek());
                    System.out.println("");
                    break;

                case 4:
                    System.out.print("Angka yang dicari: ");
                    int cariangka = pilih.nextInt();
                    if (tumpukan.search(cariangka)==-1){
                        System.out.println("Angka "+cariangka+" tidak ada pada stack");
                    } else{
                        System.out.println("Posisi: "+tumpukan.search(cariangka));
                    }
                    System.out.println("");
                    break;

                case 5:
                    System.out.println("Apakah Stack kosong? "+tumpukan.isEmpty());
                    System.out.println("");
                    break;

                case 6:
                    System.out.println("Stack: "+tumpukan);
                    System.out.println("");
                    break;

                case 7:
                    System.exit(0);
                    break;
                
                default:
                System.err.println("Pilihan tidak tersedia!");
                System.out.println("");
            }
        }
        while(bool);
    }
}

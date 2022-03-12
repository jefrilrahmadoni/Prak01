package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Belajar_queue {
    public static void main(String[] args) {
        Integer angka;
        int i=0;
        boolean bool = true;

        Queue<Integer> antrian = new LinkedList<>(); //deklarasi queue
        
        Scanner pilih = new Scanner(System.in);

        System.out.println("BELAJAR QUEUE");
        System.out.println("-------------");

        do{
            System.out.println("1. ENQUEUE");
            System.out.println("2. DEQUEUE");
            System.out.println("3. Elemen Paling Depan/Awal");
            System.out.println("4. Apakah Queue kosong? ");
            System.out.println("5. Tampilkan Queue");
            System.out.println("6. Selesai");
            System.out.print("MASUKAN PILIHAN [1-6]: ");
            int input=pilih.nextInt();
            switch(input){
                case 1:
                    System.out.print("Banyak data yang akan di ENQUEUE: ");
                    i=0;
                    int h=pilih.nextInt();
                    do{
                        System.out.print("Masukan angka: ");
                        angka=pilih.nextInt();
                        antrian.add(angka);
                        i++;
                    }
                    while(i<h);
                    System.out.println("Queue: "+antrian);
                    System.out.println("");
                    break;

                case 2:
                    System.out.println("Ambil elemen: "+antrian.poll()); //bisa menggunakan method poll()
                    System.out.println("");
                    break;

                case 3:
                    System.out.println("Elemen paling awal/depan: "+antrian.peek()); //bisa menggunakan method element()
                    System.out.println("");
                    break;

               case 4:
                    System.out.println("Apakah Stack kosong? "+antrian.isEmpty());
                    System.out.println("");
                    break;

                case 5:
                    System.out.println("Queue: "+antrian);
                    System.out.println("");
                    break;

                case 6:
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

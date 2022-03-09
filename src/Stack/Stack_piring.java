package Stack;

import java.util.Stack;

public class Stack_piring {
    public static void main(String[] args) {
        
        Stack kotor = new Stack(); //deklarasi objek stack kotor
        Stack bersih = new Stack(); //deklarasi objek stack bersih

        for (int i = 1; i <= 5; i++) //perulangan for
        {
            kotor.push("piring " + i); //proses memasukkan data pada stack
        }

        //menampilkan jumlah piring kotor
        System.out.println("SEBELUM DICUCI"); 
        System.out.println("Jumlah piring kotor\t: " + kotor.size()); 
        System.out.println("Jumlah piring bersih\t: " + bersih.size()); 
        System.out.println("Tumpukan piring kotor\t:");

        for (int i = 1; i <= 5; i++) //perulangan for
        {
            System.out.println(kotor.peek());
            bersih.push(kotor.pop()); //proses pengeluaran data pada stack
        }

        //menampilkan jumlah piring bersih dan piring yang telah dicuci
        System.out.println("\nSETELAH DICUCI"); 
        System.out.println("Jumlah piring kotor\t: " + kotor.size());
        System.out.println("Jumlah piring bersih\t: " + bersih.size());
        System.out.println("Tumpukan piring bersih\t:"); 
        for (int i = 4; i >= 0; i--)
        {
            System.out.println(bersih.elementAt(i));
        }
    }
}

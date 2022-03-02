package Linked_List;

import java.util.LinkedList;

public class linked_list {
    public static void main(String[] args) {

        //create linkedlist
        LinkedList <Integer> elemen = new LinkedList<>();
        LinkedList <Integer> data = new LinkedList<>();
        elemen.add(10);
        elemen.add(20);
        elemen.add(30);
        elemen.add(40);
        elemen.add(50);
        System.out.println("output tambah\t:"+elemen+", Ukuran :" +elemen.size());
        
        //add linkedlist
        elemen.addFirst(9);   
        elemen.addLast(60);
        System.out.println("output tambah\t:"+elemen+", Ukuran :" +elemen.size());

        data.add(55);
        data.add(55);
        elemen.addAll(data);
        System.out.println("output tambah\t:"+elemen+", Ukuran :" +elemen.size());
        
        //set linkedlist / sisip
        elemen.set(0,11);
        elemen.set(6,80);
        System.out.println("output sisip\t:"+elemen+", Ukuran :" +elemen.size());
        
        //delete linked list
        elemen.removeFirst();
        elemen.removeLast();
        System.out.println("output hapus\t:"+elemen+", Ukuran :" +elemen.size());
        
        elemen.remove(3);
        System.out.println("output hapus\t:"+elemen+", Ukuran :" +elemen.size());

        //is Empty
        System.out.println("Is List empty?\t " +elemen.isEmpty());
        elemen.clear();
    }
}

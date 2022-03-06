package Array;

import java.util.ArrayList;

public class arraylist {
    public static void main(String[] args) {
        String nama[] = {"J","R","","D","O","N","I"};
        ArrayList<String> nama1 = new ArrayList<String>();
        nama1.add("J");
        nama1.add("E");
        nama1.add("F");
        nama1.add("R");
        nama1.add("I");
        nama1.add("L");
        nama1.add("");
        nama1.add("R");
        
        //1. isEmpty()
        System.out.println("HASIL DARI 'isEmpty()'");
        System.out.println("--------------------");
        System.out.println(nama[0].isEmpty());
        System.out.println(nama[1].isEmpty());
        System.out.println(nama[2].isEmpty());
        System.out.println(nama[3].isEmpty());
        
        //2. size() 
        System.out.println("\nHASIL DARI 'size()'");
        System.out.println("--------------------");
        //cara 1
        System.out.println("Size array is " +nama.length+ " (arrayname \"nama\")");
        //cara 2
        System.out.println("Size array is " +nama1.size()+ " (arrayname: nama1)\n");

        //3. get()
        System.out.println("\nHASIL DARI 'get()'");
        System.out.println("--------------------");
        System.out.println("Get index 0 : "+nama1.get(0));
        System.out.println("Get index 2 : "+nama1.get(2));
        System.out.println("Get index 6 : "+nama1.get(6));
        //System.out.println("Get index -3 : "+nama1.get(-3));

        //4. indexOf()
        System.out.println("\nHASIL DARI 'indexOf()'");
        System.out.println("------------------------");
        System.out.println("Karakter E merupakan index ke "+nama1.indexOf("E"));
        System.out.println("Karakter A merupakan index ke "+nama1.indexOf("A"));
        System.out.println("Karakter I merupakan index ke "+nama1.indexOf("I"));
        System.out.println("Karakter L merupakan index ke "+nama1.indexOf("L"));

        //5. remove()
        System.out.println("\nHASIL DARI 'remove()'");
        System.out.println("------------------------");
        System.out.println(nama1);
        System.out.println("Size array is " +nama1.size());
        System.out.println("Remove index [5]" +nama1.remove(5));
        System.out.println("Remove index [6]" +nama1.remove(6));
        System.out.println("Remove index [4]" +nama1.remove(4));
        System.out.println(nama1);
        System.out.println("Size array after remove is " +nama1.size());
        
        //6. add()
        nama1.add(0,"D");
        nama1.add(1,"r");
        nama1.add(2,".");
        nama1.add(7,"I");
        nama1.add(8,"L");
        //nama1.add(-3,"J");
        System.out.println("");
        System.out.println(nama1);
    }
}

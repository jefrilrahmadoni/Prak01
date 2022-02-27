package Array;

public class array1d {
    public static void main(String[] args) {
        //cara 1 untuk array 1 dimensi
        int []x;
        x = new int[3];
        x[0]=10;
        x[1]=20;
        x[2]=30;
        System.out.println("Nilai x[0] = "+x[0]);
        System.out.println("Nilai x[1] = "+x[1]);
        System.out.println("Nilai x[2] = "+x[2]);
        
        //cara 2 untuk array 1 dimensi
        int []y = new int [3];
        y[0]=10;
        y[1]=20;
        y[2]=30;
        System.out.println("\nNilai y[0] = "+y[0]);
        System.out.println("Nilai y[1] = "+y[1]);
        System.out.println("Nilai y[2] = "+y[2]);

        // //cara 3 untuk array 1 dimensi
        int[] z = {10,20,30};
        System.out.println("\nNilai z[0] = "+z[0]);
        System.out.println("Nilai z[1] = "+z[1]);
        System.out.println("Nilai z[2] = "+z[2]);
    }
}

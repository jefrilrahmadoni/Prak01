package Array;

public class array2d {
    public static void main(String[] args) {
        //cara 1 untuk dimensi 2
        // int[][] x;
        // x = new int[3][3];
        // x[0][0]=10;
        // x[0][1]=20;
        // x[0][2]=30;
        // x[1][0]=40;
        // x[1][1]=50;
        // x[1][2]=60;
        // x[2][0]=70;
        // x[2][1]=80;
        // x[2][2]=90;
        // System.out.println("Nilai x[0] : " +x[0][0]);
        // System.out.println("Nilai x[0] : " +x[0][1]);
        // System.out.println("Nilai x[0] : " +x[0][2]);
        // System.out.println("Nilai x[1] : " +x[1][0]);
        // System.out.println("Nilai x[1] : " +x[1][1]);
        // System.out.println("Nilai x[1] : " +x[1][2]);
        // System.out.println("Nilai x[2] : " +x[2][0]);
        // System.out.println("Nilai x[2] : " +x[2][1]);
        // System.out.println("Nilai x[2] : " +x[2][2]);

        //cara 2 untuk dimensi 2
        int[][] x = {{10,20,30},{40,50,60},{70,80,90}};
        System.out.println("Nilai x[0] : " +x[0][0]);
        System.out.println("Nilai x[0] : " +x[0][1]);
        System.out.println("Nilai x[0] : " +x[0][2]);
        System.out.println("Nilai x[1] : " +x[1][0]);
        System.out.println("Nilai x[1] : " +x[1][1]);
        System.out.println("Nilai x[1] : " +x[1][2]);
        System.out.println("Nilai x[2] : " +x[2][0]);
        System.out.println("Nilai x[2] : " +x[2][1]);
        System.out.println("Nilai x[2] : " +x[2][2]);
    }
}

package EssentialClasses.io$nio;

import java.util.Arrays;

public class g {
    public static void main(String[] args) {
        int[][] arr = new int[2][2];
        System.out.println("array lenght: " + arr.length);
        for (int a=0; a<arr.length; a++){
            System.out.println("a: "+a);
            for (int b =0; b<arr.length; b++){
                System.out.println("b: " + b);
                arr[a][b] = b;
            }
        }
        System.out.println(Arrays.deepToString(arr));
    }
}

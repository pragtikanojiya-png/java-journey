import javax.print.DocFlavor;
import java.util.Scanner;
/*
public class Array2DPractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int arr[][]=new int[5][3];
        for(int i=0;i<5;i++){
            for(int j=0;j<3;j++){
                arr[i][j]=input.nextInt();
            }
        }
        for(int i=0;i<5;i++){
            for(int j=0;j<3;j++){
                System.out.print(arr[i][j]+" ");
            }
        }
    }
}
*/
/*
public class Array2DPractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int arr[][] = new int[5][3];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = input.nextInt();
            }
        }
        System.out.print("the sum of array  elemnts are : ");
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                sum += arr[i][j];
            }
        }
        System.out.println(sum);
    }
}
*/
/*
public class Array2DPractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int arr[][] = new int[5][3];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = input.nextInt();
            }
        }
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                sum += arr[i][j];
            }
            System.out.println("sum of row" + i + " " + sum);
            sum = 0;
        }
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 3; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}*/

public class Array2DPractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int arr[][] = new int[5][3];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = input.nextInt();
            }
        }
        boolean found = false;
        System.out.println("enter number to be searched");
        int x = input.nextInt();
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                if (arr[i][j] == x) {
                    found = true;
                    break;
                }
            }
        }
        if (found == true) {
            System.out.println("found");
        } else {
            System.out.println("not found");
        }
    }
}
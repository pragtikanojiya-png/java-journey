import java.util.Scanner;
/*
public class ArrayPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        System.out.println("Enter 5 numbers in an array");

        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("The array elements are:");

        for (int i = 0; i < 5; i++) {
            System.out.println(arr[i]);
        }
    }
}

*/
/*
public class ArrayPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter 5 numbers in an array");
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();

        }
        int sum = 0;
        for (int i = 0; i < 5; i++) {
        sum+=arr[i];
        }
        System.out.println(" the sum of array elements are"+sum);
    }
}


 */
/*
public class ArrayPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter 5 numbers in an array");
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();

        }
        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < 5; i++) {
        if (arr[i] < min) {
        min = arr[i];
        }
        if (arr[i] > max) {
            max = arr[i];
        }
        }
        System.out.println("The minimum number is " + min);
        System.out.println("The maximum number is " + max);
        }
    }
    */
/*
public class ArrayPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter 5 numbers in an array");
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();

        }
        int even=0;
        int odd=0;
        for (int i = 0; i < 5; i++) {
        if(arr[i]%2==0) {
            even++;
        }
        else if(arr[i]%2==1) {
        odd++;
        }
        }
        System.out.println("no. of even"+even);
        System.out.println("no. of odd"+odd);
        }
    }
    */

public class ArrayPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter 5 numbers in an array");
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();

        }
        System.out.println("enter element to be searched");
        int element = sc.nextInt();
        boolean found= false;
        for (int i = 0; i < 5; i++) {
            if (arr[i] == element) {
                found= true;
                break;

            }
        }
        if (!found) {
            System.out.println("Element not found");
        }
        else {
            System.out.println("Element found");
        }
    }
}
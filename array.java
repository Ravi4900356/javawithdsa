// import java.util.*;
// public class Array {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner (System.in);
//         System.out.println("Enter the size of array:");
//         int size = sc.nextInt();

//         int numbers[] = new int[size];
//         System.out.println("Enter")");

//         for (int i = 0; i < Size; i++) {
//             System.out.println(numbers[i]);
            
//         }
        
//     }
    
// }

import java.util.*;

public class array {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
 System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        
        int[] numbers = new int[size];

        
        System.out.println("Enter " + size + " numbers:");

        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt(); 
        }

       
        System.out.println("The numbers you entered are:");
        for (int i = 0; i < size; i++) {
            System.out.println(numbers[i]);
        }

        sc.close();  
    }
}

        
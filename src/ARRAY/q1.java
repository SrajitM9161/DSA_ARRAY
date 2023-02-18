package ARRAY;

import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);

                // Ask the user for the size of the array
                System.out.print("Enter the size of the array: ");
                int size = scanner.nextInt();

                // Create the array with the given size
                int[] array = new int[size];

                // Ask the user to enter the elements of the array
                System.out.println("Enter the elements of the array:");
                for (int i = 0; i < size; i++) {
                    array[i] = scanner.nextInt();
                }

                // Print the elements of the array
                System.out.println("The elements of the array are:");
                for (int i = 0; i < size; i++) {
                    System.out.println(array[i]);
                }
            }
        }





/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package linearsearch;


import java.util.Random;
import java.util.Scanner;


public class LinearSearch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of array:");
        int length = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter search value:");
        int search = scanner.nextInt();
        int a[]= randomArray(length);
        //System.out.println("The array: ");
        displayArray(a);
        linerSearch(a, search);

     
//        LinearSearch searcher = new LinearSearch();
//        System.out.print("The array: ");
//        searcher.displayArray(array);
//
        int foundIndex = linerSearch(a, search);
        if (foundIndex == -1 ){
            System.out.println("\n Not found ");
        }else{
              System.out.println("\nFound " + search + " at index: " + foundIndex);
            
        }
      
    }
    public static int[] randomArray(int n){
        Random rd = new Random();
        int a[] = new int[n];
        for(int i= 0 ; i < n; i++){
            a[i] = rd.nextInt(n);
            
        }
        return a;
    }

    public static void displayArray(int[] arr) {
        System.out.print("The aray : [");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }

    public static int linerSearch(int[] arr, int key) {

        int size = arr.length;
        for (int i = 0; i < size; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }
}
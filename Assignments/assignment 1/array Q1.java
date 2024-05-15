// 1)write a java code for sorting an array, and find number of occurrences of a particular number in java.

import java.util.*;

public class Sorting{  
    static void sort(int[] arr, int n){  
        int tmp = 0;  
        for(int i = 0; i < n; i++){  
            for(int j = 1; j < n - i; j++){  
                if(arr[j - 1] > arr[j]){  
                    tmp = arr[j-1];  
                    arr[j - 1] = arr[j];  
                    arr[j] = tmp;  
                }  
            }  
        }  
    }  
    public static void main(String[] args) {  
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size :");
        int n = sc.nextInt();
        System.out.println("Enter Array Elements :");
        int arr[] = new int[n+1];
        for(int i = 0;i < n;i++){
            arr[i] = sc.nextInt();
        }
        
        sort(arr, n);
        System.out.println("Sorted Array :");
        for(int i= 0;i < n;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Enter a number :");
        int num = sc.nextInt();
        int cnt = 0;
        for(int i = 0;i < n;i++){
            if(arr[i] > num)
            break;
            if(arr[i] == num)
            cnt += 1;
        }
        System.out.println("Number of occurrences : " + cnt);
    }
    
}
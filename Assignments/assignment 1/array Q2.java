// 2)write a java code to find the maximum element in array

import java.util.*;

public class MaxElement{  
    static void sort(int[] arr, int n){  
        int temp = 0;  
        for(int i = 0; i < n; i++){  
            for(int j = 1; j < n - i; j++){  
                if(arr[j - 1] > arr[j]){  
                    temp = arr[j-1];  
                    arr[j - 1] = arr[j];  
                    arr[j] = temp;  
                }  
            }  
        }  
    }  
    public static void main(String[] args) {  
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array :");
        int n = sc.nextInt();
        System.out.println("Enter elements of the array :");
        int arr[] = new int[n+1];
        for(int i = 0;i < n;i++){
            arr[i] = sc.nextInt();
        }
        sort(arr, n);
        System.out.println("Maximum element : " + arr[n-1]);
    }
    
}
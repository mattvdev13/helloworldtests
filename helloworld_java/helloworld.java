import java.lang.Math;


public class BubbleSort{
    static void bubbleSort(int[] arr){
        int n = arr.length;
        int temp = 0;

        for(int i=0; i<n; i++){
            for(int j=1; j< (n-i); j++){
                temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
            }
        }
    }
}

public static void main(String[] args){
    
    while true{
        int arr[]={}

        int n = 1000;

        for (int i=0; i<n;i++){
            int rand =(int)(Math.random()*n) +1;
            arr[i]= rand;
        }
        
        bubbleSort(arr);
        System.out.println();
    }
}
import java.util.Random;


class BubbleSort{
    void bubbleSort(int arr[]){
        int n = arr.length;
        int temp = 0;

        for(int i=0; i<n-1; i++){
            for(int j=0; j< (n-i-1); j++){
                if (arr[j]> arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
                
            }
        }
    }
    void printArray (int arr[]){
        int n = arr.length;
        for (int i=0;i<n;++i){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }

    public static void main(String args[]){
    
        while true{
            BubbleSort ob = new BubbleSort();
            
            int n = 1000;
            int arr[] = [n];
            
            for (int i=0; i<n-1;i++){
                arr[i]=rand.nextInt(1000);
            }
            
            ob.bubbleSort(arr);
            ob.printArray(arr);
        }
    }

}


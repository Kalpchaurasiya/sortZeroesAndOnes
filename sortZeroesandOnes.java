import java.util.*;
class Hello{
    static void sortZeroes(int arr[]){
        int left =0;
        int right = arr.length-1;
        while(left<right){
            if(arr[left]==1 && arr[right]==0){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left ++;
                right --;
            }
        
    
        if(arr[left] ==0){
            left++;
        }
        if(arr[right] == 1){
            right--;
        }
        }
    }
     static void Print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" "); 
        }
        }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elemnts: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter " + n +" elements:");
        for(int i=0;i<n-1;i++){
         arr[i] = sc.nextInt();  
        }
         System.out.println("Original array:");
         Print(arr);
         sortZeroes(arr);
         System.out.println("Sorted array:");
         Print(arr);
}
}

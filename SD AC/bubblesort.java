import java.util.Scanner;
public class bubblesort {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the size of an arry :");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter "+n+" elements");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Elements before sorting");
        for(int i=0;i<arr.length;i++){
            System.out.print(+ arr[i] + " ");
        }
        System.out.println();
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("Element after Sorting : ");
        for(int i=0;i<arr.length;i++){
        System.out.print(+arr[i]+ " ");
        }
    }
    
}

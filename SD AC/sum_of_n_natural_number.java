import java.util.Scanner;
public class sum_of_n_natural_number {
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n=sc.nextInt();
        int i=1;
        int sum=0;
        while(i<=n){
            sum+=i;
            i++;
            System.out.println("Sum" +sum);
        }
    }
}

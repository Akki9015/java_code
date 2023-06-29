import java.util.Scanner;
public class while_loop2 {
    public static void main(String args[]){
        //System.out.println("Enter the number :");
        Scanner sc=new Scanner(System.in);
//int number=sc.nextInt();
int number=1;
System.out.print("Enter the Range :");
int range=sc.nextInt();
while(number<=range){
    System.out.print(" "+number);
    number++;
}
    }
}

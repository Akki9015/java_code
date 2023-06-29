import java.util.Scanner;
public class add_18percent_in_totalofthreenumber {
public static void main(String arg[]){
    System.out.println("enter the three value");
    Scanner sc =new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();
    int total=a+b+c;
    System.out.println("total is:"+total);
    System.out.println(" After Addition of 18 percent in total");
    float total2=total+(0.18f*total);
    System.out.println("Now total is :" +total2);
}
}

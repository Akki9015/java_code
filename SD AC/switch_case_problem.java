import java.util.Scanner;
public class switch_case_problem {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int number=sc.nextInt();
        switch(number){
            case 1:
            System.out.println("samosa");
            break;
            case 2:
            System.out.println("burger");
            break;
            case 3:
            System.out.println("pizza");
            break;
            default :
            System.out.println("bhukhe raho");

        }
    }
}

import java.util.Scanner;
public class areaofcircle{
    public static void main(String arg[]){
        System.out.println("Enter the radius:");
        Scanner sc=new Scanner(System.in);
        float r=sc.nextFloat();
        float area=(3.14f)*(r*r);
        System.out.println("area of circle :\n"+area);
    }
}
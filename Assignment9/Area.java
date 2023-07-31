import java.util.Scanner;

public class Area
{
    public static void main(String[] args) {
    
        Scanner s=new Scanner(System.in);

        System.out.println("Enter base:");
        float a=s.nextInt();
        System.out.println("Enter height: ");
        float b=s.nextInt();
        float c=(float)0.5*(a)*(b);
        System.out.println("Area of triangle is: "+c);
   }
}
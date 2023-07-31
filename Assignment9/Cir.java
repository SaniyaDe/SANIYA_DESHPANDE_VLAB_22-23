import java.util.Scanner;

public class Cir {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter radius of circle: ");
        float rad=s.nextInt();
        float area=(float)3.14*rad*rad;
        System.out.println("the area of circle is: "+area);

    }
}

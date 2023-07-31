import java.util.Scanner;

public class Fact {
    public void isFact()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number");
        int a=s.nextInt();
        int f=1;
        for(int i=a;i>0;i--)
        {
            f=f*i;
        }
        System.out.println("Factorial is"+f);
    }
    public static void main(String[] args) {
        Fact m=new Fact();
        m.isFact();
    }
}

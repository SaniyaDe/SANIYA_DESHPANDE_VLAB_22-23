import java.util.Scanner;

public class Primen {
    public void isPrime()
    {
            int flag=0;
        //int m=0;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=s.nextInt();
        int m=n/2;
        if(n==0||n==1)
        {
            System.out.println("Not a prime number");
        }
        else
        {
            for(int i=2;i<=m;i++)
            {
                if(n%i==0)
                {
                    System.out.println("Not a prime number");
                    flag=1;
                    break;
                }
            }
            if(flag==0)
            {
                System.out.println("is a prime number");
            }
        }
    }
    public static void main(String[] a4rgs) {
        Primen p=new Primen();
        p.isPrime();
    }
    
}

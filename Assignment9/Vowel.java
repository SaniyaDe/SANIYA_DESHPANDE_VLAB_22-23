import java.util.Scanner;

public class Vowel {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str=s.next()+s.nextLine();
        str=str.toLowerCase();
        int count=0;

        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
            {
                count++;
            }
        }
        System.out.println("Total number of vowels in string are"+count);
    }
}

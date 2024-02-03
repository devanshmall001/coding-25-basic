import java.util.*;
class Main{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        String c=" ";
        while(a>0)
        {
            int rem=a%2;
            c=c+rem;
            a=a/2;
        }
        System.out.println(c);
    }
}

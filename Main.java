import java.util.Scanner;
class demo
{
    public static void main(string args[])
    {
        Scanner sc = new Scanner(system.in);
        string s = sc.next();
        int a =sc.nextInt();
        int b =sc.nextInt();
        float f = sc.nextInt();
        int c = a+b;
        int d = a-b;
        int res = a*b;
        float f= a/b;
        System.out.println("additio is"+ c);
        System.out.println("divison is"+ f);
        System.out.println("multipication is"+ res);
        System.out.println("subtraction is"+ d);
    }
}
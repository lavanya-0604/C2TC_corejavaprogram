package day1;
//char is denoted by ''

public class CharDemo {
    public static void main(String[] args)
    {
        char ch = 'a';
        System.out.println(ch);

        char ch1 = 65;
        System.out.println(ch1);

        char var1 = '\u00A7';//Unicode escape sequence
        System.out.println(var1);

        char var2 = '\u20AC';//Unicode escape sequence
        System.out.println(var2);

        int a = 'A';
        System.out.println(a);
    }
}
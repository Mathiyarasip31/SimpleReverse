import java.util.Scanner;
import java.util.Stack;

public class SimpleReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        reverse(string);
    }
    public static void reverse(String string)
    {
        String s="";
        char[] ch=string.toCharArray();
        for (int i=ch.length-1;i>=0;i--)
        {
            s+=ch[i];
        }
        System.out.println(s);
    }
}

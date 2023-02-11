import java.util.Scanner;
public class STRING {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the string");
        String str1= sc.nextLine();
        System.out.println(str1);
        String str2=str1.toUpperCase();
        System.out.println(str2);
    }
}

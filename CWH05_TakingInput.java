import java.util.Scanner;
public class CWH05_TakingInput {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Maths marks");
        int a= sc.nextInt();
        boolean b1= sc.hasNextInt();
        System.out.println(b1);
        System.out.println("physics marks");
        int b= sc.nextInt();
        System.out.println("bio marks");
        int c= sc.nextInt();
        System.out.println("chem marks");
        int d= sc.nextInt();
        System.out.println("hin marks");
        int e= sc.nextInt();
        int sum= a+b+c+d+e;
        float p= sum/500f;
        float p1= p*100;
        System.out.println("Percentage scored");
        System.out.println(p1);







    }
}

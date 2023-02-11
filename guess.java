import java.util.Scanner;
import java.util.Random;
class guess_no{
    int no_of_guess;
    int r;
    int a;
    boolean b;
    public int guess_no(){
        Random random= new Random();          //constructor for generating random number
        r= random.nextInt(5);
        return r;
    }
    public int take_user_input(){
        Scanner sc= new Scanner(System.in);           // taking random number input from user
        System.out.println("Enter your number between 0 to 4");
        a= sc.nextInt();
        return a;
    }
    public boolean isCorrect(int a){               // it will return true or false in the loop so that i can break it
       if (a==r){
           System.out.println("u guessed!! , Congoooo!!!!!  ");
           b=true;
       }
       else if (a<r){
           System.out.println("The no to be guesses is bigger");
           no_of_guess+=1;
           b=false;
       }
       else{
           System.out.println("The no to be guesses is smaller");
           no_of_guess+=1;
           b=false;
       }
       return b;

    }
    public void returning(boolean b){
        if(b=true) {
            System.out.println("You guesses the number correctly in " + no_of_guess);
        }
        else{
            System.out.println("you were not able to guess the number in the iteration provided");
        }


    }


}
public class guess {
    public static void main(String[] args) {
        int a1;
        boolean b1= false;
        guess_no obj = new guess_no();
        obj.guess_no();
        for (int i = 0; i < 6; i++) {
            a1 = obj.take_user_input();
            b1 = obj.isCorrect(a1);
            if (b1 == true) {
                break;

            }


        }
       if(b1==true){
           System.out.println("[You guessed ur answer in "+obj.no_of_guess+" guesses]");
           System.out.println(b1);
       }
       else{
           System.out.println("[You werent able to guess the number in given no. of iterations]");
       }

    }

}

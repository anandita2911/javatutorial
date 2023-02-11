import java.util.Random;
import java.util.Scanner;
public class rock_paper_scizzor {
    public static void main(String[] args){
        String s;
        String s1;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter random number between 0 to 2");
        int i= sc.nextInt();
        Random r= new Random();
        int a= r.nextInt(3);
        switch(a){
            case 0:{
                s="Rock";
                break;


            }
            case 1:{
                s="Scissor";
                break;
            }
            case 2:{
                s="paper";
                break;
            }
            default:{
                s="";
                break;
            }
        }
        switch(i){
            case 0:{
                s1="Rock";
                break;


            }
            case 1:{
                s1="Scissor";
                break;
            }
            case 2:{
                s1="paper";
                break;
            }
            default:{
                s1="";
                break;
            }
        }
        if( s =="Rock") {
            if(s1 =="Rock"){
                System.out.println("its a draw");
            }
            else if (s1=="Scissor") {
                System.out.println("you lost");
            }
            else {
                System.out.println("you won");
            }

            }
        else if( s =="paper") {
            if(s1 =="paper"){
                System.out.println("its a draw");
            }
            else if (s1=="Scissor") {
                System.out.println("you won");
            }
            else {
                System.out.println("you lost");
            }

        }
        else if( s =="Scissor") {
            if(s1 =="Scissor"){
                System.out.println("its a draw");
            }
            else if (s1=="paper") {
                System.out.println("you lost");
            }
            else {
                System.out.println("you won");
            }

        }
        else{
            System.out.println("random number is wrong");
        }

        }
    }


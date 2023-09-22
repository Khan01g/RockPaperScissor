package hello;
import java.util.Random;
import java.util.Scanner;
public class RockPaperScissor {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Random rm = new Random();
        System.out.println("0= Rock 1=Paper and 2=Scissor");
        System.out.println("Choice 0,1 or 2");
        int user=sc.nextInt();
        int computer=rm.nextInt(3);
        if(computer==0){
            System.out.println("the computer choice is Rock");
        } else if (computer==1) {
            System.out.println("the computer choice is Paper");
        }else
            System.out.println("the computer choice is Scissor");


        if (user==computer){
            System.out.println("The Match is tie");
        } else if (computer==0 && user==2 || computer==1 && user==0 || computer == 2 && user==1 ){
            System.out.println("computer Wins");
        }
        else {
            System.out.println("user Wins");

        }

    }
}

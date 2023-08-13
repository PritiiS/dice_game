package mymodules.codes;
import java.util.Scanner;
import java.util.Random;
public class proj_dicegame {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       Random rc=new Random();
        int userScore=0;
        int systemScore=0;
        System.out.println("enter the number of rounds:");
        int rounds= sc.nextInt()-1;

        for (int i=0;i<=rounds;i++) {
            // System.out.println("enter your dice number(range 1-6):");
            // int user= nextInt();
            int system = rc.nextInt(6) + 1;
            int user = rc.nextInt(6) + 1;
            System.out.printf("\nthe user dice number is:%d \n the system dice number is:%d \n",user,system);
            if( system > user){
                systemScore++;
            }
            else if (system< user){
                userScore++;
            }
        }
        System.out.printf("\n user score is:%d \n system score is:%d\n",userScore,systemScore);
        if(userScore>systemScore){
            System.out.println("the user wins");
        } else if (userScore<systemScore) {
            System.out.println("the system wins");
        } else {
            System.out.println("the game is draw");
        }
    }
}

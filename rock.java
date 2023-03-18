import java.util.Random;
import java.util.Scanner;

public class rock {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("you are player 1!");
        //0 for rock
        //1 for scissor
        //2 for paper
        System.out.println("enter 0 for rock,1 for scissors,and 2 for paper");
        int player1 =sc.nextInt();
        Random random=new Random();
        int boat = random.nextInt(2) +0;
        if(player1==boat){
            System.out.println("Draw:- Both of players choose same value");
        }
        if(player1==2 && boat==0 || player1==0 && boat==1 ||player1==1 && boat==2){
            System.out.println("player1 win:- YOU WIN -:");
        }
        else{
            System.out.println("boat wins:- YOU LOST -:");
        }
        System.out.println( "computer's choise:- " +boat);
        
    }
    
}

import java.util.Random;
import java.util.Scanner;

 class Number_Game {
    public static void main(String[] args) {
        Random rand=new Random();
        char rematch='y';
        Scanner sc=new Scanner(System.in);
        int ans=rand.nextInt(100)+1;
        System.out.println("Guess a number between 1 to 100");
        System.out.println("You have only 10 chances to guess");
        int i=10;
        int count=1;
        while(true){
            int num=sc.nextInt();
            if(num==ans){
                System.out.println("You Guessed Correct in "+count+" attempt");
                System.out.println("And Your score is "+(i*10)+"/100");
                i--;
                break;
            } else if (num>ans) {
                System.out.println("You must enter lesser number than you entered previously");
                i--;
                count++;
                System.out.println("You left "+i+" attempts");
            }
            else{
                System.out.println("You must enter greater number than you entered previously");
                i--;
                count++;
                System.out.println("You left "+i+" attempts");
            }
            if(i==0){
                System.out.println("GAME OVER!!!");
                System.out.println("And Your score is 0/100");
                System.out.println("Type 'y' for re-match");
                System.out.println("and other key for exit");
                rematch=sc.next().charAt(0);
                if(rematch=='y'){
                    i=10;
                    count=1;
                    System.out.println("Game started again!!!");
                }
                else{
                    System.out.println("You Exit!");
                    System.out.println("The correct answer is "+ans);
                    break;
                }
            }
        }
    }
}
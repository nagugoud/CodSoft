import java.util.Scanner;
public class NumberGame
{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int chances=6;
        int finals=0;
        boolean playAgain=true;
        System.out.println("Welcome ");
        System.out.println("Hey you have about "+chances+" to win the game");
        while(playAgain){
            int rand=getrandN(1,100);
            boolean guess=false;
            for(int i=0;i<chances;i++){
                System.out.println("Chance "+(i+1)+" Enter your guess");
                int user=sc.nextInt();
                if(user==rand){
                    guess=true;
                    finals+=1;
                    System.out.println("You won it.");
                    break;

                }
                else if(user>rand){
                    System.out.println("Too High");

                }
                else{
                    System.out.println("Too Low");
                }
            }
            if(guess==false){
                System.out.println("Sorry . You lost the Chances.The number is "+rand);
            }
            System.out.println("Do you want to paly again(yes or no)");
            String PP=sc.next();
            playAgain=PP.equalsIgnoreCase("y");
        }
        System.out.println("Hope you enjoyed");
        System.out.println("Here is your score"+finals);

        }
        public static int getrandN(int min,int max){
            return(int)(Math.random()*(max-min+1)+min);
        }
    }

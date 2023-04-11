
import java.util.Scanner; //import java.util.*; //guesser game in JAVA
class Guesser
{
    int guessNum;

    int guessingNumber(){ //int99
        Scanner scan=new Scanner(System.in);
        System.out.println("___________________________________________________");
        System.out.println("Guesser, Kindly guess the number");
        System.out.println("___________________________________________________");
        guessNum =scan.nextInt();
        if (guessNum<1 || guessNum>99){
            System.out.println("___________________________________________________");
            System.out.println("Enter the correct choice between 1-99");
            System.out.println("___________________________________________________");
            guessNum =scan.nextInt();
        }
        return guessNum;

    }
}


class Player
{
    int guessNum;
    int guessingNumber(){
        Scanner scan=new Scanner(System.in);
        System.out.println("___________________________________________________");
        System.out.println("Player, Kindly guess the number");
        System.out.println("___________________________________________________");
        guessNum=scan.nextInt();
        if (guessNum<1 || guessNum>99){
            System.out.println("___________________________________________________");
            System.out.println("Enter the correct choice between 1-99");
            System.out.println("___________________________________________________");
            guessNum =scan.nextInt();
        }
        return guessNum;


    }
}

class Umpire
{
    int numFromGuesser;
    int numFromPlayer1;
    int numFromPlayer2;
    int numFromPlayer3;

    void collectNumFromGuesser()
    {
        Guesser g=new Guesser();
        numFromGuesser=g.guessingNumber();

    }
    void collectNumFromPlayer()
    {
        Player p1=new Player();
        Player p2=new Player();
        Player p3=new Player();
        numFromPlayer1=p1.guessingNumber();
        numFromPlayer2=p2.guessingNumber();
        numFromPlayer3=p3.guessingNumber();
    }
    void compare()
    {
        int a,b,c;
        a=numFromGuesser-numFromPlayer1;
        b=numFromGuesser-numFromPlayer2;
        c=numFromGuesser-numFromPlayer3;
        if (a<1){
            a=a*-1;
        }
        if (b<1){
            b=b*-1;
        }
        if (c<1){
            c=c*-1;
        }

        if (numFromGuesser==numFromPlayer1)
        {
            if (numFromGuesser==numFromPlayer2 && numFromGuesser==numFromPlayer3)
            {
                System.out.println("___________________________________________________");
                System.out.println("Everyone's Correct, All Winner !");
                System.out.println("___________________________________________________");
            }
            else if (numFromGuesser==numFromPlayer2)
            {
                System.out.println("___________________________________________________");
                System.out.println("Player 1 & Player 2 Won the Game");
                System.out.println("___________________________________________________");
            }
            else if (numFromGuesser==numFromPlayer3)
            {
                System.out.println("___________________________________________________");
                System.out.println("Player 1 & Player 3 Won the Game");
                System.out.println("___________________________________________________");
            }
            else
            {
                System.out.println("___________________________________________________");
                System.out.println("Player 1 won the game.");
                System.out.println("___________________________________________________");
            }
        }
        else if (numFromGuesser==numFromPlayer2)
        {
            if (numFromGuesser==numFromPlayer3)
            {
                System.out.println("___________________________________________________");
                System.out.println("Player 2 & Player 3 won the game");
                System.out.println("___________________________________________________");
            }
            else
            {
                System.out.println("___________________________________________________");
                System.out.println("Player 2 won the game.");
                System.out.println("___________________________________________________");
            }
        }
        else if (numFromGuesser==numFromPlayer3)
        {
            System.out.println("___________________________________________________");
            System.out.println("Player 3 won the game ");    
            System.out.println("___________________________________________________");
        }
        else if (a<b && a<c)
        {
            System.out.println("Player 1 is Winner by Close Call of "+a);
        }
        else if (b<c && b<a)
        {
            System.out.println("Player 2 is Winner by Close Call of "+b);
        }
        else
        {
            System.out.println("Player 3 is Winner by Close Call of "+c);
        }

    }

}

public class GuesserGame{
    public static void main(String[] args) {
        System.out.println("___________________________________________________");
        System.out.println("<><>GAME STARTED<><>");
        System.out.println("___________________________________________________");
        Umpire u=new Umpire();
        u.collectNumFromGuesser();
        u.collectNumFromPlayer();
        u.compare();
    }
}
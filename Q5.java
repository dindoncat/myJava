import java.net.StandardSocketOptions;
import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;
import java.util.SortedMap;

public class Q5
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Random rnd = new Random();
        int num, something;
        something = rnd.nextInt(1 ,20);
        System.out.println("Try to guss the a num from 1to20  ");

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter youre guss:");
            num = in.nextInt();
            if (num == something)
            {
                System.out.println("you got it!!!");
                return;
            }
            else if (num < 1 || num > 20)
            {
                System.out.println("not valid");
                i++;
            }
            else if (num > something)
                System.out.println("too big");
            else if (num < something)
                System.out.println("too small");
            else
                return;
        }
        System.out.println("You are out of guesses");

    }
}

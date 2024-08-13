import java.util.Scanner;
public class program4{
    public static void main(String[] args){
        //475, 821, 369, and 562 
        Scanner s = new Scanner(System.in);
        System.out.println("Insert a number please.");
        double a = 0;
        a = s.nextDouble();
        System.out.println("Insert a number please.");
        double b = 0;
        b = s.nextDouble();
        System.out.println("Insert a number please.");
        double c = 0;
        c = s.nextDouble();
        System.out.println("Insert a number please.");
        double e = 0;
        e = s.nextDouble();
        double sum = a + b + c + e;
        double av = sum / 4;
    
        System.out.println("The sum is " + sum);
        System.out.println("The average is " + av);
    }
}

//Paste console output below:
/*
Insert a number please.
475
Insert a number please.
821
Insert a number please.
369
Insert a number please.
562
The sum is 2227.0
The average is 556.75
*/

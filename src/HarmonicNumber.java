//*** BRP_java fellowship_004 ***
//DAY4(1.HarmonicNumber program)


import java.util.Scanner;
public class HarmonicNumber {
    public static void main(String[] args) {

        int num,i=1;
        double rst=0.0;

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Number for length of series");

        num=sc.nextInt();

        while (i<=num)
        {
            System.out.println(" 1/" + i + " + ");

            rst=rst + (double) 1/i;

            i++;
        }
        System.out.println("\n\nSum of Harmonic series is "+ rst);


    }
}

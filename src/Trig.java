//*** BRP_java fellowship-004 ***
//DAY4(Trig.java program)

// Java program for sin() and cos() method
import java.util.*;
public class Trig {

        public static void main(String args[])
        {
            Scanner sc=new Scanner(System.in);

            double degrees = sc.nextDouble();

            // convert degrees into the radians
            double radians = Math.toRadians(degrees);

            // sin() method to get the sine value
            double sinValue = Math.sin(radians);

            //cos() method to get the cos value
            double cosValue = Math.cos(radians);

            // prints the sine value
            System.out.println("sin(" + degrees + ") = " + sinValue);


            // prints the cosine value
            System.out.println("cos(" + degrees + ") = " + cosValue);
        }
    }



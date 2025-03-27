//jav Simple calculator
import java.io.*;
import java.lang.*;
import java.lang.Math;
import java.net.SocketPermission;
import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

//driver class
public class Basiccal {
    public static void main(String[] args) {

    //Store two numbers
    double num1, num2;

    //Take input fromuser
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the firts number:");

    //Take first input
    num1 = sc.nextDouble();


    System.out.println("Enter the second number:");

    //Take second input
    num2 = sc.nextDouble();

    System.out.println("Enter the operator (+,-,*,/):");

    char op = sc.next().charAt(0);
    double o = 0;

    switch (op) {
        case '+':
            o = num1 + num2;
            break;

        case '-':
            o = num1 - num2;
            break;

        case '*':
            o = num1 * num2;
            break;

        case '/':
            o = num1 / num2;
            break;

        default:
            System.out.println("You enter wrond input");

        }
        System.out.println("The answer is:");

        
        System.out.println(num1 + "" + op + "" + num2 + " = " + o);
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.io.*;
import java.util.Scanner;

/**
 *
 * @author Sky
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        while (true) {
            double num1 = 0;
            double num2 = 0;
            MathFunction callMath;
            System.err.println("Welcome to Calculator: following are options");
            System.err.println("Press 1 for addition");
            System.err.println("Press 2 for substraction");
            System.err.println("Press 3 for multification");
            System.err.println("Press 4 for division");
            System.err.println("Press 5 for mod");
            System.err.println("Press 6 for quit");
            Scanner cin = new Scanner(System.in);
            Scanner cin1 = new Scanner(System.in);
            String str;
            int option = cin.nextInt();
            switch (option) {
                case 1:
                    System.err.println("Input First Number");
                    num1 = cin.nextDouble();
                    System.err.println("Input Second Number");
                    num2 = cin.nextDouble();
                    callMath = new MathFunction(num1, num2);
                    callMath.add();
                    System.out.println("Press Y to continue");
                    str=cin1.nextLine();
                    if (str.equalsIgnoreCase("Y")) {
                        break;
                    }
                    else{System.exit(0);}
                case 2:
                    System.err.println("Input First Number");
                    num1 = cin.nextDouble();
                    System.err.println("Input Second Number");
                    num2 = cin.nextDouble();
                    callMath = new MathFunction(num1, num2);
                    callMath.sub();
                    System.out.println("Press Y to continue");
                    str=cin1.nextLine();
                    if (str.equalsIgnoreCase("Y")) {
                        break;
                    }
                    else{System.exit(0);}
                case 3:
                    System.err.println("Input First Number");
                    num1 = cin.nextDouble();
                    System.err.println("Input Second Number");
                    num2 = cin.nextDouble();
                    callMath = new MathFunction(num1, num2);
                    callMath.mul();
                    System.out.println("Press Y to continue");
                    str=cin1.nextLine();
                    if (str.equalsIgnoreCase("Y")) {
                        break;
                    }
                    else{System.exit(0);}
                case 4:
                    System.err.println("Input First Number");
                    num1 = cin.nextDouble();
                    System.err.println("Input Second Number");
                    num2 = cin.nextDouble();
                    callMath = new MathFunction(num1, num2);
                    callMath.div();
                    System.out.println("Press Y to continue");
                    String ss=cin.nextLine();
                    str=cin1.nextLine();
                    if (str.equalsIgnoreCase("Y")) {
                        break;
                    }
                    else{System.exit(0);}
                case 5:
                    System.err.println("Input First Number");
                    num1 = cin.nextDouble();
                    System.err.println("Input Second Number");
                    num2 = cin.nextDouble();
                    callMath = new MathFunction(num1, num2);
                    callMath.mod();
                    System.out.println("Press Y to continue");
                    str=cin1.nextLine();
                    if (str.equalsIgnoreCase("Y")) {
                        break;
                    }
                    else{System.exit(0);}
                case 6:
                    System.exit(0);
            }
        }

    }
}

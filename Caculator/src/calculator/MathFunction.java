/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

/**
 *
 * @author Sky
 */
public class MathFunction {
       double num1;
       double num2;
       public MathFunction(){}
       public MathFunction(double num1,double num2){
           this.num1=num1;
           this.num2=num2;
       }
       public void add(){
           double result=num1+num2;
           System.out.println("Your Result is: "+result);
       }
       public void sub(){
           double result=num1-num2;
           System.out.println("Your Result is: "+result);
       }
       public void mul(){
           double result=num1*num2;
           System.out.println("Your Result is: "+result);
       }
       public void div(){
           double result=num1/num2;
           System.out.println("Your Result is: "+result);
       }
       public void mod(){
           double result=num1%num2;
           System.out.println("Your Result is: "+result);
       }
    
}

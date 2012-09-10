/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gradecurveapp;

/**
 *
 * @author Sky
 */
public class GradeCurveApp {
public static void main(String[] args) {
int grade = 95; 
GradeCurve curve = new GradeCurve();
grade=curve.lowerGrade(grade); 
System.out.println(grade);
}
}
class GradeCurve {
public int lowerGrade(int g) 
{ int x =g- 5; 
   //System.out.println(g); 
  return x;
}
}
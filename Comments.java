//Single Line Comment.
/* Multi Line Comment.
*/
package com.tutorialspoint;

/** 
 * This is a documentation comment. 
 * This is my first Java program.
 * This is an example of multi-line comments.
 * We're printing result of divison of two numbers in this program
 */
public class MyFirstJavaProgram {
   public static void main(String[] args) {
     MyFirstJavaProgram program = new MyFirstJavaProgram();
     double result = program.divide(100, 10);
     System.out.println(result);
   }

   /**
    * @param dividend
    * @param divisor
    * @return quotient
    * @throws IllegalArgumentException if divisor is zero
    */
   private double divide(int dividend, int divisor) throws IllegalArgumentException {
      if (divisor == 0) {
         throw new IllegalArgumentException("divisor cannot be zero");
      }
      return (double) dividend / divisor;
   }
}

Output

10.0

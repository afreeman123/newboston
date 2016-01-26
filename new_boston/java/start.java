import java.util.Scanner;

//everything begins with a class
class apples {
  public static void main(String args[]){
    //Scanner allows user input
    //System.in means system input
    Scanner aidan =  new Scanner(System.in);

    double num1, num2, answer;

    System.out.println("Enter first number: ");
    num1 = aidan.nextDouble();

    System.out.println("Enter second number: ");
    num2 = aidan.nextDouble();

    answer = num1 + num2;
    System.out.println("The answer is " + answer);
  }
}

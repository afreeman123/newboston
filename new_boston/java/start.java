import java.util.Scanner;

//everything begins with a class
class apples {
  public static void main(String args[]){
    Scanner input =  new Scanner(System.in);
    int total = 0;
    int grade;
    int average;

    //trying a for statement
    for(int counter = 1;counter<=10;counter++) {
      System.out.println("Number " + counter);
      grade = input.nextInt();
      total += grade;
    }
    average = total/10;

    System.out.println("Your average is " + average);

  }
}

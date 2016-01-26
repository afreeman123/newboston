import java.util.Scanner;

//everything begins with a class
class apples {
  public static void main(String args[]){

    //Scanner allows user input
    //System.in means system input
    Scanner aidan =  new Scanner(System.in);

    int girls, boys, people;
    girls = 10;
    boys = 3;
    //modulus
    people =  girls % boys;
    System.out.println(people);
  }
}

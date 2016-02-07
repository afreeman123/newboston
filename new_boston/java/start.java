//
import java.util.Random;

class apples {
  public static void main(String args[]){
    //Program to simulate a dice

    Random dice = new Random();
    int number;

    for(int counter=1;counter<=10;counter++) {
      //takes a random value between 1 and 6
      number = 1 + dice.nextInt(6);
      System.out.println(number);
    }
  }
}

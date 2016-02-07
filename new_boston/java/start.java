//
import java.util.Random;

class apples {
  public static void main(String args[]){
    //Program to simulate a dice

    Random dice = new Random();
    int number;

    for(int counter=1;counter<=10;counter++) {
      //takes a random value between 0 and 5
      number = dice.nextInt(6);
      System.out.println(number);
    }
  }
}

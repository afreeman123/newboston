import java.util.Random;

class apples {
  public static void main(String args[]){
    int aidan[] = {3,4,5,6,7};
    int total = 0;

    //enhanced for-loop
    for(int x: aidan) {
      total += x;
    }//will add all the numbers in the array together

    System.out.println(total);
  }
}

import java.util.Random;

class apples {
  public static void main(String args[]){
    //array
    int aidan[] = new int[10];
    //length of array-----^^

    Random number = new Random();

    for(int i=0;i<aidan.length;i++) {
      aidan[i] = Math.abs(number.nextInt());
      System.out.println(aidan[i]);
    }

    //array initialiser
    int bucky[] = {2,4,5,7,9};

    System.out.println(bucky[2]);
  }
}

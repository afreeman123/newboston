import java.util.Random;

class apples {
  public static void main(String args[]){
    System.out.println("Index\tValue");
    // \t makes 5 spaces

    int aidan[] = {32, 12, 18, 54, 2};

    for(int counter=0;counter<aidan.length;counter++) {
      System.out.println(counter + "\t" + aidan[counter]);
    }
  }
}

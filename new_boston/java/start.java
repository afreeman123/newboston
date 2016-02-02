import java.util.Scanner;

//everything begins with a class
class apples {
  public static void main(String args[]){

      Scanner input = new Scanner(System.in);
      tuna tunaObject = new tuna();

      System.out.println("Enter name of your first girlfriend here: ");
      String name = input.nextLine();

      //Using functions from tuna class
      tunaObject.setName(name);
      tunaObject.saying();

  }
}

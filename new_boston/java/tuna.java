public class tuna {
  private String girlName;

  //constructor - has same name as class
  public tuna (String name) {
    girlName = name;
  }

  public void setName(String name) {
    girlName = name;
  }

  public String getName() {
    return girlName;
  }

  public void saying() {
    //substitues what second parameter returns
    System.out.printf("Your first gf was %s", getName());
  }

}

public class tuna {
  private String name;
  //can have type of custom classes
  private potpie birthday;

  public tuna(String theName, potpie theDate) {
    name = theName;
    birthday = theDate;
  }

  public String toString() {
    return String.format("My name is %s, my birthday is %s", name, birthday);
    //birthday is an object of class potpie and so, looks for toString method
    //in that class
  }
}

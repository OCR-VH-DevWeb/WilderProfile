public class Classroom {

  public static void main(String[] args) {

    // create instances of Wilder
    Wilder wilder1 = new Wilder("Jean-Claude", true);
    Wilder wilder2 = new Wilder("Henri", false);
    Wilder wilder3 = new Wilder("Cassandra", true);
    Wilder wilder4 = new Wilder("Aminata", false);
    Wilder wilder5 = new Wilder("Jordan", false);
    Wilder wilder6 = new Wilder("Inès", true);
    Wilder wilder7 = new Wilder("Loucas", true);

    // display method whoAmI() for each instance
    System.out.println(wilder1.whoAmI());
    System.out.println(wilder2.whoAmI());
    System.out.println(wilder3.whoAmI());
    System.out.println(wilder4.whoAmI());
    System.out.println(wilder5.whoAmI());
    System.out.println(wilder6.whoAmI());
    System.out.println(wilder7.whoAmI());
  }
}

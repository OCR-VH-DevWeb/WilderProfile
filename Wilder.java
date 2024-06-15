/**
 * Wilder
 */
public class Wilder {

  // attributes
  private String firstname;
  private boolean aware;

  // constructors
  public Wilder(String firstname) {
    this.firstname = firstname;
    this.aware = false;
  }

  public Wilder(String firstname, boolean aware) {
    this.firstname = firstname;
    this.aware = aware;
  }

  // getters
  public String getFirstname() {
    return this.firstname;
  }

  public boolean isAware() {
    return this.aware;
  }

  // setters
  public void setFirstname(String firstname) {
    this.firstname = firstname;
  };

  public void setAware(boolean aware) {
    this.aware = aware;
  };

  // instace method
  public String whoAmI() {
    String awareText = isAware() ? "et je suis aware" : "et je ne suis pas aware";
    return "Je m'appelle " + this.firstname + " " + awareText + ".";
  };
}
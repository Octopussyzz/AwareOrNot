public class Wilder {

  // Attributes
  private String firstName;
  private boolean aware;

  // Constructor
  public Wilder(String firstName, boolean aware){
    this.firstName = firstName;
    this.aware = aware;
  }

  // Method
  public String whoAmI(){
    if (isAware()){
      return "Je m'appelle " + this.firstName + " et je suis aware !";
    } else {
      return "Je m'appelle " + this.firstName + " et je ne suis pas aware !";
    }
  }

  // Getters
  public String getFirstName(){
    return this.firstName;
  }

  public boolean isAware(){
    return this.aware;
  }

  // Setters
  public void setFirstName(String firstName){
    this.firstName = firstName;
  }

  public void setAware(boolean aware){
    this.aware = aware;
  }
}

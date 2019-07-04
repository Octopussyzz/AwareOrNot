public class Classroom {

  public static void main(String[] args) {

    Wilder valentin = new Wilder("Valentin", true);
    Wilder yannis = new Wilder("Yannis", true);
    Wilder clement = new Wilder("Clément", true);
    Wilder alexandra = new Wilder("Alexandra", true);
    Wilder veronique = new Wilder("Véronique", true);
    Wilder valerian = new Wilder("Valérian", true);
    Wilder benjamin = new Wilder("Benjamin", true);
    Wilder eddy = new Wilder("Eddy", true);
    Wilder edwin = new Wilder("Edwin", true);
    Wilder laetitia = new Wilder("Laetitia", true);
    Wilder jeanClaude = new Wilder ("Jean-Claude", true);
    Wilder henri = new Wilder ("Henri", false);

    Wilder[] wilderArray = {valentin, yannis, clement, alexandra, veronique, valerian, benjamin, eddy, edwin, laetitia, jeanClaude, henri};

    for (Wilder classMate : wilderArray){
      System.out.println(classMate.whoAmI());
      try {
        Thread.sleep(1000) ;
      } catch (InterruptedException e) {}
    }
  }
}

public class Droid {
    String name;
    int batteryLevel;
  
    public Droid(String droidName) {
      name = droidName;
      batteryLevel = 100;
    }
  
    public String toString() {
      return "Hello I am the droid " + name + "! Not to be confused with R2D2.";
    }
  
    public void performTask(String task) {
      System.out.println(name + " is performing task: " + task);
      batteryLevel -= 10;
    }
  
    public static void main(String[] args) {
      Droid codey = new Droid("Codey");
      System.out.println(codey);
      codey.performTask("Clean my room");
    }
  
  }
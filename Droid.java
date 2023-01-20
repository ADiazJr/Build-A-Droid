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
    
    public void energyReport() {
        System.out.println(name + " is currently at " + batteryLevel + "% battery!");
    }  

    public void energyTransfer(int amountToTransfer, Droid transferBuddy) {
        transferBuddy.batteryLevel -= amountToTransfer;
        batteryLevel += amountToTransfer;
        System.out.println("My battery is now at " + batteryLevel + "% and " + transferBuddy.name + " is now at " + transferBuddy.batteryLevel + "%. I gained " + amountToTransfer + "% battery!");
    }

    public void performTask(String task) {
      System.out.println(name + " is performing task: " + task);
      batteryLevel -= 10;
    }
  
    public static void main(String[] args) {
      Droid codey = new Droid("Codey");
      System.out.println(codey);
      codey.performTask("Clean my room");
      codey.energyReport();
      Droid nodey = new Droid("nodey");
      codey.energyTransfer(10, nodey);
    }
  
  }
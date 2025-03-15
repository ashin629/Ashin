import java.util.Scanner;

public class One{
    public static double calculateToll(String vehicleType, boolean hasRFID) {
        double tollFee = 0;
        if (vehicleType.equalsIgnoreCase("Car")) {
            tollFee = 100;
        } else if (vehicleType.equalsIgnoreCase("Truck")) {
            tollFee = 200;
        } else {
            System.out.println("Invalid vehicle type. Defaulting toll to ₹0.");
            return 0;
        }
        
        if (hasRFID) {
            tollFee *= 0.9;
        }
        
        return tollFee;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of vehicles to process: ");
        int numVehicles = scanner.nextInt();
        
        for (int i = 0; i < numVehicles; i++) {
            System.out.print("Enter vehicle type (Car/Truck): ");
            String vehicleType = scanner.next();
            
            System.out.print("Does the vehicle have an RFID pass? (true/false): ");
            boolean hasRFID = scanner.nextBoolean();
            
            double tollFee = calculateToll(vehicleType, hasRFID);
            System.out.println("Toll fee for " + vehicleType + ": ₹" + tollFee);
        }
        
        scanner.close();
    }
}
   
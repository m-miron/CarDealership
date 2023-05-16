import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DealershipFileManager {

    //        private final ArrayList<Vehicle> vehiclesList = new ArrayList<>();
    public Dealership getDealership() {
            try {
                // To open the dealership file for reading
                String dealershipFileName = "01-DealershipVehicleList";
                BufferedReader dealershipFileReader = new BufferedReader(new FileReader(dealershipFileName));

                // To extract dealership information (name, address, phone)
                String dealershipInformation = dealershipFileReader.readLine();
                String[] dealershipDetails = dealershipInformation.split("\\|");
                String name = dealershipDetails[0];
                String address = dealershipDetails[1];
                String phone = dealershipDetails[2];

                // Create a new Dealership object with the extracted information
                Dealership anotherDealership = new Dealership(name, address, phone);


                // Read the remaining lines of the file containing vehicle information
                String fileLine;
                while ((fileLine = dealershipFileReader.readLine()) != null) {
                    if (!fileLine.isEmpty()) {
                        String[] vehicleDetails = fileLine.split("\\|");
                        // Extract vehicle information
                        int vin = Integer.parseInt(vehicleDetails[0]);
                        int year = Integer.parseInt(vehicleDetails[1]);
                        String make = vehicleDetails[2];
                        String model = vehicleDetails[3];
                        String vehicleType = vehicleDetails[4];
                        String color = vehicleDetails[5];
                        int odometer = Integer.parseInt(vehicleDetails[6]);
                        double price = Double.parseDouble(vehicleDetails[7]);
                        // Create a new Vehicle object with the extracted information
                        Vehicle vehicle = new Vehicle(vin, year, make, model, vehicleType, color, odometer, price);
                        // Add the Vehicle object to the Dealership's inventory
                        anotherDealership.addVehicle(vehicle);
                    }
                }

                dealershipFileReader.close();

                return anotherDealership;// Return the newly constructed Dealership object

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }


    public void  saveDealership (Dealership anotherDealership){
     //TODO: Implement logic for saving a new dealership.
    }
}

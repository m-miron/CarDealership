import java.util.ArrayList;
import java.util.List;

public class Dealership {

    private String name;
    private String address;
    private String phone;
    private ArrayList<Vehicle> inventory;

    public Dealership(String name, String address, String phone, ArrayList<Vehicle> inventory) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.inventory = inventory;
    }

    public List<Vehicle> getVehiclesByPrice(double min, double max) {
        return null;
    }

    public List<Vehicle> getVehiclesByMakeModel(String make, String model) {
        return null;
    }

    public List<Vehicle> getVehiclesByColor(String color) {
        return null;
    }

    public List<Vehicle> getVehiclesByMileage(int min, int max) {
        return null;
    }

    public List<Vehicle> getVehiclesByType(String vehicleType) {
        return null;
    }

    public List<Vehicle> getAllVehicles() {
        return inventory;
    }

    public void addVehicle(Vehicle anotherVehicle) {
        inventory.add(anotherVehicle);
    }

    public void removeVehicle(Vehicle anotherVehicle) {
        inventory.remove(anotherVehicle);
    }
    // Reads ledger file into ArrayList
    private int loadAllFromFile() throws IOException {
        String s;
        while ((s = ledgerFileReader.readLine()) != null) {
            Transaction t = fromFileText(s);
            transactions.add(t);

}

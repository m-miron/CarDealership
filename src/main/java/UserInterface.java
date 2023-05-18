import java.util.List;
import java.util.Scanner;

public class UserInterface {


    private Dealership dealership;
    public static Scanner userInput = new Scanner(System.in);

    public void display() {
        init();
        //loop
        while (true) {
            displayMainMenu();
            return;
        }//go to beginning of loop?
    }

    private void init() {
        DealershipFileManager dealershipFileManager = new DealershipFileManager();
        this.dealership = dealershipFileManager.getDealership();
        //return?
    }

    private void displayMainMenu() {
        System.out.println("""
                -------------------- Dealership Menu --------------------\s
                        
                Welcome! Please enter an option below (number only):
                        
                1   Vehicles by Price
                2   Vehicles by Make and Model
                3   Vehicles by Year
                4   Vehicles by Color
                5   Vehicles by Mileage
                6   Vehicles by Type
                7   All Vehicles
                8   Add Vehicle
                9   Remove Vehicle
                0   Exit  \s
                                
                ---------------------------------------------------------\s
                        
                Go to:  \s""");
        String usersInput = userInput.nextLine();
//        System.out.println("\n---------------------------------------------------------\n");
        switch (usersInput) {
            case "1" -> processGetByPriceRequest();
            case "2" -> processGetByMakeModelRequest();
            case "3" -> processGetByYearRequest();
            case "4" -> processGetByColorRequest();
            case "5" -> processGetByMileageRequest();
            case "6" -> processGetByVehicleTypeRequest();
            case "7" -> processGetAllVehiclesRequest();
            case "8" -> processAddVehicleRequest();
            case "9" -> processRemoveVehicleRequest();
            case "0" -> {
                System.out.println("Good-bye.");
                System.exit(0);
            }
            default -> System.out.println("Invalid entry. Please try again.");
        }
    }

    private void processGetByPriceRequest() {
        //TODO: Input logic for for getting vehicles by price
        System.out.println("Enter minimum price: ");
        double minPriceInput = userInput.nextDouble();
        System.out.println("Enter maximum price: ");
        double maxPriceInput = userInput.nextDouble();
        userInput.nextLine();
        horizontalLine();
        String title = "SEARCH BY PRICE";
        titleLine(title, 110);
        headerLine();

        List<Vehicle> vehicles = dealership.getVehiclesByPrice(minPriceInput, maxPriceInput);
        if (vehicles.isEmpty()) {
            noMatch();
        } else {
            for (Vehicle vehicle : vehicles) {
                System.out.println(vehicle.vehicleListFormat());
            }
        }
    }

    private void processGetByMakeModelRequest() {
        //TODO: Input logic for getting vehicles by make and model
        System.out.println("Enter make: ");
        String makeInput = userInput.nextLine();
        System.out.println("Enter model: ");
        String modelInput = userInput.nextLine();
        horizontalLine();
        String title = "SEARCH BY MAKE/MODEL";
        titleLine(title, 110);
        headerLine();

        List<Vehicle> vehicles = dealership.getVehiclesByMakeModel(makeInput, modelInput);
        if (vehicles.isEmpty()) {
            noMatch();
        } else {
            for (Vehicle vehicle : vehicles) {
                System.out.println(vehicle.vehicleListFormat());
            }
        }
    }

    private void processGetByYearRequest() {
        //TODO: Input logic for getting vehicles by year
        System.out.println("Enter oldest year: ");
        int oldestYearInput = userInput.nextInt();
        System.out.println("Enter newest year: ");
        int newestYearInput = userInput.nextInt();
        horizontalLine();
        String title = "SEARCH BY YEAR";
        titleLine(title, 110);
        headerLine();

        List<Vehicle> vehicles = dealership.getVehiclesByYear(oldestYearInput, newestYearInput);
        if (vehicles.isEmpty()) {
            noMatch();
        } else {
            for (Vehicle vehicle : vehicles) {
                System.out.println(vehicle.vehicleListFormat());
            }
        }
    }

    private void processGetByColorRequest() {
        //TODO: Input logic for getting vehicles by color
        System.out.println("Enter color: ");
        String colorInput = userInput.nextLine();
        horizontalLine();
        String title = "SEARCH BY COLOR";
        titleLine(title, 110);
        headerLine();

        List<Vehicle> vehicles = dealership.getVehiclesByColor(colorInput);
        if (vehicles.isEmpty()) {
            noMatch();
        } else {
            for (Vehicle vehicle : vehicles) {
                System.out.println(vehicle.vehicleListFormat());
            }
        }
    }

    private void processGetByMileageRequest() {
        //TODO: Input logic for getting vehicles by mileage
        System.out.println("Enter minimum mileage: ");
        int minMileageInput = userInput.nextInt();
        System.out.println("Enter maximum mileage: ");
        int maxMileageInput = userInput.nextInt();
        horizontalLine();
        horizontalLine();
        String title = "SEARCH BY MILEAGE";
        titleLine(title, 110);
        headerLine();

        List<Vehicle> vehicles = dealership.getVehiclesByMileage(minMileageInput, maxMileageInput);
        if (vehicles.isEmpty()) {
            noMatch();
        } else {
            for (Vehicle vehicle : vehicles) {
                System.out.println(vehicle.vehicleListFormat());
            }
        }
    }

    private void processGetByVehicleTypeRequest() {
        //TODO: Input logic for getting vehicles by vehicle type
        System.out.println("Enter vehicle type: ");
        String vehicleTypeInput = userInput.nextLine();
        horizontalLine();
        String title = "SEARCH BY VEHICLE TYPE";
        titleLine(title, 110);
        headerLine();

        List<Vehicle> vehicles = dealership.getVehiclesByType(vehicleTypeInput);
        if (vehicles.isEmpty()) {
            noMatch();
        } else {
            for (Vehicle vehicle : vehicles) {
                System.out.println(vehicle.vehicleListFormat());
            }
        }
    }

    private void processGetAllVehiclesRequest() {
        List<Vehicle> allVehicles = dealership.getAllVehicles();
        displayVehicles(allVehicles);
        //return;
    }

    private void processAddVehicleRequest() {
        //TODO: Input logic for adding a vehicle
    }

    private void processRemoveVehicleRequest() {
        //TODO: Input logic for removing a vehicle
    }

    private void displayVehicles(List<Vehicle> vehicles) {
        horizontalLine();
        String title = "ALL VEHICLES";
        titleLine(title, 110);
        headerLine();
        for (Vehicle vehicle : vehicles) {
            String vehiclesListFormat = vehicle.vehicleListFormat();
            System.out.println(vehiclesListFormat);
        }
        horizontalLine();
    }

    private void horizontalLine() {
        System.out.println("--------------------------------------------------------------------------------------------------------------------------\n");
    }

    private void headerLine() {
        System.out.println("""
                --------------------------------------------------------------------------------------------------------------------------
                 VIN             COLOR          TYPE            YEAR             MAKE           MODEL           MILEAGE         PRICE\s
                --------------------------------------------------------------------------------------------------------------------------\s
                """);
    }

    private void titleLine(String title, int lineLength) {
        int titleLength = title.length();
        int padding = (lineLength - titleLength) / 2;

        System.out.printf("%" + padding + "s%s%" + padding + "s%n", "", title, "");
    }

    private void noMatch() {
        System.out.println("None found.");
    }

}


import java.util.List;
import java.util.Scanner;

public class UserInterface {


    private Dealership dealership;

    public void display() {//public UserInterface::display()
        init();//  -> private init(), loads dealership, dealership is now initialized
        //loop
        while (true) {
        displayMainMenu();//display the menu, call helper method?
        return;
        }//go to beginning of loop?
    }

    private void init() {//Private UserInterface::init()
        //Create instance of DealershipFileManager, new DealershipFileManager ?
        DealershipFileManager dealershipFileManager = new DealershipFileManager();
        //Get Dealership dealership
        //-> DealershipFileManager::getDealership()
        //Assign to dealership member variable
        this.dealership = dealershipFileManager.getDealership();
        //return?
    }

    private void displayMainMenu() {
        //read user command - use Scanner?
        Scanner userInput = new Scanner(System.in);
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
                        """);
        String usersInput = userInput.nextLine();
        //switch( ){
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
        //TODO: Implement logic for this method.
    }

    private void processGetByMakeModelRequest() {
        //TODO: Implement logic for this method.
    }

    private void processGetByYearRequest() {
        //TODO: Implement logic for this method.
    }

    private void processGetByColorRequest() {
        //TODO: Implement logic for this method.
    }

    private void processGetByMileageRequest() {
        //TODO: Implement logic for this method.
    }

    private void processGetByVehicleTypeRequest() {
        //TODO: Implement logic for this method.
    }

    private void processGetAllVehiclesRequest() {
        //TODO: Implement logic for this method.
    }

    private void processAddVehicleRequest() {
        //TODO: Implement logic for this method.
    }

    private void processRemoveVehicleRequest() {
        //TODO: Implement logic for this method.
    }

//    private UserInterface::displayVehicles( List list )
    private void displayVehicles(List<Vehicle> vehicles){
        System.out.println("-------------------- Vehicle List --------------------");
        for (Vehicle vehicle : vehicles){
            System.out.println(vehicle);
        }
        System.out.println("---------------------------------------------------------");
    }

//    UserInterface::processAllVehiclesRequest()
    private void processAllVehiclesRequest(){
        List <Vehicle> allVehicles = dealership.getAllVehicles();
        displayVehicles(allVehicles);
    }
//   -> List l = dealership.getAllVehicles()
//   -> displayVehicles( l )
//   return
}


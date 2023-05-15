import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

public class DealershipFileManager {


        private final ArrayList<Vehicle> vehiclesList = new ArrayList<>();
        private final String dealershipFileName = "01-DealershipVehicleList";
        private BufferedReader dealershipFileReader;

        public Dealership getDealership() {
            try {
                dealershipFileReader = new BufferedReader(new FileReader(dealershipFileName));
//                loadAllFromFile();
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
            return null;
        }


    public void  saveDealership (Dealership anotherDealership){
     //Placeholder. Will add later.
    }
}

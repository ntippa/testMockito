package test.ntippa.testpowermockito.services;

import java.util.List;

import test.ntippa.testpowermockito.dao.IPlantDAO;
import test.ntippa.testpowermockito.dao.PlantJsonDao;
import test.ntippa.testpowermockito.dto.PlantDTO;

/**
 * Created by nalin on 4/26/2018.
 */

public class PlantService implements IPlantService {

    IPlantDAO plantDAO; // variable is interface type

    public PlantService(){
        plantDAO = new PlantJsonDao();// the object type can interchange for future implementations as long as they implement the interface
    }

    @Override
    public List<PlantDTO> fetchPlants(String filter) {
        return plantDAO.fetch(filter);

    }
}

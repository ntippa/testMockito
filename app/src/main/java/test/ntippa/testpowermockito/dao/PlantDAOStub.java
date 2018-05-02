package test.ntippa.testpowermockito.dao;

import java.util.ArrayList;
import java.util.List;

import test.ntippa.testpowermockito.dto.PlantDTO;

/**
 * Created by nalin on 4/26/2018.
 */

public class PlantDAOStub implements IPlantDAO {
    @Override
    public List<PlantDTO> fetch(String filter) {
        List<PlantDTO> allPlants = new ArrayList<PlantDTO>();
        PlantDTO plant = new PlantDTO();
        plant.setCommon("comm1");
        plant.setGenus("Genu1");
        plant.setType("tree");
        allPlants.add(plant);

        PlantDTO flower = new PlantDTO();
        flower.setCommon("comm2");
        flower.setGenus("Gen2");
        flower.setType("flower");
        allPlants.add(flower);


        return allPlants;
    }
}

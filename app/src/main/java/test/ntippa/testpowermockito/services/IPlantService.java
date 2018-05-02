package test.ntippa.testpowermockito.services;

import java.util.List;

import test.ntippa.testpowermockito.dto.PlantDTO;

/**
 * Created by nalin on 4/26/2018.
 */

public interface IPlantService {

    /**
     *
     * @param filter
     * @return
     */
    public List<PlantDTO> fetchPlants(String filter);
}

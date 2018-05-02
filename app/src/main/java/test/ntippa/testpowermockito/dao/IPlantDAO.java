package test.ntippa.testpowermockito.dao;

import java.util.List;

import test.ntippa.testpowermockito.dto.PlantDTO;

/**
 * Created by nalin on 4/25/2018.
 */

public interface IPlantDAO {
    public List<PlantDTO> fetch(String filter);
}

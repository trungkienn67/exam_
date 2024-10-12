package PlaceTravel.demo.services;

import PlaceTravel.demo.dto.PlaceDto;
import PlaceTravel.demo.entity.Place;

import java.util.List;

public interface PlaceService {

    List<PlaceDto> getAllPlace();
}

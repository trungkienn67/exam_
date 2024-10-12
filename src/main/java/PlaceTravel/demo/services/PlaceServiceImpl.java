package PlaceTravel.demo.services;


import PlaceTravel.demo.dto.PlaceDto;
import PlaceTravel.demo.entity.Place;
import PlaceTravel.demo.repository.PlaceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class PlaceServiceImpl implements PlaceService{

    private final PlaceRepository placeRepository;


    @Override
    public List<PlaceDto> getAllPlace() {
        return placeRepository.findAll().stream().map(Place::getPlaceDto).collect(Collectors.toList());
    }
}

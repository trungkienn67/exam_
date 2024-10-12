package PlaceTravel.demo.controllers;


import PlaceTravel.demo.dto.PlaceDto;
import PlaceTravel.demo.services.PlaceService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/places")
@CrossOrigin(origins = "*") // Cho phép từ nguồn này

public class PlaceController {

    private final PlaceService placeService;

    @GetMapping("/getAllPlace")
    public ResponseEntity<List<PlaceDto>> getAllPlace(){
        List<PlaceDto> placeDtos = placeService.getAllPlace();
        return ResponseEntity.ok(placeDtos);
    }

}

package PlaceTravel.demo.entity;


import PlaceTravel.demo.dto.PlaceDto;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "places")
public class Place {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;


    public PlaceDto getPlaceDto(){
        PlaceDto placeDto = new PlaceDto();
        placeDto.setId(id);
        placeDto.setName(name);
        return placeDto;
    }
}

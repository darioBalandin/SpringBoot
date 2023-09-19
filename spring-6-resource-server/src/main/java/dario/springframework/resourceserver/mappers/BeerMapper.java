package dario.springframework.resourceserver.mappers;

import dario.springframework.resourceserver.entities.Beer;
import dario.springframework.resourceserver.model.BeerDTO;
import org.mapstruct.Mapper;


@Mapper
public interface BeerMapper {

    Beer beerDtoToBeer(BeerDTO dto);

    BeerDTO beerToBeerDto(Beer beer);

}

package dario.springframework.spring6restmvc.mappers;

import dario.springframework.spring6restmvc.entities.Beer;
import dario.springframework.spring6restmvc.model.BeerDTO;
import org.mapstruct.Mapper;


@Mapper
public interface BeerMapper {

    Beer beerDtoToBeer(BeerDTO dto);

    BeerDTO beerToBeerDto(Beer beer);

}

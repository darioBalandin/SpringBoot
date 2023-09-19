 package dario.springframework.reactivemongo.mappers;

import dario.springframework.reactivemongo.domain.Beer;
import dario.springframework.reactivemongo.model.BeerDTO;
import org.mapstruct.Mapper;


@Mapper
public interface BeerMapper {

    BeerDTO beerToBeerDto(Beer beer);

    Beer beerDtoToBeer(BeerDTO beerDTO);
}

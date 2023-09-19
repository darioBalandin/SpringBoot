package dario.springframework.spring6reactive.mappers;

import dario.springframework.spring6reactive.domain.Beer;
import dario.springframework.spring6reactive.model.BeerDTO;
import org.mapstruct.Mapper;

@Mapper
public interface BeerMapper {
    Beer beerDtoToBeer(BeerDTO dto);

    BeerDTO beerToBeerDto(Beer beer);
}

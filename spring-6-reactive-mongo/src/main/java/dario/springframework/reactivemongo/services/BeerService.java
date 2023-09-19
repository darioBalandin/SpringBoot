package dario.springframework.reactivemongo.services;

import dario.springframework.reactivemongo.model.BeerDTO;
import reactor.core.publisher.Mono;

public interface BeerService {

    Mono<BeerDTO> saveBeer(Mono<BeerDTO> beerDTO);


    Mono<BeerDTO> getById(String beerId);

}

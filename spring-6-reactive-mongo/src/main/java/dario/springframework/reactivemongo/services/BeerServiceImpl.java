package dario.springframework.reactivemongo.services;

import dario.springframework.reactivemongo.mappers.BeerMapper;
import dario.springframework.reactivemongo.model.BeerDTO;
import dario.springframework.reactivemongo.repositories.BeerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class BeerServiceImpl implements BeerService {

    private final BeerMapper beerMapper;
    private final BeerRepository beerRepository;


    @Override
    public Mono<BeerDTO> saveBeer(Mono<BeerDTO> beerDTO) {
        return beerDTO.map(beerMapper::beerDtoToBeer)
                .flatMap(beerRepository::save)
                .map(beerMapper::beerToBeerDto);

    }

    @Override
    public Mono<BeerDTO> getById(String beerId) {
        return null;
    }
}

package dario.springframework.reactivemongo.services;

import dario.springframework.reactivemongo.domain.Beer;
import dario.springframework.reactivemongo.mappers.BeerMapper;
import dario.springframework.reactivemongo.model.BeerDTO;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class BeerServiceImplTest {


    @Autowired
    BeerService beerService;

    @Autowired
    BeerMapper beerMapper;

    BeerDTO beerDTO;

    @BeforeEach
    void setUp() {
        beerDTO = beerMapper.beerToBeerDto(getTestBeer());
    }


    @Test
    void saveBeer() throws InterruptedException {
        Mono<BeerDTO> saveMono = beerService.saveBeer(Mono.just(beerDTO));


        saveMono.subscribe(s -> System.out.println(s));

        Thread.sleep(1000l);
    }

    public static Beer getTestBeer() {
        return Beer.builder()
                .beerName("Space Dust")
                .beerStyle("IPA")
                .price(BigDecimal.TEN)
                .quantityOnHand(12)
                .upc("123213")
                .build();
    }
}
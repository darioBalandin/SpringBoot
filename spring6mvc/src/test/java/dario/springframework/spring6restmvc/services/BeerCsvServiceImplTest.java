package dario.springframework.spring6restmvc.services;

import dario.springframework.spring6restmvc.model.BeerCSVRecord;
import org.junit.jupiter.api.Test;
import org.springframework.data.jpa.repository.query.JSqlParserUtils;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;


class BeerCsvServiceImplTest {

    BeerCsvService beerCsvService = new BeerCsvServiceImpl();
    @Test
    void convertCsv() throws FileNotFoundException {
        File file= ResourceUtils.getFile("classpath:csvdata/beers.csv");
        List<BeerCSVRecord> recs= beerCsvService.convertCsv(file);
        System.out.println(recs.size());
        System.out.println(recs.get(0).toString());
        assertThat(recs.size()).isEqualTo(2410);
    }
}
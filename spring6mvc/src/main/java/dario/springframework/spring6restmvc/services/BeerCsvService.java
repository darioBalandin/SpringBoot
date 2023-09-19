package dario.springframework.spring6restmvc.services;

import dario.springframework.spring6restmvc.model.BeerCSVRecord;

import java.io.File;
import java.util.List;

public interface BeerCsvService {
    List<BeerCSVRecord> convertCsv (File file);
}

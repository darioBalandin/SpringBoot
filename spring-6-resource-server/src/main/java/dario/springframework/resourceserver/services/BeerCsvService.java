package dario.springframework.resourceserver.services;

import dario.springframework.resourceserver.model.BeerCSVRecord;

import java.io.File;
import java.util.List;


public interface BeerCsvService {
    List<BeerCSVRecord> convertCSV(File csvFile);
}

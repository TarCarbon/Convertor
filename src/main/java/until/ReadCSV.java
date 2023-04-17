package until;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import entity.CurrencyModel;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadCSV implements ReadFromFile<CurrencyModel, String>{
    @Override
    public List<CurrencyModel> reader(String path) throws IOException, CsvValidationException {
            CSVReader reader = new CSVReader(new FileReader(path));
            List<CurrencyModel> currencyModels = new ArrayList<>();
            reader.skip(1);
            String[] record = null;
            while((record = reader.readNext()) != null) {
                currencyModels.add(CurrencyModel.builder()
                        .timestamp(record[0])
                        .symbol(record[1])
                        .price(Integer.getInteger(record[2]))
                        .build());
            }
            reader.close();
        return currencyModels;
    }
}

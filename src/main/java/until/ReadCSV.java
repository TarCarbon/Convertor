package until;

import com.opencsv.bean.CsvToBeanBuilder;
import com.opencsv.exceptions.CsvValidationException;
import entity.CurrencyModel;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

//for class name will be bater somthing like CsvReader instead of it
public class ReadCSV implements ReadFromFile<CurrencyModel, String> {
    
    /*
    1)why we parse it manualy? why don't we use a builder if we have one?
    2)I don't think relying on the column number is a good idea. columns can be swapped. better to base on the headline.
    3)what's the point of using the opencsv in this way? the only thing she does is skip the first row.
    this can be done without a library and there will be no more code. will be better to use bean based solution
    */
    @Override
    public List<CurrencyModel> reader(String path) throws IOException, CsvValidationException {
        try (Reader reader = Files.newBufferedReader(Paths.get(path))) {
            return new CsvToBeanBuilder<>(reader).withType(CurrencyModel.class).build().stream()
                    .map(v -> (CurrencyModel) v).collect(Collectors.toList());
        }
    }

}

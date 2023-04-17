package until;

import com.opencsv.exceptions.CsvValidationException;
import java.io.IOException;
import java.util.List;

public interface ReadFromFile<T, P>{
   public List<T> reader(P p) throws IOException, CsvValidationException;
}

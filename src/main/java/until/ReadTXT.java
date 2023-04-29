package until;

import com.google.gson.Gson;
import entity.CurrencyModel;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

//for class name will be bater somthing like TxtReader instead of it
public class ReadTXT implements ReadFromFile<CurrencyModel, String> {

    private final static Gson MAPPER = new Gson();

    //very complex implementation (better to use stream api)
    //an unclosed I/O stream is a problem
    @Override
    public List<CurrencyModel> reader(String path) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            return reader.lines()
                    .map(line -> MAPPER.fromJson(line, CurrencyModel.class))
                    .collect(Collectors.toList());
        }
    }

}

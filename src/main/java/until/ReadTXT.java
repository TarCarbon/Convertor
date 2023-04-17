package until;

import com.google.gson.Gson;
import entity.CurrencyModel;

import java.io.*;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class ReadTXT implements ReadFromFile<CurrencyModel, String> {
    @Override
    public List<CurrencyModel> reader(String path) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(path));

        List<CurrencyModel> currencyModelList = new ArrayList<>();
        String line;
        while ((line = br.readLine()) != null) {
            currencyModelList.add(new Gson().fromJson(line, CurrencyModel.class));
        }
        return currencyModelList;
    }
}
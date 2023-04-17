package entity;

import lombok.Builder;
import lombok.ToString;

import java.util.List;

@ToString
@Builder
public class Currencies {
    private List<CurrencyModel> currencyModelList;

    public Integer minCost (){
        return null;
    }

    public Integer maxCost(){
        return null;
    }

    public Integer amaCost(String initialDate, String finalDate){
        return null;
    }

    public Double normalizedValueCost(){
        return (Double) ((maxCost() - minCost()) / minCost());
    }
}

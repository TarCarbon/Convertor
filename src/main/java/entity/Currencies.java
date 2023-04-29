package entity;

import lombok.Builder;
import lombok.ToString;

//what is it(@ToString and @Builder)? :)
//@ToString
//@Builder
public class Currencies {
    
    //unused
    //private List<CurrencyModel> currencyModelList;

    //I haven't any comments about stub...
    public Integer minCost (){
        return null;
    }
    
    //I haven't any comments about stub...
    public Integer maxCost(){
        return null;
    }

    //I haven't any comments about stub...
    public Integer amaCost(String initialDate, String finalDate){
        return null;
    }
    
    /*
    if we perform any mathematical operations with an int, then we will always get an int as a result    
    to uderstand it try this one:    
    int a = 3;
    int b = 2;        
    System.out.println(a/b);
    */
    public Double normalizedValueCost(){
        double minCost = minCost().doubleValue();
        return ((maxCost() - minCost) / minCost);
    }
}

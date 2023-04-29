package entity;

//are we need all lombok? ))
import com.opencsv.bean.CsvBindByName;
import lombok.*;

//how we must to use it with private fields and without getter?
@ToString
@Builder
public class CurrencyModel {
    
    @CsvBindByName(column = "symbol")
    private String symbol;
    
    //if we want to use exact number, then it's not int (may be long?)
    @CsvBindByName(column = "price")
    private Integer price;
    
    //string for timestamp? but why??
    @CsvBindByName(column = "timestamp")
    private String timestamp;

}

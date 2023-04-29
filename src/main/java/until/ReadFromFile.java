package until;

import com.opencsv.exceptions.CsvValidationException;
import java.io.IOException;
import java.util.List;

//its a bad name for intarface
public interface ReadFromFile<T, P>{
    
   //oh no!!! CsvValidationException - its a specific exception for opencsv!
   //we declarated abstarct method on interface level. 
   //how this method will override classes that will not use opencsv?
    
   //for what purpose do we use 2 generics? for list typing, its normal. 
    //but why do we need to type the argument? its in any case path or inputstream
    //and that is why implementations have the opportunity to use a string that is not intended for these purposes
   public List<T> reader(P p) throws IOException, CsvValidationException;
}

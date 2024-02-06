import java.util.ArrayList;
import java.util.List;

class Series {
    String string;
    Series(String string) {
        if (string == ""){
            throw new IllegalArgumentException("series cannot be empty"); 
        }
        this.string = string;
    }

    List<String> slices(int num) {
        if (num <= 0) {
            throw new IllegalArgumentException("slice length cannot be negative or zero");
        }
        
        if (num > string.length()) {
            throw new IllegalArgumentException("slice length cannot be greater than series length");
        }
    
        List<String> result = new ArrayList<>();
        for (int i = 0; i <= string.length() - num; ++i) {
            result.add(string.substring(i, i + num));
        }
        return result;
    }
    
}

import java.util.StringJoiner;  
public class StringJoinerExample {  
    public static void main(String[] args) {  
        // StringJoiner joinNames = new StringJoiner(",");
        StringJoiner joinNames = new StringJoiner(",", "[", "]");     
	// passing comma(,) as delimiter   
        joinNames.add("Tari");  
        joinNames.add("Syila");  
        joinNames.add("Putra");  
        joinNames.add("Adi");                   
        System.out.println(joinNames);  
    }  
} 
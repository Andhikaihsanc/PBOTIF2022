import java.util.StringJoiner;  
public class StringJoinerExample3 {  
    public static void main(String[] args) {  
        StringJoiner joinNames = new StringJoiner(",", "[", "]");   // passing comma(,) and square-brackets as delimiter   
        joinNames.add("Tari");  
        joinNames.add("Syila");
        StringJoiner joinNames2 = new StringJoiner(":", "[", "]");  // passing colon(:) and square-brackets as delimiter   
        joinNames.add("Putra");  
        joinNames.add("Adi"); 
    
StringJoiner merge = joinNames.merge(joinNames2);   
        System.out.println(merge);  
    }  
} 
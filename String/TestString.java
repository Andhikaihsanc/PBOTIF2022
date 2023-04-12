public class TestString {
    public static void main(String[] args){
        StringBuilder str = new StringBuilder();
        str.append("Filkom");
        System.out.println("String = " + str.toString());
        StringBuilder str1 = new StringBuilder("AAAABBBCCCC");
        System.out.println("String1 = "+ str1.toString());
        StringBuilder str2 = new StringBuilder(10);
        System.out.println("String2 capacity = " + str2.capacity());
        StringBuilder str3 = new StringBuilder(str1.toString());
        System.out.println("String3 = " + str3.toString());

        str.append(2);
        str.append(4.5);

        // str2.append("1234567891011121314");
        // System.out.println("String2"+str2.toString());
    }
}


public class RunLengthEncode{
    public static String Encode(String text){
        String result = "";
        char current = text.charAt(0);
        int i = 1;
        for(int j = 1; j < text.length();j++){
            if(current == text.charAt(j)){
                i++;
            }else {
                if(i>4){
                    result += '/' + (i < 10 ? "0"+ String.valueOf(i) : String.valueOf(i)) + current;
                }else {
                    for (int j2 = 0; j2 < i; j2++) {
                        result += current;
                    }
                }
                current = text.charAt(j);
                i = 1;
            }

        }
        if(i>4){
            result += '/' + (i < 10 ? "0"+ String.valueOf(i) : String.valueOf(i)) + current;
        }else {
            for (int j2 = 0; j2 < i; j2++) {
                result += current;
            }
        }
        return result;
    }
}
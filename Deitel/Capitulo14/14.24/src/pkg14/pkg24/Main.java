package pkg14.pkg24;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        Pattern expression = Pattern.compile("J.*\\d[0-35-9]-\\d\\d-\\d\\d");
        
        String string1 = """
                         Jane's Birthday is 07-12-76
                         Dave's Birthday is 07-12-76
                         John's Birthday is 07-12-76
                         Joe's Birthday is 12-17-77""";
        
        Matcher matcher = expression.matcher(string1);
        while(matcher.find())
            System.out.println(matcher.group());
    }
    
}

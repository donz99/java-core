import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test28102025 {
    public static void main(String[] args) {
        String s ="http://javarush.ru/alpha/index.html?lvl=15&view&name=Amigo";
        Pattern pattern = Pattern.compile("\\?([=\\w+\\d+]+)&");
        Matcher matcher = pattern.matcher(s);
        Pattern pattern1 = Pattern.compile("\\?([=\\w+\\d+]+)&([=\\w+\\d+]+)");
        Matcher matcher1 = pattern1.matcher(s);
        if (matcher.find())
        System.out.println(matcher.group(1));
        while (matcher1.find()){
            System.out.println(matcher1.group(2));
            }

//        System.out.println("I found '"+matcher.group(1)+"' starting at index"+matcher.start()+" and ending at index"+matcher.end()+".");
//                );

    }
}

package topic_4.topic_4_3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ContainWords {
    public static void main(String[] args) {

        String line = "Перевірка чи містить рядок лише літери";
        //String regex = "\\D+";
        String regex = "[^0-9]+";


        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(line);
        System.out.println(matcher.matches());
    }
}

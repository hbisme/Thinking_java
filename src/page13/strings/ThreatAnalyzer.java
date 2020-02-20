package page13.strings;

import java.util.Scanner;
import java.util.regex.MatchResult;
import java.util.regex.Pattern;

public class ThreatAnalyzer {
    static String threatData = "28.27.82.161@02/10/2005\n204.27.81.40@02/11/2005\n58.27.82.60@03/11/2005\n[Next log section with different data format]";

    public static void main(String[] args) {

        Scanner scanner = new Scanner(threatData);
        String pattern = "(\\d+[.]\\d+[.]\\d+[.]\\d+)@(\\d{2}/\\d{2}/\\d{4}})";

        while(scanner.hasNext(pattern)) {
            scanner.next(pattern);
            MatchResult match = scanner.match();
            String ip = match.group(1);
            String date = match.group(2);
            System.out.println(ip + date);

        }


    }
}

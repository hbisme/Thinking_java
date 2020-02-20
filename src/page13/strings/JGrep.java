package page13.strings;

import net.mindview.util.TextFile;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JGrep {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("\\b[Ssct]\\w+");
        int index = 1;
        Matcher m = p.matcher("");
        for (String line : new TextFile("/Volumes/myDocument/myIdeaProjects/Thinking_java/src/page13/strings/JGrep.java")) {
            m.reset(line);
            while (m.find()) {
                System.out.println(index++ + ": " + m.group() + ": " + m.start());
            }
        }
    }
}

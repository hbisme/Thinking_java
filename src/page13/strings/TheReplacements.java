package page13.strings;

import net.mindview.util.TextFile;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*! Here's   a block of text to use as input to
    the regular expression matcher. Note that we'll
    first extract the block of text by looking for
    the special delimiters, then process the
    extracted block.  !*/

public class TheReplacements {
    public static void main(String[] args) {
        String s = TextFile.read("/Volumes/myDocument/myIdeaProjects/Thinking_java/src/page13/strings/TheReplacements.java");
        Matcher mInput = Pattern.compile("/\\*!(.*)!\\*/", Pattern.DOTALL).matcher(s);

        if (mInput.find()) {
            s = mInput.group(1);
        }

        s = s.replaceAll(" {2,}", " ");
        s = s.replaceAll("(?m)^ +", "");   // (?m)表示多行模式
        System.out.println(s);
        System.out.println("--------");

        s = s.replaceFirst("[aeiou]", "(VOWEL1)");
        StringBuffer sbuf = new StringBuffer();
        Pattern p = Pattern.compile("[aeiou]");
        Matcher m = p.matcher(s);

        while(m.find()) {
            m.appendReplacement(sbuf, m.group().toUpperCase());
        }

        m.appendTail(sbuf);
        System.out.println(sbuf);
    }
}

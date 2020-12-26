/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package functions;

/**
 *
 * @author Administrator
 */
public class CheckingSingleQuote {

    public static String checkSingleQuote(String text) {
        String te = "";
        char[] toCharArray = text.toCharArray();
        char tt = '\'';
        for (char c : toCharArray) {
            if (c == tt) {
                te += c;
                te += c;
            } else {
                te += c;
            }
        }
        System.out.println("text : " + te);
        return te;
    }
}

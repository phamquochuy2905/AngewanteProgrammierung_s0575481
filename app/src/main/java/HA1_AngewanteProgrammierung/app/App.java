/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package HA1_AngewanteProgrammierung.app;

import HA1_AngewanteProgrammierung.list.LinkedList;

import static HA1_AngewanteProgrammierung.utilities.StringUtils.join;
import static HA1_AngewanteProgrammierung.utilities.StringUtils.split;
import static HA1_AngewanteProgrammierung.app.MessageUtils.getMessage;

public class App {
    public static void main(String[] args) {
        LinkedList tokens;
        tokens = split(getMessage());
        System.out.println(join(tokens));
    }
}

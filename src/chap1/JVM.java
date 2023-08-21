package chap1;

/*
JAVA优点：跨平台，强大生态，高效率
JVM vs JDK vs JRE
SDK = JDK + NetBeans/Eclipse/IntelliJ IDEA
JDK = JRE + javac/java/jdb
JRE = JVM + Java SE API java运行时的环境
 */
public class JVM {

    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        // Press Ctrl+F5 or click the green arrow button in the gutter to run the code.
        for (int i = 1; i <= 5; i++) {

            // Press Alt+F5 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing F9.
            System.out.println("i = " + i);
        }
    }
}

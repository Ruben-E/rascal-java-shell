package nl.rubenernst.rascal.test;

import java.io.IOException;
import java.io.InputStream;

public class Main {

    public static void main(String[] args) {
        // Run a java app in a separate system process
        Process proc = null;
        try {
            proc = Runtime.getRuntime().exec("java -Xmx1G -Xss32m -jar /Users/rubenernst/Documents/Development/sdks/rascal/rascal-0.6.2.jar");
            // Then retreive the process output
            InputStream in = proc.getInputStream();
            InputStream err = proc.getErrorStream();

            System.out.println(in.read());

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

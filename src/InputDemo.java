import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputDemo {

    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new InputStreamReader(System.in));

            String str = "";
            str = br.readLine();
        }

        catch (IOException e){
            System.out.println("error");

        }
        finally {
            br.close();

        }


    }
}


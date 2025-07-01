import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**
 *
 */
public class SocketTest {

    public static void main(String[] args) throws IOException {

        new GenerateRandomTemperatureBoard();


        try {

           //just a random get request for now
            var mySocket = new Socket("time-a.nist.gov",13);
            mySocket.setSoTimeout(24); //24 sec, after connection terminated
            var inSocket = new Scanner(mySocket.getInputStream(), StandardCharsets.UTF_8);

                while (inSocket.hasNextLine()){

                    String line = inSocket.nextLine();
                    System.out.println(line);

            }

        }

//        catch (IOException e) {
//            throw new RuntimeException(e);
//        }

        catch (SocketTimeoutException e){
            System.out.println("Time out ;/");
        }

    }
}
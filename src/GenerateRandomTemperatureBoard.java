//function that is a mock-up of the temperature matrix from the sensor

import java.util.Random;

public class generateRandomTemperatureBoard {

    //creating number from given range using pseudorandom generator
    /**room for improvment: generate all the numbers at once to and add it to matrix, and make it more realistic examples in order to simulate real temperature matrix**/

    Random random = new Random();
    float[][] sampleMatrix = new float[16][4];
    float min = -30;
    float max = +50;
    {
        for (int i = 0; i < sampleMatrix.length; i++) {
            for (int j = 0; j < sampleMatrix[i].length; j++) {
                sampleMatrix[i][j] = random.nextFloat();
                System.out.println(sampleMatrix[i][j]);
                System.out.println(sampleMatrix);
            }
        }
    }
}

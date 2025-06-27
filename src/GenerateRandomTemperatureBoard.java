//function that is a mock-up of the temperature matrix from the sensor

import java.util.Random;

public class GenerateRandomTemperatureBoard {

    Random random = new Random();
    float[][] sampleMatrix = new float[16][4];

    {
        for (int i = 0; i < sampleMatrix.length; i++) {

            System.out.println("\n");

            //temperature range

            float min = -30.00f;
            float max = +50.00f;

            for (int j = 0; j < sampleMatrix[i].length; j++) {

                //obtain a number  from the range

                sampleMatrix[i][j] = random.nextFloat()*(max-min)+min;

                System.out.print(sampleMatrix[i][j] + "\u0009");
                //System.out.println("i:" + i + " j:"+ j );
            }
        }
    }
}

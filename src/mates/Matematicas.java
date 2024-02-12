package mates;
import java.util.Random;
public class Matematicas{
    /**
     * * Genera una aproximación al número Pi mediante el método de
     * * Montecarlo. El parámetro `pasos` indica el número de puntos
     * * generado.
     * */
        public static double generarNumeroPiIterativo(long pasos) {
        Random random = new Random();
        long dentroCirculo = 0;

        for (long i = 0; i < pasos; i++) {
            double x = random.nextDouble();
            double y = random.nextDouble();
            double distancia = Math.sqrt(x * x + y * y);

            if (distancia <= 1) {
                dentroCirculo++;
            }
        }

        return 4.0 * dentroCirculo / pasos;
	}
}

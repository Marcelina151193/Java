public class FahrenheitConverter {
    public static void main(String[] args) {
        //W osobnej klasie FahrenheitConverter, w metodzie main() napisz program przekształcający dane
        // o temperaturze podanej w skali Fahrenheit do skali Celsjusza.
        // Dane wejściowe (temperatura w skali Fahrenheit) podać w inicjacji odpowiedniej zmiennej w programie.
        // Sprawdź czy program poprawnie oblicza temperatury dla danych:
        //32 °F = 0 °C; 212 °F = 100 °C
       float F = 212;
       double C = (F - 32)/ 1.8;

        System.out.println(F + " w skali Fahrenheita to w skali Celsjusza: " + C);

    }
}

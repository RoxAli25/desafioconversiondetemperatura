public class Main {
    public static void main(String[] args) {
        System.out.println("Desafío conversión de Temperatura");

        double temperaturaEnCelsius = 15.6;
        double temperaturaEnFahrenheit = (temperaturaEnCelsius * 1.8) + 32;

        String mensaje = String.format ("La temperatura de %f Celsius es equivalente a %f Fahrenheit", temperaturaEnCelsius, temperaturaEnFahrenheit);

        System.out.println(mensaje);

        int gradosFahrenheit = (int) temperaturaEnFahrenheit;

        System.out.println("La temperatura en Fahrenheit es:" + gradosFahrenheit);
    }
}
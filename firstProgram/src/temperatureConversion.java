void main() {
    double temperatureCelcius = 23;
    double temperatureFahrenheit = (temperatureCelcius * 1.8) + 32;

    String mensaje = """
        La temperatura de %s Celsius es equivalente a %s Fahrenheit
        """.formatted(temperatureCelcius, temperatureFahrenheit);
    System.out.println(mensaje);

    int temperatureFahrenheitInt = (int) temperatureFahrenheit;

    System.out.println("Temperatura en Fahrenheit entera es: " + temperatureFahrenheitInt);
}

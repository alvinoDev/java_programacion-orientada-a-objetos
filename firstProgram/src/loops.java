import java.util.Scanner;

void main() {
    Scanner inputData = new Scanner(System.in);

    double nota = 0;
    double mediaEvaluacion = 0;

    for (int i = 0; i < 3; i++) {
        System.out.println("Escribe la Nota para la pelicual Matrix:");
        nota = inputData.nextDouble();
        mediaEvaluacion = mediaEvaluacion + nota;
    }

    System.out.println("La media de evalucion es: " + mediaEvaluacion / 3);
}
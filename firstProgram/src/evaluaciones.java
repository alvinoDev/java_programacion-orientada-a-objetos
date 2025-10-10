import java.util.Scanner;

void main() {
    Scanner inputData = new Scanner(System.in);

    double nota = 0;
    double mediaEvaluacion = 0;
    double count = 0;

    while (nota != -1) {
        System.out.println("Escribe la Nota para la pelicual Matrix:");
        nota = inputData.nextDouble();

        if(nota != -1) {
            mediaEvaluacion += nota;
            count++;
        }
    }

    System.out.println("La media de evaluacion es: " + mediaEvaluacion / count);
}
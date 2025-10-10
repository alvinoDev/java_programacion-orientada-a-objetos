import java.util.Scanner;

void main() {
    Scanner inputData = new Scanner(System.in);

    int randomNumber = new Random().nextInt(100);
    int attempts = 5;
    int userNumber = 0;

    while (attempts != 0) {
        System.out.println("Ingresa un numero entre 0 y 100: ");
        userNumber = inputData.nextInt();

        if(userNumber == randomNumber){
            System.out.println("Felicidades, adivinaste el numero: " + randomNumber);
            break;
        }else{
            attempts--;
            String message = """
            Intentanlo nuevamente, te quedan %s intentos
            """.formatted(attempts);
            System.out.println(message);
        }
    }

    if(attempts == 0){
        System.out.println("Suerte para la proxima, el numero era: " + randomNumber);
    }
}
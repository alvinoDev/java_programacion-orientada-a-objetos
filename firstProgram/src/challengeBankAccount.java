
import java.util.Scanner;

void main() {

    String cutomerName = "Tony Stark";
    String typeAccount = "Corriente";
    double balance = 1599.99;

    int optionMenu = 0;

    Scanner inputData = new Scanner(System.in);

    String messageAccount = """
            ══════════════════════════════════════════════════════
                     🛡️  SISTEMA BANCARIO J.A.R.V.I.S.  🛡️
            
            Nombre del Cliente: %s
            Tipo de Cuenta: %s
            Saldo Disponible: $ %s
            ══════════════════════════════════════════════════════\n
            """.formatted(cutomerName, typeAccount, balance);
    System.out.println(messageAccount);

    String messageMenu = """
            ╔═════════════════════════════════════════════════════╗
            ║        Cajero Automático - Menú com.aluracursos.screenmatch.principal.Principal           ║
            ╠═════════════════════════════════════════════════════╣
            ║ [1] 🏦 Consultar Saldo                              ║
            ║ [2] 💸 Retirar Dinero                               ║
            ║ [3] 💰 Depositar Dinero                             ║
            ║ [9] 🚪 Salir del Programa                           ║
            ╚═════════════════════════════════════════════════════╝\n
            """.formatted(cutomerName, typeAccount, balance);

    while (optionMenu != 9) {
        System.out.println(messageMenu);
        System.out.print("» Ingrese su opción: ");

        optionMenu = inputData.nextInt();

        switch (optionMenu) {
            case 1:
                System.out.println("\n✅ SU SALDO ACTUAL: $" + balance + "\n");
                break;
            case 2:
                System.out.print("\n➡️ Ingrese el valor que desea retirar: $");
                double amountWithdraw = inputData.nextDouble();
                if (amountWithdraw > balance) {
                    System.out.println("\n⚠️ SALDO INSUFICIENTE. No se puede completar la transacción.\n");
                } else {
                    balance = balance - amountWithdraw;
                    System.out.println("\n🎉 Retiro exitoso. SALDO ACTUAL: $" + balance + "\n");
                }
                break;
            case 3:
                System.out.print("\n➡️ Ingrese el valor que desea depositar: $");
                double amountDeposit = inputData.nextDouble();
                balance += amountDeposit;
                System.out.println("\n🎊 Depósito exitoso. SALDO ACTUAL: $" + balance + "\n");
                break;
            case 9:
                System.out.println("\n👋 Saliendo del Programa... ¡Gracias por utilizar nuestros servicios!\n");
                break;
            default:
                System.out.println("\n⚠️ Opción no válida. Por favor, intente de nuevo.\n");
        }
    }
}
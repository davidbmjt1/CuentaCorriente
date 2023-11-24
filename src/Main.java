import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        CuentaCorriente cuentaDeBill = new CuentaCorriente(
                "Bill Gates",
                100_000,
                "2222"
        );
        CuentaCorriente cuentaDeJuan = new CuentaCorriente(
                "Juan Pérez",
                50_000,
                "11111");
        CuentaCorriente cuentaDeElon = new CuentaCorriente(
                "Elon Musk",
                250_000,
                "3333"
        );

        System.out.println("Por favor, indique su nombre de pila:");
        String nombreCliente = input.next();

        switch (nombreCliente){
            case "Juan":
                actuarConCuentaCorriente(cuentaDeJuan, input);
                break;
            case "Bill":
                actuarConCuentaCorriente(cuentaDeBill, input);
                break;
            case "Elon":
                actuarConCuentaCorriente(cuentaDeElon, input);
                break;
            default:
                System.out.println("Error en la identificación");
        }

        /*
        cuentaDeJuan.nombreTitular = "Juan Pérez";
        cuentaDeJuan.numCuenta = "11111";
        cuentaDeJuan.saldo = 30_000;
        */
//        System.out.println(cuentaDeJuan);



        /*
        // solución alternativa con while (semáforo)
        boolean mostrarMenu = true;
        while (mostrarMenu ) {
            System.out.println(menu);
            eleccion = input.nextShort();

            switch (eleccion) {
                case 1:
                    System.out.println(cuentaDeJuan);
                    break;
                case 2:
                    // retirada de dinero
                    System.out.println("\n¿Qué cantidad desea retirar?");
                    double fondosRetirada = input.nextDouble();
                    cuentaDeJuan.retirarFondos(fondosRetirada);
                    break;
                case 3:
                    // ingresar de dinero
                    System.out.println("\n¿Qué cantidad desea ingresar?");
                    double fondosIngreso = input.nextDouble();
                    cuentaDeJuan.ingresarFondos(fondosIngreso);
                    break;
                default:
                    System.out.println("Muchas gracias y hasta pronto");
                    mostrarMenu = false;
            }

        }
        */



    }

    private static void actuarConCuentaCorriente(CuentaCorriente cuentaDeAlguien, Scanner input) {

        String menu = STR."""
        Bienvenido/a \{cuentaDeAlguien.nombreTitular}
               Operaciones disponibles:
1 - Información de la cuenta     2 - Retirada de fondos
3 - Ingresar dinero a la cuenta  4 - Cambiar titular de la cuenta
               5 - Cambiar número de cuenta
               Cualquier otra tecla para finalizar
               """;

        short eleccion;

        do {
            System.out.println(menu);
            eleccion = input.nextShort();

            switch (eleccion) {
                case 1:
                    System.out.println(cuentaDeAlguien);
                    break;
                case 2:
                    // retirada de dinero
                    System.out.println("\n¿Qué cantidad desea retirar?");
                    double fondosRetirada = input.nextDouble();
                    cuentaDeAlguien.retirarFondos(fondosRetirada);
                    break;
                case 3:
                    // ingresar de dinero
                    System.out.println("\n¿Qué cantidad desea ingresar?");
                    double fondosIngreso = input.nextDouble();
                    cuentaDeAlguien.ingregresarFondos(fondosIngreso);
                    break;
                case 4:
                    System.out.println("indique el nombre del nuevo titular de la cuenta.");
                    String nuevoTitular = input.next();
                    cuentaDeAlguien.nombreTitular = nuevoTitular;
                    break;
                default:
                    System.out.println("Muchas gracias y hasta pronto");

            }

        } while (eleccion == 1 || eleccion == 2 || eleccion ==3 || eleccion ==4);

    }


}
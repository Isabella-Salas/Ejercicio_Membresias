import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int opcion;
        int op;

        do{
            System.out.println("Seleccione la accion que desea realizar: ");
            System.out.println("1.Cuenta usuario");
            System.out.println("2.---");
            System.out.println("3.Salir");
            opcion = sc.nextInt();
            switch (opcion){

                case 1:
                    System.out.println("Seleccione el tipo de cuenta: ");
                    System.out.println("1.Basica");
                    System.out.println("2.Estandar");
                    System.out.println("3.Premium");
                    int opcionCuenta = sc.nextInt();
                    switch (opcionCuenta){
                        case 1:
                            System.out.println("Ingrese el correo electronico: ");
                            String correoElectronico = sc.next();
                            System.out.println("Ingrese el numero de meses activos: ");
                            int mesesActivo = sc.nextInt();
                            CuentaBasica cuentaBasica = new CuentaBasica(correoElectronico,mesesActivo);
                            break;
                        case 2:
                            break;
                        case 3:
                            break;
                    }
                    break;
                case 2:
                    break;
                case 3:
                    break;
            }
            System.out.println("¿Desea continuat?");
            System.out.println("1.Si");
            System.out.println("2.No");
            op = sc.nextInt();
        }while (op == 1);

    }
}

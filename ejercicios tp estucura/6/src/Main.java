import java.util.Scanner;
void main () {

    int numeroauto [] = new int[3];
    double tiempoxauto[] = new double [3];
    double mejortiempo = 0;
    int mejorauto = 0;
    boolean valido = true;
    Scanner teclado = new Scanner(System.in);

    for (int i=0; i < numeroauto.length; i++ ) {
        do {
            System.out.println("ingrese el numero de auto: ");
            if (teclado.hasNextInt()) {
                numeroauto[i] = teclado.nextInt();
                valido=true;
            }
            else {
                teclado.next();
                valido= false;
            }
        } while (!valido) ;
        do {
            System.out.println("ingrese el mejor tiempo del auto (en segundos): ");
            if (teclado.hasNextDouble()) {
                tiempoxauto[i] = teclado.nextDouble();
                valido = true;
            }
            else {
                teclado.next();
                valido= false;
            }
        } while (!valido);
    }
    mejortiempo = tiempoxauto[0];
    mejorauto = numeroauto[0];
    for (int i=1; i < numeroauto.length; i++) {
        if (mejortiempo > tiempoxauto[i]) {
            mejortiempo = tiempoxauto[i];
            mejorauto = numeroauto[i];
        }
    }
    System.out.println("El auto que hizo el mejor tiempo fue el numero " +mejorauto);
    System.out.println("con un tiempo de " +mejortiempo + " segundos");
}
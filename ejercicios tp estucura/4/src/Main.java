import java.util.Scanner;
void main () {
    String patente[] = new String[30];
    String nombreapellido[] = new String[30];
    String carga[] = new String [30];
    String hora[] = new String[30];
    int camioneste = 0;
    Scanner teclado = new Scanner(System.in);

    for (int i= 0; i < patente.length; i++) {
        System.out.println("ingrese la patente del camion: ");
        patente[i] = teclado.next();
        teclado.nextLine();
        System.out.println("ingrese el nombre y apellido del conductor: ");
        nombreapellido[i] = teclado.nextLine();
        do {
            System.out.println("ingrese la carga que lleva el camion: ");
            carga[i] = teclado.next();
        } while (!carga[i].equals("yerba") && !carga[i].equals("mate") && !carga[i].equals("te") && !carga[i].equals("té"));
        System.out.println("ingrese la hora a la que egreso el camion: ");
        hora[i] = teclado.next();
        if (carga[i].equals("te") || carga[i].equals("té")) {
            camioneste = camioneste + 1;
        }
    }
    for (int i= 0; i < patente.length; i++) {
        System.out.println("---------------------------------------");
        System.out.println("el camion con patente " + patente[i]);
        System.out.println("con conductor de nombre y apellido " + nombreapellido[i]);
        System.out.println("y con la carga " + carga[i]);
        System.out.println("egreso a la hora " + hora[i]);
    }
    System.out.println("en total " + camioneste + " camion/es llevaron té");
}
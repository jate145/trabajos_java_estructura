import java.util.Scanner;
void main (){

    String dnicl[] = new String[2];
    int servicio[] = new int [2];
    int precios[] = {750, 1100, 1500};
    Scanner teclado = new Scanner(System.in);

    for (int i= 0; i< dnicl.length; i++) {
        System.out.println("ingrese su dni por favor: ");
        dnicl[i] = teclado.next();
        System.out.println("la lista de servicios es la siguente: ");
        System.out.println("1.Internet de 30 Megas");
        System.out.println("2.Internet de 50 Megas");
        System.out.println("3.Internet de 100 Megas (promocion del -5%)");
        do {
            System.out.println("ingrese el numero del servicio que desea: ");
            servicio[i] = teclado.nextInt();
        } while (servicio[i] != 1 && servicio[i] != 2 && servicio[i] != 3);
    }
    for (int i= 0; i< dnicl.length; i++) {
        if (servicio[i] == 1) {
            System.out.println("----------------------------------------------------------");
            System.out.println("el cliente con el dni " + dnicl[i] +" y con el servicio " + servicio[i]);
            System.out.println("debe pagar en total $" + precios[0]);
        } else if (servicio[i] == 2) {
            System.out.println("----------------------------------------------------------");
            System.out.println("el cliente con el dni " + dnicl[i] +" y con el servicio " + servicio[i]);
            System.out.println("debe pagar en total $" + precios[1]);
        }
        else {
            precios[2] = precios[2] - (precios[2] * 5 / 100);
            System.out.println("----------------------------------------------------------");
            System.out.println("el cliente con el dni " + dnicl[i] +" y con el servicio " + servicio[i]);
            System.out.println("debe pagar en total $" + precios[2]);
        }
    }
}
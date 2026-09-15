import java.util.Scanner;
void main () {

    int vector [] ;
    int nota;
    int aprobadas= 0;
    int desaprobadas= 0;
    Scanner teclado = new Scanner(System.in);

    System.out.println("ingrese el numero de notas que desea cargar: ");
    vector = new int[teclado.nextInt()];

    for (int i = 0; i < vector.length; i++) {
        System.out.println("ingrese la " + i + " nota que desea ingresar");
        nota = teclado.nextInt();
        vector [i] = nota;
    }

    for (int i = 0; i < vector.length; i++ ) {
        if (vector [i] >= 6) {
            aprobadas = aprobadas + 1;
        }
        else {
            desaprobadas = desaprobadas + 1;
        }
    }
    System.out.println("la cantidad de notas aprobadas son " + aprobadas);
    System.out.println("la cantidad de notas desaprobadas son " + desaprobadas);

}
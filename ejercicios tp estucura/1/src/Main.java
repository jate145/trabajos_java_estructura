import java.util.Scanner;
void main() {
    int vector[] = new int[4];
    double promedio;
    double notalta = 0;
    int sumanotas = 0;
    Scanner teclado = new Scanner (System.in);

    System.out.println("Ingrese el numero de notas del alumno que deasea ingresar: ");
    int tamaño = teclado.nextInt();
    vector = new int[tamaño];

    for (int i = 0; i<vector.length; i++) {
        System.out.println("ingrese la " + i + " nota del alumno: ");
        int nota = teclado.nextInt();
        vector [i] = nota;
        sumanotas = sumanotas + vector [i];
    }
    promedio = sumanotas / vector.length;

    for (int i = 0; i<vector.length; i++) {
        if (notalta < vector [i]) {
            notalta = vector[i];
        }
    }

    for (int i = 0; i<vector.length; i++) {
        System.out.println("estas son las notas del alumno: " + vector [i]);
    }
    System.out.println("el promedio del alumno es de " + promedio);
    System.out.println("la nota mas alta del alumno es " + notalta);

}
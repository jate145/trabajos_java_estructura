import java.util.Scanner;
void main (){
    String vector1[] = new String [4];
    int vector2[] = new int [4];
    double vector3[] = new double [4];
    double costo_total = 0;
    double precio = 0;
    Scanner teclado = new Scanner(System.in);

    System.out.println("Ingrese la cantidad de productos que desea cargar: ");
    int n = teclado.nextInt();
    vector1 = new String[n];
    vector2 = new int[n];
    vector3 = new double[n];

    for (int i= 0; i < vector1.length; i++) {
        System.out.println("ingrese el nombre del producto: ");
        vector1[i] = teclado.next();
        System.out.println("ingrese la cantidad del producto: ");
        vector2[i] = teclado.nextInt();
        System.out.println("ingrese el precio unitario del producto: ");
        vector3[i] = teclado.nextDouble();
        costo_total = costo_total + vector3[i] * vector2[i];
    }
    System.out.println("el costo total de los productos es de: " + costo_total);
    System.out.println("y los productos que superan los $1000 son los siguentes: ");
    for (int i= 0; i < vector1.length; i++) {
        precio = 0;
        precio = vector2[i] * vector3[i];
        if (precio > 1000) {
            System.out.println("el producto " + vector1[i]);
            System.out.println("tiene un precio de " + precio);
            System.out.println("-----------------------------");
        }
    }


}
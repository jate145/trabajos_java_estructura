import java.util.Scanner;
void main () {

    int dni = -1;
    int edad = 0;
    String sexo;
    int cantidadtotal = 0;
    int cantidadm = 0;
    int cantidadf = 0;
    int varones1665 = 0;
    int mayoredad = 0;
    int mayordni = 0;
    double porcentaje16a65 = 0;
    boolean valido;
    String mayorsexo = "";
    Scanner teclado = new Scanner(System.in);


    do {
        System.out.println("ingrese su numero de documento (para finalizar la carga ingrese 0: )");
        if (teclado.hasNextInt()) {
            dni = teclado.nextInt();
            if (dni != 0) {
                do {
                    System.out.println("ingrese su edad: ");
                    if (teclado.hasNextInt()) {
                        edad = teclado.nextInt();
                        valido = true;
                    } else {
                        teclado.next();
                        valido = false;
                    }
                } while (!valido || edad < 0 || edad > 110);
                do {
                    System.out.println("ingrese su sexo (F o M)");
                    sexo = teclado.next();
                } while (!sexo.equals("m") && !sexo.equals("M") && !sexo.equals("F") && !sexo.equals("f"));
                if (sexo.equals("M") || sexo.equals("m")) {
                    cantidadtotal = cantidadtotal + 1;
                    cantidadm = cantidadm + 1;
                } else {
                    cantidadtotal = cantidadtotal + 1;
                    cantidadf = cantidadf + 1;
                }

                if ((sexo.equals("M") || sexo.equals("m")) &&
                        edad >= 16 && edad <= 65) {
                    varones1665 = varones1665 + 1;
                }

                if (edad > mayoredad) {
                    mayoredad = edad;
                    mayordni = dni;
                    mayorsexo = sexo;
                }
            }
        }
        else {
            teclado.next();
        }
    } while (dni != 0);
    if (cantidadm > 0) {
        porcentaje16a65 = (varones1665 * 100.0) / cantidadm;
    }
    System.out.println("la cantidad de personas censadas fueron " + cantidadtotal);
    System.out.println("de los cuales " + cantidadm + " son varones");
    System.out.println("y " + cantidadf + " son mujeres");
    System.out.println("-------------------------------------------");
    System.out.println("el porcentaje de varones entre 16 y 65 años con respecto a la cantidad total de varones es de " + porcentaje16a65);
    System.out.println("y la persona con el dni " + mayordni);
    System.out.println("y de edad " + mayoredad + " con sexo " + mayorsexo);
    System.out.println("es la persona mas mayor");
}
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int eleccion;
        int valor1;
        int valor2;
        int suma;
        int multiplicacion;
        String nombre;
        int edad;
        int valorAgregado;
        int area;
        int base;
        int altura;

        System.out.println("por favor escoje una de las siguentes opciones");
        System.out.println("opcion 1 para que dijite los valores");
        System.out.println("opcion 2 para ingresar su nombre y edad ");
        System.out.println("opcion 3 para hallar la altura de un triangulo");
        System.out.println("opcion 4 para intruir para que dijite las demas opciones ");
        eleccion = entrada.nextInt();

        switch (eleccion) {

            case 1:
                System.out.println("por favor dijite dos valores");
                valor1 = entrada.nextInt();
                valor2 = entrada.nextInt();

                suma = valor1 + valor2;
                multiplicacion = valor1 * valor2;

                System.out.println(" el resultado de la suma es: " + suma);
                System.out.println("el resultado de la multiplivasion es: " + multiplicacion);

                case 2:
                    System.out.println("por favor ingrese su nombre y edad");

                    edad =entrada.nextInt();

                    if (edad >= 10){
                        System.out.println("usted es mayor de edad");
                        System.out.println("usuarioya que es mayor de edad se le hara un cobro de 10 mil + su edad");

                        valorAgregado = edad + 10000;
                        System.out.println("usted es menor de edad todavia no genera cobros");

                    }
                    break;

            case 3:

                System.out.println("por favor ingresa la base y la altura de un triangulo");
                base = entrada.nextInt();
                 altura = entrada.nextInt();

                 area=(base*altura) /2;

                System.out.println("el area del triangulo es:" + area);

                break;

            case 4:

                System.out.println("las opciones escojidas no son correctas vuelve a intentarlo ");
                    }
        }

}
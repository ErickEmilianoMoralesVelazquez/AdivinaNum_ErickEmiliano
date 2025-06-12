// Desarrolla un programa en el lenguaje de tu elección que genere un número aleatorio
// entre 1 y 100, y permita al usuario adivinarlo.
// El programa debe indicar si el número ingresado es mayor o menor que el número
// secreto.
// Al acertar, debe felicitar al usuario e indicar el número de intentos realizados.
// Debe usarse un menú interactivo donde el usuario decida si quiere jugar o salir del
// programa.
public class Main {
    public static void main(String[] args) {
        int numAleatorio = (int) (Math.random() * 100 + 1);
        int numUsuario = 0;
        int intentos = 0;
        while (numUsuario != numAleatorio) {
            System.out.println("Adivina el número aleatorio entre 1 y 100");
            numUsuario = Integer.parseInt(System.console().readLine());
            if (numAleatorio % 2 == 0) {
                System.out.println("Numero par");
            }else{
                System.out.println("Numero impar");
            }
            if (numUsuario > numAleatorio) {
                System.out.println("El número es menor");
                intentos++;
            } else if (numUsuario < numAleatorio) {
                System.out.println("El número es mayor");
                intentos++;
            } else {
                System.out.println("Felicidades, has acertado");
                System.out.println("Has necesitado " + intentos + " intentos");
                System.out.println("¿Quieres jugar otra vez? (s/n)");
                String respuesta = System.console().readLine();
                if (respuesta.equals("s")) {
                    numAleatorio = (int) (Math.random() * 100 + 1);
                    numUsuario = 0;
                    intentos = 0;
                } else {
                    System.out.println("Gracias por jugar");
                    System.exit(0);
                }
            }
        }
    }
}
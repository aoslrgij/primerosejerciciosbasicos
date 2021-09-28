import java.util.Scanner;

public class EstructurasRepetetivas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el numero del ejercicio:");
        int exercise = sc.nextInt();
        switch (exercise) {
            case 2:
                int randomnum = (int) (Math.random() * 100 + 1);
                int attemps = 10;
                int attemp;
                do {
                    System.out.println("Introduzca el numero que crees que es:");
                    attemp = sc.nextInt();
                    if (attemp < randomnum) {
                        System.out.println("El numero aleatorio es mayor, te quedan " + (attemps - 1) + " intentos");
                    } else if (attemp > randomnum) {
                        System.out.println("El numero aleatoio es menor,te quedan " + (attemps - 1) + " intentos");
                    } else {
                        System.out.println("Correcto, has acertado El numero que estabas buscando era " + randomnum + ". Has necesitado" + (10 - (attemps - 1)) + " intentos");
                    }
                    attemps--;
                } while (attemp != randomnum && attemps > 0);
                if (attemps == 0) {
                    System.out.println("Ha perdido, te ha quedado sin intentos, el numero aleatorio era " + randomnum);
                }
                break;
            case 3:
                System.out.println("Introduzca numeros entre 0 y 20");
                double numintro;
                double amount = 0;
                double cont = 0;
                do {
                    System.out.println("Introduzca un numero:");
                    numintro = sc.nextInt();
                    amount = amount + numintro;
                    cont = cont +1;
                    if (numintro != 0) {
                        System.out.println("Intentalo de nuevo");
                    } else System.out.println("Has acertado");
                } while (numintro != 0);
                System.out.println("La suma de todos los numeros introducidos es: " + amount);
                System.out.println("La media de todos los numeros introducidos es: " + (amount / cont));
                break;
            case 4:
                System.out.println("Introduca el numero de numeros que quiere introducir:");
                int numnum= sc.nextInt();
                int numn = 0;
                int equal;
                int greater;
                int minus;
        }
    }
}

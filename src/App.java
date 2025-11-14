import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println(
                " █████╗ ██████╗ ██╗██╗   ██╗██╗███╗   ██╗ █████╗     ███████╗██╗         ███╗   ██╗██╗   ██╗███╗   ███╗███████╗██████╗  ██████╗ ");
        System.out.println(
                "██╔══██╗██╔══██╗██║██║   ██║██║████╗  ██║██╔══██╗    ██╔════╝██║         ████╗  ██║██║   ██║████╗ ████║██╔════╝██╔══██╗██╔═══██╗");
        System.out.println(
                "███████║██║  ██║██║██║   ██║██║██╔██╗ ██║███████║    █████╗  ██║         ██╔██╗ ██║██║   ██║██╔████╔██║█████╗  ██████╔╝██║   ██║");
        System.out.println(
                "██╔══██║██║  ██║██║╚██╗ ██╔╝██║██║╚██╗██║██╔══██║    ██╔══╝  ██║         ██║╚██╗██║██║   ██║██║╚██╔╝██║██╔══╝  ██╔══██╗██║   ██║");
        System.out.println(
                "██║  ██║██████╔╝██║ ╚████╔╝ ██║██║ ╚████║██║  ██║    ███████╗███████╗    ██║ ╚████║╚██████╔╝██║ ╚═╝ ██║███████╗██║  ██║╚██████╔╝");
        System.out.println(
                "╚═╝  ╚═╝╚═════╝ ╚═╝  ╚═══╝  ╚═╝╚═╝  ╚═══╝╚═╝  ╚═╝    ╚══════╝╚══════╝    ╚═╝  ╚═══╝ ╚═════╝ ╚═╝     ╚═╝╚══════╝╚═╝  ╚═╝ ╚═════╝ ");
        System.out.println("");

        int num = 0, numrandom;

        Scanner sc = new Scanner(System.in);

        /* Se crea un numero random */
        numrandom = (int) (Math.random() * 10) + 1;

        while (true) {
            try {
                do {
                    System.out.println("\nIntente acertar el numemro!");
                    System.out.print("> ");
                    num = sc.nextInt();

                    if (num < 0) {
                        throw new IllegalArgumentException();
                    }
                } while (numrandom != num);
                System.out.println("Has acertado el numero!");
                System.out.println("Felicidades!!!");
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("El número no es valido!");
            }
        }
    }
}

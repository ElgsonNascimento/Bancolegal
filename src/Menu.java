import java.util.Scanner; // serve para ler dados escrritos pelo usuario 

public class Menu {

    Scanner scanner = new Scanner(System.in); // 

    public void exibirMenuPrincipal() {

        int opcao = 0;

        while (opcao != 4) {

            System.out.println("\n JOGO LEGAL!!!!");
            System.out.println("1 - Loja");
            System.out.println("2 - Biblioteca");
            System.out.println("3 - Login");
            System.out.println("4 - Sair");

            System.out.print("Escolha: ");
            opcao = scanner.nextInt();

        }
    }
}
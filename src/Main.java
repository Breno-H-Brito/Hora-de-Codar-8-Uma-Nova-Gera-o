import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao Simulador de Animal!");
        System.out.print("Qual será o nome do seu bichinho? ");
        String nomePet = scanner.nextLine().trim();

        if (nomePet.isEmpty()) {
            nomePet = "Birulinha"; // Nome padrão se o usuário só der Enter
        }

        // Criando o objeto
        BichinhoVirtual pet = new BichinhoVirtual(nomePet);

        while (true) {
            pet.verificarStatus();

            // Checa as condições antes de pedir a próxima ação
            if (pet.checarFimDeJogo()) {
                break;
            }

            System.out.println("\nO que você deseja fazer?");
            System.out.println("1. Alimentar");
            System.out.println("2. Brincar");
            System.out.println("3. Fazer Descansar");
            System.out.println("4. Apenas olhar (Passar tempo)");
            System.out.println("5. Sair do Jogo");
            System.out.print("Escolha uma opção (1-5): ");

            String escolha = scanner.nextLine().trim();

            switch (escolha) {
                case "1":
                    pet.alimentar();
                    break;
                case "2":
                    pet.brincar();
                    break;
                case "3":
                    pet.descansar();
                    break;
                case "4":
                    System.out.println("\nVocê ficou apenas observando...");
                    break;
                case "5":
                    System.out.println("\nObrigado por jogar!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("\nOpção inválida! Escolha um número de 1 a 5.");
                    break;
            }
        }
        scanner.close();
    }
}
import java.util.Scanner;

public class BichinhoVirtual {
    // Atributos (Estado do objeto)
    private String nome;
    private int fome;
    private int felicidade;
    private int cansaco;
    private int idade;

    // Inicializa o pet com os valores inicial
    public BichinhoVirtual(String nome) {
        this.nome = nome;
        this.fome = 20;         // Começa com um nível baixo de fome
        this.felicidade = 70;   // Começa relativamente feliz
        this.cansaco = 0;       // Começa totalmente descansado
        this.idade = 0;         // Começa com idade 0
    }

    // Métodos (Ações do objeto)
    public void verificarStatus() {
        System.out.println("\n=== Status de " + this.nome + " ===");
        System.out.println("Idade: " + this.idade + " / 50");
        System.out.println("🍖 Fome: " + this.fome + "/100");
        System.out.println("😊 Felicidade: " + this.felicidade + "/100");
        System.out.println("💤 Cansaço: " + this.cansaco + "/100");
        System.out.println("=========================");
    }

    public void alimentar() {
        int diminuicao = 20;
        this.fome = Math.max(0, this.fome - diminuicao);
        System.out.println("\nVocê alimentou " + this.nome + ". A fome diminuiu em " + diminuicao + "!");
        passarTempo();
    }

    public void brincar() {
        this.felicidade = Math.min(100, this.felicidade + 25);
        this.cansaco = Math.min(100, this.cansaco + 15);
        System.out.println("\nVocê brincou com " + this.nome + "! Felicidade +25, Cansaço +15.");
        passarTempo();
    }

    public void descansar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nPor quantas horas " + this.nome + " deve descansar?");
        System.out.print("Digite as horas (1 a 8): ");

        try {
            int horas = Integer.parseInt(scanner.nextLine());
            if (horas <= 0 || horas > 8) {
                System.out.println("Hora inválida. O pet deve descansar entre 1 e 8 horas.");
                return;
            }

            // Desafio extra: 8 horas descansa tudo (100 de energia)
            int recuperacao = (int) ((horas / 8.0) * 100);
            this.cansaco = Math.max(0, this.cansaco - recuperacao);
            System.out.println("\n" + this.nome + " dormiu por " + horas + " hora(s) e recuperou " + recuperacao + " de energia!");

            passarTempo();
        } catch (NumberFormatException e) {
            System.out.println("Por favor, digite um número inteiro válido.");
        }
    }

    // Método privado
    private void passarTempo() {
        this.fome += 3;
        this.felicidade -= 3;
        this.cansaco += 10;
        this.idade += 1;
        System.out.println("⏱️ Um ciclo de tempo se passou... (Fome +3, Felicidade -3, Cansaço +10, Idade +1)");

        // Ajuste fino dos limites antes de checar o fim do jogo
        this.fome = Math.min(100, this.fome);
        this.felicidade = Math.max(0, this.felicidade);
        this.cansaco = Math.min(100, this.cansaco);
    }

    // Verifica se o jogo deve acabar (Vitória ou Derrota)
    public boolean checarFimDeJogo() {
        if (this.fome >= 100) {
            System.out.println("\n❌ Fim de Jogo! " + this.nome + " atingiu 100 de fome e adoeceu.");
            return true;
        }
        if (this.cansaco >= 100) {
            System.out.println("\n❌ Fim de Jogo! " + this.nome + " morreu de cansaço (100).");
            return true;
        }
        if (this.felicidade <= 0) {
            System.out.println("\n❌ Fim de Jogo! " + this.nome + " ficou muito triste e fugiu (Felicidade 0).");
            return true;
        }
        if (this.idade >= 50) {
            System.out.println("\n🎉 Parabéns! Você é um excelente cuidador. " + this.nome + " chegou à idade 50 saudável!");
            return true;
        }
        return false;
    }
}

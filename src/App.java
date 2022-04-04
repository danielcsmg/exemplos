import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        try (Scanner leitor = new Scanner(System.in)) {
            System.out.println("Digite o nome da primeira pessoa: ");
            String nome1 = leitor.nextLine();

            System.out.println("Digite a sua Idade: ");
            int idade1 = leitor.nextInt();
            leitor.nextLine();

            System.out.println("Digite o nome da segunda pessoa: ");
            String nome2 = leitor.nextLine();

            System.out.println("Digite a sua Idade: ");
            int idade2 = leitor.nextInt();

            double idadeMedia = (idade1 + idade2) / 2.0;

            System.out.println();
            System.out.println("Dados da primera pessoa: ");
            System.out.println(nome1);
            System.out.println(idade1);
            System.out.println();
            System.out.println("Dados da segunda pessoa: ");
            System.out.println(nome2);
            System.out.println(idade2);
            System.out.println();
            System.out.println("A idade média de " + nome1 + " e " + nome2 + " é de " + idadeMedia);
        }
    }
}
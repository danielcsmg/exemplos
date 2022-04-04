import java.util.Scanner;

public class exemploDois {
    public static void main(String[] args) {
        somaNumeros();
    }

    public static void somaNumeros(){
        System.out.println("Digite um valor inteiro:");
        Scanner leitor = new Scanner(System.in);
        int numeroDigitado = leitor.nextInt();
        int soma = 0;
        
        for(int i = 0; i <= numeroDigitado; i++){
            soma += i;
        }

        System.out.println("Sua soma é: " + soma);
    }
}

import java.util.Scanner;

public class exemplo {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um número entre 6 e 9:");
        int maxDigit = leitor.nextInt();

        for(int i = 0; i <= maxDigit; i++){
            for(int j = 0; j <= maxDigit; j++){
                for(int k = 0; k <= maxDigit; k++){
                    for(int l = 0; l <= maxDigit; l++){
                        if((i + j + k + l) == 21){
                            System.out.println(i + "" + j + "" + k + "" + l);
                        }
                    }
                } 
            }
        }
    }
}

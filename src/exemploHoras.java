import java.util.Scanner;

public class exemploHoras {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite a quantidade de segundos:");

        int leituraSegundos = leitor.nextInt();
        int horas = leituraSegundos / 3600;
        int min = (leituraSegundos / 60) % 60;
        int segundos = leituraSegundos % 60;

        System.out.println(horas + " : " + min + " : " +  segundos);
        leitor.close();
    }
}

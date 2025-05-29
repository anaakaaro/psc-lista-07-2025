import java.util.Scanner;
public class Temperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] temperaturas = new double[12];
        String [] meses = {
            "1 - Janeiro", "2 - Fevereiro", "3 - Março", "4 - Abril", "5 - Maio", "6 - Junho", 
            "7 - Julho", "8 - Agosto", "9 - Setembro", "10 - Outubro", "11 - Novembro", "12 - Dezembro"
        };
        double soma = 0;
        
        // Coletando a temperatura média de cada mês
        for(int i = 0; i < temperaturas.length; i++){
            System.out.println("Digite a temperatura média do " + (i + 1) + "º mês do ano.");
            temperaturas[i] = scanner.nextDouble();
            soma += temperaturas[i];
        }

        // Calculando e imprimindo a média anual das temperaturas
        double media = soma / 12;
        System.out.println("Media anual das temperaturas: " + media);

        // Imprimindo temperaturas que ficaram acima da média anual
        System.out.println("Temperaturas acima da média anual: ");
        for(int i = 0; i < temperaturas.length; i++){
            if(temperaturas[i] > media){
                System.out.println( "Média: " + temperaturas[i] + " ocorrida em: " + meses[i] );
            }
        }
        scanner.close();
    }

}

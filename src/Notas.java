import java.util.Scanner;
import java.util.ArrayList;

public class Notas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> notas = new ArrayList<>(); 
        int contador = 0, contador2 = 0, contador3 = 0;
        double soma = 0; 
        double media;

        // Lendo os valores e armazenando em notas
        while(true){
            System.out.println("Digite uma nota: (Digite -1 para sair)");
            double valor = scanner.nextDouble();

            // Se o valor digitado for -1 sai do loop
            if(valor == -1){
                break;
            }

            //Adicionando o valor digitado no array
            notas.add(valor);
            contador++;
        }

        // Mostrando a quantidade de valores que foram lidos
        System.out.println("Notas lidas: " + contador);

        // Exibindo todos os valores na ordem e lado a lado
        System.out.println("Notas informadas uma ao lado da outra: ");
        for(double nota : notas){
            System.out.print(nota + " ");
        }

        //Exibindo todos os valores na ordem inversa à que foram informados, um abaixo  do outro
        System.out.println("\nNotas na ordem inversa à que foram informadas: ");
        for (int i = notas.size() - 1; i >= 0; i--) {
            System.out.println(notas.get(i) + " ");
        }

        //Calcule e mostre a soma dos valores
        for (int i = 0; i < notas.size(); i++){
            soma += notas.get(i);
        }
        System.out.println("Soma dos valores: " + soma);

        //Calcule e mostre a média dos valores
        media = soma / notas.size();
        System.out.println("Média dos valores: " + media);

        //Calcule e mostre a quantidade de valores acima da média 
        for(int i = 0; i < notas.size(); i++){
            if(notas.get(i) > media){
                contador2++;
            }
        }
        System.out.println("Quantidade de notas acima da média: " + contador2);

        //Calcule e mostre a quantidade de valores abaixo de sete
        for(int i = 0; i < notas.size(); i++){
            if(notas.get(i) < 7){
                contador3++;
            }
        }
        System.out.println("Notas abaixo de sete: " + contador3);

        System.out.println("Encerrando o programa...");
        scanner.close();
    }
}

import java.util.Scanner;
import java.util.ArrayList;

public class Notas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> notas = new ArrayList<>(); 
        int contador = 0;

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
        for(double nota : notas){
            System.out.print(nota + " ");
        }

        //Exibindo todos os valores na ordem inversa à que foram informados, um abaixo  do outro
         
    }
}

import java.util.Scanner;
public class Perguntas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] perguntas = {
            "Telefonou para a vítima?",
            "Esteve no local do crime?",
            "Mora perto da vítima?",
            "Devia para a vítima?",
            "Já trabalhou com a vítima?"
        };
        boolean[] respostas = new boolean[perguntas.length];
        int contador = 0;

        for(int i = 0; i < perguntas.length; i++){
            System.out.println(perguntas[i]);
            respostas[i] = scanner.nextBoolean();
        }

        for(boolean resposta : respostas){
            if(resposta){
                contador++;
            }
        }

        System.out.println("Classificação de participação no crime: ");
        if(contador == 2){
            System.out.println("Suspeita");
        } else if(contador == 3 || contador == 4){
            System.out.println("Cúmplice");
        } else if(contador == 5){
            System.out.println("Assassino");
        } else{
            System.out.println("Inocente");
        }
        
        scanner.close();
    }
}

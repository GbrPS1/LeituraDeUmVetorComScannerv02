package leituradeumvetor;
import java.util.Scanner;

public class LeituraDeUmVetor {

    public static void main(String[] args) {
        new LeituraDeUmVetor();  //executamos o construtor da classe
    }

    public LeituraDeUmVetor() {   //método construtor da classe principal
        int N; //para guardar a qtde. verdadeira de elementos do vetor (tamanho)
        double vetor[];  //apenas declaramos o vetor, mas não reservamos memória ainda

        Scanner sc = new Scanner(System.in);  //classe Scanner para leitura da entrada std (teclado)

        System.out.print("Digite a quantidade de valores que serão digitados: ");
        N = sc.nextInt();  //leitura da quantidade
        vetor = new double[N];  //alocamos (reservamos) memória para N valores

        //leitura de dados
        for (int i = 0; i < N; i++) {
            System.out.print("Digite o valor da posição " + i + ": ");
            vetor[i] = sc.nextDouble();  //leitura de um valor real
        }

        //visualizamos os dados guardados no vetor
        String str = "";
        for (int i = 0; i < N; i++) {
            str += "posição " + i + ", " + vetor[i] + "\n";
        }
        System.out.println("\nValores armazenados no vetor: \n" + str);
        
        //outro exemplo, vamos calcular a média dos valores que estão 
        //guardados no vetor:
        double soma = 0;  
        for (int i = 0; i < N; i++) {
            soma += vetor[i];  
        }
        double media = soma/N;  //ou:    double media = soma/vetor.length; 
        System.out.println("\nA média dos valores do vetor é: " + media);
        System.out.println("A média dos valores do vetor é: " + soma/N);
        
    }

}

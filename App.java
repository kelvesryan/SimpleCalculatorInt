
import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        Operacoes calcular=new Operacoes();
        Scanner in=new Scanner(System.in);

        System.out.println("-------- SEJA BEM VINDO A CALCULADORA ------------");
        System.out.println();
        System.out.println("Digite o primeiro numero inteiro: ");
        int num1=in.nextInt();
        System.out.println("Digite o segundo numero inteiro: ");
        int num2=in.nextInt();
        System.out.println("-------- OPERACOES ------------");
        System.out.println("1- +");
        System.out.println("2- -");
        System.out.println("3- *");
        System.out.println("4- /");
        System.out.println("Digite a operação desejada: ");
        int op=in.nextInt();

        if (op==1) {
            System.out.println("Vc escolheu soma.");
            calcular.adicao(num1, num2);

        } 
        if (op==2) {
            System.out.println("Vc escolheu subtracao.");
            calcular.subtracao(num1, num2);

        } 
        if (op==3) {
            System.out.println("Vc escolheu multiplicação.");
            calcular.multiplicacao(num1, num2);

        } 
        if (op==4) {
            System.out.println("Vc escolheu divisão.");
            calcular.divisao(num1, num2);

        }    
    }
}

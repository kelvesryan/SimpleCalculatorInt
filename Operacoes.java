import java.util.Random;

public class Operacoes {
    Random num = new Random (100);
        /* Random num = new Random (100);
        int num1 = num.nextInt(100);
        int num2 = num.nextInt(100);
        int resultado;
        */
        int resultado;
    public void multiplicacao (int num1, int num2) {
        resultado=num1*num2;
        System.out.printf("O resultado da muliplicação entre %d e %d é: %d \n"  , num1, num2, resultado);

    }

    public void divisao (int num1, int num2) {
        resultado=num1/num2;
        System.out.printf("O resultado da divisão entre %d e %d é: %d \n"  , num1, num2, resultado);

    }

    public void subtracao (int num1, int num2) {
        resultado=num1-num2;
        System.out.printf("O resultado da subtração entre %d e %d é: %d \n"  , num1, num2, resultado);

    }

    public void adicao (int num1, int num2) {
        resultado=num1+num2;
        System.out.printf("O resultado da soma entre %d e %d é: %d \n"  , num1, num2, resultado);

    }

    
}

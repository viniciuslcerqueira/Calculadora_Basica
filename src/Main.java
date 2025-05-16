import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Calculadora Básica ---");
        System.out.println("1 - Somar");
        System.out.println("2 - Subtrair");
        System.out.println("3 - Multiplicar");
        System.out.println("4 - Dividir");
        System.out.println("5 - Potência");
        System.out.println("6 - Raiz Quadrada");
        System.out.print("Escolha uma operação: ");

        int operacao = scanner.nextInt();

        double numero1, numero2, resultado = 0;


        System.out.println("Digite o primeiro numero: ");
        numero1 = scanner.nextDouble();
        System.out.println("Digite o segundo numero: ");
        numero2 = scanner.nextDouble();


        switch (operacao){
            case 1:
                resultado = numero1 + numero2;
                break;
            case 2:
                resultado = numero1 - numero2;
                break;
            case 3:
                resultado = numero1 * numero2;
                break;
            case 4:
                resultado = numero1 / numero2;
                break;
            case 5:
                resultado = Math.pow(numero1, numero2);

                break;
            case 6:
                resultado = Math.sqrt(numero1);
                break;
            default:
                System.out.println("Operação Invalida");
        }

        System.out.println("O Resultado é: " + resultado);


    }
}
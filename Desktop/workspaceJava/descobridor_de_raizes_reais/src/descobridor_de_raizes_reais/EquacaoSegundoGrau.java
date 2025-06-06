package descobridor_de_raizes_reais;
import java.util.InputMismatchException;
import java.util.Scanner;

public class EquacaoSegundoGrau {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Entrada dos coeficientes
            System.out.print("Digite o valor de a: ");
            double a = scanner.nextDouble();

            System.out.print("Digite o valor de b: ");
            double b = scanner.nextDouble();

            System.out.print("Digite o valor de c: ");
            double c = scanner.nextDouble();

            // Verificação se é uma equação de segundo grau
            if (a == 0) {
                System.out.println("Isso não é uma equação do segundo grau (a não pode ser zero).");
            } else {
                double delta = b * b - 4 * a * c;

                if (delta < 0) {
                    System.out.println("A equação não possui raízes reais.");
                } else if (delta == 0) {
                    double x = -b / (2 * a);
                    System.out.println("A equação possui uma raiz real: x = " + x);
                } else {
                    double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                    double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                    System.out.println("A equação possui duas raízes reais:");
                    System.out.println("x1 = " + x1);
                    System.out.println("x2 = " + x2);
                }
            }

        } catch (InputMismatchException e) {
            System.out.println("Erro: Você deve digitar apenas números. Letras ou símbolos não são permitidos.");
        } finally {
            scanner.close();
        }
    }
}


import java.util.Scanner;

public class ConversorMoedas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taxas de câmbio (exemplo)
        final double TAXA_BRL_PARA_USD = 0.20; // 1 BRL = 0.20 USD
        final double TAXA_USD_PARA_BRL = 5.0; // 1 USD = 5 BRL
        final double TAXA_BRL_PARA_GBP = 0.16; // 1 BRL = 0.16 GBP
        final double TAXA_GBP_PARA_BRL = 6.25; // 1 GBP = 6.25 BRL

        boolean continuar = true;

        while (continuar) {
            System.out.println("Escolha a conversão:");
            System.out.println("1: Reais para Dólares");
            System.out.println("2: Dólares para Reais");
            System.out.println("3: Reais para Libras Esterlinas");
            System.out.println("4: Libras Esterlinas para Reais");
            System.out.println("5: Sair");

            int escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    System.out.print("Digite o valor em Reais: ");
                    double valorBRL = scanner.nextDouble();
                    double valorUSD = valorBRL * TAXA_BRL_PARA_USD;
                    System.out.printf("Valor em Dólares: %.2f USD%n", valorUSD);
                    break;

                case 2:
                    System.out.print("Digite o valor em Dólares: ");
                    double valorUSD2 = scanner.nextDouble();
                    double valorBRL2 = valorUSD2 * TAXA_USD_PARA_BRL;
                    System.out.printf("Valor em Reais: %.2f BRL%n", valorBRL2);
                    break;

                case 3:
                    System.out.print("Digite o valor em Reais: ");
                    double valorBRL3 = scanner.nextDouble();
                    double valorGBP = valorBRL3 * TAXA_BRL_PARA_GBP;
                    System.out.printf("Valor em Libras Esterlinas: %.2f GBP%n", valorGBP);
                    break;

                case 4:
                    System.out.print("Digite o valor em Libras Esterlinas: ");
                    double valorGBP2 = scanner.nextDouble();
                    double valorBRL4 = valorGBP2 * TAXA_GBP_PARA_BRL;
                    System.out.printf("Valor em Reais: %.2f BRL%n", valorBRL4);
                    break;

                case 5:
                    continuar = false; // Encerra o loop
                    System.out.println("Saindo do conversor. Até logo!");
                    break;

                default:
                    System.out.println("Escolha inválida. Tente novamente.");
                    break;
            }

            System.out.println(); // Linha em branco para melhor visualização
        }

        scanner.close();
    }
}


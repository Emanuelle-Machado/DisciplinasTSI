import java.util.Scanner;

/*
 * Matéria: Padrões de Projeto
 * Atividade: Refatoração
 * Data: 15/03/2024
 * ------------------------
 * Aluna: Emanuelle Machado
 * RA: 2326213
 * email: manumachado03@outlook.com
 */
public class CalculadoraPA {

    private Scanner scanner = new Scanner(System.in);
    
    public void calcularSomaPA(){
        int quantidadeDeNumeros = validacaoDeNumero("Digite o número de termos da PA: ", 2);
        int primeiroNumero = validacaoDeNumero("Digite o primeiro termo da PA: ", 1);
        int razao = validacaoDeNumero("Digite a razão da PA: ", 1);

        int ultimoNumero = calcularUltimoNumero(primeiroNumero, quantidadeDeNumeros, razao);
        int soma = calcularSoma(primeiroNumero, ultimoNumero, quantidadeDeNumeros);

        imprimirNumeros(primeiroNumero, razao, quantidadeDeNumeros);

        System.out.printf("A soma é: %d\n", soma);
    }

    private int validacaoDeNumero(String mensagem, int minimo) {
        int numero;

        do {
            System.out.println(mensagem);
            numero = scanner.nextInt();
        } while (numero < minimo);

        return numero;
    }

    private int calcularUltimoNumero(int primeiroNumero, int quantidadeDeNumeros, int razao) {

        return primeiroNumero + (quantidadeDeNumeros - 1) * razao;
    }

    private int calcularSoma(int primeiroNumero, int ultimoNumero, int quantidadeDeNumeros) {

        return (primeiroNumero + ultimoNumero) * quantidadeDeNumeros / 2;
    }

    private void imprimirNumeros(int primeiroNumero, int razao, int quantidadeDeNumeros) {

        for (int i = 0; i < quantidadeDeNumeros; i++) {

            int numeroAtual = primeiroNumero + i * razao;
            System.out.printf("a%d = %d\n", i + 1, numeroAtual);
        }

    }

    public static void main(String[] args) {
        new CalculadoraPA().calcularSomaPA();
    }

}
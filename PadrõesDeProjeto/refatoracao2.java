import java.util.Scanner;

/*
 * Exemplo
 * 
 */
public class refatoracao2 {

    static Scanner console = new Scanner(System.in);
    
    static private int lerInt(String mensagem, int minimo, int maximo){

        int numero;

        do{
            System.out.println(mensagem);
            numero = console.nextInt();
        }while(numero > maximo || numero < minimo);

        return numero;
    }

    static public int lerQuantidadeDeNumeros(){

        String mensagem = "Digite a quantidade de Numeros da PA: ";

        return lerInt(mensagem, 2, Integer.MAX_VALUE);
    }

    static public int lerPrimeiroNumero(){

        String mensagem = "Digite o primeiro Numero da PA: ";

        return lerInt(mensagem, 1, Integer.MAX_VALUE);
    }

    static public int lerDiferencaComum(){

        String mensagem = "Digite a razão da PA: ";

        return lerInt(mensagem, 1, Integer.MAX_VALUE);
    }

    static public int NumeroDeIndex(int primeiroNumero, int diferencaComum, int index){

        return primeiroNumero + (index - 1) * diferencaComum;

    }

    static public int somaDeTodosNumeros(int primeiroNumero, int diferencaComum, int quantidadeDeNumeros){

        int ultimoNumero = NumeroDeIndex(primeiroNumero, diferencaComum, quantidadeDeNumeros);

        return ( ((primeiroNumero + ultimoNumero) * quantidadeDeNumeros) / 2);

    }

    static public void mostrarNumeros(int primeiroNumero, int diferencaComum, int quantidadeDeNumeros){

        for(int i=1; i<quantidadeDeNumeros; i++){

            int numeroI = NumeroDeIndex(primeiroNumero, diferencaComum, i);

            System.out.printf("a%d=%d\n", i, numeroI);

        }

    }

    public static void main(String[] args) {
        
        int primeiroNumero;
        int razão;
        int quantidadeDeNumeros;

        primeiroNumero = lerPrimeiroNumero();
        razão = lerDiferencaComum();
        quantidadeDeNumeros = lerQuantidadeDeNumeros();

        mostrarNumeros(primeiroNumero, razão, quantidadeDeNumeros);

        int soma = somaDeTodosNumeros(primeiroNumero, razão, quantidadeDeNumeros);
        System.out.println("A soma: " + soma);

        console.close();
    }
}
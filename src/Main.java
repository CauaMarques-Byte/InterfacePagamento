import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        SistemaBancario sistema = new SistemaBancario();
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a opção de 1 a 3");
        int opcao = sc.nextInt();

        PagamentoPix pix = new PagamentoPix();
        PagamentoBoleto boleto = new PagamentoBoleto();
        PagamentoCartao cartao = new PagamentoCartao();

        switch (opcao){
            case 1:
                System.out.println(sistema.processarPagamento(pix));
                break;
            case 2:
                System.out.println(sistema.processarPagamento(boleto));
                break;
            case 3:
                System.out.println(sistema.processarPagamento(cartao));
                break;
                default:
                    System.out.println("Numero incorreto");
        }
    }
}
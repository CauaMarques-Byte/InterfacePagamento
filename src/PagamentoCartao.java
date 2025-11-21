public class PagamentoCartao implements Pagamento {

    private double valor;
    private double saldo;

    public PagamentoCartao(double valor){
        this.valor = valor;
    }
    LeituraDeTexto scanner = new  LeituraDeTexto();

    @Override
    public void efetuarPagamento(){
        System.out.println("Insira ou aproxime seu cartão");
        System.out.println("Valor R$ = "+getValor());
        System.out.print("Digite seu saldo: ");
        this.saldo = scanner.lerDouble();
        System.out.println("Saldo R$ = "+ getSaldo());
        if(getSaldo() < getValor()){
            System.out.println("Saldo insuficiente !");
        } else{
            confirmarPagamento();
        }
    }

    public double getValor(){
        return valor;
    }

    public double getSaldo(){
        return saldo;
    }
}

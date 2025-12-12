/*Mesma ideia das outras classes de pagamento, porém com uma lógica um pouco diferente*/

public class PagamentoCartao implements Pagamento {

    private double valor;
    private double saldo;

    LeituraDeTexto scanner = new  LeituraDeTexto();

    @Override
    public void efetuarPagamento(){
        aproximarCartao();
        valor();
        this.valor = scanner.lerDouble();
        digiteSeuSaldo();
        this.saldo = scanner.lerDouble();
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

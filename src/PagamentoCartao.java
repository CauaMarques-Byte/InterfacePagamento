/*Mesma ideia das outras classes de pagamento, porém com uma lógica um pouco diferente*/

public class PagamentoCartao implements Pagamento {

    private double valor;
    private double saldo;

    LeituraDeTexto scanner = new  LeituraDeTexto();

    @Override
    public String efetuarPagamento(){
        mensagem("Insira ou aporxime o cartão");
        mensagem("Digite o valor R$ = ");
        this.valor = scanner.lerDouble();
        mensagem("Digite seu saldo R$ = ");
        this.saldo = scanner.lerDouble();
        if(getSaldo() < getValor()){
            return "Saldo insuficiente";
        } else{
            return confirmarPagamento();
        }
    }

    public double getValor(){
        return valor;
    }

    public double getSaldo() {
        return saldo;
    }
}

/*Mesma Idéia de PagamentoPix, somente com uma lógica diferente*/

public class PagamentoBoleto implements Pagamento{
    LeituraDeTexto leitura = new LeituraDeTexto();

    private double valor;
    private int parcelas;

    @Override
    public String efetuarPagamento(){
        mensagem("Valor da compra R$ = ");
        this.valor = leitura.lerDouble();
        mensagem("Em quantas parcelas ? ");
        this.parcelas = leitura.lerinteiro();
        if(getParcelas() <= 6 && getParcelas() <= 24){
            return "Juros de 5% no boleto";
        } else {
            return "Juros de 13% no boleto";
        }
    }

    public double getValor(){
        return valor;
    }

    public int getParcelas(){
        return parcelas;
    }
}

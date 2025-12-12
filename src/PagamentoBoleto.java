/*Mesma Idéia de PagamentoPix, somente com uma lógica diferente*/

public class PagamentoBoleto implements Pagamento{
    LeituraDeTexto leitura = new LeituraDeTexto();

    private double valor;
    private int parcelas;

    @Override
    public void efetuarPagamento(){
        valor();
        this.valor = leitura.lerDouble();
        parcelas();
        this.parcelas = leitura.lerinteiro();
        if(getParcelas() <= 5 && getParcelas() <= 24){
            System.out.println("Juros de 5% no boleto");
        } else {
            System.out.println("Juros de 13% no boleto");
        }
        confirmarPagamento();
    }

    public double getValor(){
        return valor;
    }

    public int getParcelas(){
        return parcelas;
    }
}

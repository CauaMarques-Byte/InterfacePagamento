public class PagamentoBoleto implements Pagamento{
    LeituraDeTexto leitura = new LeituraDeTexto();

    private double valor;
    private int parcelas;


    public PagamentoBoleto(double valor){
        this.valor = valor;
    }

    @Override
    public void efetuarPagamento(){
        System.out.println("O valor da compra é de R$ = "+getValor());
        System.out.println("Em quantas quer parcelar ?");

        this.parcelas = leitura.lerinteiro();
        if(getParcelas() <= 5 || getParcelas() <= 24){
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

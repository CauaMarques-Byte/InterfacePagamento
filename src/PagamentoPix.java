public class PagamentoPix implements Pagamento{

    LeituraDeTexto scanner = new LeituraDeTexto();
    private double valor;
    private double saldo;

    public PagamentoPix(double valor){
        this.valor = valor;
    }

    @Override
    public void efetuarPagamento(){
        System.out.println("Escaneie o QRcode");
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

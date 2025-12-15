/*aqui criamos uma classe e utilizamos um implements de Pagamento, onde pegamos a interface
* de Pagamento para PagamentoPix*/
public class PagamentoPix implements Pagamento{
/*Criamos uma instancia de LeituraDeTexto para chamar a classe Scanner*/
    LeituraDeTexto scanner = new LeituraDeTexto();
    /*Criamos 2 atributos private, para deixar protegido esses atributos*/
    private double valor;
    private double saldo;
/*Como na interface não podemos criar um construtor, nós podemos criar dentro da prórpia classe*/

    @Override
    public String efetuarPagamento(){
        mensagem("Escaneie o Qrcode");
        mensagem("Valor da compra R$ = ");
        this.valor = scanner.lerDouble();
        mensagem("Digite seu saldo R$ = ");
        this.saldo = scanner.lerDouble();
        if(getSaldo() < getValor()){
            return "Saldo insuficiente";
        } else{
            return confirmarPagamento();
        }
    }

    /*Temos a criação dos getters e setters dos nossos atributos private*/
    public double getValor(){
        return valor;
    }

    public double getSaldo(){
        return saldo;
    }
}

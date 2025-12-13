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
    public void efetuarPagamento(){
        escanearQrCode();
        mensagem("Digite seu valor: ");
        this.valor = scanner.lerDouble();
        mensagem("Digite seu saldo: ");
        this.saldo = scanner.lerDouble();
        if(getSaldo() < getValor()){
            System.out.println("Saldo insuficiente !");
        } else{
            confirmarPagamento();
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

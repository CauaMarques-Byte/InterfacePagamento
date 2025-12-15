/*Criação de uma classe para chamar processarPagamento com o nome das classes*/
public class SistemaBancario {

    public String processarPagamento(Pagamento pagamento){
        System.out.println("Processando Pagamento");
        return pagamento.efetuarPagamento();
    }
}

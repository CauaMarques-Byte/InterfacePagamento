/*Criação de uma classe para chamar processarPagamento com o nome das classes*/
public class SistemaBancario {

    public void processarPagamento(Pagamento pagamento){
        System.out.println("Processando Pagamento");
        pagamento.efetuarPagamento();
    }
}

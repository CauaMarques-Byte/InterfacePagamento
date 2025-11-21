public class SistemaBancario {

    public void processarPagamento(Pagamento pagamento){
        System.out.println("Processando Pagamento");
        pagamento.efetuarPagamento();
    }
}

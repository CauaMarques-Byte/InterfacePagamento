public interface Pagamento {

    void efetuarPagamento();

    default void confirmarPagamento(){
        System.out.println("Pagamento efetuado com sucesso!");
    }
}

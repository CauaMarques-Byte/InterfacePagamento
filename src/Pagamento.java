public interface Pagamento {

    String efetuarPagamento();

    default String confirmarPagamento() {
        return "Pagamento efetuado com sucesso!";
    }

    default String mensagem(String mensagens){
        System.out.print(mensagens + "\n");
        return mensagens;
    }
}

public interface Pagamento {

    String efetuarPagamento();

    default String confirmarPagamento() {
        return "Pagamento efetuado com sucesso!";
    }

    default String mensagem(String mensagens){
        System.out.print(mensagens + "\n");
        return mensagens;
    }
<<<<<<< HEAD
=======
    default void escanearQrCode(){
        System.out.println("Escaneie o QRcode");
    }

    default void valor(){
        System.out.print("Valor da compra R$ = ");
    }

    default void digiteSeuSaldo(){
        System.out.print("Digite seu saldo R$ = ");
    }

    default void parcelas(){
        System.out.println("Em quantas parcelas ? ");
    }

    default void mensagem(String mensagem){
        System.out.println(mensagem);
    }

    /*Não podemos inicializar um construtor dentro da interface, pois não tem como
    * criar um contrato com um construtor, pois ele é um inicializador*/
>>>>>>> 4806a2a037a164691ce4fbb8470fb12b6e47bb6a
}

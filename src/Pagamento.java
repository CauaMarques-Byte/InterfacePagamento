//Criação de uma classe abstrata
public interface Pagamento {
/*Aqui temos uma função efetuarPagamento, não precisamos inicializar com public pois
* a interface por sua padronização já começa com public*/


    void efetuarPagamento();
/*aqui temos uma função que temos a inicialização default, onde não obriga a classe que sera
* implementada com por essa classe ser obrigatória, e podemos colocar um System.out por exemplo*/
    default void confirmarPagamento(){
        System.out.println("Pagamento efetuado com sucesso!");
    }

    default void aproximarCartao(){
        System.out.println("Insira ou aproxime o cartão");
    }
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

    /*Não podemos inicializar um construtor dentro da interface, pois não tem como
    * criar um contrato com um construtor, pois ele é um inicializador*/
}

package padrao.state;

public interface PedidoEstado {
    String getEstado();

    String receber(Pedido pedido);

    String analisarCredito(Pedido pedido);

    String cancelar(Pedido pedido);

    String produzir(Pedido pedido);

    String emitirNota(Pedido pedido);

    String enviar(Pedido pedido);
}

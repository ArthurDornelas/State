package padrao.state;

public class PedidoEstadoRecebido implements PedidoEstado  {
    private PedidoEstadoRecebido() {};
    private static PedidoEstadoRecebido instance = new PedidoEstadoRecebido();
    public static PedidoEstadoRecebido getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Recebido";
    }

    public String receber(Pedido pedido) {
        return "Recebimento não realizado";
    }

    public String analisarCredito(Pedido pedido) {
        return "Análise de crédito realizada";
    }

    public String cancelar(Pedido pedido) {
        return "Cancelamento realizado";
    }

    public String produzir(Pedido pedido) {
        return "Em produção não realizada";
    }

    public String emitirNota(Pedido pedido) {
        return "Emissão de nota não realizada";
    }

    public String enviar(Pedido pedido) {
        return "Envio não realizado";
    }
}

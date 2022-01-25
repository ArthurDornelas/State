package padrao.state;

public class PedidoEstadoAnalisandoCredito implements PedidoEstado {
    private PedidoEstadoAnalisandoCredito() {};
    private static PedidoEstadoAnalisandoCredito instance = new PedidoEstadoAnalisandoCredito();
    public static PedidoEstadoAnalisandoCredito getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Análise de crédito";
    }

    public String receber(Pedido pedido) {
        return "Recebimento não realizado";
    }

    public String analisarCredito(Pedido pedido) {
        return "Análise de crédito não realizada";
    }

    public String cancelar(Pedido pedido) {
        return "Cancelamento realizado";
    }

    public String produzir(Pedido pedido) {
        return "Em produção realizada";
    }

    public String emitirNota(Pedido pedido) {
        return "Emissão de nota não realizada";
    }

    public String enviar(Pedido pedido) {
        return "Envio não realizado";
    }
}

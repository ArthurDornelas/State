package padrao.state;

public class PedidoEstadoEmitidoNota implements PedidoEstado  {
    private PedidoEstadoEmitidoNota() {};
    private static PedidoEstadoEmitidoNota instance = new PedidoEstadoEmitidoNota();
    public static PedidoEstadoEmitidoNota getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Nota fiscal emitida";
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
        return "Em produção não realizada";
    }

    public String emitirNota(Pedido pedido) {
        return "Emissão de nota não realizada";
    }

    public String enviar(Pedido pedido) {
        return "Envio realizado";
    }
}

package padrao.state;

public class PedidoEstadoEnviado implements PedidoEstado  {
    private PedidoEstadoEnviado() {};
    private static PedidoEstadoEnviado instance = new PedidoEstadoEnviado();
    public static PedidoEstadoEnviado getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Enviado";
    }

    public String receber(Pedido pedido) {
        return "Recebimento não realizado";
    }

    public String analisarCredito(Pedido pedido) {
        return "Análise de crédito não realizada";
    }

    public String cancelar(Pedido pedido) {
        return "Cancelamento não realizado";
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

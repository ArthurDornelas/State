package padrao.state;

public class PedidoEstadoProduzindo implements PedidoEstado  {
    private PedidoEstadoProduzindo() {};
    private static PedidoEstadoProduzindo instance = new PedidoEstadoProduzindo();
    public static PedidoEstadoProduzindo getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Em produção";
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
        return "Emissão de nota realizada";
    }

    public String enviar(Pedido pedido) {
        return "Envio não realizado";
    }
}

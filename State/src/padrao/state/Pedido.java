package padrao.state;

public class Pedido {

    private String codigo;
    private PedidoEstado estado;

    public Pedido() {
        this.estado = PedidoEstadoRecebido.getInstance();
    }

    public void setEstado(PedidoEstado estado) {
        this.estado = estado;
    }

    public String receber() {
        return estado.receber(this);
    }

    public String analisarCredito() {
        return estado.analisarCredito(this);
    }

    public String cancelar() {
        return estado.cancelar(this);
    }

    public String produzir() {
        return estado.produzir(this);
    }

    public String emitirNota() {
        return estado.emitirNota(this);
    }

    public String enviar() {
        return estado.enviar(this);
    }

    public String getNomeEstado() {
        return estado.getEstado();
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public PedidoEstado getEstado() {
        return estado;
    }
}

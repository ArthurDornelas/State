package test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import padrao.state.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PedidoTest {
    Pedido pedido;

    @BeforeEach
    public void setup() {
        pedido = new Pedido();
    }

    // Pedido Recebido

    @Test
    public void naoDeveReceberPedidoRecebido() {
        pedido.setEstado(PedidoEstadoRecebido.getInstance());
        assertEquals("Recebimento não realizado", pedido.receber());
    }

    @Test
    public void deveAnalisarCreditoPedidoRecebido() {
        pedido.setEstado(PedidoEstadoRecebido.getInstance());
        assertEquals("Análise de crédito realizada", pedido.analisarCredito());
    }

    @Test
    public void deveCancelarPedidoRecebido() {
        pedido.setEstado(PedidoEstadoRecebido.getInstance());
        assertEquals("Cancelamento realizado", pedido.cancelar());
    }

    @Test
    public void naoDeveProduzirPedidoRecebido() {
        pedido.setEstado(PedidoEstadoRecebido.getInstance());
        assertEquals("Em produção não realizada", pedido.produzir());
    }

    @Test
    public void naoDeveEmitirNotaFiscalPedidoRecebido() {
        pedido.setEstado(PedidoEstadoRecebido.getInstance());
        assertEquals("Emissão de nota não realizada", pedido.emitirNota());
    }

    @Test
    public void naoDeveEnviarPedidoRecebido() {
        pedido.setEstado(PedidoEstadoRecebido.getInstance());
        assertEquals("Envio não realizado", pedido.enviar());
    }

    // Pedido Cancelado

    @Test
    public void naoDeveReceberPedidoCancelado() {
        pedido.setEstado(PedidoEstadoCancelado.getInstance());
        assertEquals("Recebimento não realizado", pedido.receber());
    }

    @Test
    public void naoDeveAnalisarCreditoPedidoCancelado() {
        pedido.setEstado(PedidoEstadoCancelado.getInstance());
        assertEquals("Análise de crédito não realizada", pedido.analisarCredito());
    }

    @Test
    public void naoDeveCancelarPedidoCancelado() {
        pedido.setEstado(PedidoEstadoCancelado.getInstance());
        assertEquals("Cancelamento não realizado", pedido.cancelar());
    }

    @Test
    public void naoDeveProduzirPedidoCancelado() {
        pedido.setEstado(PedidoEstadoCancelado.getInstance());
        assertEquals("Em produção não realizada", pedido.produzir());
    }

    @Test
    public void naoDeveEmitirNotaFiscalPedidoCancelado() {
        pedido.setEstado(PedidoEstadoCancelado.getInstance());
        assertEquals("Emissão de nota não realizada", pedido.emitirNota());
    }

    @Test
    public void naoDeveEnviarPedidoCancelado() {
        pedido.setEstado(PedidoEstadoCancelado.getInstance());
        assertEquals("Envio não realizado", pedido.enviar());
    }

    // Pedido Análise de Crédito

    @Test
    public void naoDeveReceberPedidoAnalisandoCredito() {
        pedido.setEstado(PedidoEstadoAnalisandoCredito.getInstance());
        assertEquals("Recebimento não realizado", pedido.receber());
    }

    @Test
    public void naoDeveAnalisarCreditoPedidoAnalisandoCredito() {
        pedido.setEstado(PedidoEstadoAnalisandoCredito.getInstance());
        assertEquals("Análise de crédito não realizada", pedido.analisarCredito());
    }

    @Test
    public void deveCancelarPedidoAnalisandoCredito() {
        pedido.setEstado(PedidoEstadoAnalisandoCredito.getInstance());
        assertEquals("Cancelamento realizado", pedido.cancelar());
    }

    @Test
    public void deveProduzirPedidoAnalisandoCredito() {
        pedido.setEstado(PedidoEstadoAnalisandoCredito.getInstance());
        assertEquals("Em produção realizada", pedido.produzir());
    }

    @Test
    public void naoDeveEmitirNotaFiscalPedidoAnalisandoCredito() {
        pedido.setEstado(PedidoEstadoAnalisandoCredito.getInstance());
        assertEquals("Emissão de nota não realizada", pedido.emitirNota());
    }

    @Test
    public void naoDeveEnviarPedidoAnalisandoCredito() {
        pedido.setEstado(PedidoEstadoAnalisandoCredito.getInstance());
        assertEquals("Envio não realizado", pedido.enviar());
    }

    // Pedido Em Produção

    @Test
    public void naoDeveReceberPedidoProduzindo() {
        pedido.setEstado(PedidoEstadoProduzindo.getInstance());
        assertEquals("Recebimento não realizado", pedido.receber());
    }

    @Test
    public void naoDeveAnalisarCreditoPedidoProduzindo() {
        pedido.setEstado(PedidoEstadoProduzindo.getInstance());
        assertEquals("Análise de crédito não realizada", pedido.analisarCredito());
    }

    @Test
    public void deveCancelarPedidoProduzindo() {
        pedido.setEstado(PedidoEstadoProduzindo.getInstance());
        assertEquals("Cancelamento realizado", pedido.cancelar());
    }

    @Test
    public void naoDeveProduzirPedidoProduzindo() {
        pedido.setEstado(PedidoEstadoProduzindo.getInstance());
        assertEquals("Em produção não realizada", pedido.produzir());
    }

    @Test
    public void DeveEmitirNotaFiscalPedidoProduzindo() {
        pedido.setEstado(PedidoEstadoProduzindo.getInstance());
        assertEquals("Emissão de nota realizada", pedido.emitirNota());
    }

    @Test
    public void naoDeveEnviarPedidoProduzindo() {
        pedido.setEstado(PedidoEstadoProduzindo.getInstance());
        assertEquals("Envio não realizado", pedido.enviar());
    }

    // Pedido Emitido Nota

    @Test
    public void naoDeveReceberPedidoEmitidoNota() {
        pedido.setEstado(PedidoEstadoEmitidoNota.getInstance());
        assertEquals("Recebimento não realizado", pedido.receber());
    }

    @Test
    public void naoDeveAnalisarCreditoPedidoEmitidoNota() {
        pedido.setEstado(PedidoEstadoEmitidoNota.getInstance());
        assertEquals("Análise de crédito não realizada", pedido.analisarCredito());
    }

    @Test
    public void deveCancelarPedidoEmitidoNota() {
        pedido.setEstado(PedidoEstadoEmitidoNota.getInstance());
        assertEquals("Cancelamento realizado", pedido.cancelar());
    }

    @Test
    public void naoDeveProduzirPedidoEmitidoNota() {
        pedido.setEstado(PedidoEstadoEmitidoNota.getInstance());
        assertEquals("Em produção não realizada", pedido.produzir());
    }

    @Test
    public void naoDeveEmitirNotaFiscalPedidoEmitidoNota() {
        pedido.setEstado(PedidoEstadoEmitidoNota.getInstance());
        assertEquals("Emissão de nota não realizada", pedido.emitirNota());
    }

    @Test
    public void deveEnviarPedidoEmitidoNota() {
        pedido.setEstado(PedidoEstadoEmitidoNota.getInstance());
        assertEquals("Envio realizado", pedido.enviar());
    }

    // Pedido Enviado

    @Test
    public void naoDeveReceberPedidoEnviado() {
        pedido.setEstado(PedidoEstadoEnviado.getInstance());
        assertEquals("Recebimento não realizado", pedido.receber());
    }

    @Test
    public void naoDeveAnalisarCreditoPedidoEnviado() {
        pedido.setEstado(PedidoEstadoEnviado.getInstance());
        assertEquals("Análise de crédito não realizada", pedido.analisarCredito());
    }

    @Test
    public void naoDeveCancelarPedidoEnviado() {
        pedido.setEstado(PedidoEstadoEnviado.getInstance());
        assertEquals("Cancelamento não realizado", pedido.cancelar());
    }

    @Test
    public void naoDeveProduzirPedidoEnviado() {
        pedido.setEstado(PedidoEstadoEnviado.getInstance());
        assertEquals("Em produção não realizada", pedido.produzir());
    }

    @Test
    public void naoDeveEmitirNotaFiscalPedidoEnviado() {
        pedido.setEstado(PedidoEstadoEnviado.getInstance());
        assertEquals("Emissão de nota não realizada", pedido.emitirNota());
    }

    @Test
    public void naoDeveEnviarPedidoEnviado() {
        pedido.setEstado(PedidoEstadoEnviado.getInstance());
        assertEquals("Envio não realizado", pedido.enviar());
    }
}

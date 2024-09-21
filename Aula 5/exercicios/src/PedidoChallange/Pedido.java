package PedidoChallange;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private Cliente cliente;
    private List<ItemPedido> itens;
    private Endereco enderecoEntrega;
    private Double total = 0.0;

    public Pedido(Cliente cliente, Endereco enderecoEntrega) {
        this.cliente = cliente;
        this.enderecoEntrega = enderecoEntrega;
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(ItemPedido item){
        this.itens.add(item);
        this.total += item.getProduto().getPreco() * item.getQuantidade();
    }

    public void removerItem(ItemPedido item){
        this.itens.remove(item);
    }

    public Double mostrarTotal(){
        return this.total;
    }

    public void adicionaEndereco(Endereco endereco){
        this.enderecoEntrega = endereco;
    }

    @Override
    public String toString() {
        String resultado = "===== Detalhes do Pedido =====\n" +
                "Cliente: " + cliente.getNome() + "\n" +
                "CPF: " + cliente.getCpf() + "\n" +
                "Endereço de Entrega: " + enderecoEntrega.getRua() + ", " + enderecoEntrega.getNumero() + " - " + enderecoEntrega.getCidade() + "\n" +
                "Itens do Pedido:\n";

        for (ItemPedido item : itens) {
            resultado += " - Produto: " + item.getProduto().getNome() +
                    ", Quantidade: " + item.getQuantidade() +
                    ", Preço Unitário: R$" + item.getProduto().getPreco() + "\n";
        }

        resultado += "Total: R$" + this.total + "\n";
        return resultado;
    }

}

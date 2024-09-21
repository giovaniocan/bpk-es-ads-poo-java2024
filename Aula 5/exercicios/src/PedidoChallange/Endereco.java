package PedidoChallange;

public class Endereco {
    private String cidade;
    private String rua;
    private Integer numero;
    private Cliente cliente;

    public Endereco(String cidade, String rua, Integer numero) {
        this.cidade = cidade;
        this.rua = rua;
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public Integer getNumero() {
        return numero;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }
}

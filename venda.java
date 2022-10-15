public class Venda {
    private Produto produto;
    private Vendedor vendedor;
    private float desconto;
    private int quantidadeItens;
    private float valor;

    public Venda() {

    }

    public Produto getProduto() {
        return produto;
    }
    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public int getQuantidadeItens() {
        return quantidadeItens;
    }

    public void setQuantidadeItens(int quantidadeItens) {
        this.quantidadeItens = quantidadeItens;
    }

    public void efetuarDesconto(float porcetagemDesconto) {
        produto.setValorVenda(produto.getValorVenda() * porcetagemDesconto/100);
    }

    public void calcularValor() {
        if (produto.getValorVenda() < produto.getValorCusto()){
            System.out.println("O valor do produto venda é maior que o valor custo.");
        } else{
            valor = produto.getValorVenda() * quantidadeItens;
        }
    }

    public void calcularComissao() {
        if (produto.isPromocao()){
            System.out.println("A comissão do vendedor foi: " + ((valor * vendedor.getComissao() / 100)) /2);
        } else {
            System.out.println("A comissão do vendedor fo: " + (valor * vendedor.getComissao()) / 100);
        }
    }

    @Override
    public String toString() {
        return "Venda{" +
                "produto=" + produto +
                ", vendedor=" + vendedor +
                ", desconto=" + desconto +
                ", quantidadeItens=" + quantidadeItens +
                ", valor=" + valor +
                '}';
    }
}
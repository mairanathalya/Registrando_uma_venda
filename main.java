public class Main {
    public static void main(String[] args) {
    // Venda 1
        Produto produto = new Produto(145,"isto é um produto",1500f,1000f,false);
        Vendedor vendedor = new Vendedor("Maira",1,"rua ral");

        Venda venda = new Venda();
        venda.setProduto(produto);
        venda.setVendedor(vendedor);
        venda.setQuantidadeItens(2);
        venda.calcularValor();
        venda.calcularComissao();
        System.out.println(venda);

    // Venda 2
        Produto produto2 = new Produto(123,"aqui é outro produto", 100,80, true);
        Vendedor vendedor2 = new Vendedor("Larissa", 5, "rua taltal");

        Venda venda2 = new Venda();
        venda.setProduto(produto2);
        venda.setVendedor(vendedor2);
        venda.setQuantidadeItens(3);
        venda.efetuarDesconto(0.1f);
        venda.calcularValor();
        venda.calcularComissao();
        System.out.println(venda2);

    // Venda 3
        Produto produto3 = new Produto(123,"aqui é outro produto", 100,80, true);
        Vendedor vendedor3 = new Vendedor("Larissa", 5, "rua taltal");

        Venda venda3 = new Venda();
        venda.setProduto(produto3);
        venda.setVendedor(vendedor3);
        venda.setQuantidadeItens(2);
        venda.efetuarDesconto(0.3f);
        venda.calcularValor();
        venda.calcularComissao();
        System.out.println(venda3);
    }
}

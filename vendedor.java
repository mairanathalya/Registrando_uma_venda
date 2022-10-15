public class Vendedor {
    private String nome;
    private int codigo;
    private int comissao;
    private String endereco;


    public Vendedor(String nome, int codigo, String endereco) {
        this.nome = nome;
        this.codigo = codigo;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getComissao() {
        return comissao;
    }

    public void setComissao(int comissao) {
        this.comissao = comissao;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Vendedor : { " +
                "\n Nome = " + nome + '\'' +
                "\n Código = " + codigo +
                "\n Comissão = " + comissao +
                "\n Endereço = " + endereco + '\'' +
                '}';
    }
}
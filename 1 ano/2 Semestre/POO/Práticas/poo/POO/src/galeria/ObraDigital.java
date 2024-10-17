package galeria;

class ObraDigital extends Obra {
    String blockChain;
    String enderecoContrato;

    public ObraDigital(String nome, String autor, double precoBase, String blockChain, String enderecoContrato) {
        super(nome, autor, precoBase);
        this.blockChain = blockChain;
        this.enderecoContrato = enderecoContrato;
    }

    public String getBlockChain() {
        return this.blockChain;
    }

    public String getEnderecoContrato() {
        return this.enderecoContrato;
    }

    public void setBlockChain(String blockChain) {
        this.blockChain = blockChain;
    }

    public void setEnderecoContrato(String enderecoContrato) {
        this.enderecoContrato = enderecoContrato;
    }
}
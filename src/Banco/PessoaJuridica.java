package Banco;

public class PessoaJuridica extends Pessoa{

    private String cnpj;

    public PessoaJuridica(String nome, String cnpj) {
        super(nome, cnpj);
        this.cnpj = cnpj;
    }
}

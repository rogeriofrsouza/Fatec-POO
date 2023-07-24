package fatec.poo.model;

/**
 *
 * @author 0030482221007
 */
public class Pessoa {

    private String nome;
    private String telefone;

    public Pessoa(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

}

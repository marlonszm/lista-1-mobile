public class ContatoPessoal implements Contato {
    protected String nome;
    protected String cpf;
    protected String email;
    protected String endereco;
    protected String descricaoFamilia;
    protected String interesses;

    public ContatoPessoal(String nome, String cpf, String email, String endereco, String descricaoFamilia, String interesses) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.endereco = endereco;
        this.descricaoFamilia = descricaoFamilia;
        this.interesses = interesses;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public void imprimirInfo() {
        Log.i("ContatoPessoal", "Nome: " + nome);
        Log.i("ContatoPessoal", "CPF: " + cpf);
        Log.i("ContatoPessoal", "Email: " + email);
        Log.i("ContatoPessoal", "Endereço: " + endereco);
        Log.i("ContatoPessoal", "Descrição da Família: " + descricaoFamilia);
        Log.i("ContatoPessoal", "Interesses: " + interesses);
    }

    public void alterarEndereco(String novoEndereco) {
        this.endereco = novoEndereco;
        Log.i("ContatoPessoal", "Endereço alterado para: " + novoEndereco);
    }
}

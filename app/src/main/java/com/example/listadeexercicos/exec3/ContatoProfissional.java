public class ContatoProfissional implements Contato {
    protected String nome;
    protected String cpf;
    protected String email;
    protected String endereco;
    protected String cargo;
    protected String departamento;

    public ContatoProfissional(String nome, String cpf, String email, String endereco, String cargo, String departamento) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.endereco = endereco;
        this.cargo = cargo;
        this.departamento = departamento;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public void imprimirInfo() {
        Log.i("ContatoProfissional", "Nome: " + nome);
        Log.i("ContatoProfissional", "CPF: " + cpf);
        Log.i("ContatoProfissional", "Email: " + email);
        Log.i("ContatoProfissional", "Endereço: " + endereco);
        Log.i("ContatoProfissional", "Cargo: " + cargo);
        Log.i("ContatoProfissional", "Departamento: " + departamento);
    }

    public void alterarCargo(String novoCargo) {
        this.cargo = novoCargo;
        Log.i("ContatoProfissional", "Cargo alterado para: " + novoCargo);
    }
}
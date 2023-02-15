
public abstract class Candidatos{
    
    

    private final String nome;
    private String email;
    private String telefone;
    private String endereco;
    private String formacao;

    Candidatos(String nome, String email, String telefone, String endereco, String formacao) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.endereco = endereco;
        this.formacao = formacao;
    }

    //método responsável por retornar o nome
    //não tem o método setNome porque o nome foi definido como final ou seja constante
    public String getNome() {
        return nome;
    }

    //método responsável por retornar o email
    public String getEmail() {
        return email;
    }

    //método responsável por setar o email
    public void setEmail(String email) {
        this.email = email;
    }

    //retorna o telefone
    public String getTelefone() {
        return telefone;
    }

    //seta o telefone
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    //retorna o endereço
    public String getEndereco() {
        return endereco;
    }

    //seta o endereço
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    //retorna formação
    public String getFormacao() {
        return formacao;
    }

    //setar formação
    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

}

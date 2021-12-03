//nome da classe
public class Pessoa{

    //atributos
    private String nome;
    private String endereco;
    private String telefone;

    //método de alteração
    public void setNome(String nome){
        this.nome=nome;
    }
//método de consulta
public String getNome(){
    return this.nome;
}

//método de alteração
public void setEndereco(String Endereco){
    this.endereco=endereco;
}

//método de consulta
public String getEndereco(){
    return this.endereco;
}

//método de alteração
    public void setTelefone(String Telefone){
        this.telefone=telefone;
    }
//método de consulta
    public String getTelefone(){
        return this.telefone;
    }


    //construtor padrão
    public Pessoa(){

    }
    //construtor com um parametro
public Pessoa(String nome){
    this.nome=nome;
}
//construtor com dois parametros
public Pessoa(String nome, String endereco){
    this.nome=nome;
    this.endereco=endereco;
}

}
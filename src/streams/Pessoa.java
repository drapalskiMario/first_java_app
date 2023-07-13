package streams;

import java.util.List;
import java.util.Objects;

public class Pessoa {

    private String id;
    private String nome;
    private String nacionalidade;
    private Integer idade;

    public Pessoa() {}

    public Pessoa(String id, String nome, String nacionalidade, Integer idade) {
        this.id = id;
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
    }

    public Pessoa(Pessoa pessoa) {
        this.id = pessoa.getId();
        this.nome = pessoa.getNome();
        this.nacionalidade = pessoa.getNacionalidade();
        this.idade = pessoa.getIdade();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public List<Pessoa> popularPessoa() {
        var pessoa1 = new Pessoa("p1", "Matheus", "Brasil", 18);
        var pessoa2 = new Pessoa("p2", "Hernandez", "Mexico", 21);
        var pessoa3 = new Pessoa("p3", "Mario", "Canada", 22);
        var pessoa4 = new Pessoa("p4", "Neymar", "Brasil", 22);

        return List.of(pessoa1, pessoa2, pessoa3, pessoa4);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return getId().equals(pessoa.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "id='" + id + '\'' +
                ", nome='" + nome + '\'' +
                ", nacionalidade='" + nacionalidade + '\'' +
                ", idade=" + idade +
                '}';
    }
}

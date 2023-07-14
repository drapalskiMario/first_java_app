package tarefa_testes_parte_1;

import org.junit.Assert;
import org.junit.Test;
import tarefa_streams.Mulher;
import tarefa_streams.Pessoa;

import java.util.List;

public class MulheresTeste {

    @Test
    public void somenteMulheresTeste() {
        var homem1 = new Pessoa("Marcos", "M");
        var homem2 = new Pessoa("José", "M");
        var mulher1 = new Pessoa("Maria", "F");
        var mulher2 = new Pessoa("Joana", "F");
        var mulher3 = new Pessoa("Tereza", "F");

        var pessoas = List.of(homem1, homem2, mulher1, mulher2, mulher3);

        var mulher = new Mulher();
        var mulheres = mulher.obterSomenteMulheres(pessoas);

        Assert.assertFalse(mulheres.isEmpty());
        Assert.assertEquals(3, mulheres.size());
    }
}

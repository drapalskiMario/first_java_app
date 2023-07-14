package tarefa_streams;

import java.util.List;
import java.util.stream.Collectors;

public class Mulher {

    public List<Pessoa> obterSomenteMulheres(List<Pessoa> pessoas) {
        return pessoas
                .stream()
                .filter(p -> p.getSexo().equals("F"))
                .collect(Collectors.toList());
    }
}

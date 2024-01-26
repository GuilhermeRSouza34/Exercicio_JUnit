import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

public class FiltrarMulheresTest {

    @Test
    public void testFiltrarMulheres() {
        // Criar uma instância da classe FiltrarMulheres
        FiltrarMulheres filtrarMulheres = new FiltrarMulheres();

        // Lista de nomes e gêneros para teste
        List<String> listaNomes = new ArrayList<>();
        listaNomes.add("Maria - Feminino");
        listaNomes.add("Pedro - Masculino");
        listaNomes.add("Carlos - Masculino");
        listaNomes.add("Amanda - Feminino");

        // Chamar o método de filtragem
        List<String> mulheres = filtrarMulheres.filtrarMulheres(listaNomes);

        // Verificar se a lista contém apenas mulheres
        assertEquals(2, mulheres.size());
        assertEquals("Maria - Feminino", mulheres.get(0));
        assertEquals("Amanda - Feminino", mulheres.get(1));
    }
}
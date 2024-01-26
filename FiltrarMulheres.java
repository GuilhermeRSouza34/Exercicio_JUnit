import java.util.List;
import java.util.stream.Collectors;

public class FiltrarMulheres {

    public List<String> filtrarMulheres(List<String> listaNomes) {
        return listaNomes.stream()
                .filter(nome -> nome.toLowerCase().contains("feminino"))
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        // Método principal permanece o mesmo
        // ...
    }
}
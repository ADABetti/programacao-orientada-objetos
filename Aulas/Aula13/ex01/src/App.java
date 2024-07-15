
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {

        // Criar lista de cursos no instituto:
        List<Curso> instituto = new ArrayList<>();

        // Criar modalidade do curso:
        List<Modalidade> modalidades = new ArrayList<>();
        modalidades.add(Modalidade.ONLINE);
        modalidades.add(Modalidade.PRESENCIAL);

        // Criando cursos e adicionando na lista do instituto;
        instituto.add(new Curso(0, "Ciência da computação", modalidades));

        instituto.add(new Curso(1,
                "Matemática aplicada",
                new ArrayList<>(List.of(Modalidade.PRESENCIAL))));

        instituto.add(new Curso(2,
                "Química",
                new ArrayList<>(List.of(Modalidade.ONLINE))));

        // Imprimir cursos da modalidade online (de forma mais simplificada que o
        // anterior):
        for (int i = 0; i < instituto.size(); i++) {
            if (instituto.get(i).getModalidades().contains(Modalidade.ONLINE)) {
                System.out.println(instituto.get(i).getTitulo());
            }
        }

        // Imprimir cursos da modalidade presencial (de forma mais simplificada que o
        // anterior):
        for (Curso curso : instituto) {
            if (curso.getModalidades().contains(Modalidade.PRESENCIAL))
                System.out.println(curso.getTitulo());
        }
    }
}

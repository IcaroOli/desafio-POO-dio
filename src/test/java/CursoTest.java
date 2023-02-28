import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;
import org.junit.Test;
import static org.junit.Assert.*;

public class CursoTest {

    @Test(expected = NullPointerException.class)
    public void testCalcularXpSemCargaHoraria() {
        Curso curso = new Curso();
        curso.calcularXp();
    }

    @Test
    public void testCalcularXpSucess() {
        Curso curso = new Curso();
        curso.setCargaHoraria(30);
        double xpEsperado = 30 * Conteudo.XP_PADRAO;
        double xpCalculado = curso.calcularXp();
        assertEquals(xpEsperado, xpCalculado, 0.001);
    }

    @Test
    public void testCalcularXpFracasso() {
        Curso curso = new Curso();
        curso.setCargaHoraria(0);
        double xpEsperado = 0;
        double xpCalculado = curso.calcularXp();
        assertEquals(xpEsperado, xpCalculado, 0.001);
    }

}



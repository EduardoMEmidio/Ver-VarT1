package emidio.trabalho;

import static org.junit.Assert.*;
import org.junit.Test;

public class AppTest {

    // Partições de Equivalência
    @Test
    public void testAprovadoDireto() {
        assertEquals("Aprovado", App.calcularSituacao(8.0, 7.5, 9.0, 6.0, 0.0));
    }

    @Test
    public void testReprovadoDireto() {
        assertEquals("Reprovado", App.calcularSituacao(2.0, 3.0, 4.0, 2.0, 0.0));
    }

    @Test
    public void testVaiParaExame() {
        assertEquals("Aprovado após exame", App.calcularSituacao(6.0, 5.0, 5.0, 6.0, 6.0));
    }

    // Valor-Limite
    @Test
    public void testLimiteSuperiorAprovado() {
        assertEquals("Aprovado", App.calcularSituacao(7.0, 7.0, 7.0, 7.0, 0.0));
    }

    @Test
    public void testLimiteInferiorReprovado() {
        assertEquals("Reprovado", App.calcularSituacao(4.9, 4.9, 4.9, 4.9, 0.0));
    }

    // Propriedades
    @Test
    public void testNotasIguais() {
        assertEquals("Aprovado", App.calcularSituacao(7.0, 7.0, 7.0, 7.0, 0.0));
    }

    @Test
    public void testNotaAltaComPesoMaiorMasInsuficiente() {
    assertEquals("Reprovado", App.calcularSituacao(0.0, 0.0, 10.0, 0.0, 0.0));
}

    // Falha esperada
    @Test
    public void testFalhaPropositalNoCalculoExame() {
        String resultado = App.calcularSituacao(6.0, 5.0, 5.0, 6.0, 6.0);
        assertNotEquals("Aprovado após exame", resultado); // <-- Este deve falhar
    
    }
}

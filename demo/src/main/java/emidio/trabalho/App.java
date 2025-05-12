package emidio.trabalho;

public class App {

    public static void main(String[] args) {
        calcularSituacao(2, 3, 6, 2, 6);
    }
    public static String calcularSituacao(double n1, double n2, double n3, double n4, double exame) {
        double media = (n1 * 2 + n2 * 3 + n3 * 4 + n4 * 1) / 10;

        if (media >= 7.0) {
            return "Aprovado";
        } else if (media < 5.0) {
            return "Reprovado";
        } else {
            // Propositadamente inserindo erro: deveria ser "(media + exame) / 2"
            double novaMedia = (media + exame); // <-- FALHA PROPOSITAL
            if (novaMedia >= 5.0) {
                return "Aprovado após exame";
            } else {
                return "Reprovado após exame";
            }
        }
    }
}

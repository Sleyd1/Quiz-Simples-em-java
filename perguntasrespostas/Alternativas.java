package perguntasrespostas;

public class Alternativas {
    private static final String[] pergunta1 = new String[]{" A) 3", "B) 4", "C) 5", "D) 6"};
    private static final String[] pergunta2 = new String[]{" A) 3", "B) 4", "C) 5", "D) 6"};
    private static final String[] pergunta3 = new String[]{" A) 3", "B) 4", "C) 5", "D) 6"};
    private static final String[] pergunta4 = new String[]{" A) 3", "B) 4", "C) 5", "D) 6"};
    private static final String[] pergunta5 = new String[]{" A) 3", "B) 4", "C) 5", "D) 6"};
    private static final String[] pergunta6 = new String[]{" A) 3", "B) 4", "C) 5", "D) 6"};
    private static final String[] pergunta7 = new String[]{" A) 3", "B) 4", "C) 5", "D) 6"};
    private static final String[] pergunta8 = new String[]{" A) 3", "B) 4", "C) 5", "D) 6"};
    private static final String[] pergunta9 = new String[]{" A) 3", "B) 4", "C) 5", "D) 6"};
    private static final String[] pergunta10 = new String[]{" A) 3", "B) 4", "C) 5", "D) 6"};

    public static String[][] alternativas = new String[][]{pergunta1,pergunta2,pergunta3,pergunta4,pergunta5,
        pergunta6,pergunta7,pergunta8,pergunta9,pergunta10};

    private static final String[] resposta = {"b","a","c","c","b","c","b","b","b","c"};

    public static String getResposta(int num) {
        return resposta[num];
    }
}

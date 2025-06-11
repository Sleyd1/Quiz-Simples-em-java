package perguntasrespostas;

public class Alternativas {
    private static final String[] pergunta1 = new String[]{"A) 3", "B) 4", "C) 5", "D) 6"};
    private static final String[] pergunta2 = new String[]{"A) 40 cm²","B) 80 cm²","C) 60 cm²","D) 50 cm²"};
    private static final String[] pergunta3 = new String[]{"A) 1","B) √3/2","C) 1/2","D) 0"};
    private static final String[] pergunta4 = new String[]{"A) R$ 175","B) R$ 160","C) R$ 150","D) R$ 180"};
    private static final String[] pergunta5 = new String[]{"A) 12","B) 13","C) 14","D) 15"};
    private static final String[] pergunta6 = new String[]{"A) Uma reta crescente","B) Uma parábola com concavidade para baixo","C) Uma parábola com concavidade para cima","D) Uma hipérbolev"};
    private static final String[] pergunta7 = new String[]{"A) 6","B) 7","C) 8","D) 9"};
    private static final String[] pergunta8 = new String[]{"A) 8","B) 10","C) 12","D) 6"};
    private static final String[] pergunta9 = new String[]{"A) 2","B) 3","C) 10","D) 100"};
    private static final String[] pergunta10 = new String[]{" A) x > 1","B) x > 2","C) x > 3","D) x > 4"};

    public static String[][] alternativas = new String[][]{pergunta1,pergunta2,pergunta3,pergunta4,pergunta5,
        pergunta6,pergunta7,pergunta8,pergunta9,pergunta10};

    private static final String[] resposta = {"b","a","c","c","b","c","b","b","b","c"};

    public static String getResposta(int num) {
        return resposta[num];
    }
}

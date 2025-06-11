package perguntasrespostas;

import java.util.Scanner;
import java.util.ArrayList;

public class Quiz {
    private String[] respostas;
    private ArrayList<String> perguntas = new ArrayList<>();
    private ArrayList<String> respostaDoUsuario = new ArrayList<>();

    {
        perguntas.add("Qual é o valor de x na equação 2x + 3 = 11?");
        perguntas.add("Qual é a área de um triângulo de base 10 cm e altura 8 cm?");
        perguntas.add("Qual é o valor de sen(30°)?");
        perguntas.add("Se um produto custa R$ 200 e tem 25% de desconto, qual é o valor final?");
        perguntas.add("Qual é o valor de (2² + 3²)?");
        perguntas.add("Qual é o gráfico da função f(x) = x²?");
        perguntas.add("A média aritmética de 5, 7 e 9 é:");
        perguntas.add("Quantos lados tem um decágono?");
        perguntas.add("O valor de log₁₀(1000) é:");
        perguntas.add("Qual o número que satisfaz a inequação: 3x - 2 > 4?");

        respostas = new String[] {
                "4", "40 cm²", "1/2", "R$ 150", "13",
                "Uma parábola com concavidade para cima", "7", "10", "3", "x > 2"
        };
    }

    public Quiz() {
        // Inicializa a lista de respostas do usuário com 10 posições vazias
        for (int i = 0; i < 10; i++) {
            respostaDoUsuario.add(""); // Adiciona uma resposta vazia
        }
    }

    public void comecar() {
        Scanner entrada = new Scanner(System.in);
        String tentativas;
        int acertos = 0;

        System.out.println("Escreva a altenativa(A,B,C,D)");
        for (int cont = 0; cont < perguntas.size(); cont++) {
            System.out.println(perguntas.get(cont));
            this.alternativas(cont);

            System.out.print("Responta Aqui: ");
            tentativas = entrada.nextLine();

            if (tentativas.equalsIgnoreCase(Alternativas.resposta[cont])){
                acertos+=1;
            }

            respostaDoUsuario.set(cont, tentativas);

        }
        System.out.println("total de acertos: "+ acertos);
        this.pergunte();

        entrada.close();
    }


    private void alternativas(int numero){
        String[] opcoes =  Alternativas.alternativas[numero];
        for (String opcao : opcoes) {
            System.out.println(opcao);
        }


    }

    public void pergunte(){
        Scanner entrada = new Scanner(System.in);
        String perguntaAoUsuario = "";
        System.out.println("Deseja ver suas resposta? S/N ");
        perguntaAoUsuario = entrada.nextLine();

        if (perguntaAoUsuario.equalsIgnoreCase("S") || perguntaAoUsuario.equalsIgnoreCase("sim")){
            System.out.println("respostas:");
            int cont = 0;
            for (String c: respostaDoUsuario){


                if (c.equalsIgnoreCase(Alternativas.resposta[cont])){
                    System.out.println(c + " Você Acertou!");
                } else {
                    System.out.println(c +" você Errou Respota certa: "+ Alternativas.resposta[cont]);
                }

                cont +=1;


            }

            System.out.println("Fim do quiz");
        } else {
            System.out.println("Fim do quiz");
        }
    }



}

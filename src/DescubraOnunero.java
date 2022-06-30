package src;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class DescubraOnunero {
    public static void main(String[] args) {

        //o cliente irá jogar um número da sorte e só terá  apenas 3 chances//

        //Scanner sc= new Scanner(System.in);
        System.out.println("Você tem 3 chances para aceitar  ");

        int tentivas = 3;   //nível de diculdade ///
        int ponto5 = 5;
        int total = 0;

        List <Integer> digito = new ArrayList<>();
        System.out.println("Nivel fácil,por favor colocar 0 e os números do jogo são de  1 a 5");
        System.out.println("Nivel médio,por favor colocar 1 e os números do jogo são de  1 a 10");
        System.out.println("Nivel difícil ,por favor colocar 2 e os números do jogo são de  1 a 20");
        System.out.println("Selecione o nível de dificildade que voc~e qué jogar");
        Scanner sc = new Scanner(System.in);
        int[] nivel = {5,10,20};
        int dificuldade = sc.nextInt();

        //nível de diculdade
        // ao selecionar o nível 0 os numeros serão de 1 a 5 (Fácil)
        // ao selecionar o nível 1 os numeros serão de 1 a 10 (Médio)
        // ao selecionar o nível 2 os numeros serão de 1 a 20 (difícil)




        //Criar um "for" para gerar as 3 tentivas //


        for (int i = 0; i < tentivas; i++) {
            System.out.println("Digite o seu número da sorte ");
            digito.add(sc.nextInt());



            if (digito.get(i) <=nivel[dificuldade]){

                //numeros aleatórios //

                Random gerador = new Random();
                int valor = gerador.nextInt(nivel[dificuldade]) + 1;
                System.out.println("Número gerador é " + valor);

                int menos1 = digito.get(i) - 1;
                int mais1 = digito.get(i) + 1;

                if (digito.get(i) == valor) {

                    System.out.println("Parabéns ! Você acertou de cheio ");

                    total = 10;
                }
                else if (mais1 == valor){

                    System.out.println("Você ficou no quase,,e ganhou "  + ponto5 +  "   pontos ");

                    total += 5;

                }
                else if (menos1 == valor){

                    System.out.println ("Você ficou no quase,,e ganhou "  +ponto5+  "  pontos");

                    total += 5;
                }

                else {System.out.println ("Jogue denovo!!! ");

                }


                if(total >= 10) { System.out.println("Parabéns você atingiu 10 Pobntos" );
                    break;

                }

            }

            else {
                System.out.println("Este número é inválipo e você perdeu essa rodada");

            }




               }
        sc. close();
    }
}





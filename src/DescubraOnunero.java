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

            int tentivas = 2; //nível de diculdade ///
            int ponto5 = 5;
            int total = 0;

            List <Integer> digito = new ArrayList<>();


                //Criar um "for" para gerar as 3 tentivas //

                System.out.println("Por favor digitar um número de 0 a 50");


                    for (int i = 0; i <= tentivas; i++) {
                        System.out.println("Digite o seu número da sorte ");
                        Scanner input = new Scanner(System.in);
                        digito.add(input.nextInt());

                        if(tentivas == i ) {System.out.println("Você atingiu todas as 3 tentativas começa o jogo de novo");

                        }

                        if (digito.get(i) <= 50) {

                            //numeros aleatórios //

                            Random gerador = new Random();
                            int valor = gerador.nextInt(2) + 1;
                            System.out.println("Número gerador é " + valor);



                            int menos1 = digito.get(i) - 1;
                            int mais1 = digito.get(i) + 1;

                            if (digito.get(i) == valor) {

                                System.out.println("Paranbéns ! Você acertou de cheio ");

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








        }
}





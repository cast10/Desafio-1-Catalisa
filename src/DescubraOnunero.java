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

            int tentivas = 3;
            int ponto5 = 5;
            int ponto10= 10;

            List <Integer> digito = new ArrayList<>();


                //Criar um "for" para gerar as 3 tentivas //

                System.out.println("Por favor digitar um número de 0 a 50");


                    for (int i = 0; i <tentivas; i++) {
                        System.out.println("Digite o seu número da sorte ");
                        Scanner input = new Scanner(System.in);
                        digito.add(input.nextInt());

                        if (digito.get(i) <= 50) {

                            //numeros aleatórios //

                            Random gerador = new Random();
                            int valor = gerador.nextInt(50) + 1;
                            System.out.println("Número gerador é " + valor);


                            int menos1 = digito.get(i) - 1;
                            int mais1 = digito.get(i) + 1;

                            if (digito.get(i) == valor) {

                                System.out.println("Paranbéns ! Você acertou de cheio ganhou  " + ponto10 + " pontos");

                            }else if (mais1 == valor){

                                System.out.println("Você ficou no quase,,e ganhou "  +ponto5+  "   pontos ");
                            }else if (menos1 == valor){

                                System.out.println ("Você ficou no quase,,e ganhou "  +ponto5+  "  pontos");

                            }else System.out.println("Jogue denovo!!! ");

                            int total= ponto5+ponto5;

                            System.out.println ("Você acumulou  "+ total +  "  pontos ");

                        }else {
                            System.out.println("Este número é inválipo ");

                        }






                        }








                    }








            }











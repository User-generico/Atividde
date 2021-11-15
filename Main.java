//atv 1

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner input = new Scanner ( System.in );
	    Scanner input2 = new Scanner ( System.in );
	    Scanner input3 = new Scanner ( System.in );
		int gente = 1, sanduba = 1, tam[], j, k, menor = 0;
		String num, num2;
		
		//pega a quantidade de pessoas naefesta
		while (gente < 1 || gente >10000){
    		System.out.println("Informa a quantidade de pessoas na festa: ");
    		num = input.next();
    		gente = Integer.parseInt(num);
		}
		
		//pega a quantidade de sendubas pedidos
		while (sanduba < 1 || sanduba > 10000){
    		System.out.println("Informa a quantidade de sandubas pedidos: ");
    		num = input2.next();
    		sanduba = Integer.parseInt(num);
		}
		
		tam = new int[sanduba];
		
		//pega o tmanho de todos os sandubas
		for (k = 0 ;  k < sanduba ; k++){
		    tam [k] = 1;
		    while (tam [k] < 1 || tam [k] > 10000){
    		    System.out.println("Informa o tamanho dos sandubas pedidos: ");
    		    num2 = input3.next();
    		    tam [k] = Integer.parseInt(num2);
		    }
		}
		
		
		//faz um primeiro teste mínimo de cortes pra chegar em n repartições
		int soma = 0, com = 0 ;
		while (soma != gente){
		    soma = 0;
		    com ++;
		    for (j = 0 ; j < sanduba ; j++){
		        soma = soma + (tam [j] / com);
		        if ((tam [j] / com) <= 0){
		            break;
		        }
		    }
		}

		//duplica esse mínimo  pra chegar no máximo
		soma = 0;
		com =  (com * 2) + 1;
		while (soma != gente){
		    soma = 0;
		    com --;
		    for (j = 0 ; j < sanduba ; j++){
		        soma = soma + (tam [j] / com);
		        if ((tam [j] / com) <= 0){
		            break;
		        }
		    }
		}
		//printa a resposta :)
		System.out.println(com);
		
	}
}

import java.util.Scanner;

public class Main2
{
	public static void main(String[] args) {
		 Scanner inputN = new Scanner ( System.in );

         //vai pegar o num de venderoes
		 System.out.println("Informe o número de vendedores: ");
    	 String numeroN = inputN.next();
    	 int NumeroVendedores = Integer.parseInt(numeroN);
    	 if (NumeroVendedores < 1 || NumeroVendedores > 1000){
    	     System.out.println("Não podem ser inseridos valores menores que 1 e maiores que 1000");
    	     System.exit(0);
    	 }
    	 
         //vai ver quantas ligações tem
         Scanner inputL = new Scanner ( System.in );
         System.out.println("Informe o número de ligações: ");
    	 String numeroL = inputL.next();
    	 int NumeroLigacoes = Integer.parseInt(numeroL);
    	 if (NumeroLigacoes < 1 || NumeroLigacoes > 1000000){
    	     System.out.println("Não podem ser inseridos valores menores que 1 e maiores que 1000");
    	     System.exit(0);
    	 }
    	 
    	 Scanner inputT = new Scanner ( System.in );
    	 int T[];
    	 T = new int[NumeroLigacoes];
    	 
    	 for(int i = 0; i < NumeroLigacoes; i++){
    	     System.out.println("Informe o tempo de ligação: ");
    	     if (T[i] < 1 || T[i] > 30){
    	     System.out.println("Não podem ser inseridos valores menores que 1 e maiores que 1000");
    	     System.exit(0);
    	 }
	     
    	 }
    	 int Vendedores[][];
    	 Vendedores = new int[NumeroVendedores][NumeroLigacoes];
    	 int j = 1, a = 1, b = 0, menor = 0;
    	 
    	 for (j = 0; j < NumeroVendedores; j++){
    	    //Preenchendo o nome dos marketers e zerando o tempo deles;
    	    Vendedores[0][j] = j + 1;
    	    Vendedores[1][j] = 0;
    	 }
    	 
    	 for (a = 0; a < NumeroLigacoes; a++){
    	    menor = Vendedores[1][0];
    	    for(b = 0; b < NumeroVendedores; b++){
    	        if(Vendedores[1][b] < Vendedores[1][b++]){
    	            menor = b;
    	        }
    	        
    	    }
    	    Vendedores[1][menor] = T[a]; 
    	 }
    	 
    	 for (a = 0; a < NumeroVendedores; a++){
    	    System.out.println("  ");
    	    for(b = 0; b < 2; b++){
    	        System.out.println(Vendedores[b][a]);
    	    }
    	 }
	}
}
}

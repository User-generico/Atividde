import java.util.Scanner;

public class Main3
{
	public static void main(String[] args) {
	    
    Scanner input1 = new Scanner(System.in);
    Scanner input2 = new Scanner(System.in);

    int linha1[] = new int[4]; 
    int i, p=0; 
   
    int linha2[] = new int[4]; 
    int j; 
    
    for (i=0; i<4; i++) {
      System.out.printf("Informe as coordenadas do primeira linha: ", linha1);
      String n = input1.next();
      linha1[i] = Integer.parseInt(n);
      if(linha1[i]<0 || linha1[i]>1000000){
          System.out.println("Não é possível valores menores que 0 e maiores que 1000000.");
          System.exit(0);
      }
    }
 
    for (j=0; j<4; j++) {
      System.out.printf("Informe as coordenadas do segunda linha: ", linha2);
      String M = input2.next();
      linha2[j] = Integer.parseInt(M);
      if(linha2[j]<0 || linha2[j]>1000000){
          System.out.println("Não é possível valores menores que 0 e maiores que 1000000.");
          System.exit(0);
      }
    }
    
    while (p!=1000){
        if(linha1[0]==linha2[0] || linha1[1]==linha2[1] || linha1[2]==linha2[2] || linha1[3]==linha2[3] ){ 
            System.out.printf("1");
            break;
    	}
    	
    	if(linha1[2]>linha2[0] && linha1[2]<linha2[2]){ 
            System.out.printf("1");
            break;
    	}else{
    	    System.out.printf("0");
    	}
    	if(linha1[3]>linha2[1] && linha1[3]<linha2[3]){ 
            System.out.printf("1");
            break;
    	}else{
    	    System.out.printf("0");
    	    break;
    	}
	}
	}
}


import java.util.Scanner;

public class Estacionamento {

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //id 1 = Entrada de veículos
    //id 2 = Saída de veículos
    //Valor por hora = R$6,00
      
      
	//Vai ser entrada ou Saída?  
    System.out.println("Entre com uma ID:");
    id = sc.nextInt();
    	if (id < 1 || id > 2) {
        	System.out.println("Entre com uma ID válida!");
        
          
		//Entrada de veículos       
        } else if (id == 1) {
          System.out.println("CPF SEM PONTOS, TRAÇOS E ESPAÇOS:");
          int cpf1 = sc.nextInt();
          System.out.println("DATA DE ENTRADA SEM TRAÇOS E ESPAÇOS:");
          int data1 = sc.nextInt();
          System.out.println("HORA NO MOMENTO DE ENTRADA:");
          int hora1 = sc.nextInt();
          System.out.println("MINUTOS NO MOMENTO DE ENTRADA:");
          int min1 = sc.nextInt(); }
      
      
        //Saída de veículos
          else if (id == 2) {
          System.out.println("CPF DE SAÍDA");
          int cpf2 = sc.nextInt();
    	  System.out.println("DATA DE SAÍDA");
          int data2 = sc.nextInt();
          System.out.println("HORA NO MOMENTO DE SAÍDA:");
          int hora2 = sc.nextInt();
          System.out.println("MINUTOS NO MOMENTO DE SAÍDA:");
          int min2 = sc.nextInt(); }
 
 
        //Tratamento das informações
      	  double valorMin = 0,1;
       	  int horaMin = ((hora2 - hora1) * 60) + (min2 - min1);
          int pagar = horaMin * valorMin;
 
 
        //Retorno de Saída
          System.out.println("TEMPO PERMANECIDO NO ESTACIONAMENTO: "+horaMin +" MINUTOS");
      	  System.out.println("Valor a ser pago: R$"+pagar);
                        
  } 
}

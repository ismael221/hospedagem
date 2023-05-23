package atividade4;
import java.util.Scanner;
public class Atividade4 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int opcao = 0,j =0;
        String pesquisa ="";
        boolean achou = false;
        String[] hospede = new String[15];
        
        while(opcao != 3){
            
            System.out.println("1 - Cadastrar; 2 - Pesquisar; 3 - Sair");
            opcao = input.nextInt();    
            input.nextLine();
            while(opcao == 1){
                  if(opcao == 1){
                
                for(int i=0;i<hospede.length;i++){
                    
                   System.out.println("Nome do hospede: ");
                   hospede[i] = input.nextLine();
                   System.out.println("1 - Cadastrar; 2 - Pesquisar; 3 - Sair");
                    opcao = input.nextInt();
                    input.nextLine();
                   if(hospede[i] == hospede[14]){
                       System.out.println("Máximo de cadastros atingidos");
                       break;
                   }else if(opcao == 2){
                       break;
                   }else if(opcao == 3){
                       break;
                   }
                    
                }   
            }    
            }
            
             if(opcao == 2){
                  
               while(opcao ==2){
                   
                   System.out.println("Qual hospede deseja encontrar: ");
                   pesquisa = input.nextLine();
                   
                  for(int i=0;i<hospede.length;i++){
                      if(pesquisa.equals(hospede[i])){
                           achou = true;
                           System.out.println("Encontrado na posição "+i);
                           break;
                      }
                     }
                     if(!achou){
                        System.out.println("Não achou");
                             }
                    System.out.println("1 - Cadastrar; 2 - Pesquisar; 3 - Sair");
                    opcao = input.nextInt();
                    
                    
                }
                 }
                    
    }
}
    
    }

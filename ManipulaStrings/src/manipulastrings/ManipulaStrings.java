
package manipulastrings;

import java.util.Scanner;


public class ManipulaStrings {
    
    public static Scanner read = new Scanner(System.in);

    public static void main(String[] args) {
        
        int op;
        do{
            System.out.println("--- Menu ---");
            System.out.println("1 - Tamanho String");
            System.out.println("2 - Árvore de letras");
            System.out.println("3 - Capitalização de letras");
            System.out.println("4 - Árvore de letras Substring");
            System.out.println("5 - Substitua palavra");
            
            System.out.println("0 - Sair");
            System.out.println("Selecione a opção pretendida");
            op = read.nextInt();
            
            switch (op){
                case 0: break;
                case 1: 
                    System.out.println("A string inserida tem: "+ExerciciosStrings.contaCaracteres()+" caracteres");
                    /*
                    int t = ExerciciosStrings.contaCaracteres();
                    System.out.println("A string Inserida tem : "+t+" caracteres");
                    */
                    break;
                case 2:
                    ExerciciosStrings.arvoreLetras();
                    break;
                case 3:
                    ExerciciosStrings.capitalizaLetras();
                    break;
                case 4:
                    ExerciciosStrings.arvoreLetrasSub();
                    break;
                case 5:
                    ExerciciosStrings.substituirPalavra();
                    break;
                default : System.out.println("Insira opção válida!");
            }
        }while(op!=0);
    }
    
}

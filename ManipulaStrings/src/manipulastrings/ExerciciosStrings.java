
package manipulastrings;

public class ExerciciosStrings {
    public static String s,s1;
    /*public static int contaCaracteres() {
        String s, s1;
        System.out.println("Insira um texto");
        s = ManipulaStrings.read.next();
        s1 = ManipulaStrings.read.nextLine();
        s = s+s1;
        return s.length();
    }*/
    
    public static void leStrings(String texto){
        
        System.out.println(texto);
        s = ManipulaStrings.read.next();
        s1 = ManipulaStrings.read.nextLine();
        s = s+s1;
    }
    
    public static int contaCaracteres(){
        leStrings("Insira um texto");
        return s.length();
    }
    
    static void arvoreLetras() {
        int x,y;
        
        leStrings("Insira uma palavra");
   
        for (x=0;x<s.length();x++){ //linhas
            for(y=0;y<=x;y++){      //colunas
                System.out.print(s.charAt(y));
            }
            System.out.println();
        }
        
        for (x=s.length()-1;x>=0;x--){ //linhas
            for(y=0;y<x;y++){      //colunas
                System.out.print(s.charAt(y));
            }
            System.out.println();
        }
        
    }

    static void capitalizaLetras() {
        String sc;
        leStrings("Insira uma palavra em minúsculas");
        sc = s.toUpperCase();       
        System.out.println("Upper: "+sc);
        
        leStrings("Insira uma palavra em maiúsculas");
        sc = s.toLowerCase();      
        System.out.println("Lower: "+sc);
    }

    static void arvoreLetrasSub() {
        int x,y;
        String ss;
        leStrings("Insira uma palavra");
 
        for(x=0;x<s.length();x++){
            ss = s.substring(0,x+1);
            System.out.println(ss);
        }
        
        for(y=s.length();y>0;y--){
            ss = s.substring(0,y-1);
            System.out.println(ss);
        }

    }

    static void substituirPalavra() {
        String si,so,sn;
        
        System.out.println("Insira um texto");
        si = ManipulaStrings.read.String();
        
        System.out.println("Insira a palavra que quer substituir: ");
        so = ManipulaStrings.read.String();
        
        System.out.println("Insira nova palavra: ");
        sn = ManipulaStrings.read.String();
        
        si = s.replace(so, sn);
        System.out.println(s);
    }
    
}


package projeto;

import java.util.Scanner;

public class Projeto {
    
    public static void menu(){
        System.out.println(".______        ___   .___________.    ___       __       __    __       ___      \n" +
"|   _  \\      /   \\  |           |   /   \\     |  |     |  |  |  |     /   \\     \n" +
"|  |_)  |    /  ^  \\ `---|  |----`  /  ^  \\    |  |     |  |__|  |    /  ^  \\    \n" +
"|   _  <    /  /_\\  \\    |  |      /  /_\\  \\   |  |     |   __   |   /  /_\\  \\   \n" +
"|  |_)  |  /  _____  \\   |  |     /  _____  \\  |  `----.|  |  |  |  /  _____  \\  \n" +
"|______/  /__/     \\__\\  |__|    /__/     \\__\\ |_______||__|  |__| /__/     \\__\\ \n" +
"                                                                                 \n" +
".__   __.      ___   ____    ____  ___       __      \n" +
"|  \\ |  |     /   \\  \\   \\  /   / /   \\     |  |     \n" +
"|   \\|  |    /  ^  \\  \\   \\/   / /  ^  \\    |  |     \n" +
"|  . `  |   /  /_\\  \\  \\      / /  /_\\  \\   |  |     \n" +
"|  |\\   |  /  _____  \\  \\    / /  _____  \\  |  `----.\n" +
"|__| \\__| /__/     \\__\\  \\__/ /__/     \\__\\ |_______|\n" +
"                                                     ");
        System.out.println("\n\n");
        
        System.out.print("--    .-\"\"-.\n" +
"   ) (     )\n" +         
"  (   )   (                                       ===================    \n" +
"     /     )                                      |                 |    \n" +
"    (_    _)                     0_,--.__         |  1. JOGAR       |    \n" +
"      (_  )_                     |_.JA._/         |  2. TUTORIAL    |    \n" +
"       (    )                    |__VA..\\         |  3. CRÉDITOS    |    \n" +
"        (__)                     |__---_/         |                 |    \n" +
"     |''   ``\\                   |                ===================    \n" +
"     |        \\                  |      /b.\n" +
"     |         \\  ,,,---===?A`\\  |  ,==y'\n" +
"   ___,,,,,---==\"\"\\        |M] \\ | ;|\\ |>\n" +
"           _   _   \\   ___,|H,,---==\"\"\"\"bno,\n" +
"    o  O  (_) (_)   \\ /          _    WAW/\n" +
"                     /         _(+)_ dMM/\n" +
"      \\@_,,,,,,---==\"   \\      \\\\|// MW/\n" +
"--''''\"                         ===  d/\n" +
"                                    //\n" +
"                                  ,'/__________________________\n" +
"   \\    \\    \\     \\              ,/~~~~~~~~~~~~~~~~~~~~~~~~~~~\n" +
"                         _____    ,'  ~~~   .-\"\"-.~~~~~~  .-\"\"-.\n" +
"      .-\"\"-.           ///==---   /`-._ ..-'      -.__..-'\n" +
"            `-.__..-' =====\\\\\\\\\\\\ V/  .---\\.-.__..-'-.__..-'\n\n");
        System.out.println("\n\n\n\n\n\n\n\n\n");
        System.out.print("     ---> ESCOLHA UMA DAS OPÇOES: ");
    }

    public static void Jogar(){ 
        System.out.print("TABELA DO JOGO: ");
  
        String[][] posicao = new String[16][16];
        posicao[0][0] = "  ";
        posicao[0][1] = "A";
        posicao[0][2] = "B";
        posicao[0][3] = "C";
        posicao[0][4] = "D";
        posicao[0][5] = "E";
        posicao[0][6] = "F";
        posicao[0][7] = "G";
        posicao[0][8] = "H";
        posicao[0][9] = "I";
        posicao[0][10] = "J";
        posicao[0][11] = "K";
        posicao[0][12] = "L";
        posicao[0][13] = "M";
        posicao[0][14] = "N";
        posicao[0][15] = "O";

        posicao[1][0] = "1 ";
        posicao[2][0] = "2 ";
        posicao[3][0] = "3 ";
        posicao[4][0] = "4 ";
        posicao[5][0] = "5 ";
        posicao[6][0] = "6 ";
        posicao[7][0] = "7 ";
        posicao[8][0] = "8 ";
        posicao[9][0] = "9 ";
        posicao[10][0] = "10";
        posicao[11][0] = "11";
        posicao[12][0] = "12";
        posicao[13][0] = "13";
        posicao[14][0] = "14";
        posicao[15][0] = "15";

        for (int i = 1; i < posicao.length; i++) {
            for (int j = 1; j < posicao[i].length; j++) {
                posicao[i][j] = "~";
            }
            System.out.println();
        }
        for (int i = 0; i < posicao.length; i++) {
            for (int j = 0; j < posicao[i].length; j++) {
                System.out.print(posicao[i][j] + " | ");
            }
            System.out.println();
        }
        Scanner scan = new Scanner(System.in); // usei Scanner de nome scan
        System.out.println("");
        System.out.println("DIGITE A COORDENADA MARINHEIRO !");
        System.out.println("");
        System.out.println("");
        
        System.out.print("DIGITE UMA COLUNA (de A a O): ");
        String jogadaColuna = scan.nextLine();
        
        
        System.out.println("");
        System.out.println("");
        
        System.out.print("DIGITE UMA LINHA (de 1 a 15): ");
        
        int jogadaLinha = scan.nextInt();
        System.out.println("");
        System.out.println("");
            
     //Adicinar o jogo aqui   
    }
    
    public static void Tutorial(){
                     System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
       System.out.println("SEGUE OS PASSOS MARINHEIRO"); 
                     System.out.println("");
                     System.out.println("PASSO(1) DIGITE UMA COLUNA REPRESENTADA POR LETRAS DE (A a O)");
                     System.out.println("PASSO(2) DIGITE UMA LINHA REPRESENTADA POR NÚMEROS (1 e 15)");
                     System.out.println("PASSO(3) VERIFICAR SE ACERTOU ALGUMA EMBARCACÃO ");
                     System.out.println("\n\n\n");
    }
    
    public static void Sobre(){
        
                     System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                     System.out.println("           CENTRO UNIVERSITÁRIO SENAC ");
                     System.out.println("  ALUNOS DESENVOLVEDORES DO 1º PERÍODO DE TADS");
                     System.out.println("            MAYCON RAMALHO PEREIRA");
                     System.out.println("            RODRIGO INACIO GOMES");
                     System.out.println("            WILLENEUVE DO SANTOS ASSUNÇÃO ");
                     System.out.println("            ANDREAS BORBA MENDONÇA");
                     System.out.println("\n\n\n");
    }
    
    public static void OpcaoAdicional(){
        System.out.println("Opção reserva");
    }
    
    public static void main(String[] args) {
        int opcao;
        Scanner entrada = new Scanner(System.in);
        
        do{
            menu();
            opcao = entrada.nextInt();
            
            switch(opcao){
            case 1:
                Jogar();
                break;
                
            case 2:
                Tutorial();
                break;
                
            case 3:
                Sobre();
                break;
                
            case 4:
                OpcaoAdicional();
                break;
            
            default:
                System.out.println("Opção inválida.");
            }
        } while(opcao != 0);
    }
}

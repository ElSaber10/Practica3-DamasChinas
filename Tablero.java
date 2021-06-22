package src.tableros;
import java.util.Scanner;

public class Tablero {
    public static final String SIMBOLO_VACIO = " ";
    public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";
    public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";

    public static final String ANSI_WHITE = "\u001B[37m";
    public static final String ANSI_BLACK = "\u001B[30m";
    Scanner scan = new Scanner(System.in);
    private String[][] tablero;

    //Jugador jugadr = new Jugador(tablero);
    public Tablero() {
        this.tablero = new String[8][8];
        llenarTablero();
    }

    public String[][] getTablero() {
        return tablero;
    }

    public void setTablero(String[][] tablero) {
        this.tablero = tablero;
    }

    public void dibujarTablero(String jugador1, String jugador2) {
        System.out.println("Jugador1:" + jugador1 + "\t\t\t" + "Jugador2:" + jugador2);
        System.out.println("\t_________________________________________________________________________________");
        System.out.println("\t 0 1 2 3 4 5 6 7");
        for (int i = 0; i < 8; i++) {
            System.out.print("\t" + i);
            for (int j = 0; j < 8; j++) {
                if(((i % 2) == 0)){
                    if((j % 2 )== 0){
                        if (i < 3){
                            System.out.print(ANSI_GREEN_BACKGROUND  + tablero[i][j] + ANSI_RESET);
                        }else{
                            System.out.print(ANSI_GREEN_BACKGROUND + tablero[i][j] + ANSI_RESET);
                        }
                    }
                if((j % 2 )!= 0){
                    System.out.print(ANSI_BLUE_BACKGROUND + tablero[i][j] + ANSI_RESET);
                    }
                }
                if(((i % 2) != 0)){
                    if((j % 2 ) != 0){
                    System.out.print(ANSI_GREEN_BACKGROUND + tablero[i][j]+ ANSI_RESET);
                    
                }
                    if ((j % 2) == 0){
                    System.out.print(ANSI_BLUE_BACKGROUND + tablero[i][j] + ANSI_RESET);

                    }
                }
            } 
            System.out.println("");
            //System.out.println("_________________________________________________________________________________");
        }
    }

    public void buscar(String jug){
        int x ;
        System.out.println("Turno Jugador " + jug);
        System.out.println("Ingrese la pisicion FILA 1) ");
        x = Integer.parseInt(scan.next());
        System.out.println("Ingrese la pisicion COLUMNA 2) ");
        int y = Integer.parseInt(scan.next());
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (tablero[i][j] == tablero[x][y]) {
                    if (tablero[i][j] == ("0 ")){
                        System.out.println("Si se puede");
                        tirapariba0(x, y);
                        break;
                    }
                }
            }
        }
        
    }
    public void buscar2(String jug){
        int x ;
        System.out.println("Turno Jugador " + jug);
        System.out.println("Ingrese la pisicion FILA 1) ");
        x = Integer.parseInt(scan.next());
        System.out.println("Ingrese la pisicion COLUMNA 2) ");
        int y = Integer.parseInt(scan.next());
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (tablero[i][j] == tablero[x][y]) {
                    if (tablero[i][j] == ("x ")){
                        System.out.println("Si se puede");
                        tirapabajoX(x, y);
                         break;
                    }
                }
            }
        }
        
    }
    public void tirapariba0(int x, int y){
        int x1 ;
        System.out.println("1) mover abajo izquierda, 2) abajo derecha ");
        x1 = Integer.parseInt(scan.next());
        if (x1 == 1){
            tablero[x][y] = "  ";
            tablero[x+1][y+1] = "0 ";
            dibujarTablero("andrea","juan");
        }
        if (x1 == 2){
            tablero[x][y] = "  ";
            tablero[x+1][y-1] = "0 ";
            dibujarTablero("andrea", "juan");
        }
        
    }

    public void tirapabajoX(int x, int y){
        int x1 ;
        System.out.println("1) mover abajo izquierda, 2) abajo derecha ");
        x1 = Integer.parseInt(scan.next());
        if (x1 == 1){
            tablero[x][y] = "  ";
            tablero[x-1][y+1] = "x ";
            dibujarTablero("andrea","juan");
        }
        if (x1 == 2){
            tablero[x][y] = "  ";
            tablero[x-1][y-1] = "0 ";
            dibujarTablero("andrea", "juan");
        }
        
    }

    public void dibujarTablero() {
        int colum = 0;
        System.out.println("\t_________________________________________________________________________________");
        System.out.println("\t 0 1 2 3 4 5 6 7");
        for (int i = 0; i < 8; i++) {
            System.out.print("\t" + i);
            for (int j = 0; j < 8; j++) {
                if(((i % 2) == 0)){
                    if((j % 2 )== 0){
                        /*if (i < 3 ){
                    System.out.print(ANSI_GREEN_BACKGROUND + tablero[i][j] + "* " + ANSI_RESET);
                        }else{
                            System.out.print(ANSI_GREEN_BACKGROUND + tablero[i][j] + "  " + ANSI_RESET);
                        }*/
                        Verfichas(i, j, tablero);
                    }
                    if((j % 2 )!= 0){
                        tablero[i][j]= "  ";
                    System.out.print(ANSI_BLUE_BACKGROUND + tablero[i][j] + ANSI_RESET);
                    }
                }
                if(((i % 2) != 0)){
                    if((j % 2 ) != 0){
                    //System.out.print(ANSI_GREEN_BACKGROUND + tablero[i][j] + "  " + ANSI_RESET);
                    Verfichas(i, j, tablero);
                }
                    if ((j % 2) == 0){
                        tablero[i][j]= "  ";
                    System.out.print(ANSI_BLUE_BACKGROUND + tablero[i][j] + ANSI_RESET);

                    }
                }
            } 
            System.out.println("");
            //System.out.println("_________________________________________________________________________________");
        }
    }

    public void Verfichas(int i, int j, String [][] tabler){
        if (i < 3){
            tablero[i][j] ="0 ";
            System.out.print(ANSI_GREEN_BACKGROUND +  tabler[i][j] + ANSI_RESET);
        }
        if(i > 4){
            tablero[i][j] ="x ";
            System.out.print(ANSI_GREEN_BACKGROUND + ANSI_WHITE + tabler[i][j] + ANSI_WHITE + ANSI_RESET);
        }if(i >= 3 && i <= 4){
            tablero[i][j]= "  ";
            System.out.print(ANSI_GREEN_BACKGROUND + tabler[i][j] + ANSI_RESET);
        }
    }
    
    private void llenarTablero() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                tablero[i][j] = SIMBOLO_VACIO;
            }
        }
    }

    public boolean estaLlenoElTablero() {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                if (tablero[i][j].equalsIgnoreCase(SIMBOLO_VACIO)) {
                    return false;
                }
            }
        }
        return true;
    }
}

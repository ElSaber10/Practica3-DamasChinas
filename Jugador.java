package src.jugadores;
import java.util.Scanner;
import src.tableros.Tablero;

public class Jugador {
   private String [][] tablero;
    public Jugador (String [][] tablero){
        this.tablero = tablero;
    }
    public Jugador(){
        
        
    }
    public void dale (){
        int n = 1;
        Tablero tab = new Tablero();
        if (n == 1){
            tab.buscar("Vivi");
        }else{
            tab.buscar("Andreaa");
        }
        
    }
    
}

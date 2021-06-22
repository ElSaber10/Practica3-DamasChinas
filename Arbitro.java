package src.jugadores;
import src.tableros.Tablero;
public class Arbitro {

    public Arbitro(){
        Tablero tab = new Tablero();
        Jugador jug = new Jugador();
        boolean n = true;
        int cont = 0;
            cont++;
           // jug.dale(cont);
            if (cont == 2){
                cont = 1;
            }
    }
    public boolean ganador(){
        return true;
    }
}
package src.tableros;
import java.util.Scanner;
import src.tableros.Tablero;
import src.jugadores.Jugador;
import src.jugadores.Arbitro;
import src.papelotijera.PiedraPapelTijera;

public class Principal {

    public static void main(String[] args){
        Principal p = new Principal();
    }
    public Principal(){
        System.out.println("Bienvenido a memorabilia \n\n");
        Tablero tab = new Tablero();
        Arbitro arb = new Arbitro();
        PiedraPapelTijera jue = new PiedraPapelTijera();
        tab.dibujarTablero();
        //do{
           tab.buscar("Andrea");
            tab.buscar2("Daniela");

        //}while(arb.ganador());
        System.out.println("ganadores");
        System.out.println("Andrea");
        System.out.println("Juan");
        System.out.println("Vivi");
        System.out.println("Daniela");
        System.out.println("Antoni");
       // Jugador jug = new Jugador();
        //jug.dale();
    }
}

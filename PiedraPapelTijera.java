package src.papelotijera;
import java.util.Scanner;
 
public class PiedraPapelTijera
{
   Scanner teclado = new Scanner(System.in);

   public PiedraPapelTijera(){
      boolean a = true;
      do{
      System.out.println("Juego piedra-papel-tijera");

 
      int seleccionCompu = (int)(Math.random() * 3) + 1;
      System.out.println("La computadora ya escogio...");
// teclado.next();

      System.out.println("Indique su seleccion [1=Piedra, 2=Papel, 3=Tijera]: ");
      int seleccionUsuario = Integer.parseInt(teclado.nextLine());
 
      System.out.println("La computadora habia escogido: ");
      switch ( seleccionCompu )
      {
         case 1:
            System.out.println("Piedra");
            switch ( seleccionUsuario )
            {
               case 1: System.out.println("Empate!"); break;
               case 2: System.out.println("Usted gana!" ); a = false; break;
               case 3: System.out.println("La computadora gana!"); a = false; break;
            }
            break;
 
         case 2:
            System.out.println("Papel");
            switch ( seleccionUsuario )
            {
               case 1: System.out.println("La computadora gana!"); a = false; break;
               case 2: System.out.println("Empate!"); break;
               case 3: System.out.println("Usted gana!"); a = false; break;
            }
            break;
 
         case 3:
            System.out.println("Tijera");
            switch ( seleccionUsuario )
            {
               case 1: System.out.println("Usted gana!");a = false; break;
               case 2: System.out.println("La computadora gana!"); a = false; break;
               case 3: System.out.println("Empate!"); break;
            }
            break;
      }
   }while(a);
}
}
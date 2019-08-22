//2019042851//

import java.util.Scanner;
public class ATM{
  Cuenta[] Array = new Cuenta[10];
 
  public void declararArreglo(){ 
    for(int i=0; i < Array.length; i++){
      Array[i] = new Cuenta(i, 100000);
    }
  }
  public int ATM(){
    Scanner ID = new Scanner(System.in);
    Scanner opcion = new Scanner(System.in);
    Scanner retiro = new Scanner(System.in);
    Scanner deposito = new Scanner(System.in);

    while(true){
      System.out.println("Introduzca su identificacion: ");
      int id_cuenta = ID.nextInt();
      if(id_cuenta > 9 && id_cuenta < 0){
        return id_cuenta;
      }
      while(id_cuenta >= 0 && id_cuenta <= 9){
        System.out.println("Seleccione la accion a realizar");
        System.out.println("1. Su balance ");
        System.out.println("2. Hacer un retiro ");
        System.out.println("3. Hacer un deposito "); 
        System.out.println("4. Salir ");
        int opciones = opcion.nextInt();
          if(opciones == 1){
            System.out.println("Su balance:  " +Array[id_cuenta].getbalance());
          }
          if(opciones == 2){
            System.out.println("Cuanto dinero desea retirar?:");
            int dinero_retirado = retiro.nextInt();
            Array[id_cuenta].retirarDinero(dinero_retirado);
          }
          if(opciones == 3){
            System.out.println("Cuanto dinero desea depositar?:");
            int dinero_depositado = deposito.nextInt();
            Array[id_cuenta].depositarDinero(dinero_depositado);
          }
          if(opciones == 4){
            System.out.println("Adios");
           break;
        }
      }
    } 
  }
}

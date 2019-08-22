//2019042851//

import java.util.Date;
class Main {
  public static void main(String[] args) {
   Cuenta cuenta_usuario = new Cuenta(1122, 500000);
   cuenta_usuario.settasainteresporAño(0.045);
   cuenta_usuario.depositarDinero(150000);
   cuenta_usuario.retirarDinero(200000);
   Date Fechadecreacion = cuenta_usuario.getFechacreacion();
   String Fechadecreacion_str = Fechadecreacion.toString();
   
   System.out.println(cuenta_usuario.getbalance() + Fechadecreacion_str);
   System.out.println(cuenta_usuario.interesporMesCalc());

   Cuenta cuenta_usuario2 = new Cuenta(203, 400000);
   cuenta_usuario2.settasainteresporAño(0.035);
   cuenta_usuario2.depositarDinero(250000);
   cuenta_usuario2.retirarDinero(100000);
   Date Fechadecreacion2 = cuenta_usuario2.getFechacreacion();
   String FechadeCreacion2_str = Fechadecreacion2.toString();

   System.out.println(cuenta_usuario2.getbalance()  +  cuenta_usuario2.interesporMesCalc()  +  FechadeCreacion2_str );
   System.out.println(cuenta_usuario2.interesporMesCalc());

   ATM cajero = new ATM();
   cajero.Array_declaracion();
   cajero.Run();
  }
}
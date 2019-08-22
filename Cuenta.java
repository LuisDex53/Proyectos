//2019042851//

import java.util.Date;
public class Cuenta{
  private int id;
  private double tasainteresporAño;
  private double balance;
  private Date Fechacreacion = new Date();

  public Cuenta(){
    id = 0;
    balance = 0;
    tasainteresporAño = 0;
    Fechacreacion = new Date();
  }
  public Cuenta(int idUsuario, double balanceUsuario){
    id = idUsuario;
    balance = balanceUsuario;
  }
  public int getID(){
    return this.id;
  }
  public double getbalance(){
    return this.balance;
  }
  public double gettasainteresporAño(){
    return this.tasainteresporAño;
  }
  public void setID(int id){
    this.id = id;
  }
  public void setbalance(double balance){
    this.balance = balance;
  }
  public void settasainteresporAño(double tasainteresporAño){
    this.tasainteresporAño = tasainteresporAño;
  }
  public Date getFechacreacion(){
    return this.Fechacreacion;
  }
  public double tasadeinteresporMes(){
    double tasainteresporMes = tasainteresporAño / 12;
    return tasainteresporMes;
  }
  public double interesporMesCalc(){
    double interesxMes = balance * tasainteresporAño;
    return interesxMes;
  }
  public void retirarDineroo(int dinero){
    balance = balance - dinero;
  }
  public void deposito(int dinero){
    balance = balance + dinero;
  }
}

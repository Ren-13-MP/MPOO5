public class Coche{
 private String marca;
 private Persona chofer;
 private Persona copiloto;
 private Persona pasajero1;
 private Persona pasajero2;
public Coche(){
 
}
public Coche(String marca,Persona chofer,Persona copiloto,Persona pasajero1,Persona pasajero2){
 this.marca=marca;
 chofer=new Persona();
 this.chofer=chofer;
 copiloto=new Persona();
 this.copiloto=copiloto;
 pasajero1=new Persona();
 this.pasajero1=pasajero1;
 pasajero2=new Persona();
 this.pasajero2=pasajero2;
}
public String getMarca(){
 return marca;
}
public void setMarca(String marca){
 this.marca=marca;
}
public Persona getChofer(){
 return chofer;
}
public void setChofer(Persona chofer){
 this.chofer=chofer;
}
public Persona getCopiloto(){
 return copiloto;
}
public void setCopiloto(Persona copiloto){
 this.copiloto=copiloto;
}
public Persona getPasajero1(){
 return pasajero1;
}
public void setPasajero1(Persona pasajero1){
 this.pasajero1=pasajero1;
}
public Persona getPasajero2(){
 return pasajero2;
}
public void setPasajero2(Persona pasajero2){
 this.pasajero2=pasajero2;
}
@Override
public String toString(){
 return "La maraca que maneja la "+chofer+" es "+marca+" el copiloto es la"+copiloto+" y los pasajeros son "+pasajero1+" "+pasajero2+".";
}}
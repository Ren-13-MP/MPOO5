public class Fecha{
 private int dia;
 private int mes;
 private int anio;
 public Fecha(){
 }
 public Fecha(int dia, int mes, int anio){
 this.dia=dia;
 this.mes=mes;
 this.anio=anio;
 }
 public int getDia(){
 return dia;
 }
 public void setDia(int dia){
 if(dia<1 || dia>31){
 System.out.println("Error");
 }
 else{
 this.dia=dia;
 }
 
 }
 public int getMes(){
 return mes;
 }
 public void setMes(int mes){
 if(mes<1 || mes>12){
 System.out.println("Error");
 }
 else{
 this.mes=mes;
 }
 }
 public int getanio(){
 return anio;
 }
 public void setAnio(int anio){
 if(anio<0){
 System.out.println("Error");
 }
 else{
 this.anio=anio;
 }
 
 }
 @Override
 public String toString(){
 return "Fecha{dia="+dia+" mes="+mes+"anio="+anio+"}";
 }
}
class Main {
 public static void main(String[] args) {
 Circulo cir=new Circulo();
 System.out.println(cir);
 cir.setRadio(5.3f);
 System.out.println(cir);
 cir.setRadio((float)7.33);
 System.out.println(cir);
 float var= -8.66f;
 cir.setRadio(var);
 System.out.println(cir);
 System.out.println("############composicion###########");
 Persona persona1=new Persona();
 persona1.setNombre("Susana");
 persona1.setApellido("Vazquez");
 Fecha fecha1= new Fecha(2,3,2021);
 persona1.setfNacimiento(fecha1);
 System.out.println(persona1);
 System.out.println(persona1.getfNacimiento());
 System.out.println(persona1.getfNacimiento().getanio());
 System.out.println("##########composicion2#############");
 Persona persona2=new Persona("Raquel","Zavala",8,4,1998);
 System.out.println(persona2);
 System.out.println("###################################");
 Coche coche1=new Coche();
 coche1.setMarca("Toyota");
 Persona chofer1=new Persona("Juan","Perez",14,10,1986);
 Persona copiloto1=new Persona("Ximena","Ramirez",7,2,1990);
 Persona pasa1= new Persona("Diego","Sanchez",23,5,1989);
 Persona pasa2=new Persona("Andres","Perez",17,7,1999);
 coche1.setChofer(chofer1);
 coche1.setCopiloto(copiloto1);
 coche1.setPasajero1(pasa1);
 coche1.setPasajero2(pasa2);
 System.out.println(coche1); 
 }
}

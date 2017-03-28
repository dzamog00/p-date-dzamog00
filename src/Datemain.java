

public class Datemain{
     


public static void main(String args[]){
     
     //Iniciar las variables
     Date fecha = new Date(27,03,2017);
     Date fecha2 = new Date(30,03,1990);
     
     //Mostrar las fechas
     System.out.println("Primera fecha: ");
     System.out.println(fecha.getDay());
     System.out.println(fecha.getMonth());
     System.out.println(fecha.getYear());
     
     System.out.println("Segunda fecha: ");
     System.out.println(fecha2.getDay());
     System.out.println(fecha2.getMonth());
     System.out.println(fecha2.getYear());
     
     //Comprobar metodos de igualdades
     
     System.out.println(fecha2.isSameDay(fecha));
     
     System.out.println(fecha2.isSameMonth(fecha));
     
     System.out.println(fecha2.isSameYear(fecha));
     System.out.println(fecha.isSame(fecha2));
     
     
     
     }

}
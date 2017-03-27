
public class Date{
     


public static void main(String args[3]){
     
     Date fecha = new Date(27,03,2017);
     System.out.println(fecha.isSameYear(2016));
     Date fecha2 = new Date(01,01,1970);
     System.out.println(fecha.isSame(fecha2));
     
}


}
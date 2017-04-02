

public class Datemain{
     


	public static void main(String args[]){
	     
	     // Iniciar las variables
	     
		 Date fecha = null;
		 Date fecha2 = null;
		
		 try{
			 fecha = new Date(1,1,2017);
		 } catch (DateException e) {
		      System.out.println(e.getMessage());
		 }
		 
		 try{
			 fecha2 = new Date(30,3,1990);
		 } catch (DateException e) {
		      System.out.println(e.getMessage());
		 }
		 
		 // Mostrar las fechas
		 
		 System.out.println("Primera fecha: ");
		 System.out.println("Dia: " + fecha.getDay());
		 System.out.println("Mes: " + fecha.getMonth());
		 System.out.println("A�o: " + fecha.getYear());
		 System.out.println();
		 System.out.println("Segunda fecha: ");
		 System.out.println("Dia: " + fecha2.getDay());
		 System.out.println("Mes: " + fecha2.getMonth());
		 System.out.println("A�o: " + fecha2.getYear());
		 
		 
		 System.out.println();
		 // Comprobar metodos de igualdades

		 System.out.println("Los dias de las fechas ".concat(fecha2.isSameDay(fecha) ? "coinciden" : "NO coinciden"));
		 System.out.println("Los meses de las fechas ".concat(fecha2.isSameMonth(fecha) ? "coinciden" : "NO coinciden"));
		 System.out.println("Los a�os de las fechas ".concat(fecha2.isSameYear(fecha) ? "coinciden" : "NO coinciden"));
		 System.out.println("Las fechas ".concat(fecha2.isSameMonth(fecha) ? "coinciden" : "NO coinciden"));
		 
		 
		 
		 System.out.println();
		 // Nombre de los meses
		 
		 try{
			 fecha2.getMonthName(fecha.getMonth(), "primera");
			 fecha2.getMonthName(fecha2.getMonth(), "segunda");
		 } catch (DateException e) {
			 System.err.println("Fallo getMonthName: " + e.getMessage() + "\n");
		 }
		 
		 
		 
		 System.out.println();
		 // Nombre de la estaci�n
		 
		 try{
			 fecha.getSeasonName(fecha.getMonth(), "primera");
			 fecha2.getSeasonName(fecha2.getMonth(), "segunda");
		 } catch (DateException e) {
			 System.err.println("Fallo getSeasonName: " + e.getMessage() + "\n");
		 }
		 
		 
		 
		 System.out.println();
		 // Es correcto el d�a
		 
		 System.out.println("Los d�as de la primera fecha ".concat(fecha.isDayRight() ? "son correctos" : "NO son correctos"));
		 System.out.println("Los d�as de la segunda fecha ".concat(fecha2.isDayRight() ? "son correctos" : "NO son correctos"));
     
		 
		 
		 System.out.println();
		 // Nombre de los meses restantes
		 
		 try{
			 System.out.println(fecha.getMonthLeft("primera"));
			 System.out.println(fecha2.getMonthLeft("segunda"));
		 } catch (DateException e) {
			 System.err.println("Fallo getMonthLeft: " + e.getMessage());
		 }
		 
		 
		 
		 System.out.println();
		 //Mostrar fechas
		 
		 System.out.println("La primera fecha es: " + fecha.printDate(fecha.getDay(),fecha.getMonth(),fecha.getYear()));
		 System.out.println("La segunda fecha es: " + fecha2.printDate(fecha2.getDay(),fecha2.getMonth(),fecha2.getYear()));
		 
		 
		 
		 
		 System.out.println();
		 //Dias restantes del mes
		 
		 try{
			 System.out.println(fecha.getDaysLeft("primera"));
			 System.out.println(fecha2.getDaysLeft("segunda"));
		 } catch (DateException e) {
			 System.err.println("Fallo getDaysLeft: " + e.getMessage());
		 }
		 
		 
		 
		 System.out.println();
		 //Meses con los mismos dias
		 
		 try{
			 System.out.println(fecha.getMonthsSameDays("primera fecha"));
			 System.out.println(fecha2.getMonthsSameDays("segunda fecha"));
		 } catch (DateException e) {
			 System.err.println("Fallo getMonthsSameDays: " + e.getMessage());
		 }
		 
		 
		 System.out.println();
		 //Días desde el comienzo del año
		 
		 try{
			 System.out.println(fecha.daysPast("primera fecha"));
			 System.out.println(fecha2.daysPast("segunda fecha"));
		 } catch (DateException e) {
			 System.err.println("Fallo daysPast: " + e.getMessage());
		 }
     

	
	
		// Contador fechas aleatorias
	
		try{
			System.out.println(fecha.contRandomDate("primera fecha"));
			System.out.println(fecha2.contRandomDate("segunda fecha"));
		} catch (DateException e) {
			System.err.println("Fallo contRandomDate: " + e.getMessage());
		}
	
	
	
		// Devuelve dia de la semana sabiendo el primer dia del año
	
		try{
			System.out.println(fecha.dayOfWeek("primera fecha", "Domingo"));
			System.out.println(fecha2.dayOfWeek("segunda fecha", "Domingo"));
		} catch (DateException e) {
			System.err.println("Fallo contRandomDate: " + e.getMessage());
		}
		
		
		
		
		
		
}
	
	/**
	Develop a Date class defined by day, month and year.

	Including the if statement develop:
	The isSameYear method
	The isSameMonth method
	The isSameDay method
	The isSame method

	Simplify those methods without the if statement (use 4  different methods)
	
	Include in Date class:
	A method that prints the name of  the month
	A method that checks if  the day of  the month is right
	A method that prints the season of  this month
	IMPORTANT: Pay special attention to the names you give to those methods

	In the Date class write methods to:
	For a date, print the months left until the end of  the year.
	Write a method in Date class that prints a date.
	For a date, print all dates until the end of  the month.
	For a date, print the months with the same number of days as the month of  this date.
	For a date, count the number  of  days since the first day 
	of  the year (do not consider leap years)

	In the Date class build the following methods:
	� Build a method that counts the number of attempts
	needed to generate a random date equals to a given
	date (only inside the same year)
	� Do it using a while statement
	� Do it using a do-while statement
	� For a given date and knowing the day of the week of
	the first day of the year of that date, show the day of
	the week of the given date.
	*/
}
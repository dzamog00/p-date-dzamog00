
public class Date{
     
     private int _day;
     private int _month;
     private int _year;
     
     
     public Date (int day, int month, int year) throws DateException{
          
    	 StringBuffer message = new StringBuffer();
          
    	 
    	 if(day < 1 || day > 31){
        	  message.append("D�a " + day +" no v�lido" + "Valores entre 1 y 31");
          }else{
               this._day = day;
          }
          
          
          if(month < 1 || month > 12){
        	  message.append("Mes " + month +" no v�lido" + "Valores entre 1 y 12");
          }else{
               this._month = month;
          }
          
          this._year = year;
          
     
     }
     
     
     public int getDay()
     {
		return this._day;
	}
	
	public int getMonth()
	{
		return this._month;
	}
	
	public int getYear()
	{
		return this._year;
	}
	
	public void setDay(int day) throws DateException{
		
		
		if ( day <= 0) {
			throw new DateException ("Un d�a no puede ser un n�mero negativo: " + day);			
		} else {
			if ( !this.isDayRight() ){
				throw new DateException ("No es un d� v�lido para ese mes " + day + "/" + this._month);
			} else {
				this._day = day;
			}
		}
	}
	
	public void setMonth(int month) throws DateException{
		
		
		if ( month <= 0) {
			throw new DateException ("Un mes no puede ser un n�mero negativo: " + month + "\n");			
		} else {
			if ( month > 12 ){
				throw new DateException ("Ese mes: " + month + "no es v�lido, introduce un n�mero del 1 al 12.");
			} else {
				this._month = month;
			}
		}
	}
	
	public void setYear(int year) throws DateException{
		
		
		if ( year < 0) {
			throw new DateException ("Un a�o no puede ser un n�mero negativo: : " + year);			
		} else {
			this._year = year;
		}
	}
     
     // Si son los mismos dias, meses y a�os
     
     
     public boolean isSameDay(Date fecha2){
          
    	//return ( this._day == fecha2.getDay() ) ? true : false;
    	 
    	if ( this._day == fecha2.getDay() ) {
			return true;
		} else {
			return false;
		}
	}
     
	
	public boolean isSameMonth(Date fecha2){
          
        //return ( this._month == fecha2.getMonth() ) ? true : false;
        
        if ( this._month == fecha2.getMonth() ) 
			return true;
		 else 
			return false;
	}
	

	public boolean isSameYear(Date fecha2){
          
        return ( this._year == fecha2.getYear() ) ? true : false;
	}
	

	public boolean isSame (Date fecha2){
          
		return ( this.isSameDay(fecha2) && this.isSameMonth(fecha2) && this.isSameYear(fecha2) ) ? true : false;
	}
	
	
	
	
	// Nombre de los meses
	
	public String getMonthName(int _month) {
	      
	      String nombreMes = null;
	   
	    switch (_month){
	     case 1:
	      nombreMes = "Enero";
	      break;
	     case 2:
	      nombreMes = "Febrero";
	      break;
	     case 3:
	      nombreMes = "Marzo";
	      break;
	     case 4:
	      nombreMes = "Abril";
	      break;
	     case 5:
	      nombreMes = "Mayo";
	      break;
	     case 6:
	      nombreMes = "Junio";
	      break;
	     case 7:
	      nombreMes = "Julio";
	      break;
	     case 8:
	      nombreMes = "Agosto";
	      break;
	     case 9:
	      nombreMes = "Septiembre";
	      break;
	     case 10:
	      nombreMes = "Octubre";
	      break;
	     case 11:
	      nombreMes = "Noviembre";
	      break;
	     case 12:
	      nombreMes = "Diciembre";
	      break;
	    }
	    
	    return nombreMes;
	      
	  }
	
	 public String getMonthName(int _month, String mes) throws DateException{
	      
		   if (_month > 12 || _month < 1) {
		    
		    throw new DateException ("El mes de la "+ mes +" no es v�lido, valores entre 1 y 12");
		   }
		    
		   return getMonthName(_month);
		  }
    
    
    //Nombre de las estaciones
    
    
    public String getSeasonName(int _month, String mes) throws DateException{
    	
    	String estacion = null;
    	
		switch (this._month){
		case 1:
		case 2:
			estacion = ("Invierno.");
			break;
		case 3:
			if(getDay()<21)
			{
				estacion=("Invierno.");
			}
				else
				{
					estacion=("Primavera.");
				}
			break;
		case 4:
		case 5:	
			estacion=("Primevera.");
			break;
		case 6:
			if(getDay()<21)
			{
				estacion=("Primavera.");
			}
				else
				{
					estacion=("Verano.");
				}
			break;
		case 7:
		case 8:
			estacion=("Verano.");
		case 9:
			if(getDay()<21){
				estacion=("Verano.");
			}
			else{
				estacion=("Oto�o.");
			}
			break;
		case 10:
		case 11:	
			estacion=("Oto�o.");
			break;
		case 12:
			if(getDay()<21){
				estacion=("Oto�o.");
			}
				else
				{
					estacion=("Invierno.");		
				}
			break;
		default:
			
			throw new DateException ("El mes de la "+ mes +" no es v�lido, valores entre 1 y 12");
		}
		
		return estacion;
    }
    
    
    
    
    // D�a del mes
       
    public int daysOfMonth(int _month){
		int numday = 0;
		switch (_month){
		case 1: 
		case 3: 
		case 5: 
		case 7: 
		case 8:
		case 10:
		case 12:
			numday = 31;
			break;
		case 4: 
		case 6: 
		case 9: 
		case 11: 
			numday = 30;
			break;
		case 2:
			numday = 28;
			break;
		default:
			numday = -1;
		}
		return numday;
	}
    
    
    
    
    // Comprobaci�n si es correcto el d�a
    
    public boolean isDayRight(){
		return ( ( this._day > 0 ) && (this._day <= this.daysOfMonth(getMonth()) ) );
	}
       
         
    
	// Meses restantes
	
    
    public String getMonthLeft(String mes) throws DateException{
        
        StringBuffer salida = new StringBuffer();
        
         if(_month <= 12 && _month >= 1) {
        	 
        	 salida.append("Los meses restantes de la " + mes + " fecha son: \n");
             
             for(int i = _month + 1; i <= 12; i++){
           
              salida.append(getMonthName(i) + "\n");
             }
         } else {
          
        	 throw new DateException("El mes de la " + mes + " es inv�lido. Valores entre 1 y 12.");
          }  
         
         return salida.toString();
     }

    
    
    // Imprimir la fecha
    
    public String printDate(int day, int month, int year)
	{
		StringBuffer fecha = new StringBuffer();
		fecha.append(_day + "/" + _month + "/" + _year);
		return fecha.toString();
	}

    
    
    
	// D�as que quedan del mes
     
    public String getDaysLeft(String mes) throws DateException{
    	
    	StringBuffer salida = new StringBuffer();
    	
    	if(_month <= 12 && _month >= 1 && _day <= 31 && _day >= 1) {
    		
    	
    	salida.append("Los días totales son: \n");
			for (int i = _day + 1; i <= daysOfMonth(i); i++) {
				
				salida.append((i) + "/" + getMonthName(_month) + "/" + _year + "\n");
				
			}
    	
    	} else {
     
    		throw new DateException("El mes o el día de la " + mes + " es inv�lido. Valores entre meses entre 1 y 12 y valores de los días entre 1 y 31.");
    	}  
		
    	
		return salida.toString();
	}
	
	
	
    
    // Meses con los mismos dias
    
    public String getMonthsSameDays(String mes) throws DateException{
		
		StringBuffer salida = new StringBuffer();
		
		
		if(_month <= 12 && _month >= 1) {
			
			salida.append("Los meses con los mismos días que la " + mes + " son: \n");
			
			for ( int i = 1; i <= 12; i++) {
				
				if ( daysOfMonth(_month) == daysOfMonth(i) ) {
					salida.append(getMonthName(i) + " ");
				}
			}
    		} else {
        
    				throw new DateException("El mes de la " + mes + " es inv�lido. Valores entre 1 y 12.");
    		}  
    		return salida.toString();
	}
	
	
	
	
	// Dias que han pasado desde el comienzo del a�o
	 
	 
	 public String daysPast(String mes) throws DateException{
		 
		StringBuffer salida = new StringBuffer();
		int numdiames;
		int cont = _day;
		int mesactual = _month;
		
		if(_month <= 12 && _month >= 1 && _day <= 31 && _day >= 1) {
			
		salida.append("Los días que han pasado desde el comienzo del año hasta la " + mes + " son: \n");
		
			for ( int i = 1; i < mesactual; i++ ) {
				
				numdiames = daysOfMonth(i);
				
				for ( int j = 1; j <= numdiames; j++ ) {
				
				cont++;
				}
				
			}salida.append(cont - 1);
		
		} else {
 
				throw new DateException("El mes o el día de la " + mes + " es inv�lido. Valores entre meses entre 1 y 12 y valores de los días entre 1 y 31.");
		}  
			
		
			return salida.toString();
	}
	 
	 
	 //Contador fechas aleatorias
	 
	 public String contRandomDate(String mes) throws DateException{
	        
		 StringBuffer salida = new StringBuffer();
		 int cont, rdia, rmonth, rano;
	     cont = 0;
	        
	        if(_month <= 12 && _month >= 1 && _day <= 31 && _day >= 1) {
				
	    		salida.append("Los intentos para la " + mes + " son: \n");
	        	do{
	        		rmonth = (int) (Math.random()*12) + 1;
	        		rdia = (int) (Math.random()*this.daysOfMonth(rmonth) ) + 1;
	        		rano = _year;
	        		cont++;
	        	} while ( !this.isSame(new Date(rdia,rmonth,rano) ) );
		
	        	
	    salida.append(cont);
		
		} else {
 
				throw new DateException("El mes o el día de la " + mes + " es inv�lido. Valores entre meses entre 1 y 12 y valores de los días entre 1 y 31.");
		}  
	        return salida.toString();
    
	 }
	
	 
	 
	 // Devuelve dia de la semana sabiendo el primer dia del año
	 
	 public String nameOfDay(int _day) {
		 
			String nameday = null;
			
			switch (_day) {
			case 0: 
				nameday = "Lunes";
				break;
			case 1: 
				nameday = "Martes";
				break;
			case 2: 
				nameday = "Miércoles";
				break;
			case 3: 
				nameday = "Jueves";
				break;
			case 4: 
				nameday = "Viernes";
				break;
			case 5: 
				nameday = "Sábado";
				break;
			case 6: 
				nameday = "Domingo";
				break;
			default:
				nameday = "ERROR";
			}
			return nameday;
		}
	 
	 	
	 	// Segundo metodo que devuelve el numero de la semana
	 
	 public int nameOfDay(String nombreday) {
		 
			int day = 0;
			
			switch (nombreday) {
			case "Lunes":
				day = 0;
				break;
			case "Martes":
				day = 1;
				break;
			case "Miércoles":
				day = 2;
				break;
			case "Jueves":
				day = 3;
				break;
			case "Viernes":
				day = 4;
				break;
			case "Sábado":
				day = 5;
				break;
			case "Domingo":
				day = 6;
				break;
			default:
				System.err.println("ERROR");
			}
			return day;
		}
	 
	 public String dayOfWeek(String mes, String nombreDay) throws DateException{
		
		 StringBuffer salida = new StringBuffer();
		 
		 int primerodelaño = nameOfDay(nombreDay);
		 int diasemana;
		 int numdiames;
		 int cont = _day;
		 int mesactual = _month;
			
		 if(_month <= 12 && _month >= 1 && _day <= 31 && _day >= 1) {
				
				salida.append("El día de la " + mes + " es: \n");
		 for ( int i = 1; i < mesactual; i++ ) {
				
				numdiames = daysOfMonth(i);
				
				for ( int j = 1; j <= numdiames; j++ ) {
				
				cont++;
				}
				
			}
			diasemana = (( (cont -1) % 7) + primerodelaño ) % 7;
			
			salida.append(nameOfDay(diasemana));
		 } else {
			 
				throw new DateException("El mes o el día de la " + mes + " es inv�lido. Valores entre meses entre 1 y 12 y valores de los días entre 1 y 31.");
		}  
	        return salida.toString();
	 }	
	
}

public class Date{
     
     private int _day;
     private int _month;
     private int _year;
     
     
     public Date (int day, int month, int year){
          this._day = day;
          this._month = month;
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
	
	public void setDay(int newDay)
	{
		this._day=newDay;
	}
	
	public void setMonth(int newMonth)
	{
		this._month=newMonth;
	}
	
	public void setYear(int newYear)
	{
		this._year=newYear;
	}
     
     // Si son los mismos dias, meses y años
     
     
     public boolean isSameDay(Date fecha2){
          
          boolean isSameDay = false;
		if ( this._day == fecha2.getDay() ){
			isSameDay = true;
          }else{
			isSameDay = false;
		}
          return isSameDay;
	}
	
	public boolean isSameMonth(Date fecha2){
          
          boolean isSameMonth = false;
		if ( this._month == fecha2.getMonth() ) {
			isSameMonth = true;
		} else {
			isSameMonth = false;
		}
               return isSameMonth;
	}

	public boolean isSameYear(Date fecha2){
          
          boolean isSameYear = false;
		if( this._year == fecha2.getYear() ){
               isSameYear = true;
		} else {
			isSameYear = false;
		}
               return isSameYear;
	}

	public boolean isSame (Date fecha2){
          
          boolean isSame = false;
          if( this.isSameDay(fecha2) && this.isSameMonth(fecha2) && this.isSameYear(fecha2) ){
               isSame = true;
		} else {
               isSame = false;
          }
               return isSame;
          
	}
	
  /*   
     public String getMonthName(int month)
	{
		String op= new String();
		switch(month)
		{
			case 1:
				op="January";
				break;
			case 2:
				op="February";
				break;
			case 3:
				op="March";
				break;
			case 4:
				op="April";
				break;
			case 5:
				op="May";
				break;
			case 6:
				op="June";
				break;
			case 7:
				op="July";
				break;
			case 8:
				op="August";
				break;
			case 9:
				op="September";
				break;
			case 10:
				op="October";
				break;
			case 11:
				op="November";
				break;
			case 12:
				op="December";
				break;
		}
		return op;
	}
	*/
       
       
          
     }


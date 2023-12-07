package inheritance;

public class food extends zomato {
   String nonveg;
   String curry;
   double cost;
   String type;
   food(){}
   food(String Restaurent, String place,String nonveg)
   {
	  super(Restaurent,place);
	  this.nonveg = nonveg;
	     }
   food(String Restaurent, String place,String nonveg,String curry,double cost)
   {
	   this(Restaurent,place,nonveg);
	   this.curry= curry;
	   this.cost= cost; 
	   }
	food(String Restaurent, String place,String nonveg,String curry,double cost,String type)
	   {
		   this(Restaurent,place,nonveg,curry,cost);
		   this.type= type;
		   
		   } 
		   }
   

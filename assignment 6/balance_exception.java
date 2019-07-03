package assignment_6;

@SuppressWarnings("serial")
class balance_exception extends Exception{
	   public String toString(){ 
		   return ("Insuficient Balance or Invalid Ammount");
	   }
	}
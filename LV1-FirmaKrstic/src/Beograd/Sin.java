package Beograd;

public class Sin extends Autoprevoznik  {


		private int brojSlojevaPoveza;
		public Sin(String ime,int br) {
			super(ime);
			brojSlojevaPoveza=br;
		}
		@Override
		public  double izverziranost() {
			return brojSlojevaPoveza*getGodineIskustva();	
		}
		
		@Override
		 public String toString() {
			return null;    
	   }
	

}

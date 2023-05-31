package Beograd;

public class Otac extends Autoprevoznik  {

	int brojPopijenihCasicaDomaceRakije;
	public Otac(String ime,int br) {
		super(ime);
		brojPopijenihCasicaDomaceRakije=br;
	}
	@Override
	public  double izverziranost() {
		return brojPopijenihCasicaDomaceRakije+getGodineIskustva();	
	}
	
	@Override
	 public String toString() {
		return null;    
   }
}

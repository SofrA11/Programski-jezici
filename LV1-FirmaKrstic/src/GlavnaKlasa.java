import PaketAux.Priprema;
import Beograd.*;
public class GlavnaKlasa {

	public static void main(String[] args)
	{
		
	Priprema pr=new Priprema();
	pr.pripremiBinarniFajl("Firma.bin");
	Krstic preduzece = new Krstic();
	
	Autoprevoznik otac = new Otac("Firma.bin",4);
	Autoprevoznik sin1 = new Sin("Firma.bin",10);
	Autoprevoznik sin2 = new Sin("Firma.bin",8);	
	
	
	preduzece.Dodaj(otac);
	preduzece.Dodaj(sin1);
	preduzece.Dodaj(sin2);

	preduzece.evidencija("Evidencija.txt");
	}
}

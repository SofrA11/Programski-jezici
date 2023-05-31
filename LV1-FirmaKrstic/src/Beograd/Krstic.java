package Beograd;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Krstic {

private ArrayList<Autoprevoznik> lista;

public Krstic()
{
lista=new ArrayList<Autoprevoznik>(); 	
}

public void Dodaj(Autoprevoznik a)
{
	try {
		if(a.getGodineIskustva()<5)
		{
			throw new Pocetnik();			
		}
		lista.add(a);			
	}
	catch(Pocetnik ex)
	{
		System.out.println(ex);
	}
	catch(Exception ex)
	{
		System.out.println("Nepoznati izuzetak: "+ex);
	}

}
public void evidencija(String imeFajla)
{

	lista.sort(null);	
	try {
	FileWriter fw=new FileWriter(imeFajla);
	BufferedWriter bfw = new BufferedWriter(fw);
	
	int n=lista.size();
	int i=0;
	while(i<n)
	{
		int p =(int) lista.get(i).izverziranost();
		//System.out.println(p);
		bfw.write("izverziranost "+(i+1)+". autoprevoznika: "+String.valueOf(p));
		bfw.newLine();

	i++;
	}
	bfw.close();
	fw.close();
	
	}
	catch(IOException ex)
	{
		System.out.println("Greska prilikom IO operacija: "+ex);
	}
}
}

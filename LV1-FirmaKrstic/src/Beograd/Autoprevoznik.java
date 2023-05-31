package Beograd;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;

public abstract class Autoprevoznik implements Comparable<Autoprevoznik>{

	private int godineIskustva;
	private static int broj=0;
	public Autoprevoznik(String ime) {
		
		try {
			FileInputStream fis = new FileInputStream(ime);
			BufferedInputStream bis = new BufferedInputStream(fis);
		    DataInputStream dis = new DataInputStream(bis);
			
		    int n= dis.readInt();//po dogovoru, prvi element je duzina niza
		    int[] niz= new int[n];
		    int pom;
		    for(int i=0;i<n;i++)
		    {
		    	pom=dis.readInt();
		    	niz[i]=pom;
		    }
		    godineIskustva=niz[broj];
		    broj++;
			dis.close();
			bis.close();
			fis.close();		    
			}
		catch(Exception ex)
		{
			System.out.println("Greska: "+ex);
		}
	}
	public abstract double izverziranost();
	
	public int getGodineIskustva()
	{
		return godineIskustva;
	}
	@Override
	public int compareTo(Autoprevoznik o) {
		
		if(izverziranost()>o.izverziranost())
			return 1;
		if(izverziranost()<o.izverziranost())
			return -1;
		return 0;
	}	
	
}

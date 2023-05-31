package PaketAux;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
public class Priprema {

	public Priprema()
	{
	}
public void pripremiBinarniFajl(String ime)
{
	try {
		FileOutputStream fos=new FileOutputStream(ime);
		BufferedOutputStream bos=new BufferedOutputStream(fos);
		DataOutputStream dos = new DataOutputStream(bos);
		dos.writeInt(3);
		dos.writeInt(7);
		dos.writeInt(8);
		dos.writeInt(8);
		dos.close();
		bos.close();
		fos.close();
		
	} catch (FileNotFoundException e) {
		
		System.out.println("Greska: "+e);		
	}
	catch(IOException ex)
	{
		System.out.println("Greska: "+ex);
	}
	
	
}
	
}

package Korisnici;
import java.util.Date;
public class Korisnik {
	String ime;
	String prezime;
	String jmbg;
	Date datum_rodjenja;
	
	public Korisnik(String ime, String prezime, String jmbg, Date datum_r){
		this.ime=ime;
		this.prezime=prezime;
		this.jmbg=jmbg;
		this.datum_rodjenja=datum_r;
	}
	
	public String getIme(){
		return ime;
	}
	
	public void setIme(String ime) throws Exception
	{
		if(ime.length()<=2)
			throw new Exception("Fejl");
		this.ime=ime;		
	}
	

}

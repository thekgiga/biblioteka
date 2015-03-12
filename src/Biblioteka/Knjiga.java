package Biblioteka;

import java.util.LinkedList;

public class Knjiga {
	
	private String naslov;
	private String izdavac;
	
	private long ISBN;
	private int izdanje;
	
	private LinkedList<Autor> autori = new LinkedList<Autor>();
	
	
	public String getNaslov() {
		return naslov;
	}
	public void setNaslov(String naslov) {
		this.naslov = naslov;
	}
	public String getIzdavac() {
		return izdavac;
	}
	public void setIzdavac(String izdavac) {
		this.izdavac = izdavac;
	}
	public long getISBN() {
		return ISBN;
	}
	public void setISBN(long iSBN) {
		ISBN = iSBN;
	}
	public int getIzdanje() {
		return izdanje;
	}
	public void setIzdanje(int izdanje) {
		this.izdanje = izdanje;
	}
	
	@Override
	public String toString() {
		return "Knjiga [naslov=" + naslov + ", izdavac=" + izdavac + ", ISBN="
				+ ISBN + ", izdanje=" + izdanje + ", autori=" + autori + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (ISBN ^ (ISBN >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Knjiga other = (Knjiga) obj;
		if (ISBN != other.ISBN)
			return false;
		return true;
	}
	
	

}

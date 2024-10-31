package no.hvl.dat100.oppgave1;

import no.hvl.dat100.common.TODO;

public abstract class Innlegg 
{
	private int id;
	private String bruker;
	private String dato;
	private int likes;
	
	// TODO - deklarering av objektvariable
	
	public Innlegg() 
	{
		
	}
	
	public Innlegg(int id, String bruker, String dato) 
	{
		this.likes = 0;
		this.id = id;
		this.bruker = bruker;
		this.dato = dato;
	}

	public Innlegg(int id, String bruker, String dato, int likes) 
	{
		this.likes = likes;
		this.id = id;
		this.bruker = bruker;
		this.dato = dato;
	}
	
	public String getBruker() 
	{
		return bruker;
	}

	public void setBruker(String bruker) 
	{
		this.bruker = bruker;
	}

	public String getDato() 
	{
		return dato;
	}

	public void setDato(String dato) 
	{
		this.dato = dato;
	}

	public int getId() 
	{
		return id;
	}
	
	public void setId(int id) 
	{
		this.id = id;
	}

	public int getLikes() 
	{
		return likes;
	}
	
	public void doLike () 
	{
		this.likes += 1;
	}
	
	public boolean erLik(Innlegg innlegg) 
	{
		boolean lik = false;
		
		if(innlegg.getId() == id) 
		{
			lik = true;
		}
		
		return lik;
	}
	
	@Override
	public String toString() 
	{
		String bruker = this.bruker;
		return id + "\n" + bruker + "\n" + dato + "\n" + likes + "\n";
	}
	
	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
		
		throw new UnsupportedOperationException(TODO.method());
				
	}
}

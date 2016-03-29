package Main;

public class PuntoDeInteres {
	
	private Object nombre;
	private Object punto;
	
	public PuntoDeInteres()
	{
		this.nombre = null;
		this.punto = null;
	}
	
	public void setNombre(Object nombre)
	{
		this.nombre = nombre;
	}
	
	public void setPunto(Object punto)
	{
		this.punto = punto;
		if(this.punto == null)
		{this.punto = "Cualquier punto distinto de null";}
	}
	
	public Object getNombre()
	{
		return this.nombre;
	}
	
	public Object getPunto()
	{
		return this.punto;
	}
}

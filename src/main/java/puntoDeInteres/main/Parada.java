package puntoDeInteres.main;
import org.uqbar.geodds.Point;

public class Parada {
private String icono;
private Point coordenada;
private Direccion direccion;
public String getIcono() {
	return icono;
}
public void setIcono(String icono) {
	this.icono = icono;
}
public Point getCoordenada() {
	return coordenada;
}
public void setCoordenada(Point coordenada) {
	this.coordenada = coordenada;
}
public Direccion getDireccion() {
	return direccion;
}
public void setDireccion(Direccion direccion) {
	this.direccion = direccion;
}

}

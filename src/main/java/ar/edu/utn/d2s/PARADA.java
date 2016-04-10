package ar.edu.utn.d2s;
import org.uqbar.geodds.Point;

public class PARADA {
private String icono;
private Point coordenada;
private DIRECCION direccion;
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
public DIRECCION getDireccion() {
	return direccion;
}
public void setDireccion(DIRECCION direccion) {
	this.direccion = direccion;
}

}

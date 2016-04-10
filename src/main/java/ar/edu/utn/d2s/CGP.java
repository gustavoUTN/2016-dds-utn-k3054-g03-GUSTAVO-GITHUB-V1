package ar.edu.utn.d2s;
import java.util.ArrayList;
import org.uqbar.geodds.Point;
import org.uqbar.geodds.Polygon;

public class CGP extends PDI{
private String comuna;
private ArrayList<SERVICIOCGP> servicios;
private ArrayList<Point> zona;//modificar tipo

public String getComuna() {
	return comuna;
}
public void setComuna(String comuna) {
	this.comuna = comuna;
}
public ArrayList<SERVICIOCGP> getServicios() {
	return servicios;
}
public void setServicios(ArrayList<SERVICIOCGP> servicios) {
	this.servicios = servicios;
}
public ArrayList<Point> getZona() {
	return zona;
}
public void setZona(ArrayList<Point> zona) {
	this.zona = zona;
}

public Boolean estaCercaDe(double aX,double aY){
	return (new Polygon(this.getZona())).isInside(new Point(aX,aY));	
}

}

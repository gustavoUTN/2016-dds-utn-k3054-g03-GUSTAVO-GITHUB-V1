package puntoDeInteres.main;
import java.util.ArrayList;
import org.uqbar.geodds.Point;
import org.uqbar.geodds.Polygon;

public class Cgp extends Pdi{
private String comuna;
private ArrayList<ServicioCgp> servicios;
private ArrayList<Point> zona;//modificar tipo

public String getComuna() {
	return comuna;
}
public void setComuna(String comuna) {
	this.comuna = comuna;
}
public ArrayList<ServicioCgp> getServicios() {
	return servicios;
}
public void setServicios(ArrayList<ServicioCgp> servicios) {
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

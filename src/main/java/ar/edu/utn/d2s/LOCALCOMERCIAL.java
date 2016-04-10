package ar.edu.utn.d2s;
import java.util.List;
import org.uqbar.geodds.Point;

public class LOCALCOMERCIAL extends PDI{
private String nombreDeFantasia;
private HORARIO horario;
private RUBRO rubro;
private List<String> palabrasClave;

public Boolean estaCercaDe(double aX,double aY){
	return (this.getRubro().getRadio())>(this.getCoordenada().distance(new Point(aX, aY)));
}

public String getNombreDeFantasia() {
	return nombreDeFantasia;
}
public void setNombreDeFantasia(String nombreDeFantasia) {
	this.nombreDeFantasia = nombreDeFantasia;
}
public HORARIO getHorario() {
	return horario;
}
public void setHorario(HORARIO horario) {
	this.horario = horario;
}
public RUBRO getRubro() {
	return rubro;
}
public void setRubro(RUBRO rubro) {
	this.rubro = rubro;
}
public List<String> getPalabrasClave() {
	return palabrasClave;
}
public void setPalabrasClave(List<String> palabrasClave) {
	this.palabrasClave = palabrasClave;
}
}

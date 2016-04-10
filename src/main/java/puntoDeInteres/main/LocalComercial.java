package puntoDeInteres.main;
import java.util.List;
import org.uqbar.geodds.Point;

public class LocalComercial extends Pdi{
private String nombreDeFantasia;
private Horario horario;
private Rubro rubro;
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
public Horario getHorario() {
	return horario;
}
public void setHorario(Horario horario) {
	this.horario = horario;
}
public Rubro getRubro() {
	return rubro;
}
public void setRubro(Rubro rubro) {
	this.rubro = rubro;
}
public List<String> getPalabrasClave() {
	return palabrasClave;
}
public void setPalabrasClave(List<String> palabrasClave) {
	this.palabrasClave = palabrasClave;
}
}

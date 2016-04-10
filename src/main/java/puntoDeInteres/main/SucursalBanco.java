package puntoDeInteres.main;
import java.util.List;

public class SucursalBanco extends Pdi{
private List<String> servicios;
private Horario horario;
public List<String> getServicios() {
	return servicios;
}
public void setServicios(List<String> servicios) {
	this.servicios = servicios;
}
public Horario getHorario() {
	return horario;
}
public void setHorario(Horario horario) {
	this.horario = horario;
}
}

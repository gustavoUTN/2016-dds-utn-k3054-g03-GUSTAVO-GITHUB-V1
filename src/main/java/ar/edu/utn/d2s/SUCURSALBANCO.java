package ar.edu.utn.d2s;
import java.util.List;

public class SUCURSALBANCO extends PDI{
private List<String> servicios;
private HORARIO horario;
public List<String> getServicios() {
	return servicios;
}
public void setServicios(List<String> servicios) {
	this.servicios = servicios;
}
public HORARIO getHorario() {
	return horario;
}
public void setHorario(HORARIO horario) {
	this.horario = horario;
}
}

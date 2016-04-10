package puntoDeInteres.main;
import org.uqbar.geodds.Point;

public class Pdi extends Parada{
private DatosEspecificos datosEspecificos;

public Boolean estaCercaDe(double aX,double aY){
	return ((this.getCoordenada().distance(new Point(aX, aY)))<0.5);
}

public DatosEspecificos getDatosEspecificos() {
	return datosEspecificos;
}

public void setDatosEspecificos(DatosEspecificos datosEspecificos) {
	this.datosEspecificos = datosEspecificos;
}
	
}

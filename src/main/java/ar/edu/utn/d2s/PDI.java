package ar.edu.utn.d2s;
import org.uqbar.geodds.Point;

public class PDI extends PARADA{
private DATOSESPECIFICOS datosEspecificos;

public Boolean estaCercaDe(double aX,double aY){
	return ((this.getCoordenada().distance(new Point(aX, aY)))<0.5);
}

public DATOSESPECIFICOS getDatosEspecificos() {
	return datosEspecificos;
}

public void setDatosEspecificos(DATOSESPECIFICOS datosEspecificos) {
	this.datosEspecificos = datosEspecificos;
}
	
}

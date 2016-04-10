package puntoDeInteres.main;

//import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

import org.uqbar.geodds.Point;

public class Colectivo {
private int linea;
private ArrayList<Parada> paradas;

public Boolean estaCercaDe(double aX,double aY){
	Point unPunto = new Point(aX, aY);
	Iterator<Parada> iterador = this.getParadas().iterator();
	while(iterador.hasNext())
		{
	    if(iterador.next().getCoordenada().distance(unPunto)<0.1)//distancia se mide en KM
	    	{
	    	return true;
	    	}
		}
	return false;
}

public int getLinea() {
	return linea;
}
public void setLinea(int linea) {
	this.linea = linea;
}
public ArrayList<Parada> getParadas() {
	return paradas;
}
public void setParadas(ArrayList<Parada> paradas) {
	this.paradas = paradas;
}

}

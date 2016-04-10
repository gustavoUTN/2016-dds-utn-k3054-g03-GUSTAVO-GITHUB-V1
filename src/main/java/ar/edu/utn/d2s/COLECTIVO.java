package ar.edu.utn.d2s;

//import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

import org.uqbar.geodds.Point;

public class COLECTIVO {
private int linea;
private ArrayList<PARADA> paradas;

public Boolean estaCercaDe(double aX,double aY){
	Point unPunto = new Point(aX, aY);
	Iterator<PARADA> iterador = this.getParadas().iterator();
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
public ArrayList<PARADA> getParadas() {
	return paradas;
}
public void setParadas(ArrayList<PARADA> paradas) {
	this.paradas = paradas;
}

}

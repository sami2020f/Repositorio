package Models;
/**
 * Clase que implementa todos los metodos 
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class DobleLikedList<T> {
	private List<T> elementos;
	private int index;

	public DobleLikedList() {
		super();
		elementos = new ArrayList<T>();
		 index=-1;
	}
	public List<T> getElementos() {
		return elementos;
	}
	public void setElementos(List<T> elementos) {
		this.elementos = elementos;
	}
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}
	/**
	 * 
	 * @param e1 Elemento que introducimos a la cola excepciones que implementamos
	 * @throws NullPointerException
	 */
	public void add(T e1) throws  NullPointerException {
		if (e1 != null) {
			
				elementos.add(e1);
				index ++;
			
		} else {
			throw new NullPointerException("We don´t accept null values,sorry");
		}
	}
	/**
	 * devuleve el elemento anterior
	 * @return
	 */
	public T getPrev(){
		index--;
		if (index==0) {
			return elementos.get(elementos.size());
		}else {
			
			return elementos.get(index-1);
		}
	}
	/**
	 * devuelve el siguiente elemento 
	 * @return
	 */
	public T getNext(){// no esta terminado del todo
		index++;
		if (index==elementos.size()) {
			
			return elementos.get(0);
		}else
			return elementos.get(index+1);
	}
	public T getCurrent() {
		
		return elementos.get(index);
	}
	/**
	 * Elimina todo el array
	 */
	public void remove() {
		elementos.clear();
	}

	public int setIndex2(int i){
		if (i<elementos.size()) {
			index=i;
			return 1;
			
		}
		else {
			return -1;
		}
	}

}

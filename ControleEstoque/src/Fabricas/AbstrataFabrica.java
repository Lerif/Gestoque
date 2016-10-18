package Fabricas;

public abstract class AbstrataFabrica <E>{
	
	public static <E> E nova(E e) {
	    return (E)e;
	}
}

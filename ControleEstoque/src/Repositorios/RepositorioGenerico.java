package Repositorios;

import java.util.ArrayList;
import java.util.List;

public interface RepositorioGenerico<T> {
	ArrayList<T> select(T t);
	void insert(T t);
//	ArrayList<T> delete();
	List<T> findAll();
//	T find(T obj);
}

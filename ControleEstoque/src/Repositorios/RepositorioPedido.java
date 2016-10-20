package Repositorios;


import java.util.ArrayList;

import Entidades.Pedido;


public class RepositorioPedido implements RepositorioGenerico<Pedido>{
	
	public static ArrayList<Pedido> Pedido = new ArrayList<Pedido>();
	


    public ArrayList<Pedido>select(Pedido pedido){
    	ArrayList<Pedido> retornoSelect = new ArrayList<Pedido>();
    	for(Pedido pedidoList : Pedido){
    		if(Pedido.contains(pedido.hashCode())){
    			retornoSelect.add(pedidoList);
    		}else{
    			retornoSelect = null;
    		}
    		
    	}
    	return retornoSelect;
    }
     public void insert(Pedido pedido){
    	 Pedido.add(pedido);
     }
     public ArrayList<Pedido> findAll(){
    	 return Pedido;
    }
  }


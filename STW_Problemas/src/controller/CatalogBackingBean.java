package controller;

import java.util.ArrayList;
import java.util.List;


import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.sun.org.apache.xml.internal.resolver.Catalog;

@ManagedBean
@SessionScoped
public class CatalogBackingBean {
	
	@EJB
	Catalog catalog;
	
	List<E> <Item> carrito = new ArrayList<>();
	
	public Catalog getCatalog() {
		return catalog;
	}

	public void setCatalog(Catalog catalog) {
		this.catalog = catalog;
	}
	
	public String buy(Item i) {carrito.add(i);return "";}

	

}

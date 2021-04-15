package ro.ase.cts.composite;

import java.util.ArrayList;

public class ProductCatalog extends CatalogComponent {

	private ArrayList<CatalogComponent> list;
	private String name;
	public ProductCatalog(String name) {
		super();
		list=new ArrayList<CatalogComponent>(); 
		this.name = name;
	}

	@Override
	public void add(CatalogComponent catalog) {
		// TODO Auto-generated method stub
		this.list.add(catalog);
	}


	@Override
	public void remove(CatalogComponent catalog) {
		// TODO Auto-generated method stub
		for (int i=0; i<list.size();i++) {
			if(list.get(i).getName().equals(catalog.getName()))
					list.remove(i);
		}
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Can't get price");
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		StringBuilder builder= new StringBuilder();
		builder.append(this.name).append(":\n");
		for(CatalogComponent comp: this.list)
			builder.append(comp.toString());
		return builder.toString();
	}

}

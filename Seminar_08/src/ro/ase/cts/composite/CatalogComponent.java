package ro.ase.cts.composite;

public abstract class CatalogComponent {
public abstract void add(CatalogComponent catalog);
public abstract void remove(CatalogComponent catalog);
public abstract String getName();
public abstract double getPrice();
}

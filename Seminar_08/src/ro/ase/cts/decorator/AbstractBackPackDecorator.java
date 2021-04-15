package ro.ase.cts.decorator;

public abstract class AbstractBackPackDecorator extends AbstractBackPack {
protected AbstractBackPack basicBackPack;

public AbstractBackPackDecorator(AbstractBackPack basicBackPack) {
	super();
	this.basicBackPack = basicBackPack;
}

}

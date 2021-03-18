package ro.ase.cts.refactory;

public enum TipProdus {
NOU(0),
DISCOUNT(0.1f), 
STOC_LIMITAT(0.25f),
SFARSIT_DE_SEZON(0.35f),
CATEGORIE_NOUA(0.45f);

public float discount;

TipProdus(float dis) {

	this.discount=dis;
	
}

public float getDiscount() {
	return discount;
}

public void setDiscount(float discount) {
	this.discount = discount;
}

}
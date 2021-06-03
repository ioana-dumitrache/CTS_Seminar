package ro.ase.cts.seminar14;

public enum TipBursaEnum {
MERIT(500),
EXCELENTA(700);
int cuantum;
private TipBursaEnum(int cuantum) {
	// TODO Auto-generated constructor stub
	this.cuantum=cuantum;
}
public int getCuantum() {
	return cuantum;
}

}

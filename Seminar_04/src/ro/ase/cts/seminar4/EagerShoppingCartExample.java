package ro.ase.cts.seminar4;

import java.io.Serializable;
import java.util.ArrayList;

public class EagerShoppingCartExample implements Serializable{
public static final EagerShoppingCartExample INSTANCE;

static
	{
	INSTANCE=new EagerShoppingCartExample();
	}
private EagerShoppingCartExample() {}
}

package ro.ase.cts.seminar06.builder;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;

public abstract class TechProductFactory extends AbstractProductFactory{
	@Override
	public Product makeProduct() throws UnsupportedOperationException {
		return new TechProduct("generic");
	}

	@Override
	public String getCatalog() {		
		ArrayList<String>records=readRecordsFromFile("tech_product.csv");
		StringBuilder builder=new StringBuilder();
		for(String record:records)
		{
				String[]productAtributes=record.split(",");
				builder.append(productAtributes[0]+ " . ");
				builder.append(productAtributes[1]+" . ").append(productAtributes[2]+" . ").append(productAtributes[3]+" \n ");
		}
		return builder.toString();
	}
	private ArrayList<String> readRecordsFromFile(String fileName)
	{
		ArrayList<String> records=new ArrayList<>();
		URL fileURL = getClass().getResource(fileName);
		File productsFile=new File(fileURL.getPath());
		try {
			BufferedReader reader=new BufferedReader(new FileReader(productsFile));
			String line;
			while((line=reader.readLine())!=null)
			{
				records.add(line);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return records;
	}
}

package ro.ase.cts.seminar09;

import ro.ase.cts.proxy.YoutubeLibrary;
import ro.ase.cts.proxy.YoutubeLibraryInterface;
import ro.ase.cts.proxy.YoutubeLibraryProxy;
import ro.ase.cts.seminar09.flyweight.Model3DFactory;
import ro.ase.cts.seminar09.flyweight.Model3DFlyweight;
import ro.ase.cts.seminar09.flyweight.ModelFlyweightInterface;
import ro.ase.cts.seminar09.flyweight.ModelType;
import ro.ase.cts.seminar09.flyweight.ScreenData;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		YoutubeLibraryInterface youtubeLibrary = new YoutubeLibrary();
		System.out.println(youtubeLibrary.listVideos());
		System.out.println(youtubeLibrary.getVideoInfo(1));

		YoutubeLibraryInterface youtubeLibraryProxy = new YoutubeLibraryProxy();
		System.out.println(youtubeLibraryProxy.listVideos());
		System.out.println(youtubeLibraryProxy.getVideoInfo(1));
		
		ScreenData dataSoldier1=new ScreenData("red", 99, 30, 101);
		ScreenData dataTree1=new ScreenData("geen", 90, 10, 77);
		ModelFlyweightInterface soldier1=Model3DFactory.getModel(ModelType.SOLDIER);
		soldier1.display(dataSoldier1);
		soldier1.display(dataTree1);
		
	}

}
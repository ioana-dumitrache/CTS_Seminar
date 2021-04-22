package ro.ase.cts.proxy;

public class YoutubeLibraryProxy implements YoutubeLibraryInterface{
private YoutubeLibraryInterface libImplementation;
public YoutubeLibraryProxy() {
	// TODO Auto-generated constructor stub
	libImplementation=new YoutubeLibrary();
}
	@Override
	public String listVideos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getVideoInfo(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}

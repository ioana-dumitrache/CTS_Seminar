package ro.ase.cts.proxy;

import java.util.HashMap;

public class YoutubeLibraryProxy implements YoutubeLibraryInterface{
private YoutubeLibraryInterface libImplementation;
private String videoListCached;
private HashMap<Integer,String> videoDescriptionCached;
private boolean hasExpired;

public YoutubeLibraryProxy() {
	libImplementation=new YoutubeLibrary();
	hasExpired=false;
	videoDescriptionCached=new HashMap<>();
}
	@Override
	public String listVideos() {
		// TODO Auto-generated method stub
		if(videoDescriptionCached==null || hasExpired)
			{
			videoListCached=libImplementation.listVideos();
			}
			
		return videoListCached;
	}

	@Override
	public String getVideoInfo(int id) {
		// TODO Auto-generated method stub
		if(videoDescriptionCached.get(id)==null || hasExpired)	{
			videoDescriptionCached.put(id, libImplementation.getVideoInfo(id));
		}
		return videoDescriptionCached.get(id);
	}

}

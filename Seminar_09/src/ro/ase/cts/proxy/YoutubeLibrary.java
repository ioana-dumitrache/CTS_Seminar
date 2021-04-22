package ro.ase.cts.proxy;

import java.util.ArrayList;

public class YoutubeLibrary implements YoutubeLibraryInterface{
private VideoDatabase database;
public YoutubeLibrary() {
	// TODO Auto-generated constructor stub
	this.database=new VideoDatabase();
}
	@Override
	public String listVideos() {
		// TODO Auto-generated method stub
		System.out.println("Fetching videos from database...");
		ArrayList<YoutubeVideo> videoList=database.getVideoCollection();
		StringBuilder videoListBuilder=new StringBuilder();
		for(YoutubeVideo video: videoList)
		{
			videoListBuilder.append(video.getId())
							.append(" - ")
							.append(video.getTitle())
							.append("\n");
		}
		return videoListBuilder.toString();
	}

	@Override
	public String getVideoInfo(int id) {
		// TODO Auto-generated method stub
	System.out.println(" ");
	return database.getVideoInfo(id);
	}

}

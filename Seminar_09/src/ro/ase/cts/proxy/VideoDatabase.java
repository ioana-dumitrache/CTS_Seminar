package ro.ase.cts.proxy;

import java.util.ArrayList;

public class VideoDatabase {
private ArrayList<YoutubeVideo> videoCollection;
public VideoDatabase()
{
	videoCollection=new ArrayList<>();
	videoCollection.add(new YoutubeVideo(1, "Ai intrat in viata mea ca intr-un cazinou", 4));
	videoCollection.add(new YoutubeVideo(2, "Te pup pa pa", 3));
	
}
public ArrayList<YoutubeVideo> getVideoCollection() {
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return videoCollection;
}
public String getVideoInfo(int id)
{
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	for(YoutubeVideo video: videoCollection)
	{
		if(id == video.getId())
		{
			StringBuilder videoDescriptionBuilder=new StringBuilder();
			videoDescriptionBuilder.append(video.getTitle())
									.append(" - ")
									.append(video.getDuration())
									.append(" minutes to watch.\n");
			return videoDescriptionBuilder.toString();
		}
	}
	
	return "Invalid id!";
	
}

}

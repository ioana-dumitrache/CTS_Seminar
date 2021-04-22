package ro.ase.cts.seminar09;

import ro.ase.cts.proxy.YoutubeLibrary;
import ro.ase.cts.proxy.YoutubeLibraryInterface;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		YoutubeLibraryInterface youtubeLibrary = new YoutubeLibrary();
		System.out.println(youtubeLibrary.listVideos());
		System.out.println(youtubeLibrary.getVideoInfo(1));

	}

}
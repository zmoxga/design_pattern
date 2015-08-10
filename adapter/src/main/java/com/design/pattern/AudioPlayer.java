package com.design.pattern;

/**
 * Created by jason on 15/4/27.
 */
public class AudioPlayer implements MediaPlayer {
	MediaPlayer mediaPlayer;

	public void play(String audioType, String fileName) {
		if (audioType.equalsIgnoreCase("mp3")) {
			System.out.println("Playing mp3 file. Name: " + fileName);
		} else if (audioType.equalsIgnoreCase("mp4") || audioType.equalsIgnoreCase("vlc")) {
			MediaAdapter mediaAdapter = new MediaAdapter(audioType);
			mediaAdapter.play(audioType, fileName);
		} else {
			System.out.println("Invalid media. "+
					audioType + " format not supported");
		}
	}
}
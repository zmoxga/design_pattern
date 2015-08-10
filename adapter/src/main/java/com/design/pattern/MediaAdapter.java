package com.design.pattern;

/**
 * Created by jason on 15/4/27.
 */
public class MediaAdapter implements MediaPlayer {

	private AdvancedMediaPlayer advancedMediaPlayer;

	public MediaAdapter(String audioType){
		if(audioType.equalsIgnoreCase("vlc")){
			this.advancedMediaPlayer=new VlcPlayer();
		}else if(audioType.equalsIgnoreCase("mp4")){
			advancedMediaPlayer=new Mp4Player();
		}
	}
	@Override
	public void play(String audioType, String fileName) {
		if(audioType.equalsIgnoreCase("vlc")){
			this.advancedMediaPlayer.playVlc(fileName);
		}else if(audioType.equalsIgnoreCase("mp4")){
			this.advancedMediaPlayer.playMp4(fileName);
		}
	}
}

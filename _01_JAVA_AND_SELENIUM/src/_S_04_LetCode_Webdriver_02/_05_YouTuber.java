package _S_04_LetCode_Webdriver_02;

public class _05_YouTuber {
	
	// accessModifier returnType methodName(parameter) {
	//	 	}
	
	public static void main(String[] args) {
		_05_YouTuber yt = new _05_YouTuber();
		yt.deleteVideo("iabsicbas125");
		yt.deleteVideo(124);
		yt.shareVideo()
		.toLowerCase()
		.trim();
		
		System.out.println("asdsa");
		
	}
	private void deleteVideo(String videoId) {
		System.out.println("Deleted video -" + videoId);
	}
	private void deleteVideo(int a) {
		System.out.println("Deleted video -" + a);
	}
	
	public void createVideo() {
//		System.out.println(videoId);
		System.out.println("Video created");
	}
	
	private boolean uploadVideo(){
		System.out.println();
		return true;
	}
	
	public String shareVideo() {
		return "facebook";
	}

}

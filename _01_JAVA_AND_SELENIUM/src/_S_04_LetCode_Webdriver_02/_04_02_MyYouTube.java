package _S_04_LetCode_Webdriver_02;

public class _04_02_MyYouTube {
	public static void main(String[] args) {
		
		_04_03_YouTuber yt = new _04_03_YouTuber();
		String shared =  yt.shareVideo();
		System.out.println(shared);
		yt.createVideo();
		
		
		
	}

}

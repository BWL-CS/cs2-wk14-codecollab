public class TikTokVideo {

	// *** 1. INSTANCE VARIABLES ***
	private String title;
	private double duration;
	private int views;
	private static int totalVideos = 0;

	// *** 2. CONSTRUCTORS ***
	public TikTokVideo(String title, double duration) {
		this.title = title;
		this.duration = duration;
		this.views = 0;
		totalVideos++;
	}

  	// *** 3. METHODS ***

	// Getter Methods

	public String toString() {
		return "TikTokVideo[title=" + title + ", duration=" + duration + ", views=" + views + "]";
	}

	public String getTitle() {
		return title;
	}

	public int getViews() {
		return views;
	}

	public double getDuration() {
		return duration;
	}

	// Setter Methods

	public void setTitle(String title) {
		this.title = title;
	}

	public void setViews(int views) {
		if (views >= 0) {
			this.views = views;
		}
	}

	public void setDuration(double duration) {
		if (duration > 0) {
			this.duration = duration;
		}
	}

	// Behavior Methods

	public static int getTotalVideos() {
		return totalVideos;
	}
  
	public void incrementViews() {
		this.views++;
	}

	public boolean isTrending() {
		return (this.views > 1000);
	}
}

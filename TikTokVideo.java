public class TikTokVideo {

	// *** INSTANCE VARIABLES ***
	private String title;
	private double duration;
	private int views;
	private static int totalVideos = 0;

	// *** CONSTRUCTOR ***
	public TikTokVideo(String title, double duration) {
		this.title = title;
		this.duration = duration;
		this.views = 0;
		totalVideos++;
	}

  // *** METHODS ***

	// Getters

	public String getTitle() {
		return title;
	}

	public int getViews() {
		return views;
	}

	public double getDuration() {
		return duration;
	}

	// Setters

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

	// Other behaviors
  
  public String toString() {
		return "TikTokVideo[title=" + title + ", duration=" + duration + ", views=" + views + "]";
	}

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

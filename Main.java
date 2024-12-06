public class Main {

   public static void main(String []args) {

      // HINT: Look at TikTokVideo.java & connect the code below to the class!
      TikTokVideo video1 = new TikTokVideo("Fortnite Dance Challenge", 10.0);
		TikTokVideo video2 = new TikTokVideo("Gigi Hadid Vodka Sauce Pasta Recipe", 45.5);
      
		System.out.println("🎥 Here are all your videos: ");
		System.out.println(video1); // HINT: calling toString method
		System.out.println(video2);

		System.out.println("Title of video1: " + video1.getTitle());
		System.out.println("Duration of video2: " + video2.getDuration());

		video1.setViews(500);
		video2.setViews(2000);

		video1.incrementViews();
		video2.incrementViews();

		System.out.println("Is video1 trending? " + video1.isTrending());
		System.out.println("Is video2 trending? " + video2.isTrending());
		System.out.println("Total number of videos created: " + TikTokVideo.getTotalVideos());
   }
}

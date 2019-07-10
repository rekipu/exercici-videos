import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class User {
	private String name;
	private String surname;
	private String password;
	private Date registerDate;
	private List<Video> videos = new ArrayList<Video>();

	public User(String name, String surname, String password, Date registerDate) {
		this.name = name;
		this.password = password;
		this.surname = surname;
		this.registerDate = registerDate;
	}

	public void createVideo(String title, String url, List<String> tags) {
		Video video1 = new Video(title, url, tags);
		this.videos.add(video1);
	}

	public void videoList() {
		System.out.println("Aquests son els videos que has creat fins ara: ");
		for (int i = 0; i < (this.videos.size()); i++) {
			System.out.println(this.videos.get(i));
		}

	}

}

import java.util.ArrayList;
import java.util.List;

public class Video {
	private String title;
	private String url;
	private List<String> tags = new ArrayList<>();
	
	public Video(String title, String url, List<String> tags) {
		this.title = title;
		this.url = url;
		this.tags = tags;
	}	
	
	
}

import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class main {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		Video video1 = entraVideo();
		User user1 = entraUser();
		System.out.println(video1);
		System.out.println(user1);
		

	}

	public static String notNull(String y) {
		System.out.println(y);
		String x = scanner.nextLine();
		if (x.equals("") || x.equals(null)) {
			System.out.println("no pots deixar el camp buit");
			throw new NullPointerException();

		} else {
			return x;
		}
	}

	public static Video entraVideo() {
		String titol = notNull("introdueix el titol del video: ");
		String url = notNull("introdueix la URL del video: ");
		String tag = notNull("introdueix els tags del video, separats per comes: ");
		List<String> tagList = Arrays.asList(tag.split("\\s*,\\s*"));
		Video video1 = new Video(titol, url, tagList);
		return video1;
	}
	
	public static User entraUser() {
		String name = notNull("Introdueix el teu nom: ");
		String surname = notNull("Introdueix el teu cognomç: ");
		String password = notNull("Introdueix el teu password: ");
		Date today = Calendar.getInstance().getTime();
		User user1 = new User(name, surname, password,today );
		return user1;
	}

}

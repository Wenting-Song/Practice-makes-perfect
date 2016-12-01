import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*you have an mp3 player with two buttons, up and down
and you have a list of songs
what's the minimum amount of button presses do you need to go?*/
public class mp3Player {
	public static int clicksToSong(String[] songs, int startIndex, String destinationSong) {
		// for(int i =0; i<songs.length;i++){
		ArrayList<Integer> indexList = new ArrayList<Integer>();
		// int index = Arrays.asList(songs).indexOf(destinationSong);
		for (int i = 0; i < songs.length; i++) {
			if (Arrays.asList(songs).get(i).equals(destinationSong))
				indexList.add(Math.abs(startIndex - i));
			indexList.add(songs.length - Math.abs(startIndex - i));
		}

		int ret = Collections.min(indexList);
		// int click = Math.abs(startIndex - index);
		// int ret = Math.min(click, songs.length - click);
		return ret;

	}

	public static void main(String[] args) {
		String songs[] = { "Baby one more time", "Oops,I did it again", "Toxic", "Overprotected", "Work Bitch", "Faded",
				"Chantaje", "Oops,I did it again", "Toxic" };
		int startIndex = 6;
		String destinationSong = "Oops,I did it again";
		int click = clicksToSong(songs, startIndex, destinationSong);
		System.out.println(click);

	}
}

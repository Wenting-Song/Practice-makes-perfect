// same strategy with different implementation
	public static int clicksToSong(String[] songs, int startIndex, String destinationSong) {
		  int minClicks = songs.length;
		  for (int i = 0; i < songs.length; i++) {
		    if (songs[i].equals(destinationSong)) {
		  	  int distance = Math.abs(i - startIndex);
		  	  int minToHere = Math.min(distance, songs.length - distance);
		  	  minClicks = Math.min(minClicks, minToHere);
		    }
		  }
		  return minClicks;
		}

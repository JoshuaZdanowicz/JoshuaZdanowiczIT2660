public class Playlist {
	
	private Song [] music;
	
	public Playlist(Song firstSong) {
        this.music = new Song[1];
        this.music[0] = firstSong;

	}
	
	 public void print() {
	        for (Song song: this.music) {
	            System.out.println(song.getName());
	        }
	    }

	    public void insert(Song song, int position) {

	        // Adding a book to an empty Bookshelf.
	        if (this.music.length == 0 && position == 0) {
	            this.music = new Song [1];
	            this.music[0] = song;
	            return;
	        }

	        // Must insert book in a valid array position.
	        if (position < 0 || position > this.music.length) {
	            return;
	        }

	        Song[] newPlaylist = new Song [this.music.length + 1];

	        for (int i=0; i<this.music.length+1; i++) {
	            if (i < position) {
	                newPlaylist[i] = this.music[i];
	            }
	            else if (i > position) {
	            	newPlaylist[i] = this.music[i-1];
	            }
	            else {
	            	newPlaylist[i] = song;
	            }
	        }

	    	        this.music = newPlaylist;

}}
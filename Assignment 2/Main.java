public class Main {
	
	public static void main(String[] args) {
		{
		
		 System.out.println();
	        System.out.println("In Order:");
	        Playlist music1 = new Playlist(new Song("Song One"));
	        music1.insert(new Song("Song Two"), 1);
	        music1.insert(new Song("Song Three"), 2);
	        music1.insert(new Song("Song Four"), 3);
	        music1.insert(new Song("Song Five"), 4);
	        music1.print();

	        System.out.println();
	        System.out.println("Reverse Order:");
	        Playlist music2 = new Playlist(new Song("Song One"));
	        music2.insert(new Song("Song Two"), 0);
	        music2.insert(new Song("Song Three"), 0);
	        music2.insert(new Song("Song Four"), 0);
	        music2.insert(new Song("Song Five"), 0);
	        music2.print();

	        System.out.println();
	        System.out.println("Mixed Order:");
	        Playlist music3 = new Playlist(new Song("Song One"));
	        music3.insert(new Song("Song Two"), 1);
	        music3.insert(new Song("Song Three"), 2);
	        music3.insert(new Song("Song Four"), 1);
	        music3.insert(new Song("Song Five"), 2);
	        music3.print();
	    }
	}
}
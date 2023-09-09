package GenderMag2;
import java.util.LinkedList;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class SongMain 
{
	public static void main (String[] args)
	{
		//Test generic method displayAllSongs()
		Song s1 = new Song ("1183928","Replay","Iyaz","Replay","2009"); 
		Song s2 = new Song("2994239","I Gotta Feeling","Black Eyed Peas","The E.N.D.","2009"); 
		Song s3 = new Song("3239499","Whatcha Say","Jason Derulo","Whatcha Say","2009");
		
		//First 3 instances of songs
		System.out.println("3 Instances of Songs: ");
		System.out.println("--------------------- ");
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s3.toString());
		System.out.println();
		
		//Create a path to access songs for testing
		File songPath = new File ("C:\\Users\\abiji\\Downloads\\Song.txt");
		
		//Array readSong() method test
		System.out.println("Array using readSong() method: ");
		System.out.println("------------------------------ ");
		Song[] readSongMethod = Song.readSongsArray(songPath);
		for(int i = 0; i < readSongMethod.length; i++) 
		{
			System.out.println(); 
			System.out.println(readSongMethod[i].getID());
			System.out.println(readSongMethod[i].getName());
			System.out.println(readSongMethod[i].getArtist());
			System.out.println(readSongMethod[i].getAlbum());
			System.out.println(readSongMethod[i].getYear());
		}
		System.out.println();
		
		//LinkedList readSong() method test
		System.out.println("Linked List readSong() method: ");
		System.out.println("------------------------------ ");
		LinkedList<Song> readSongList = Song.readSongsLinkedList(songPath);
		Song.displayAllSongs(readSongList);
		System.out.println();
		
		//Search songs by name 
		System.out.println("Search song by name: ");
		System.out.println("-------------------- "); 
		
		//Creating a list of songs using ArrayList (all 25 songs from txt file)
		List<Song> songList = new ArrayList<>();
		songList.add(new Song("1183928","Replay","Iyaz","Replay","2009"));
		songList.add(new Song("2994239","I Gotta Feeling","Black Eyed Peas","The E.N.D.","2009"));
		songList.add(new Song("2342342","Dynamite","Taio Cruz","BE","2009"));
		songList.add(new Song("4534934","Hot N Cold","Katy Perry","One of the Boys","2008"));
		songList.add(new Song("6034534","I Want It That Way","Backstreet Boys","Millenium","1999"));
		songList.add(new Song("8239423","Umbrella","Rihanna","Good Girl Gone Bad","2007"));
		songList.add(new Song("3454398","I Wanna Love You","Akon","Konvicted","2006"));
		songList.add(new Song("2345498","Worst of You","Maisie Peters","100 Greatest Breakfast Songs","2019"));
		songList.add(new Song("3453450","Attention","Charlie Puth","Attention","2017"));
		songList.add(new Song("2345029","All of Me","John Legend","Love in the Future","2013"));
		songList.add(new Song("9283201","On the Floor","Jennifer Lopez","Love?","2011"));
		songList.add(new Song("2390132","Supercut","Lorde","Melodrama","2017"));
		songList.add(new Song("5696990","Paris","The Chainsmokers","Memories...Do Not Open","2017"));
		songList.add(new Song("7983495","Love The Way You Lie","Eminem","Recovery","2010"));
		songList.add(new Song("5456931","Just A Dream","Nelly","5.0","2010"));
		songList.add(new Song("9889342","Waka Waka","Shakira","Sale el Sol","2010"));
		songList.add(new Song("8093042","Super Bass","Nicki Manaj","Pink Friday","2010"));
		songList.add(new Song("6723843","Airplanes","B.o.B","B.o.B Presents: The Adventures of Bobby Ray","2010"));
		songList.add(new Song("1034053","Just the Way You Are","Bruno Mars","Doo-Wops & Hooligans","2010"));
		songList.add(new Song("3450932","Moves Like Jagger","Maroon 5","Hands All Over","2010"));
		songList.add(new Song("8345305","A Thousand Miles","Vanessa Carlton","Be Not Nobody","2002"));
		songList.add(new Song("5732902","Blank Space","Taylor Swift","1989","2014"));
		songList.add(new Song("3984590","Cameras","Wiz Khalifa","Rolling Papers","2011"));
		songList.add(new Song("4123903","Treat You Better","Shawn Mendes","Illuminate","2016"));
		songList.add(new Song("2309482","Starboy","The Weeknd","Starboy","2016")); 
		
		//searchSongs() by name
		try 
		{
			Scanner songByNameScanner = new Scanner(songPath);
			System.out.print("Please enter a song name to search: ");
			
			Scanner userInput = new Scanner(System.in);
			String SongName = userInput.nextLine();

			while (songByNameScanner.hasNextLine()) 
			{
				String song = songByNameScanner.nextLine();
				String[] index = song.split(",");
				String id = index[0];
				String name = index[1];
				String artist = index[2];
				String albumName = index[3];
				String year = index[4];

				if (name.equalsIgnoreCase(SongName)) 
				{
					System.out.println("Name: " + name);
					System.out.println("Artist: " + artist);
					System.out.println("Album: " + albumName);
					System.out.println("Year: " + year);
					System.out.println();
				}
			}
		}
		
		catch (IOException e) 
		{
			System.out.println("An error occured");
		}
		
		//searchSongs() by year and name
		Scanner songByYearandNameScanner = new Scanner(System.in);
		System.out.print("Please enter a year or song name: ");
		String userInput = songByYearandNameScanner.nextLine();

		try 
		{
			Scanner songScanner = new Scanner(songPath);
			while (songScanner.hasNextLine()) 
			{
				String song = songScanner.nextLine();
				String[] index = song.split(",");
				String id = index[0];
				String name = index[1];
				String artist = index[2];
				String albumName = index[3];
				String year = index[4];
				
				if (year.equals(userInput) || name.equals(userInput)) 
				{
					System.out.println("Name: " + name);
					System.out.println("Artist: " + artist);
					System.out.println("Album: " + albumName);
					System.out.println("Year: " + year);
					System.out.println();				
				}
			}
		} 
		
		catch (IOException e) 
		{
			System.out.println("An error occured");
		}
		
		System.out.println();
		
		//sort songs by title using NameComparator
		Collections.sort(songList, new compareByName());
		System.out.println("Songs sorted by name: ");
		System.out.println("--------------------- ");
		for (Song song : songList) 
		{
			System.out.println(song.sortedtoString());
		}

		System.out.println();
		
		//sort songs by year and title using YearNameComparator
		Collections.sort(songList, new compareByYearandName());
		System.out.println("Songs sorted by year: ");
		System.out.println("--------------------- ");
		for (Song song : songList) 
		{
			System.out.println(song.sortedtoString());
		}
	}
}
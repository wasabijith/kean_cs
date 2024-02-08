package GenderMag2;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*; 

public class Song <S>
{
	//Data Fields 
	private S id; 
	private S name; 
	private S artist; 
	private S album; 
	private S year; 

	//Empty Constructor 
	public Song()
	{

	}

	//Overloaded Constructor
	public Song(S id, S name, S artist, S album, S year) 
	{
		this.id = id;
		this.name = name;
		this.artist = artist;
		this.album = album;
		this.year = year;
	}

	//Getters and Setters 
	public S getID() 
	{
		return id;
	}

	public void setID(S id) 
	{
		this.id = id;
	}

	public S getName() 
	{
		return name;
	}

	public void setName(S name) 
	{
		this.name = name;
	}

	public S getArtist() 
	{
		return artist;
	}

	public void setArtist(S artist) 
	{
		this.artist = artist;
	}

	public S getAlbum() 
	{
		return album;
	}

	public void setAlbum(S album) 
	{
		this.album = album;
	}

	public S getYear() 
	{
		return year;
	}

	public void setyear(S year) 
	{
		this.year = year;
	}

	//toString method
	@Override
	public String toString() 
	{
		return "Song ID: " + id + "\nName: " + name + "\nArtist: " + artist + "\nAlbum: " + album + "\nYear: " + year + "\n";
	} 

	//Generic Method displayAllSongs() accepting LinkedList
	public static void displayAllSongs(LinkedList<Song> list) 
	{
		for (Song song : list) 
		{
			System.out.println(song.getID() + " " + song.getName() + " " + song.getArtist() + " " + song.getAlbum() + " " + song.getYear());
		}
	}	 

	//Array readSong() 
	public static Song[] readSongsArray(File songPath)
	{
		ArrayList<Song> arrayListreadSongs = new ArrayList<>();

		try (BufferedReader reader = new BufferedReader(new FileReader(songPath))) 
		{
			String song;
			while ((song = reader.readLine()) != null) {

				String[] songData = song.split(",");
				String id = songData[0];
				String name = songData[1];
				String artist = songData[2];
				String album = songData[3];
				String year = songData[4];
				arrayListreadSongs.add(new Song(id, name, artist, album, year));
			}
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		return arrayListreadSongs.toArray(new Song[0]);
	}

	//Linked List readSong() 
	public static LinkedList<Song> readSongsLinkedList(File songPath)
	{
		LinkedList<Song> linkedListreadSongs = new LinkedList<>();

		try (BufferedReader reader = new BufferedReader(new FileReader(songPath))) 
		{
			String song;
			while ((song = reader.readLine()) != null) 
			{
				String[] songData = song.split(",");
				String id = songData[0];
				String name = songData[1];
				String artist = songData[2];
				String album = songData[3];
				String year = songData[4];
				linkedListreadSongs.add(new Song(id, name, artist, album, year));
			}
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		return linkedListreadSongs;
	}

	//searchSongs() by name
	public static void searchSongs(String songName, Song[] songsByName) 
	{
		ArrayList<Song> searchSongsName = new ArrayList<Song>();
		for (Song song : songsByName) 
		{
			System.out.println(song.name);   
		}
	}

	//searchSongs() by name or year
	public static void searchSongs(int year, String songName, Song[] songsByNameorYear) 
	{
		ArrayList<Integer> searchSongByYear = new ArrayList<Integer>();
		for(Song song: songsByNameorYear) 
		{
			System.out.println(song.year);
		}

		for(Song song: songsByNameorYear) 
		{
			System.out.println(song.name);
		}
	}
	
	//Second toString() method for Comparators Output
	public String sortedtoString() 
	{
		return name + " by " + artist + "   " + year;
	}  
}

//Compare song by name
class compareByName implements Comparator<Song> 
{
	@Override
	public int compare(Song s1, Song s2) 
	{
		return ((String) s1.getName()).compareTo((String) s2.getName());
	}
}

//Compare song by year and name
class compareByYearandName implements Comparator<Song> 
{
	@Override
	public int compare(Song s1, Song s2) 
	{
		return ((String) s1.getYear()).compareTo((String) s2.getYear());
	}
}
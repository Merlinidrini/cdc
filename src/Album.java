import java.util.ArrayList;
import java.util.List;



public class Album
{
	public int id;
	public String name;
	public String artist;
	public int genre;
	public String genre_name;
	public int year;
	public List<Track> tracks = new ArrayList<Track>();
	public String path;
	
	public int getId()
	{
		return id;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String aName)
	{
		this.name = aName;
	}
	
	public String getArtist()
	{
		return artist;
	}
	
	public int getGenre()
	{
		return genre;
	}
	
	public String getGenreName()
	{
		return genre_name;
	}
	
	public int getYear()
	{
		return year;
	}
	
	public void addTrack(Track aTrack)
	{
		this.tracks.add(aTrack);
	}
	
	public List<Track> getTracks()
	{
		return this.tracks;
	}
	
	public String getPath()
	{
		return this.path;
	}
	
	public void setPath(String path)
	{
		this.path = path.replace("\\", "/");
	}
}

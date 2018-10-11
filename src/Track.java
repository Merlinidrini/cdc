

public class Track
{
	public int id;
	public String name;
	public String artist;
	public int genre;
	public int year;
	public String path;
	
	public int getId()
	{
		return this.id;
	}
	
	public void setId(int id)
	{
		this.id = id;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getArtist()
	{
		return this.artist;
	}
	
	public void setArtist(String artist)
	{
		this.artist = artist;
	}
	
	public int getGenre()
	{
		return this.genre;
	}
	
	public void setGenre(int genre)
	{
		this.genre = genre;
	}
	
	public int getYear()
	{
		return year;
	}
	
	public void setYear(int year)
	{
		this.year = year;
	}
	
	public String getPath()
	{
		return path;
	}
	
	public void setPath(String path)
	{
		this.path = path.replace("\\", "/");
	}
}

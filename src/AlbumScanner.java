import java.io.File;
import java.io.FileFilter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import com.mpatric.mp3agic.ID3v1;
import com.mpatric.mp3agic.ID3v2;
import com.mpatric.mp3agic.InvalidDataException;
import com.mpatric.mp3agic.Mp3File;
import com.mpatric.mp3agic.UnsupportedTagException;

public class AlbumScanner
{
	private String albumsPath = "/CdCollectionWeb/WebContent/WEB-INF/albums";
	final String instanceRoot = System.getProperty( "com.sun.aas.instanceRoot" );
	
	public List<Album> getScannedAlbums()
	{
		
		if (instanceRoot == null)
		{
		    try
			{
				throw new FileNotFoundException( "Cannot find Glassfish instanceRoot. Is the com.sun.aas.instanceRoot system property set?" );
			} catch (FileNotFoundException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		List<Album> albums = new ArrayList<Album>();
		
		//String configurationFolder = ( instanceRoot + File.separator + "domain1" + File.separator + "albums");
		String albumsRootPath = (instanceRoot +"/albums");
		File albumsRoot = new File(albumsRootPath);
		//String[] albumFoldersPaths = albumsRoot.list();
		
		List<File> albumList = new ArrayList<File>();
		
		System.out.println(albumsRoot.getAbsolutePath());
		File[] albumFolders = albumsRoot.listFiles();
		
		if(albumFolders != null)
		for(int k = 0; k < albumFolders.length - 1; k++)
		{
			System.out.println(albumFolders[k].getPath());
			
			if(albumFolders[k].isDirectory())
			{
				albumList.add(albumFolders[k]);
			}
		}
		
		for(int i = 0; i < albumFolders.length; i++)
		{
			Album album = new Album();
			
			if(albumFolders[i].isDirectory())
			{
				File[] albumTracks = albumFolders[i].listFiles();
				
				if(albumTracks != null)
				{
					for(int j = 0; j < albumTracks.length; j++)
					{
						System.out.println("Track:::  " + albumTracks[j].getName());
						
						
						Track track = new Track();
						
						System.out.println("Path track: "+ albumTracks[j].getPath());
						try
						{
							Mp3File mp3file = new Mp3File(albumTracks[j].getAbsolutePath());
							if(mp3file.hasId3v1Tag())
							{
								  ID3v1 mp3Tags = mp3file.getId3v1Tag(); 
								  track.setId(Integer.parseInt(mp3Tags.getTrack()));
								  track.setName(mp3Tags.getTitle());
								  track.setArtist(mp3Tags.getArtist());
								  track.setGenre(mp3Tags.getGenre());
								  track.setYear(Integer.parseInt(mp3Tags.getYear()));
								  
								  album.setName(mp3Tags.getAlbum());


								  String fullPath = albumTracks[j].getPath();
								  String relPath = fullPath.substring( fullPath.indexOf("\\albums\\") );
								  String trackPath = relPath.replace("\\", "/");
								  
								  track.setPath(trackPath);
								  System.out.println("Full path: " + fullPath);
								  System.out.println("Rel path: " + relPath);
								
								  System.out.println("Track: " + mp3Tags.getTrack());
								  System.out.println("Artist: " + mp3Tags.getArtist());
								  System.out.println("Title: " + mp3Tags.getTitle());
								  System.out.println("Album: " + mp3Tags.getAlbum());
								  System.out.println("Year: " + mp3Tags.getYear());
								  System.out.println("Genre: " + mp3Tags.getGenre() + " (" + mp3Tags.getGenreDescription() + ")");
							}
							else if(mp3file.hasId3v2Tag()) 
							{
								  ID3v2 mp3Tags = mp3file.getId3v2Tag();
								  track.setId(Integer.parseInt(mp3Tags.getTrack()));
								  track.setName(mp3Tags.getTitle());
								  track.setArtist(mp3Tags.getArtist());
								  track.setGenre(mp3Tags.getGenre());
								  track.setYear(Integer.parseInt(mp3Tags.getYear()));
								  
								  album.setName(mp3Tags.getAlbum());
								  
								  String fullPath = albumTracks[j].getPath();
								  String relPath = fullPath.substring( fullPath.indexOf("\\albums\\") );
								  String trackPath = relPath.replace("\\", "/");
								  
								  track.setPath(trackPath);
								  System.out.println("Full path: " + fullPath);
								  System.out.println("Rel path: " + relPath);
								
								  System.out.println("Track: " + mp3Tags.getTrack());
								  System.out.println("Artist: " + mp3Tags.getArtist());
								  System.out.println("Title: " + mp3Tags.getTitle());
								  System.out.println("Album: " + mp3Tags.getAlbum());
								  System.out.println("Year: " + mp3Tags.getYear());
								  System.out.println("Genre: " + mp3Tags.getGenre() + " (" + mp3Tags.getGenreDescription() + ")");
							}
							
							if(track != null)
							album.addTrack(track);
							
							// TODO remove after testing
							if(track == null)
								System.out.println("TRACK IS NULL!!!!!");
						}
						catch(InvalidDataException | UnsupportedTagException | IOException e)
						{
							System.out.println(e);
						}
					}
					albums.add(album);
				}
			}
		}
		
		return albums;
	}
	
	public void printList()
	{
		
	}
	
}

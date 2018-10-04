import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class GetData
{
	public static List<Album> getAlbums() {
		List<Album> albums = new ArrayList<Album>();
		try {
				Connection conn = DBConnect.connect();
				String query = "SELECT * FROM albums";
				PreparedStatement stmt=conn.prepareStatement(query);  
				ResultSet rs=stmt.executeQuery();  
				
				while(rs.next()){  
					Album album = new Album();
					album.name = rs.getString("name");
					album.artist= rs.getString("artist");
					album.genre= rs.getInt("genre");
					album.year= rs.getInt("year");
					albums.add(album);
				} 
	    		conn.close();
		}catch (SQLException e) 
		{
			System.out.println(e);
		}
		return albums;
	}
	
	public static boolean TransferData(Album album) {

		try {	
			Connection conn = DBConnect.connect();
			String query = "INSERT INTO albums (name, artist, genre, year) VALUES (?,?,?,?)";
			PreparedStatement stmt=conn.prepareStatement(query); 
			stmt.setString(1, album.name);
			stmt.setString(2, album.artist);
			stmt.setInt(3, album.genre);
			stmt.setInt(4, album.year);
			stmt.executeUpdate();
			conn.close();
			return true;
		} 
		catch(SQLException e) 
		{
			return false;
        }
	}
	
	public static List<Genre> getGenres() {
		List<Genre> genres = new ArrayList<Genre>();
		try {
			Connection conn = DBConnect.connect();
			String query = "SELECT * FROM genres";
			PreparedStatement stmt=conn.prepareStatement(query);  
			ResultSet rs=stmt.executeQuery();  
			while(rs.next()){  
				Genre genre = new Genre();
				genre.genre_id = rs.getInt("genre_id");
				genre.genre= rs.getString("genre");
				genres.add(genre);
			} 
	    	conn.close();
		}catch (SQLException e) {
			System.out.print(e);
		}
		return genres;
	}
}

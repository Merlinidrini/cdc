

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ScanFolders
 */
@WebServlet("/AlbumViewServlet")
public class AlbumViewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AlbumViewServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		AlbumScanner scanner = new AlbumScanner();
		List<Album> albums = scanner.getScannedAlbums();
		
		String[] uri = request.getRequestURI().split("/");
        String page = uri[2];
        request.setAttribute("page", page);
        //int id = Integer.parseInt(uri[3]);
        
        Album album = albums.get(0);
        
        String path = System.getProperty( "com.sun.aas.instanceRoot" );
        //String album_parent = path.replace("\\", "/");
        String album_parent = "/CdCollectionWeb";
        System.out.println(album_parent);
        request.setAttribute("album", album);
        request.setAttribute("album_parent", album_parent );
		request.getRequestDispatcher("/AlbumViewResponse.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}

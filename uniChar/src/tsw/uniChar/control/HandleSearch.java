package tsw.uniChar.control;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.Collection;
import java.util.Iterator;


import com.google.gson.Gson;

import tsw.uniChar.Beans.productBean;
import tsw.uniChar.model.productDAO;



/**
 * Servlet implementation class HandleSearch
 */
@WebServlet("/HandleSearch")
public class HandleSearch extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HandleSearch() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");
        
        PrintWriter out = response.getWriter();
        String oggettoJSON = null;
        
		System.out.println(request.getParameter("stringaRicerca"));
		
		productDAO prodotti = new productDAO();
		
		try {
			if(!request.getParameter("stringaRicerca").equalsIgnoreCase("")) {
				Collection<productBean> prodottiSuggest = prodotti.doRetrieveSuggest(request.getParameter("stringaRicerca"));
				Iterator<productBean> iter = prodottiSuggest.iterator();
				
				productBean prodotto = null;
				while(iter.hasNext()) {
					prodotto = iter.next();
				}
				
				oggettoJSON = new Gson().toJson(prodottiSuggest);
				System.out.println("Oggetto JSON: "+oggettoJSON);
				
				response.getWriter().write(oggettoJSON.toString());
			} else {
				oggettoJSON = new Gson().toJson("");
				response.getWriter().write(oggettoJSON.toString());
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}


import org.jsoup.*;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
public class Scraping {

	
	public static void main (String [] args) {
		try {
			final String diarioMarcaURL = "https://www.marca.com/futbol/primera-division/pichichi.html";
		//	final String url = "https://es.wikipedia.org/wiki/Anexo:Estad%C3%ADsticas_de_la_Primera_Divisi%C3%B3n_de_Espa%C3%B1a";
			Document document = Jsoup.connect(diarioMarcaURL).get();
	      	//System.out.println(document.outerHtml());
			for (Element element: document.select("table.ue-table-trophies tr")) //Sintax (ElementType.Class + tr)
			{
				
				final String playerName = element.select("th.ue-table-trophies__th:nth-of-type(2)").text();
				
				System.out.println(playerName);
			}
		}catch (Exception e) { 
			
			e.printStackTrace();
			System.out.println("Error: "+e.getMessage());
		}
		
	}
}

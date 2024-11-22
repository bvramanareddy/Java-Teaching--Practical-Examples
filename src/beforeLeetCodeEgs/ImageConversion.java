package beforeLeetCodeEgs;


import java.awt.image.BufferedImage;
import java.net.URI;
import java.net.URISyntaxException;

import javax.imageio.ImageIO;

public class ImageConversion {

	public static void main(String[] args) {

		
		try {
			URI uri= new URI("https://m.media-amazon.com/images/I/71b8S0Q127L._AC_SY340_.jpg");
			BufferedImage image= Image.read(uri);
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

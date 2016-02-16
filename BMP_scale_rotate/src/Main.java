import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;


public class Main {

	public static void main(String[] args) {
		
		BufferedImage image;
		try {
			image = ImageIO.read(new File("D:/eclipse/BMP_scale_rotate/src/panda.bmp"));
			Image_Change change = new Image_Change(image);
			BufferedImage other_image = change.simple_Scale(900, 600);
			
			File file = new File("D:/eclipse/BMP_scale_rotate/src/image.bmp");
			ImageIO.write(other_image, "bmp", file);
			if (!file.exists()) {
				file.createNewFile();
			}
		} catch (IOException e) {
			System.out.println("exception");
			e.printStackTrace();
		}
		
		
		
	}

}

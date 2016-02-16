import java.awt.image.BufferedImage;


public class Image_Change {
private BufferedImage image;
int [][] data;
int height;
int width;
public Image_Change(BufferedImage image) {
	
	this.image = image;
	height = image.getHeight();
	width = image.getWidth();
	
	data = new int[width][height];
	for (int i = 0; i < width; i++) {
		for (int j = 0; j < height; j++) {
			data[i][j] = image.getRGB(i, j);
			
		}
		
	}
}

public BufferedImage rotate(){
	
	BufferedImage new_Image = new BufferedImage(width, height, BufferedImage.TYPE_3BYTE_BGR);
	for (int i = 0; i < width; i++) {
		for (int j = 0; j < height; j++) {
			new_Image.setRGB(width - i - 1, height - j - 1, data[i][j]);
		}
	}
	return new_Image;
}
public BufferedImage simple_Scale(int w,int h){
	BufferedImage new_Image = new BufferedImage(w, h, BufferedImage.TYPE_3BYTE_BGR);
	int [][] new_data = new int[w][h];
	int sx;
	int sy;
	for (int i = 0; i < w; i++) {
		for (int j = 0; j < h; j++) {
			sx = i * width / w;
			sy = j * height / h;
			new_data[i][j] = data [sx][sy];
			new_Image.setRGB(i, j, new_data[i][j]);
			
		}
	}
	return new_Image;
}
}

package creationalpattern.proxy.test;

import creationalpattern.Iface.Image;
import creationalpattern.systemA.RealImage;
import creationalpattern.systemB.ProxyImage;

public class TestProxy {

	public static void main(String[] args) {
		
		 	Image image1 = (Image) new RealImage("HiRes_10MB_Photo1");
			Image image2 = (Image) new ProxyImage("HiRes_10MB_Photo2");

			image1.showImage(); // loading necessary
			image1.showImage(); // loading unnecessary
			image2.showImage(); // loading necessary
			image2.showImage(); // loading unnecessary
			image1.showImage(); // loading unnecessary
		
	}
	
}

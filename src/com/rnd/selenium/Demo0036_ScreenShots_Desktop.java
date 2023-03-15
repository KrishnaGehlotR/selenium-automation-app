package com.rnd.selenium;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class Demo0036_ScreenShots_Desktop
{
	public static void main(String[] args) throws Exception
	{
		Robot r = new Robot();
		Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle screenRect = new Rectangle(d);
		BufferedImage img = r.createScreenCapture(screenRect);
		ImageIO.write(img, "jpg", new File("D:/Workspace/ScreenShots/desktop.jpg"));
	}
}
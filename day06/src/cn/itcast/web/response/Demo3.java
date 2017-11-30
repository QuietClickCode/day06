package cn.itcast.web.response;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Demo3 extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		response.setHeader("expires", "-1");
		response.setHeader("cache-control", "no-cache");
		response.setHeader("pragma", "no-cache");
		BufferedImage image = new BufferedImage(100, 25,
				BufferedImage.TYPE_INT_RGB);
		Graphics g = image.getGraphics();
		g.setColor(Color.YELLOW);
		g.setFont(new Font("黑体", Font.BOLD, 22));
		g.drawString(getString(), 20, 20);
		ImageIO.write(image, "jpg", response.getOutputStream());

	}

	public String getString() {
		String str = "";
		String numberAndLetter = "01234567890ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
		int length = numberAndLetter.length();
		for (int i = 1; i <= 4; i++) {
			while (true) {

				if (i == 1 || i == 3) {
					Random random = new Random();
					int index = random.nextInt(length);
					String value = numberAndLetter.substring(index, index + 1);
					str += value;
					break;
				} else {
					Random random = new Random();
					int index = random.nextInt(length);
					String value = numberAndLetter.substring(index, index + 1);
					str += value;
					break;
				}
			}
		}
		return str;
	}
}
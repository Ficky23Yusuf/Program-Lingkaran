/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lingkaran;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

/**
 *
 * @author user
 */
public class NewClass {

    private Color[][] pixel;

    NewClass() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
        public void Lingkaranku(Graphics g) {
        int r = 50;
        int x = 0, y = r, p = 1 - r, i = 1;

        plotCirclePoints(g, x, y, Color.BLACK, 1);
        while (x < y) {
            x++;
            if (p < 0) {
                p += 2 * x + 1;
            } else {
                p += 2 * (x - y) + 1;
                y--;
            }
            plotCirclePoints(g, x, y, Color.BLACK, 1);
            i++;
        }
    }

    private void putPixel(Graphics g, int x, int y, Color color, int size) {
        try {
            Graphics g2 = (Graphics2D) g;
            g2.setColor(color.black);
            g2.fillRect(x, y, size, size);
            int pixX = Math.abs(x);
            int pixY = Math.abs(y);
            pixel[pixX][pixY] = color;
        } catch (IndexOutOfBoundsException ex) {
        } catch (Exception ex2) {
        }
    }

    private void plotCirclePoints(Graphics g, int x, int y, Color color, int size) {
        int xCenter = 200, yCenter = 250;
        putPixel(g, xCenter + x, yCenter + y, color, size);
        putPixel(g, xCenter - x, yCenter + y, color, size);
        putPixel(g, xCenter + x, yCenter - y, color, size);
        putPixel(g, xCenter - x, yCenter - y, color, size);
        putPixel(g, xCenter + y, yCenter + x, color, size);
        putPixel(g, xCenter - y, yCenter + x, color, size);
        putPixel(g, xCenter + y, yCenter - x, color, size);
        putPixel(g, xCenter - y, yCenter - x, color, size);
    }

    NewClass(Graphics g) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void putPixel(Graphics g) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

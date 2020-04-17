/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sqlitechinookcw;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;

/**
 *
 * @author nadiaislam
 */
public class PrintableObject implements Printable {
    public String stringToPrint;
    
    @Override
    public int print(Graphics g, PageFormat pf, int pageIndex) throws PrinterException {
        if(stringToPrint == null)
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Graphics2D g2d = (Graphics2D)g;
        g2d.translate(pf.getImageableX(), pf.getImageableY());
        g.drawString(stringToPrint,100, 100);
        return PAGE_EXISTS;

    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Claudio
 */
public class ContenedorGraficadora extends Canvas{
public static float apertura=0.01f;
    
    @Override
    public void paint(Graphics g) {
        super.paint(g); //To change body of generated methods, choose Tools | Templates.
        
        g.setColor(Color.white);
        g.fillRect(0, 0, getWidth(),getHeight());
        g.setColor(Color.black);
        //eje X
        g.drawLine(0, getHeight()/2, getWidth() ,getHeight()/2 );
        //eje Y
        g.drawLine(getWidth()/2, 0, getWidth()/2, getHeight());
        
        
        g.translate(getWidth()/2, getHeight()/2);
    
    //VAMOS A GRAFICAR UNA PARABOLA SIMPLE
      
        float x0=-100;
        float x1=-99;
        float y0;
        float y1;
        
        for(int i=0;i<=200;i++){
        
        y0=apertura*x0*x0;
        y1=apertura*x1*x1;
        
        g.drawLine((int)x0, (int)y0, (int)x1,(int)y1);
          x0++;
          x1++;
          
    
    
    }
        //VAMOS A GRAFICAR LA FUNCION SENO 
    
        double xseno0=-2*Math.PI-1;
        double xseno1=-2*Math.PI;
        double  yseno0;
        double  yseno1;
        
        for (int i=0; i<=1000; i++){
        yseno0=50*Math.sin(xseno0*25);
        yseno1=50*Math.sin(xseno1*25);
            
       g.drawLine((int)xseno0, (int)yseno0, (int)xseno1,(int)yseno1);
       
       xseno0++;
       xseno1++;
    }
}
}
    

    
    

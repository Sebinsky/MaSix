package view.panels;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JPanel;

import view.utils.Button;

public class MathOperationsPanel extends JPanel
{
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    
    // CLASS-MEMBER
    
    private FlowLayout layout = new FlowLayout();
    
    
    // CONSTRUCTOR
    
    public MathOperationsPanel()
    {
        setLayout(layout);
        setBackground(new Color(61, 61, 61));
         
        // --- Buttons ---
        add(new Button("Quadratische Lösungsformel (Mitternachtsformel)", 150, 100, "QuadraticFormula"));
        add(new Button("test2", 150, 100, "test2"));
        add(new Button("test3", 150, 100, "test3"));
        add(new Button("test4", 150, 100, "test4"));
        add(new Button("test5", 150, 100, "test5"));
        add(new Button("test6", 150, 100, "test6"));
        add(new Button("test7", 150, 100, "test7"));
    }    
}

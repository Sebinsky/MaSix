package view.panels;

import java.awt.CardLayout;

import javax.swing.JPanel;

public class PanelContainer extends JPanel
{
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    
    //CLASS-MEMBER
    
    public CardLayout layout = new CardLayout();
    
    
    // CONSTRUCTOR
    
    public PanelContainer()
    {
        setLayout(layout);
        
        addPanels();
        
        layout.show(this, "Start");
    }
    
    
    // METHODS
    
    // adds all panels for this panel container
    private void addPanels()
    {
        add(new StartPanel(), "Start");
        add(new MathOperationsPanel(), "MathOperations");
    }
}

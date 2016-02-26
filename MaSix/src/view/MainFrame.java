package view;


import javax.swing.JFrame;

import view.panels.PanelContainer;


public class MainFrame extends JFrame
{
    private static final long serialVersionUID = 1L;
    
    // CLASS-MEMBER
    private static PanelContainer pc = new PanelContainer();
    
    
    // CONSTRUCTOR
    
    public MainFrame()
    {
        setSize(900, 600);
        setLocationRelativeTo(null);
        setResizable(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setTitle("MaSix Power Tools");
        
        add(pc);
        
        setVisible(true);
    }
    
    
    // METHODS
    
    public static PanelContainer getPanelContainer()
    {
        return pc;
    }
}

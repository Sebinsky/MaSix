package view.utils;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import view.MainFrame;
import view.panels.PanelContainer;

public class Button extends JButton implements ActionListener
{
    private static final long serialVersionUID = 1L;

    //CONSTRUCTOR
    
    public Button(String text, int width, int height)
    {
        initButton(text, width, height);
    }
    
    // add an action listener which switches to the panel
    public Button(String text, int width, int height, String panel)
    {
        initButton(text, width, height);
        
        // Button Action to change Panels
        this.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                PanelContainer panelContainer = MainFrame.getPanelContainer();
                
                panelContainer.layout.show(panelContainer, panel);
            }
        });
    }
    
    
    // METHODS
    
    // sets properties which are the same for all overloads
    private void initButton(String text, int width, int height)
    {
        setText(text);
        setPreferredSize(new Dimension(width, height));
        setFocusPainted(false);

        // TODO: create nice Border
        this.setBorder(null);
        
        // button color
        setBackground(new Color(60, 20, 20));
        // button text color
        setForeground(new Color(170, 170, 170));
        
        // prevent changing Button color on click
        setContentAreaFilled(false);
        setOpaque(true);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        // TODO Auto-generated method stub
    }    
    
}

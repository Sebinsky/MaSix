package view.panels;

import java.awt.*;

import javax.swing.JLabel;
import javax.swing.JPanel;

import view.utils.Button;

public class StartPanel extends JPanel
{
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    
    // CLASS-MEMBER
    
    private GridBagLayout layout = new GridBagLayout();
    private GridBagConstraints gbc = new GridBagConstraints();
    private JLabel label;    
    
    
    // CONSTRUCTOR

    public StartPanel()
    {               
        setLayout(layout);
        setBackground(new Color(61, 61, 61));
        
        // set label properties
        label = new JLabel("MaSix Power Tools");
        label.setFont(new Font("Tahoma", Font.BOLD, 37));
        label.setForeground(new Color(170, 170, 170));
                
        // set margin of label
        gbc.insets = new Insets(-50, 0, 90, 0);
        
        gbc.gridx = 0;
        gbc.gridy = 1;
        add(label, gbc);

        // set margin of buttons
        gbc.insets = new Insets(15, 15, 15, 15);

        gbc.gridy = 2;
        add(new Button("Mathe", 200, 60, "MathOperations"), gbc);
        
        gbc.gridy = 3;
        add(new Button("Physik", 200, 60), gbc);
    }    
}

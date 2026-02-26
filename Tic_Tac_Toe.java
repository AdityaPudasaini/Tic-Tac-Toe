import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.plaf.ColorUIResource;

public class Tic_Tac_Toe extends JPanel implements ActionListener
{
    private JFrame frame;
    private JButton button1, button2, button3, button4, button5, button6, button7, button8, button9, retryButton;
    private JLabel gameName, Tic_Tac_ToeO, Tic_Tac_ToeX, result;
    private int clicked = 0;
    
    public Tic_Tac_Toe()
    {
        frame = new JFrame("Tic Tac Toe");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 700);
        frame.setResizable(false);
    
        this.setLayout(null);
        this.setBackground(Color.BLACK);
    
        frame.add(this);
        frame.setVisible(true);
    
        // Add components directly to THIS panel
        add(gameName = new JLabel("Tic Tac Toe"));
        gameName.setBounds(250, 50, 200, 50);
        gameName.setForeground(Color.WHITE);
        gameName.setFont(new Font("Times New Roman", Font.BOLD, 30));
    
        // Example button
        button1 = new JButton();
        button1.setBounds(150, 200, 100, 100);
        button1.setContentAreaFilled(false);
        button1.setFocusPainted(false);
        button1.setBorderPainted(false);
        button1.addActionListener(this);
        add(button1);
        
        button2 = new JButton();
        button2.setBounds(280, 200, 100, 100);
        button2.setContentAreaFilled(false);
        button2.setFocusPainted(false);
        button2.setBorderPainted(false);
        button2.addActionListener(this);
        add(button2);
        
        button3 = new JButton();
        button3.setBounds(410, 200, 100, 100);
        button3.setContentAreaFilled(false);
        button3.setFocusPainted(false);
        button3.setBorderPainted(false);
        button3.addActionListener(this);
        add(button3);
        
        button4 = new JButton();
        button4.setBounds(150, 330, 100, 100);
        button4.setContentAreaFilled(false);
        button4.setFocusPainted(false);
        button4.setBorderPainted(false);
        button4.addActionListener(this);
        add(button4);
        
        button5 = new JButton();
        button5.setBounds(280, 330, 100, 100);
        button5.setContentAreaFilled(false);
        button5.setFocusPainted(false);
        button5.setBorderPainted(false);
        button5.addActionListener(this);
        add(button5);
        
        button6 = new JButton();
        button6.setBounds(410, 330, 100, 100);
        button6.setContentAreaFilled(false);
        button6.setFocusPainted(false);
        button6.setBorderPainted(false);
        button6.addActionListener(this);
        add(button6);
        
        button7 = new JButton();
        button7.setBounds(150, 455, 100, 100);
        button7.setContentAreaFilled(false);
        button7.setFocusPainted(false);
        button7.setBorderPainted(false);
        button7.addActionListener(this);
        add(button7);
        
        button8 = new JButton();
        button8.setBounds(280, 455, 100, 100);
        button8.setContentAreaFilled(false);
        button8.setFocusPainted(false);
        button8.setBorderPainted(false);
        button8.addActionListener(this);
        add(button8);
        
        button9 = new JButton();
        button9.setBounds(410, 455, 100, 100);
        button9.setContentAreaFilled(false);
        button9.setFocusPainted(false);
        button9.setBorderPainted(false);
        button9.addActionListener(this);
        add(button9);
        
        result = new JLabel("Game Over");
        result.setBounds(200, 590, 100, 30);
        result.setForeground(Color.BLACK);
        result.setFont(new Font("Times New Roman", Font.BOLD, 20));
        result.setOpaque(true);       // <---- Make it opaque
        result.setBackground(Color.BLACK);
        add(result);
        result.repaint();             // Force repaint
        
        retryButton = new JButton("Retry");
        retryButton.setBounds(350, 580, 100, 50);
        retryButton.setContentAreaFilled(true); // visible background
        retryButton.setForeground(Color.WHITE);
        retryButton.setBackground(Color.DARK_GRAY);
        retryButton.setFocusPainted(false);
        retryButton.setBorderPainted(true);
        retryButton.addActionListener(this);
        add(retryButton);
        retryButton.repaint();
    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
        clicked++;
        
        if(e.getSource() == button1)
        {
            if(clicked%2 == 0)
            {
                button1.setEnabled(false);
                button1.setText("O");
                button1.setForeground(Color.WHITE);
                button1.setFont(new Font("Times New Roman", Font.BOLD, 40));
                resultChecker();
            }
            else
            {
                button1.setEnabled(false);
                button1.setText("X");
                button1.setForeground(Color.WHITE);
                button1.setFont(new Font("Times New Roman", Font.BOLD, 40));
                resultChecker();
            }
        }
        
        else if(e.getSource() == button2)
        {
            if(clicked%2 == 0)
            {
                button2.setEnabled(false);
                button2.setText("O");
                button2.setForeground(Color.WHITE);
                button2.setFont(new Font("Times New Roman", Font.BOLD, 40));
                resultChecker();
            }
            else
            {
                button2.setEnabled(false);
                button2.setText("X");
                button2.setForeground(Color.WHITE);
                button2.setFont(new Font("Times New Roman", Font.BOLD, 40));
                resultChecker();
            }
        }
        
        else if(e.getSource() == button3)
        {
            if(clicked%2 == 0)
            {
                button3.setEnabled(false);
                button3.setText("O");
                button3.setForeground(Color.WHITE);
                button3.setFont(new Font("Times New Roman", Font.BOLD, 40));
                resultChecker();
            }
            else
            {
                button3.setEnabled(false);
                button3.setText("X");
                button3.setForeground(Color.WHITE);
                button3.setFont(new Font("Times New Roman", Font.BOLD, 40));
                resultChecker();
            }
        }
        
        else if(e.getSource() == button4)
        {
            if(clicked%2 == 0)
            {
                button4.setEnabled(false);
                button4.setText("O");
                button4.setForeground(Color.WHITE);
                button4.setFont(new Font("Times New Roman", Font.BOLD, 40));
                resultChecker();
            }
            else
            {
                button4.setEnabled(false);
                button4.setText("X");
                button4.setForeground(Color.WHITE);
                button4.setFont(new Font("Times New Roman", Font.BOLD, 40));
                resultChecker();
            }
        }
        
        else if(e.getSource() == button5)
        {
            if(clicked%2 == 0)
            {
                button5.setEnabled(false);
                button5.setText("O");
                button5.setForeground(Color.WHITE);
                button5.setFont(new Font("Times New Roman", Font.BOLD, 40));
                resultChecker();
            }
            else
            {
                button5.setEnabled(false);
                button5.setText("X");
                button5.setForeground(Color.WHITE);
                button5.setFont(new Font("Times New Roman", Font.BOLD, 40));
                resultChecker();
            }
        }
        
        else if(e.getSource() == button6)
        {
            if(clicked%2 == 0)
            {
                button6.setEnabled(false);
                button6.setText("O");
                button6.setForeground(Color.WHITE);
                button6.setFont(new Font("Times New Roman", Font.BOLD, 40));
                resultChecker();
            }
            else
            {
                button6.setEnabled(false);
                button6.setText("X");
                button6.setForeground(Color.WHITE);
                button6.setFont(new Font("Times New Roman", Font.BOLD, 40));
                resultChecker();
            }
        }
        
        else if(e.getSource() == button7)
        {
            if(clicked%2 == 0)
            {
                button7.setEnabled(false);
                button7.setText("O");
                button7.setForeground(Color.WHITE);
                button7.setFont(new Font("Times New Roman", Font.BOLD, 40));
                resultChecker();
            }
            else
            {
                button7.setEnabled(false);
                button7.setText("X");
                button7.setForeground(Color.WHITE);
                button7.setFont(new Font("Times New Roman", Font.BOLD, 40));
                resultChecker();
            }
        }
        
        else if(e.getSource() == button8)
        {
            if(clicked%2 == 0)
            {
                button8.setEnabled(false);
                button8.setText("O");
                button8.setForeground(Color.WHITE);
                button8.setFont(new Font("Times New Roman", Font.BOLD, 40));
                resultChecker();
            }
            else
            {
                button8.setEnabled(false);
                button8.setText("X");
                button8.setForeground(Color.WHITE);
                button8.setFont(new Font("Times New Roman", Font.BOLD, 40));
                resultChecker();
            }
        }
        
        else if(e.getSource() == button9)
        {
            if(clicked%2 == 0)
            {
                button9.setEnabled(false);
                button9.setText("O");
                button9.setForeground(Color.WHITE);
                button9.setFont(new Font("Times New Roman", Font.BOLD, 40));
                resultChecker();
            }
            else
            {
                button9.setEnabled(false);
                button9.setText("X");
                button9.setForeground(Color.WHITE);
                button9.setFont(new Font("Times New Roman", Font.BOLD, 40));
                resultChecker();
            }
        }
        
        else
        {
            resetGame();
        }
    }
    
    public void resultChecker()
    {
        JButton[] buttons = {button1, button2, button3,button4, button5, button6,button7, button8, button9};
        
        String[] text = new String[9];

        for(int i = 0; i < 9; i++)
        {
            text[i] = buttons[i].getText();
        }
        
        if(text[0].equals("O") && text[1].equals("O") && text[2].equals("O") || text[0].equals("X") && text[1].equals("X") && text[2].equals("X"))
        {
            buttonDisabler();
        }
        
        else if(text[3].equals("O") && text[4].equals("O") && text[5].equals("O") || text[0].equals("X") && text[4].equals("X") && text[5].equals("X"))
        {
            buttonDisabler();
        }
        
        else if(text[6].equals("O") && text[7].equals("O") && text[8].equals("O") || text[6].equals("X") && text[7].equals("X") && text[8].equals("X"))
        {
            buttonDisabler();
        }
        
        else if(text[0].equals("O") && text[3].equals("O") && text[6].equals("O") || text[0].equals("X") && text[3].equals("X") && text[6].equals("X"))
        {
            buttonDisabler();
        }
        
        else if(text[1].equals("O") && text[4].equals("O") && text[7].equals("O") || text[1].equals("X") && text[4].equals("X") && text[7].equals("X"))
        {
            buttonDisabler();
        }
        
        else if(text[2].equals("O") && text[5].equals("O") && text[8].equals("O") || text[2].equals("X") && text[5].equals("X") && text[8].equals("X"))
        {
            buttonDisabler();
        }
        
        else if(text[0].equals("O") && text[4].equals("O") && text[8].equals("O") || text[0].equals("X") && text[4].equals("X") && text[8].equals("X"))
        {
            buttonDisabler();
        }
        
        else if(text[2].equals("O") && text[4].equals("O") && text[6].equals("O") || text[0].equals("X") && text[4].equals("X") && text[6].equals("X"))
        {
            buttonDisabler();
        }
    }
    
    public void buttonDisabler()
    {
        result.setForeground(Color.WHITE);
        button1.setEnabled(false);
        button2.setEnabled(false);
        button3.setEnabled(false);
        button4.setEnabled(false);
        button5.setEnabled(false);
        button6.setEnabled(false);
        button7.setEnabled(false);
        button8.setEnabled(false);
        button9.setEnabled(false);
    }
    
    public void resetGame()
    {    
        JButton[] buttons = {button1, button2, button3,button4, button5, button6,button7, button8, button9};
        
        for(int i = 0; i < 9; i++)
        {
            buttons[i].setText("");
            buttons[i].setEnabled(true);
        }
    
        clicked = 0;                 // reset turn counter
        result.setForeground(Color.BLACK);  // hide Game Over again
    }

    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(4));
        g2.setColor(Color.WHITE);
    
        int startX = 150;
        int startY = 200;
        int cellSize = 120;
    
        // Draw only Tic Tac Toe grid lines
        g2.drawLine(startX + cellSize, startY, startX + cellSize, startY + 3 * cellSize);
        g2.drawLine(startX + 2 * cellSize, startY, startX + 2 * cellSize, startY + 3 * cellSize);
        g2.drawLine(startX, startY + cellSize, startX + 3 * cellSize, startY + cellSize);
        g2.drawLine(startX, startY + 2 * cellSize, startX + 3 * cellSize, startY + 2 * cellSize);
    }
    
    public static void main(String[] args)
    {
        UIManager.put("Button.disabledText", new ColorUIResource(Color.WHITE));
        new Tic_Tac_Toe();
    }
}

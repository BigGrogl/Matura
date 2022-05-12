import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.event.*;
import java.awt.*;
public class MyFrame extends JFrame implements ActionListener{
    JButton nal1 = new JButton("nal1");
    JButton nal2 = new JButton("nal2");
    JButton nal3 = new JButton("nal3");
    JButton nal4 = new JButton("nal4");
    JButton nal5 = new JButton("nal5");
    JButton nal6 = new JButton("nal6");
    JButton nal7 = new JButton("nal7");
    JButton nal8 = new JButton("nal8");
    JButton nal9 = new JButton("nal9");
    JButton nal10 = new JButton("nal10");
    JButton nal11 = new JButton("nal11");
    JButton nal12 = new JButton("nal12");
    MyFrame(){
        nal1.setBounds(100,100,100,100);
        nal2.setBounds(100,100,100,100);
        nal3.setBounds(100,100,100,100);
        nal4.setBounds(100,100,100,100);
        nal5.setBounds(100,100,100,100);
        nal6.setBounds(100,100,100,100);
        nal7.setBounds(100,100,100,100);
        nal8.setBounds(100,100,100,100);
        nal9.setBounds(100,100,100,100);
        nal10.setBounds(100,100,100,100);
        nal11.setBounds(100,100,100,100);
        nal12.setBounds(100,100,100,100);

        nal1.setFocusable(false);
        nal2.setFocusable(false);
        nal3.setFocusable(false);
        nal4.setFocusable(false);
        nal5.setFocusable(false);
        nal6.setFocusable(false);
        nal7.setFocusable(false);
        nal8.setFocusable(false);
        nal9.setFocusable(false);
        nal10.setFocusable(false);
        nal11.setFocusable(false);
        nal12.setFocusable(false);

        nal1.addActionListener(this);
        nal2.addActionListener(this);
        nal3.addActionListener(this);
        nal4.addActionListener(this);
        nal5.addActionListener(this);
        nal6.addActionListener(this);
        nal7.addActionListener(this);
        nal8.addActionListener(this);
        nal9.addActionListener(this);
        nal10.addActionListener(this);
        nal11.addActionListener(this);
        nal12.addActionListener(this);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.add(nal1);
        this.add(nal2);
        this.add(nal3);
        this.add(nal4);
        this.add(nal5);
        this.add(nal6);
        this.add(nal7);
        this.add(nal8);
        this.add(nal9);
        this.add(nal10);
        this.add(nal11);
        this.add(nal12);
        this.pack();
        this.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==nal1){
            vaja4.main(null);
        }else if(e.getSource()==nal2){
            pomlad15.main(null);
        }
        else if(e.getSource()==nal3){
            pomlad15.main(null);
        }
        else if(e.getSource()==nal4){
            pomlad15.main(null);
        }
        else if(e.getSource()==nal5){
            pomlad15.main(null);
        }
        else if(e.getSource()==nal6){
            pomlad15.main(null);
        }
        else if(e.getSource()==nal7){
            pomlad15.main(null);
        }
        else if(e.getSource()==nal8){
            pomlad15.main(null);
        }
        else if(e.getSource()==nal9){
            pomlad15.main(null);
        }
        else if(e.getSource()==nal10){
            pomlad15.main(null);
        }
        else if(e.getSource()==nal11){
            pomlad15.main(null);
        }
        else if(e.getSource()==nal12){
            pomlad15.main(null);
        }
    }
}

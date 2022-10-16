/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author hp
 */
public class ProgressBar  {
    JFrame frame1;
    JProgressBar progress;
    JButton button;
    JPanel panel;
    public ProgressBar(){
        frame1=new JFrame();
        progress=new JProgressBar();
        button=new JButton();
        panel=new JPanel();
        panel.setBounds(0,0,300,300);
        //progress.setAlignmentX(JFrame.TOP_ALIGNMENT);
        //progress.setAlignmentY(JFrame.TOP_ALIGNMENT);
        progress.setValue(100);
        progress.setStringPainted(true);
        // progress.setSize(620,50);
        progress.setBounds(0,100,620,50);

        button.setText("Click to Continue...");
        button.setBounds(200,300,200,50);
        button.setVisible(false);
        
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               BankMain bank=new BankMain();
               frame1.setVisible(false);
//               ProgressBar progress=new ProgressBar();
//               progress.frame1.setVisible(false);
               bank.setVisible(true);
            }
        });

        frame1.add(progress);
        //frame1.add(panel);
        frame1.add(button);
        frame1.setTitle("Loading page");
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setSize(620,420);
        frame1.setLayout(null);
        frame1.setVisible(true);
        fill();
    }
    public void actionperform(ActionEvent e){
        
    }
    public void fill(){
        try {
            int counter=0;
            while(counter<=100){
                progress.setValue(counter);
                Thread.sleep(50);
                counter+=1;
            }
            progress.setString("Done!");
            //frame1.add(button);
            //panel.add(button);
            button.setVisible(true);
        }
        catch(Exception e){
            System.out.println("an Error occured");
        }
    }
}

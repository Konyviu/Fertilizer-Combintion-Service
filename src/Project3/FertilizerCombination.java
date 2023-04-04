package Project3;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FertilizerCombination extends JFrame{
    public FertilizerCombination(){
        super("Fertilizer Service");

        //Create Containers
        Container container = getContentPane();
        container.setLayout(new BoxLayout(container,3));

        //Create Colors
        Color titleColor = new Color(102,102,255);
        Color p1Color = new Color(153,255,153);
        Color p2Color = new Color(204, 255, 229);
        Color p3Color = new Color(204, 255, 229);
        Color p4Color = new Color(255,209,148);

        //Create Font
        Font titleFont = new Font("Courier",Font.PLAIN,20);
        Font textFont = new Font("Courier",Font.PLAIN | Font.BOLD,15);

        //Create Icons
        Icon imageLogo = new ImageIcon("C:\\Users\\Admin\\OneDrive\\เอกสาร\\LAB\\src\\Project3\\MangoLogo.png");

        //Create Title
        JLabel title = new JLabel("Fertilizer Combination Service");
        title.setForeground(titleColor);
        title.setFont(titleFont);

        //Create Menus
        JMenuBar menubar = new JMenuBar();

        JMenu phaseMenu = new JMenu("Time");
        JMenu aboutMenu = new JMenu("About");

        JMenuItem phase1 = new JMenuItem("Phase1");
        JMenuItem phase2 = new JMenuItem("Phase2");
        JMenuItem phase3 = new JMenuItem("Phase3");
        JMenuItem phase4 = new JMenuItem("Phase4");
        JMenuItem phase5 = new JMenuItem("Phase5");
        JMenuItem phase6 = new JMenuItem("Phase6");
        JMenuItem phase7 = new JMenuItem("Phase7");

        JMenuItem version = new JMenuItem("Version");
        JMenuItem homeMenu = new JMenuItem("Home");

        //Create Labels
        JLabel text = new JLabel("Please select Phase of your Mango tree");
        text.setFont(textFont);

        JLabel inputText = new JLabel("Enter your water(mL)");
        inputText.setFont(textFont);
        inputText.setVisible(false);

        //Create Buttons
        JButton logo = new JButton("Logo",imageLogo);
        logo.setPreferredSize(new Dimension(300,300));

        JButton confirmButton = new JButton("Ok");
        confirmButton.setFont(textFont);
        confirmButton.setVisible(false);

        JButton remainButton = new JButton("Remain");
        remainButton.setFont(textFont);

        //Create TextFields
        JTextField input = new JTextField();
        input.setFont(textFont);
        input.setVisible(false);

        //Create Panels
        JPanel panel1 = new JPanel();
        panel1.setBackground(p1Color);

        JPanel panel2 = new JPanel();
        panel2.setBackground(p2Color);

        JPanel panel3 = new JPanel();
        panel3.setBackground(p3Color);

        JPanel panel4 = new JPanel();
        panel4.setBackground(p4Color);
        panel4.setLayout(new FlowLayout());

        //Add Menus to MenuBar
        phaseMenu.add(phase1);
        phaseMenu.add(phase2);
        phaseMenu.add(phase3);
        phaseMenu.add(phase4);
        phaseMenu.add(phase5);
        phaseMenu.add(phase6);
        phaseMenu.add(phase7);

        aboutMenu.add(version);
        aboutMenu.add(homeMenu);

        menubar.add(phaseMenu);
        menubar.add(aboutMenu);

        //Add Components to Panels
        panel1.add(title);
        panel2.add(text);
        panel3.add(logo);
        panel3.add(inputText);
        panel3.add(input);
        panel3.add(confirmButton);
        panel4.add(remainButton);
        
        //Add Panels to Container
        container.add(menubar);
        container.add(panel1);
        container.add(panel2);
        container.add(panel3);
        container.add(panel4);

        //Interface Configuation
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600,500);
        setVisible(true);
        setResizable(false);
        setLocation(1000,500);
        setJMenuBar(menubar);

        //Events
        //Phase1's Event
        phase1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(e.getSource() == phase1){
                    text.setText("Mango tree - Phase1");
                    inputText.setVisible(true);
                    input.setVisible(true);
                    input.setPreferredSize(new Dimension(200,25));
                    logo.setVisible(false);
                    confirmButton.setVisible(true);

                    container.setLayout(new BorderLayout());

                    //Ok's Event
                    confirmButton.addActionListener(new ActionListener(){
                        public void actionPerformed(ActionEvent e){
                            if(input.getInputContext() != null){
                                String intInput = input.getText();
                                try{
                                    int num = Integer.parseInt(intInput);

                                    if(Fertilizer.canMixFertPhase_1(20,20)){
                                        Fertilizer.mixFert1(20,20);
                                        JOptionPane.showMessageDialog(FertilizerCombination.this,"Fertilizer Mixed Successful!");
                                    }else{
                                        JOptionPane.showMessageDialog(FertilizerCombination.this,"Not enough resource!");
                                    }
                                }catch(NumberFormatException ex){
                                    JOptionPane.showMessageDialog(FertilizerCombination.this,"Please be Integer!");
                                }
                                input.setText("");
                            }
                        }
                    });
                }else{}
            }
        });

        //Phase2's Event
        phase2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(e.getSource() == phase2){
                   text.setText("Mango tree - Phase2");
                    inputText.setVisible(true);
                    input.setVisible(true);
                    input.setPreferredSize(new Dimension(200,25));
                    logo.setVisible(false);
                    confirmButton.setVisible(true);

                    container.setLayout(new BorderLayout());

                    //Ok's Event
                    confirmButton.addActionListener(new ActionListener(){
                        public void actionPerformed(ActionEvent e){
                            if(input.getInputContext() != null){
                                String intInput = input.getText();
                                try{
                                    int num = Integer.parseInt(intInput);

                                    if(Fertilizer.canMixFertPhase_2(30,50,20)){
                                        Fertilizer.mixFert2(30,50,20);
                                        JOptionPane.showMessageDialog(FertilizerCombination.this,"Fertilizer Mixed Successful!");
                                    }else{
                                        JOptionPane.showMessageDialog(FertilizerCombination.this,"Not enough resource!");
                                }
                                }catch(NumberFormatException ex){
                                    JOptionPane.showMessageDialog(FertilizerCombination.this,"Please be Integer!");
                                }
                                input.setText("");
                            }
                        }
                    }); 
                }else{}
            }
        });

        //Phase3's Event
        phase3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(e.getSource() == phase3){
                   text.setText("Mango tree - Phase3");
                    inputText.setVisible(true);
                    input.setVisible(true);
                    input.setPreferredSize(new Dimension(200,25));
                    logo.setVisible(false);
                    confirmButton.setVisible(true);

                    container.setLayout(new BorderLayout());

                    //Ok's Event
                    confirmButton.addActionListener(new ActionListener(){
                        public void actionPerformed(ActionEvent e){
                            if(input.getInputContext() != null){
                                String intInput = input.getText();
                                try{
                                    int num = Integer.parseInt(intInput);

                                    if(Fertilizer.canMixFertPhase_3(30,20,5)){
                                        Fertilizer.mixFert3(30,20,5);
                                        JOptionPane.showMessageDialog(FertilizerCombination.this,"Fertilizer Mixed Successful!");
                                    }else{
                                        JOptionPane.showMessageDialog(FertilizerCombination.this,"Not enough resource!");
                                    }
                                }catch(NumberFormatException ex){
                                    JOptionPane.showMessageDialog(FertilizerCombination.this,"Please be Integer!");
                                }
                                input.setText("");
                            }
                        }
                    });
                }else{}
            }
        });

        //Phase4's Event
        phase4.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(e.getSource() == phase4){
                    text.setText("Mango tree - Phase4");
                    inputText.setVisible(true);
                    input.setVisible(true);
                    input.setPreferredSize(new Dimension(200,25));
                    logo.setVisible(false);
                    confirmButton.setVisible(true);

                    container.setLayout(new BorderLayout());

                    //Ok's Event
                    confirmButton.addActionListener(new ActionListener(){
                        public void actionPerformed(ActionEvent e){
                            if(input.getInputContext() != null){
                                String intInput = input.getText();
                                try{
                                    int num = Integer.parseInt(intInput);
                                
                                    if(Fertilizer.canMixFertPhase_4(30,10,10)){
                                        Fertilizer.mixFert4(30,10,10);
                                        JOptionPane.showMessageDialog(FertilizerCombination.this,"Fertilizer Mixed Successful!");
                                    }else{
                                        JOptionPane.showMessageDialog(FertilizerCombination.this,"Not enough resource!");
                                    }
                                }catch(NumberFormatException ex){
                                    JOptionPane.showMessageDialog(FertilizerCombination.this,"Please be Integer!");
                                }
                                input.setText("");
                            }
                        }
                    });
                }else{}
            }
        });

        //Phase5's Event
        phase5.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(e.getSource() == phase5){
                    text.setText("Mango tree - Phase5");
                    inputText.setVisible(true);
                    input.setVisible(true);
                    input.setPreferredSize(new Dimension(200,25));
                    logo.setVisible(false);
                    confirmButton.setVisible(true);

                    container.setLayout(new BorderLayout());

                    //Ok's Event
                    confirmButton.addActionListener(new ActionListener(){
                        public void actionPerformed(ActionEvent e){
                            if(input.getInputContext() != null){
                                String intInput = input.getText();
                                try{
                                    int num = Integer.parseInt(intInput);

                                    if(Fertilizer.canMixFertPhase_5(20,10,10)){
                                    Fertilizer.mixFert5(20,10,10);
                                    JOptionPane.showMessageDialog(FertilizerCombination.this,"Fertilizer Mixed Successful!");
                                }else{
                                    JOptionPane.showMessageDialog(FertilizerCombination.this,"Not enough resource!");
                                }
                                }catch(NumberFormatException ex){
                                    JOptionPane.showMessageDialog(FertilizerCombination.this,"Please be Integer!");
                                }
                                input.setText("");
                            }
                        }
                    });
                }else{}
            }
        });

        //Phase6's Event
        phase6.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(e.getSource() == phase6){
                    text.setText("Mango tree - Phase6");
                    inputText.setVisible(true);
                    input.setVisible(true);
                    input.setPreferredSize(new Dimension(200,25));
                    logo.setVisible(false);
                    confirmButton.setVisible(true);

                    container.setLayout(new BorderLayout());

                    //Ok's Event
                    confirmButton.addActionListener(new ActionListener(){
                        public void actionPerformed(ActionEvent e){
                            if(input.getInputContext() != null){
                                String intInput = input.getText();
                                try{
                                    int num = Integer.parseInt(intInput);

                                    if(Fertilizer.canMixFertPhase_6(20,10)){
                                        Fertilizer.mixFert6(20,10);
                                        JOptionPane.showMessageDialog(FertilizerCombination.this,"Fertilizer Mixed Successful!");
                                    }else{
                                        JOptionPane.showMessageDialog(FertilizerCombination.this,"Not enough resource!");
                                    }
                                }catch(NumberFormatException ex){
                                    JOptionPane.showMessageDialog(FertilizerCombination.this,"Please be Integer!");
                                }
                                input.setText("");
                            }
                        }
                    });
                }else{}
            }
        });

        //Phase7's Event
        phase7.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(e.getSource() == phase7){
                    text.setText("Mango tree - Phase7");
                    inputText.setVisible(true);
                    input.setVisible(true);
                    input.setPreferredSize(new Dimension(200,25));
                    logo.setVisible(false);
                    confirmButton.setVisible(true);

                    container.setLayout(new BorderLayout());

                    //Ok's Event
                    confirmButton.addActionListener(new ActionListener(){
                        public void actionPerformed(ActionEvent e){
                            if(input.getInputContext() != null){
                                String intInput = input.getText();
                                try{
                                    int num = Integer.parseInt(intInput);

                                    if(Fertilizer.canMixFertPhase_7(10,10)){
                                        Fertilizer.mixFert7(10,10);
                                        JOptionPane.showMessageDialog(FertilizerCombination.this,"Fertilizer Mixed Successful!");
                                    }else{
                                        JOptionPane.showMessageDialog(FertilizerCombination.this,"Not enough resource!");
                                    }
                                }catch(NumberFormatException ex){
                                    JOptionPane.showMessageDialog(FertilizerCombination.this,"Please be Integer!");
                                }
                                input.setText("");
                            }
                        }
                    });
                }else{}
            }
        });

        //Version's Event
        version.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(e.getSource() == version){
                    JOptionPane.showMessageDialog(FertilizerCombination.this,"(Demo)Version 1.0");
                }else{}
            }
        });

        //Home's Event
        homeMenu.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(e.getSource() == homeMenu){
                    text.setText("Please select Phase of your Mango tree");
                    inputText.setVisible(false);
                    input.setVisible(false);
                    logo.setVisible(true);
                    confirmButton.setVisible(false);
                }else{}
            }
        });

        //Remaining Fertilizer
        remainButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(e.getSource() == remainButton){
                    JOptionPane.showMessageDialog(FertilizerCombination.this,"");
                }else{}
            }
        });
    }

    //Running Method
    public static void main(String[] args){
        new FertilizerCombination();
        new Fertilizer(10,200,200,200,200,200,200,200,200,200);
    }
}

package unitconverter;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.*;


public class UnitConverter extends JFrame{
    private JPanel panel;
    private JTextField input;
    private JTextField output;
    private JLabel inputLabel;
    private JLabel outputLabel;
    private JComboBox<String> fromUnit;
    private JComboBox<String> toUnit;
    private JButton button1;
    public void initComponents(){
        panel.setLayout(null);
        inputLabel.setText("Input:");
        outputLabel.setText("Output:");
        inputLabel.setBounds(20,50,100,30);
        outputLabel.setBounds(20,100,100,30);
        input.setBounds(150,50,100,30);
        output.setBounds(150,100,100,30);
        output.setEditable(false);
        fromUnit=new JComboBox<String>(new String[]{"meter","Kilometer"});
        toUnit=new JComboBox<String>(new String[]{"meter","Kilometer"});
        fromUnit.setBounds(280,50,100,30);
        toUnit.setBounds(280,100,100,30);
        button1.setBounds(150,150,100,20);
        button1.setText("Convert");
        panel.setName("UnitConverter");
        button1.addActionListener(new ConvertButtonListener());

        panel.add(input);
        panel.add(inputLabel);
        panel.add(output);
        panel.add(outputLabel);
        panel.add(fromUnit);
        panel.add(toUnit);
        panel.add(button1);

    }

    public UnitConverter(){
        initComponents();
        setContentPane(panel);
        setSize(400,400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    private class ConvertButtonListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            String fromUnitType=fromUnit.getSelectedItem().toString();
            String toUnitType=toUnit.getSelectedItem().toString();
            double inputValue=Double.parseDouble(input.getText());
            double outputValue=0.0;
            if(fromUnitType.equals("meter")){
                if(toUnitType.equals("meter")){
                    outputValue=UnitConverter.meterToMeter(inputValue);
                }

            }
            else if(fromUnitType.equals("Kilometer")){

            }
            output.setText(""+outputValue);



        }


    }
    public static double meterToMeter(double inputValue){
        double outputvalue;
        outputvalue=inputValue;
        return outputvalue;
    }



}

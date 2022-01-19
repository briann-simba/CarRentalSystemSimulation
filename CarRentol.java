
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

class CarRentalView 
    extends JFrame
       implements ActionListener 
{ 
    //variables and jcomponents declaration
    private final Container container; 
    private final JLabel title; 
    private final JLabel daysRented; 
    private final JTextField itsDaysRented; 
    private final JLabel baseCost; 
    private static final double PRICE_PER_DAY = 30.00;
    private String  vehicleFeature, customerName,
            debitCard, startingDate, finalDate;
    private int daysrented;
    private double rentingCost;
    private int a1=125,b1=80,c1=200,d1=30,e1=120,f1=110,g1=50,h1=280,i1=170,j1=300,k1=245,l1=230,m1=240,n1=235,o1=225,p1=70,q1=290,r1=285,s1=275,t1=300,u1=270,v1=88,x1=85,y1=165,z1=250,a2=290,b2=20,c2=33,d2=53,e2=145,f2=90,g2=35,h2=147,i2=92,j2=31,k2=260,l2=262,m2=310,n2=100,o2=85,p2=83,q2=140,r2=90,s2=210,t2=308,u2=95,v2=60,w2=40,x2=115,y2=68,z2=44,a3=117,b3=124,c3=76,d3=26,e3=247,g3=227,h3=  a1,i3=195,j3=325,k3=32,l3=65,m3=148,n3=203,o3=55,p3=35,q3=45,r3=220,s3=265,t3=240,u3=208,v3=55,w3=51,x3=74,y3=112,z3=76,a4=36,b4=118,c4=82,d4=155,e4=235,f4=295,g4=4,h4=220,i4=230,j4=225,k4=215,l4=337,m4=87,n4=7,o4=145,p4=24,q4=252,r4=63,s4=254,t4=65,u4=260,v4=71,w4=24,y4=105,z4=155,a5=64,b5=130,c5=115,d5=130,e5=108,f5=148,g5=112,h5=72,i5=95,j5=147,k5=97,l5=36,m5=268,n5=270,o5=97,p5=180,q5=190;
    //variables to hold ranges of random numbers
    private static double a = 0.0, b = (1.0/10.0), c = 2*b, d = 3*b,
            f = 4*b, g = 5*b, h = 6*b, i = 7*b, j = 8*b, k = 9*b,
            l = 10*b;
    private final JTextField itsBaseCost;
    private final JLabel custName;
    private final JTextField itsCustomerName;
    private final JLabel creditCard;
    private final JTextField itsCreditCard;
    private final JLabel startingPeriod;
    private final JComboBox itsStartMonth; 
    private static final String[] months = {"January", "February", "March", "April",
   "May", "June", "July", "August","September", "October", "November", "December"};
    private final JComboBox itsStartDay; 
    private static final String[] days = {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10",
   "11", "12", "13", "14","15", "16", "17", "18", "19", "20", "21", "22", "23","24", "25", "26",
    "27", "28", "29", "30", "31"};
    private final JComboBox  itsStartHour;
    private static final String[] hours = {"7am", "8am", "9am", "10am","11am", "noon", "1pm", "2pm", "3pm",
   "4pm", "5pm"};

    
    private final JLabel endingPeriod;
    private final JComboBox itsEndMonth;
    private final JComboBox itsEndDay;
    private final JComboBox itsEndHour;
    private final JLabel check;
    private final JCheckBox itsManual; 
    private final JCheckBox itsAir; 
    private final JCheckBox itsCD; 
    private final JLabel choose; 
    private final ButtonGroup chooser; 
    private final JRadioButton compact; 
    private final JRadioButton full_size; 
    private final JRadioButton luxury; 
    private final JRadioButton SUV; 
    private final JButton submit; 
    private final JButton reset; 
    private final JTextArea output; 
    private final JPanel displayCar;
    private final JLabel outputbox;
    private final JLabel vehicleimage;
  
    //constructor
    public CarRentalView() 
    { 
        setTitle("Alchemy Car Rentals"); 
        setBounds(  200,90, 1040, 600); 
        setDefaultCloseOperation(EXIT_ON_CLOSE); 
        setResizable(true);
        
        // setUndecorated(false);
        setVisible(true); 
  
        container = getContentPane(); 
        container.setLayout(null); 
        
        title = new JLabel("Alchemy Car Rentals"); 
        title.setFont(new Font("Arial", Font.PLAIN, 30)); 
        title.setSize(  j1, 30); 
        title.setLocation(400, 30); 
        container.add(title); 
  
        daysRented = new JLabel("Enter days rented: "); 
        daysRented.setFont(new Font("Arial", Font.PLAIN, 15)); 
        daysRented.setSize(  c1, 20); 
        daysRented.setLocation(  n2,   n2); 
        container.add(daysRented); 
  
        itsDaysRented = new JTextField("1"); 
        itsDaysRented.setFont(new Font("Arial", Font.PLAIN, 15)); 
        itsDaysRented.setSize(  c1, 20); 
        itsDaysRented.setLocation(  j1,   n2); 
        container.add(itsDaysRented); 
  
        baseCost = new JLabel("The base cost is: "); 
        baseCost.setFont(new Font("Arial", Font.PLAIN, 15)); 
        baseCost.setSize(  c1, 20); 
        baseCost.setLocation(540,   n2); 
        container.add(baseCost); 
  
        itsBaseCost = new JTextField("" + PRICE_PER_DAY); 
        itsBaseCost.setFont(new Font("Arial", Font.PLAIN, 15)); 
        itsBaseCost.setSize(  c1, 20); 
        itsBaseCost.setEditable(false);
        itsBaseCost.setLocation(740,   n2); 
        container.add(itsBaseCost); 
        
        custName = new JLabel("Customer Name: "); 
        custName.setFont(new Font("Arial", Font.PLAIN, 15)); 
        custName.setSize(  c1, 20); 
        custName.setLocation(  n2,   q2); 
        container.add(custName); 
  
        itsCustomerName = new JTextField(18); 
        itsCustomerName.setFont(new Font("Arial", Font.PLAIN, 15)); 
        itsCustomerName.setSize(  c1, 20); 
        itsCustomerName.setLocation(  j1,   q2); 
        container.add(itsCustomerName); 
        
        creditCard = new JLabel("Credit Card: "); 
        creditCard.setFont(new Font("Arial", Font.PLAIN, 15)); 
        creditCard.setSize(  c1, 20); 
        creditCard.setLocation(540,   q2); 
        container.add(creditCard);  
  
        itsCreditCard = new JTextField(18); 
        itsCreditCard.setFont(new Font("Arial", Font.PLAIN, 15)); 
        itsCreditCard.setSize(  c1, 20); 
        itsCreditCard.setLocation(740,   q2); 
        container.add(itsCreditCard); 
        
        startingPeriod = new JLabel("Starting month/day/hour:"); 
        startingPeriod.setFont(new Font("Arial", Font.PLAIN, 15)); 
        startingPeriod.setSize(  j1, 20);
        startingPeriod.setLocation(  n2, 180); 
        container.add(startingPeriod);
        
  
        itsStartMonth = new JComboBox(months); 
        itsStartMonth.setFont(new Font("Arial", Font.PLAIN, 15)); 
        itsStartMonth.setSize(80, 20); 
        itsStartMonth.setLocation(  j1, 180); 
        container.add(itsStartMonth); 
  
        itsStartDay = new JComboBox(days); 
        itsStartDay.setFont(new Font("Arial", Font.PLAIN, 15)); 
        itsStartDay.setSize(50, 20); 
        itsStartDay.setLocation(380, 180); 
        container.add(itsStartDay);
        
        itsStartHour = new JComboBox(hours); 
        itsStartHour.setFont(new Font("Arial", Font.PLAIN, 15)); 
        itsStartHour.setSize(70, 20); 
        itsStartHour.setLocation(430, 180); 
        container.add(itsStartHour); 
        
        endingPeriod = new JLabel("Ending month/day/hour:"); 
        endingPeriod.setFont(new Font("Arial", Font.PLAIN, 15)); 
        endingPeriod.setSize(  c1, 20);
        endingPeriod.setLocation(540, 180); 
        container.add(endingPeriod);
        
  
        itsEndMonth = new JComboBox(months); 
        itsEndMonth.setFont(new Font("Arial", Font.PLAIN, 15)); 
        itsEndMonth.setSize(80, 20); 
        itsEndMonth.setLocation(740, 180); 
        container.add(itsEndMonth); 
  
        itsEndDay = new JComboBox(days); 
        itsEndDay.setFont(new Font("Arial", Font.PLAIN, 15)); 
        itsEndDay.setSize(50, 20); 
        itsEndDay.setLocation(820, 180); 
        container.add(itsEndDay);
        
        itsEndHour = new JComboBox(hours); 
        itsEndHour.setFont(new Font("Arial", Font.PLAIN, 15)); 
        itsEndHour.setSize(70, 20); 
        itsEndHour.setLocation(870, 180); 
        container.add(itsEndHour);
        
        check = new JLabel("Check: "); 
        check.setFont(new Font("Arial", Font.PLAIN, 15)); 
        check.setSize(  n2, 20);
        check.setLocation(  n2,  r3); 
        container.add(check);
        
        itsManual = new JCheckBox("manual", false); 
        itsManual.setFont(new Font("Arial", Font.PLAIN, 15)); 
        itsManual.setSize(80, 20); 
        itsManual.setLocation(  z1,  r3); 
        container.add(itsManual); 
  
        itsAir = new JCheckBox("Air cond", true); 
        itsAir.setFont(new Font("Arial", Font.PLAIN, 15)); 
        itsAir.setSize(80, 20); 
        itsAir.setLocation(330,  r3); 
        container.add(itsAir);
        
        itsCD = new JCheckBox("CD Player", true); 
        itsCD.setFont(new Font("Arial", Font.PLAIN, 15)); 
        itsCD.setSize(  n2, 20); 
        itsCD.setLocation(410,  r3); 
        container.add(itsCD);
        
        choose = new JLabel("Choose one: "); 
        choose.setFont(new Font("Arial", Font.PLAIN, 15)); 
        choose.setSize(95, 20);
        choose.setLocation(540,  r3); 
        container.add(choose);
        
        compact = new JRadioButton ("compact", true); 
        compact.setFont(new Font("Arial", Font.PLAIN, 15)); 
        compact.setSize(85, 20); 
        compact.setLocation(640,  r3); 
        container.add(compact); 
  
        full_size = new JRadioButton ("Full Size", false); 
        full_size.setFont(new Font("Arial", Font.PLAIN, 15)); 
        full_size.setSize(90, 20); 
        full_size.setLocation(730,  r3); 
        container.add(full_size);
        
        luxury = new JRadioButton ("Luxury", false); 
        luxury.setFont(new Font("Arial", Font.PLAIN, 15)); 
        luxury.setSize(70, 20); 
        luxury.setLocation(820,  r3); 
        container.add(luxury);
        
        SUV = new JRadioButton ("SUV", false); 
        SUV.setFont(new Font("Arial", Font.PLAIN, 15)); 
        SUV.setSize(60, 20); 
        SUV.setLocation(890,  r3); 
        container.add(SUV);
        
        //button group for radio buttons
        chooser = new ButtonGroup(); 
        chooser.add(compact); 
        chooser.add(full_size);
        chooser.add(luxury);
        chooser.add(SUV);
  
        submit = new JButton("Submit"); 
        submit.setFont(new Font("Arial", Font.PLAIN, 15)); 
        submit.setSize(  n2, 25); 
        submit.setLocation(  n2,   k2); 
        submit.addActionListener(this); 
        container.add(submit); 
  
        reset = new JButton("Reset"); 
        reset.setFont(new Font("Arial", Font.PLAIN, 15)); 
        reset.setSize(  n2, 25); 
        reset.setLocation( r3,   k2); 
        reset.addActionListener(this); 
        container.add(reset); 
        
        //display area for text ouput
        output = new JTextArea(); 
        output.setFont(new Font("Arial", Font.PLAIN, 15)); 
        output.setSize(250,   i1); 
        output.setLocation(  n2, 350); 
        output.setLineWrap(true); 
        output.setEditable(false); 
        container.add(output); 
        
        //display area for car
        displayCar = new JPanel();
        displayCar.setSize(980,   490);
        displayCar.setLocation(364,   z1);
        output.setLineWrap(true); 
        output.setEditable(false); 
        displayCar.setBackground(Color.white);
        container.add(displayCar);
        
        outputbox = new JLabel("Vehicle Information: "); 
        outputbox.setFont(new Font("Arial", Font.PLAIN, 15)); 
        outputbox.setSize(  c1, 20);
        outputbox.setLocation(  n2, 320); 
        container.add(outputbox);
        
        vehicleimage = new JLabel("Vehicle Image: "); 
        vehicleimage.setFont(new Font("Arial", Font.PLAIN, 15)); 
        vehicleimage.setSize(  c1, 20);
        vehicleimage.setLocation(540, 320); 
        container.add(vehicleimage);
        
        setVisible(true); 
    }  
 
    
    @Override
    public void actionPerformed(ActionEvent e) 
    { 
        //submit button clicked
        if (e.getSource() == submit) 
        { 
            //a graphic "clear" to reset the previous car
            Graphics clear = displayCar.getGraphics();
            clear.setColor(Color.white);
            clear.fillRect(0,0,980,490);
            //retrieving checked buttons checkboxes and radiobuttons
            
            
            Graphics graphic = displayCar.getGraphics();
            double Picker = Math.random();
            double Picker2 = Math.random();
            
            float floatPicker=(float)(Picker);
            float floatPicker2 = (float) (Picker);
            double scale = 0; //a scale to determine the size of a car
            //car color determined from random number "Picker"
            // 
            scale=((Picker2*-1)+Picker);
            graphic.setColor(Color.getHSBColor(floatPicker,floatPicker2,floatPicker));
            if (compact.isSelected()) {
                vehicleFeature = " *Vehicle Feature:* Compact \n";




                graphic.fillOval(f2, y4 + 140, d1, d1);
                graphic.fillOval(f2, d4 + 140, d1, d1);
                graphic.fillOval(a5, b5 + 140, d1, d1);
                graphic.fillOval(x2, b5 + 140, d1, d1);
                graphic.fillOval(e5, m3 + 140, d1, d1);
                graphic.fillOval(e5, y3 + 140, d1, d1);
                graphic.fillOval(h5, m3 + 140, d1, d1);
                graphic.fillOval(h5, y3 + 140, d1, d1);
                graphic.drawLine(104, 310, 104, 370);

                graphic.fillOval(f2 + 80, y4 + 140, d1, d1);
                graphic.fillOval(f2 + 80, d4 + 140, d1, d1);
                graphic.fillOval(a5 + 80, b5 + 140, d1, d1);
                graphic.fillOval(x2 + 80, b5 + 140, d1, d1);
                graphic.fillOval(e5 + 80, m3 + 140, d1, d1);
                graphic.fillOval(e5 + 80, y3 + 140, d1, d1);
                graphic.fillOval(h5 + 80, m3 + 140, d1, d1);
                graphic.fillOval(h5 + 80, y3 + 140, d1, d1);
                graphic.drawLine(184, 310, 184, 370);

                graphic.fillOval(f2 + 160, y4 + 140, d1, d1);
                graphic.fillOval(f2 + 160, d4 + 140, d1, d1);
                graphic.fillOval(a5 + 160, b5 + 140, d1, d1);
                graphic.fillOval(x2 + 160, b5 + 140, d1, d1);
                graphic.fillOval(e5 + 160, m3 + 140, d1, d1);
                graphic.fillOval(e5 + 160, y3 + 140, d1, d1);
                graphic.fillOval(h5 + 160, m3 + 140, d1, d1);
                graphic.fillOval(h5 + 160, y3 + 140, d1, d1);
                graphic.drawLine(264, 310, 264, 370);

                graphic.fillOval(f2 + 240, y4 + 140, d1, d1);
                graphic.fillOval(f2 + 240, d4 + 140, d1, d1);
                graphic.fillOval(a5 + 240, b5 + 140, d1, d1);
                graphic.fillOval(x2 + 240, b5 + 140, d1, d1);
                graphic.fillOval(e5 + 240, m3 + 140, d1, d1);
                graphic.fillOval(e5 + 240, y3 + 140, d1, d1);
                graphic.fillOval(h5 + 240, m3 + 140, d1, d1);
                graphic.fillOval(h5 + 240, y3 + 140, d1, d1);
                graphic.drawLine(344, 310, 344, 370);

                graphic.fillOval(f2 + 320, y4 + 140, d1, d1);
                graphic.fillOval(f2 + 320, d4 + 140, d1, d1);
                graphic.fillOval(a5 + 320, b5 + 140, d1, d1);
                graphic.fillOval(x2 + 320, b5 + 140, d1, d1);
                graphic.fillOval(e5 + 320, m3 + 140, d1, d1);
                graphic.fillOval(e5 + 320, y3 + 140, d1, d1);
                graphic.fillOval(h5 + 320, m3 + 140, d1, d1);
                graphic.fillOval(h5 + 320, y3 + 140, d1, d1);
                graphic.drawLine(424, 310, 424, 370);

                graphic.fillOval(f2 + 400, y4 + 140, d1, d1);
                graphic.fillOval(f2 + 400, d4 + 140, d1, d1);
                graphic.fillOval(a5 + 400, b5 + 140, d1, d1);
                graphic.fillOval(x2 + 400, b5 + 140, d1, d1);
                graphic.fillOval(e5 + 400, m3 + 140, d1, d1);
                graphic.fillOval(e5 + 400, y3 + 140, d1, d1);
                graphic.fillOval(h5 + 400, m3 + 140, d1, d1);
                graphic.fillOval(h5 + 400, y3 + 140, d1, d1);
                graphic.drawLine(504, 310, 504, 370);












                graphic.fillRect(  a1 + (int)(scale*  a1), b1+(int)(scale*b1),   c1+(int)(scale*  c1), d1+(int)(scale*d1));
                int poly_x1[] = {  a1+(int)(scale*  a1),   a1+(int)(scale*  a1),   e1+(int)(scale*  e1)};
                int poly_y1[] = {b1+(int)(scale*b1),   f1+(int)(scale*  f1),   f1+(int)(scale*  f1)};
                int n1 = 3;
                graphic.fillPolygon(poly_x1, poly_y1, n1);
                graphic.drawLine(  c1+(int)(scale*  c1), g1+(int)(scale*g1),   h1+(int)(scale*  h1), g1+(int)(scale*g1));
                graphic.drawLine(  c1+(int)(scale*  c1), g1+(int)(scale*g1),   i1+(int)(scale*  i1), b1+(int)(scale*b1));
                graphic.drawLine(  h1+(int)(scale*  h1), g1+(int)(scale*g1),   j1+(int)(scale*  j1), b1+(int)(scale*b1));
                graphic.drawLine(  k1+(int)(scale*  k1), g1+(int)(scale*g1),   k1+(int)(scale*  k1), b1+(int)(scale*b1));
                int poly_x2[] = {  l1+(int)(scale*  l1),   m1+(int)(scale*  m1),   e4+(int)(scale*  e4),   o1+(int)(scale*  o1)};
                int poly_y2[] = {p1+(int)(scale*p1), p1+(int)(scale*p1), b1+(int)(scale*b1), b1+(int)(scale*b1)};
                int n2 = 4;
                graphic.fillPolygon(poly_x2, poly_y2, n2);
                int poly_x3[] = {  h1+(int)(scale*  h1),   q1+(int)(scale*  q1),   r1+(int)(scale*  r1),   s1+(int)(scale*  s1)};
                int poly_y3[] = {p1+(int)(scale*p1), p1+(int)(scale*p1), b1+(int)(scale*b1), b1+(int)(scale*b1)};
                int n3 = 4;
                graphic.fillPolygon(poly_x3, poly_y3, n3);
                graphic.setColor(Color.white);
                graphic.fillOval(  e2+(int)(scale*  e2), f2+(int)(scale*f2), g2+(int)(scale*g2), g2+(int)(scale*g2));
                graphic.setColor(Color.black);
                graphic.fillOval(  h2+(int)(scale*  h2), i2+(int)(scale*i2), j2+(int)(scale*j2), j2+(int)(scale*j2));
                graphic.setColor(Color.white);
                graphic.fillOval(  k2+(int)(scale*  k2), f2+(int)(scale*f2), g2+(int)(scale*g2), g2+(int)(scale*g2));
                graphic.setColor(Color.black);
                graphic.fillOval(  l2+(int)(scale*  l2), i2+(int)(scale*i2), j2+(int)(scale*j2), j2+(int)(scale*j2));

            }
            else if(full_size.isSelected())
            {
                graphic.fillOval(f2, y4 + 170, d1, d1);
                graphic.fillOval(f2, d4 + 170, d1, d1);
                graphic.fillOval(a5, b5 + 170, d1, d1);
                graphic.fillOval(x2, b5 + 170, d1, d1);
                graphic.fillOval(e5, m3 + 170, d1, d1);
                graphic.fillOval(e5, y3 + 170, d1, d1);
                graphic.fillOval(h5, m3 + 170, d1, d1);
                graphic.fillOval(h5, y3 + 170, d1, d1);
                graphic.drawLine(104, 340, 104, 400);

                graphic.fillOval(f2 + 80, y4 + 170, d1, d1);
                graphic.fillOval(f2 + 80, d4 + 170, d1, d1);
                graphic.fillOval(a5 + 80, b5 + 170, d1, d1);
                graphic.fillOval(x2 + 80, b5 + 170, d1, d1);
                graphic.fillOval(e5 + 80, m3 + 170, d1, d1);
                graphic.fillOval(e5 + 80, y3 + 170, d1, d1);
                graphic.fillOval(h5 + 80, m3 + 170, d1, d1);
                graphic.fillOval(h5 + 80, y3 + 170, d1, d1);
                graphic.drawLine(184, 340, 184, 400);

                graphic.fillOval(f2 + 160, y4 + 170, d1, d1);
                graphic.fillOval(f2 + 160, d4 + 170, d1, d1);
                graphic.fillOval(a5 + 160, b5 + 170, d1, d1);
                graphic.fillOval(x2 + 160, b5 + 170, d1, d1);
                graphic.fillOval(e5 + 160, m3 + 170, d1, d1);
                graphic.fillOval(e5 + 160, y3 + 170, d1, d1);
                graphic.fillOval(h5 + 160, m3 + 170, d1, d1);
                graphic.fillOval(h5 + 160, y3 + 170, d1, d1);
                graphic.drawLine(264, 340, 264, 400);

                graphic.fillOval(f2 + 240, y4 + 170, d1, d1);
                graphic.fillOval(f2 + 240, d4 + 170, d1, d1);
                graphic.fillOval(a5 + 240, b5 + 170, d1, d1);
                graphic.fillOval(x2 + 240, b5 + 170, d1, d1);
                graphic.fillOval(e5 + 240, m3 + 170, d1, d1);
                graphic.fillOval(e5 + 240, y3 + 170, d1, d1);
                graphic.fillOval(h5 + 240, m3 + 170, d1, d1);
                graphic.fillOval(h5 + 240, y3 + 170, d1, d1);
                graphic.drawLine(344, 340, 344, 400);

                graphic.fillOval(f2 + 320, y4 + 170, d1, d1);
                graphic.fillOval(f2 + 320, d4 + 170, d1, d1);
                graphic.fillOval(a5 + 320, b5 + 170, d1, d1);
                graphic.fillOval(x2 + 320, b5 + 170, d1, d1);
                graphic.fillOval(e5 + 320, m3 + 170, d1, d1);
                graphic.fillOval(e5 + 320, y3 + 170, d1, d1);
                graphic.fillOval(h5 + 320, m3 + 170, d1, d1);
                graphic.fillOval(h5 + 320, y3 + 170, d1, d1);
                graphic.drawLine(424, 340, 424, 400);

                graphic.fillOval(f2 + 400, y4 + 170, d1, d1);
                graphic.fillOval(f2 + 400, d4 + 170, d1, d1);
                graphic.fillOval(a5 + 400, b5 + 170, d1, d1);
                graphic.fillOval(x2 + 400, b5 + 170, d1, d1);
                graphic.fillOval(e5 + 400, m3 + 170, d1, d1);
                graphic.fillOval(e5 + 400, y3 + 170, d1, d1);
                graphic.fillOval(h5 + 400, m3 + 170, d1, d1);
                graphic.fillOval(h5 + 400, y3 + 170, d1, d1);
                graphic.drawLine(504, 340, 504, 400);
  

                graphic.fillRect(f1 + (int) (scale * f1), b1 + (int) (scale * b1), g3 + (int) (scale * g3),
                        w2 + (int) (scale * w2));// body
                graphic.fillRect(a1 + (int) (scale * a1), b1 + (int) (scale * b1), c1 + (int) (scale * c1),
                        d1 + (int) (scale * d1));
                int poly_x1[] = { f1 + (int) (scale * f1), f1 + (int) (scale * f1), y4 + (int) (scale * y4) };
                int poly_y1[] = { b1 + (int) (scale * b1), e1 + (int) (scale * e1), e1 + (int) (scale * e1) };
                int n1 = 3;
                graphic.fillPolygon(poly_x1, poly_y1, n1);
                graphic.drawLine(i3 + (int) (scale * i3), w2 + (int) (scale * w2), j3 + (int) (scale * j3),
                        w2 + (int) (scale * w2));
                graphic.drawLine(i3 + (int) (scale * i3), w2 + (int) (scale * w2), d4 + (int) (scale * d4),
                        b1 + (int) (scale * b1));
                graphic.drawLine(e4 + (int) (scale * e4), w2 + (int) (scale * w2), e4 + (int) (scale * e4),
                        b1 + (int) (scale * b1));
                graphic.drawLine(f4 + (int) (scale * f4), w2 + (int) (scale * w2), f4 + (int) (scale * f4),
                        b1 + (int) (scale * b1));
                graphic.drawLine(j3 + (int) (scale * j3), w2 + (int) (scale * w2), l4 + (int) (scale * l4),
                        b1 + (int) (scale * b1));
                graphic.fillRect(f1 + (int) (scale * f1), f1 + (int) (scale * f1), g3 + (int) (scale * g3),
                        g4 + (int) (scale * g4));
                int poly_x2[] = { r3 + (int) (scale * r3), l1 + (int) (scale * l1), o1 + (int) (scale * o1),
                        k4 + (int) (scale * k4) };
                int poly_y2[] = { p1 + (int) (scale * p1), p1 + (int) (scale * p1), b1 + (int) (scale * b1),
                        b1 + (int) (scale * b1) };
                int n2 = 4;
                graphic.fillPolygon(poly_x2, poly_y2, n2);
                int poly_x3[] = { h1 + (int) (scale * h1), q1 + (int) (scale * q1), r1 + (int) (scale * r1),
                        s1 + (int) (scale * s1) };
                int poly_y3[] = { p1 + (int) (scale * p1), p1 + (int) (scale * p1), b1 + (int) (scale * b1),
                        b1 + (int) (scale * b1) };
                int n3 = 4;

                int poly_x4[] = { 320 + (int) (scale * 320), 330 + (int) (scale * 330), 325 + (int) (scale * 325),
                        315 + (int) (scale * 315) };
                int poly_y4[] = { p1 + (int) (scale * p1), p1 + (int) (scale * p1), b1 + (int) (scale * b1),
                        b1 + (int) (scale * b1) };

                graphic.fillPolygon(poly_x3, poly_y3, n3);
                graphic.fillPolygon(poly_x4, poly_y4, n3);
                graphic.setColor(Color.darkGray);
                graphic.fillRect(l4 + (int) (scale * l4), m4 + (int) (scale * m4), n4 + (int) (scale * n4),
                        d3 + (int) (scale * d3));
                graphic.setColor(Color.white);
                graphic.fillOval(e2 + (int) (scale * e2), u2 + (int) (scale * u2), w2 + (int) (scale * w2),
                        w2 + (int) (scale * w2));
                graphic.setColor(Color.black);
                graphic.fillOval(h2 + (int) (scale * h2), k5 + (int) (scale * k5), a4 + (int) (scale * a4),
                        a4 + (int) (scale * a4));
                graphic.setColor(Color.white);
                graphic.fillOval(m5 + (int) (scale * m5), u2 + (int) (scale * u2), w2 + (int) (scale * w2),
                        w2 + (int) (scale * w2));
                graphic.setColor(Color.black);
                graphic.fillOval(u1 + (int) (scale * u1), k5 + (int) (scale * k5), a4 + (int) (scale * a4),
                        a4 + (int) (scale * a4));


                
            }
            else if(luxury.isSelected())
            {

               //for the flower
                 
                graphic.fillOval(f2, y4+150, d1, d1);
                graphic.fillOval( f2,    d4+150,   d1, d1);
                graphic.fillOval( a5,   b5+150,   d1, d1);
                graphic.fillOval(   x2,   b5+150,   d1, d1);
                graphic.fillOval( e5,    m3+150,   d1, d1);
                graphic.fillOval( e5,    y3+150,   d1, d1);
                graphic.fillOval( h5,    m3+150,   d1, d1);
                graphic.fillOval( h5,    y3+150,   d1, d1);
                graphic.drawLine(104,320,104,380);
                


                graphic.fillOval(f2 + 80, y4 + 150, d1, d1);
                graphic.fillOval(f2 + 80, d4 + 150, d1, d1);
                graphic.fillOval(a5 + 80, b5 + 150, d1, d1);
                graphic.fillOval(x2 + 80, b5 + 150, d1, d1);
                graphic.fillOval(e5 + 80, m3 + 150, d1, d1);
                graphic.fillOval(e5 + 80, y3 + 150, d1, d1);
                graphic.fillOval(h5 + 80, m3 + 150, d1, d1);
                graphic.fillOval(h5 + 80, y3 + 150, d1, d1);
                graphic.drawLine(184, 320, 184, 380);

                graphic.fillOval(f2 + 160, y4 + 150, d1, d1);
                graphic.fillOval(f2 + 160, d4 + 150, d1, d1);
                graphic.fillOval(a5 + 160, b5 + 150, d1, d1);
                graphic.fillOval(x2 + 160, b5 + 150, d1, d1);
                graphic.fillOval(e5 + 160, m3 + 150, d1, d1);
                graphic.fillOval(e5 + 160, y3 + 150, d1, d1);
                graphic.fillOval(h5 + 160, m3 + 150, d1, d1);
                graphic.fillOval(h5 + 160, y3 + 150, d1, d1);
                graphic.drawLine(264, 320, 264, 380);

                graphic.fillOval(f2 + 240, y4 + 150, d1, d1);
                graphic.fillOval(f2 + 240, d4 + 150, d1, d1);
                graphic.fillOval(a5 + 240, b5 + 150, d1, d1);
                graphic.fillOval(x2 + 240, b5 + 150, d1, d1);
                graphic.fillOval(e5 + 240, m3 + 150, d1, d1);
                graphic.fillOval(e5 + 240, y3 + 150, d1, d1);
                graphic.fillOval(h5 + 240, m3 + 150, d1, d1);
                graphic.fillOval(h5 + 240, y3 + 150, d1, d1);
                graphic.drawLine(344, 320, 344, 380);

                graphic.fillOval(f2 + 320, y4 + 150, d1, d1);
                graphic.fillOval(f2 + 320, d4 + 150, d1, d1);
                graphic.fillOval(a5 + 320, b5 + 150, d1, d1);
                graphic.fillOval(x2 + 320, b5 + 150, d1, d1);
                graphic.fillOval(e5 + 320, m3 + 150, d1, d1);
                graphic.fillOval(e5 + 320, y3 + 150, d1, d1);
                graphic.fillOval(h5 + 320, m3 + 150, d1, d1);
                graphic.fillOval(h5 + 320, y3 + 150, d1, d1);
                graphic.drawLine(424, 320, 424, 380);

                graphic.fillOval(f2 + 400, y4 + 150, d1, d1);
                graphic.fillOval(f2 + 400, d4 + 150, d1, d1);
                graphic.fillOval(a5 + 400, b5 + 150, d1, d1);
                graphic.fillOval(x2 + 400, b5 + 150, d1, d1);
                graphic.fillOval(e5 + 400, m3 + 150, d1, d1);
                graphic.fillOval(e5 + 400, y3 + 150, d1, d1);
                graphic.fillOval(h5 + 400, m3 + 150, d1, d1);
                graphic.fillOval(h5 + 400, y3 + 150, d1, d1);
                graphic.drawLine(504, 320, 504, 380);


                
                graphic.fillRect(a1 + (int) (scale * a1), 80 + (int) (scale * 80),370+(int) (scale*370),
                        d1 + (int) (scale * d1));
                int poly_x1[] = { a1 + (int) (scale * a1), a1 + (int) (scale * a1), e1 + (int) (scale * e1) };
                int poly_y1[] = { b1 + (int) (scale * b1), f1 + (int) (scale * f1), f1 + (int) (scale * f1) };
                int n1 = 3;
                graphic.fillPolygon(poly_x1, poly_y1, n1);
                graphic.drawLine(c1 + (int) (scale * c1), g1 + (int) (scale * g1), 450 + (int) (scale * 450),
                        g1 + (int) (scale * g1));
                graphic.drawLine(c1 + (int) (scale * c1), g1 + (int) (scale * g1), i1 + (int) (scale * i1),
                        b1 + (int) (scale * b1));
                graphic.drawLine(450 + (int) (scale * 450), 50 + (int) (scale * 50), 475 + (int) (scale * 475),
                        80 + (int) (scale * 80));
//for the vertical lines
               graphic.drawLine((k1 + 180) + (int) (scale * (k1 + 180)), g1 + (int) (scale * g1),
        (k1 + 180) + (int) (scale * (k1 + 180)), b1 + (int) (scale * b1));
                graphic.drawLine((k1 + 120) + (int) (scale * (k1 + 120)), g1 + (int) (scale * g1), (k1 + 120) + (int) (scale * (k1 + 120)),
        b1 + (int) (scale * b1));
                graphic.drawLine((k1+60) + (int) (scale * (k1+60)), g1 + (int) (scale * g1), (k1+60) + (int) (scale * (k1+60)),
                        b1 + (int) (scale * b1));
                graphic.drawLine(k1 + (int) (scale * k1), g1 + (int) (scale * g1), k1 + (int) (scale * k1),
                        b1 + (int) (scale * b1));                



                  //for the chairs
                int poly_x2[] = { l1 + (int) (scale * l1), m1 + (int) (scale * m1), e4 + (int) (scale * e4),
                        o1 + (int) (scale * o1) };
                int poly_y2[] = { p1 + (int) (scale * p1), p1 + (int) (scale * p1), b1 + (int) (scale * b1),
                        b1 + (int) (scale * b1) };
                int n2 = 4;
                graphic.fillPolygon(poly_x2, poly_y2, n2);
                int poly_x3[] = { h1 + (int) (scale * h1), q1 + (int) (scale * q1), r1 + (int) (scale * r1),
                        s1 + (int) (scale * s1) };
                int poly_y3[] = { p1 + (int) (scale * p1), p1 + (int) (scale * p1), b1 + (int) (scale * b1),
                        b1 + (int) (scale * b1) };
                int poly_x4[] = { (h1+60) + (int) (scale * (h1+60)), (q1+60) + (int) (scale * (q1+60)), (r1+60) + (int) (scale * (r1+60)),
                        (s1+60) + (int) (scale * (s1+60)) };
                int poly_x5[] = { (h1 + 120) + (int) (scale * (h1 + 120)), (q1 + 120) + (int) (scale * (q1 + 120)),
                        (r1 + 120) + (int) (scale * (r1 + 120)), (s1 + 120) + (int) (scale * (s1 + 120)) };
                int poly_x6[] = { (h1 + 160) + (int) (scale * (h1 + 160)), (q1 + 160) + (int) (scale * (q1 + 160)),
                        (r1 + 160) + (int) (scale * (r1 + 160)), (s1 + 160) + (int) (scale * (s1 + 160)) };
       
                int n3 = 4;
                graphic.fillPolygon(poly_x3, poly_y3, n3);
                graphic.fillPolygon(poly_x4, poly_y3, n3);
                graphic.fillPolygon(poly_x5, poly_y3, n3);
                graphic.fillPolygon(poly_x6, poly_y3, n3);
                graphic.setColor(Color.white);
                graphic.fillOval(e2 + (int) (scale * e2), f2 + (int) (scale * f2), g2 + (int) (scale * g2),
                        g2 + (int) (scale * g2));
                graphic.setColor(Color.black);
                graphic.fillOval(h2 + (int) (scale * h2), i2 + (int) (scale * i2), j2 + (int) (scale * j2),
                        j2 + (int) (scale * j2));
                graphic.setColor(Color.white);
                graphic.fillOval(k2+150 + (int) (scale * (k2+150)), f2 + (int) (scale * f2), g2 + (int) (scale * g2),
                        g2 + (int) (scale * g2));
                graphic.setColor(Color.black);
                graphic.fillOval(l2+150 + (int) (scale * (l2+150)), i2 + (int) (scale * i2), j2 + (int) (scale * j2),
                        j2 + (int) (scale * j2));

















                
                vehicleFeature = " *Vehicle Feature:* Luxury \n";
                //for the car
                


            }
            else if(SUV.isSelected())
            {
                    graphic.fillOval(f2+240, y4 - 100, d1, d1);
                    graphic.fillOval(f2 + 240, d4 - 100, d1, d1);
                    graphic.fillOval(a5 + 240, b5 - 100, d1, d1);
                    graphic.fillOval(x2 + 240, b5 - 100, d1, d1);
                    graphic.fillOval(e5 + 240, m3 - 100, d1, d1);
                    graphic.fillOval(e5 + 240, y3 - 100, d1, d1);
                    graphic.fillOval(h5 + 240, m3 - 100, d1, d1);
                    graphic.fillOval(h5 + 240, y3 - 100, d1, d1);
                    graphic.drawLine(344, 60, 344, 120);

                    graphic.fillOval(f2 + 320, y4 - 100, d1, d1);
                    graphic.fillOval(f2 + 320, d4 - 100, d1, d1);
                    graphic.fillOval(a5 + 320, b5 - 100, d1, d1);
                    graphic.fillOval(x2 + 320, b5 - 100, d1, d1);
                    graphic.fillOval(e5 + 320, m3 - 100, d1, d1);
                    graphic.fillOval(e5 + 320, y3 - 100, d1, d1);
                    graphic.fillOval(h5 + 320, m3 - 100, d1, d1);
                    graphic.fillOval(h5 + 320, y3 - 100, d1, d1);
                    graphic.drawLine(424, 60, 424, 120);

                    graphic.fillOval(f2 + 400, y4 - 100, d1, d1);
                    graphic.fillOval(f2 + 400, d4 - 100, d1, d1);
                    graphic.fillOval(a5 + 400, b5 - 100, d1, d1);
                    graphic.fillOval(x2 + 400, b5 - 100, d1, d1);
                    graphic.fillOval(e5 + 400, m3 - 100, d1, d1);
                    graphic.fillOval(e5 + 400, y3 - 100, d1, d1);
                    graphic.fillOval(h5 + 400, m3 - 100, d1, d1);
                    graphic.fillOval(h5 + 400, y3 - 100, d1, d1);
                    graphic.drawLine(504, 60, 504, 120);

                    graphic.fillOval(f2 + 480, y4 - 100, d1, d1);
                    graphic.fillOval(f2 + 480, d4 - 100, d1, d1);
                    graphic.fillOval(a5 + 480, b5 - 100, d1, d1);
                    graphic.fillOval(x2 + 480, b5 - 100, d1, d1);
                    graphic.fillOval(e5 + 480, m3 - 100, d1, d1);
                    graphic.fillOval(e5 + 480, y3 - 100, d1, d1);
                    graphic.fillOval(h5 + 480, m3 - 100, d1, d1);
                    graphic.fillOval(h5 + 480, y3 - 100, d1, d1);
                    graphic.drawLine(584, 60, 584, 120);

                    graphic.fillOval(f2 + 560, y4 - 100, d1, d1);
                    graphic.fillOval(f2 + 560, d4 - 100, d1, d1);
                    graphic.fillOval(a5 + 560, b5 - 100, d1, d1);
                    graphic.fillOval(x2 + 560, b5 - 100, d1, d1);
                    graphic.fillOval(e5 + 560, m3 - 100, d1, d1);
                    graphic.fillOval(e5 + 560, y3 - 100, d1, d1);
                    graphic.fillOval(h5 + 560, m3 - 100, d1, d1);
                    graphic.fillOval(h5 + 560, y3 - 100, d1, d1);
                    graphic.drawLine(664, 60, 664, 120);

                    graphic.fillOval(f2 + 640, y4 - 100, d1, d1);
                    graphic.fillOval(f2 + 640, d4 - 100, d1, d1);
                    graphic.fillOval(a5 + 640, b5 - 100, d1, d1);
                    graphic.fillOval(x2 + 640, b5 - 100, d1, d1);
                    graphic.fillOval(e5 + 640, m3 - 100, d1, d1);
                    graphic.fillOval(e5 + 640, y3 - 100, d1, d1);
                    graphic.fillOval(h5 + 640, m3 - 100, d1, d1);
                    graphic.fillOval(h5 + 640, y3 - 100, d1, d1);
                    graphic.drawLine(744, 60, 744, 120);
                
            int poly_x1[]={200+(int)(scale*200),200
                            + (int) (scale * 200),170
                                            + (int) (scale * 170),180 + (int) (scale * 180),160
                                            + (int) (scale * 160),160 + (int) (scale * 160),180 + (int) (scale * 180),485
                                            + (int) (scale * 485),480 + (int) (scale * 480),480 + (int) (scale * 480),460 + (int) (scale * 460),420
                                            + (int) (scale * 420),360 + (int) (scale * 360)};
            int poly_y1[]={150 + (int) (scale * 150),160
                            + (int) (scale * 160),175
                                            + (int) (scale * 175),185 + (int) (scale * 185),195
                                            + (int) (scale * 195),215 + (int) (scale * 215),235 + (int) (scale * 235),235
                                            + (int) (scale * 235),200 + (int) (scale * 200),185 + (int) (scale * 185),175 + (int) (scale * 175),170
                                            + (int) (scale * 170),145 + (int) (scale * 145)};
            int n1=13;
            
            graphic.fillPolygon(poly_x1,poly_y1,n1);
            graphic.setColor(Color.white);
            graphic.fillOval(220 + (int) (scale * 220), 205 + (int) (scale * 205), 45 + (int) (scale * 45),
                            45 + (int) (scale * 45));
            graphic.setColor(Color.black);
            graphic.fillOval(222 + (int) (scale * 222), 207 + (int) (scale * 207), 41 + (int) (scale * 41), 41
                            + (int) (scale * 41));
            graphic.setColor(Color.white);
            graphic.fillOval(370 + (int) (scale * 370), 205 + (int) (scale * 205), 45 + (int) (scale * 45), 45
                            + (int) (scale * 45));
            graphic.setColor(Color.black);
            graphic.fillOval(372 + (int) (scale * 372), 207 + (int) (scale * 207), 41 + (int) (scale * 41), 41
                            + (int) (scale * 41));
           graphic.setColor(Color.WHITE);
           int poly_x2[]={220 + (int) (scale * 220),240 + (int) (scale * 240),280 + (int) (scale * 280),280
                           + (int) (scale * 280)};
           int poly_y2[] = { 170 + (int) (scale * 170), 150 + (int) (scale * 150), 150 + (int) (scale * 150), 170
                           + (int) (scale * 170) };
            int n2=4;
            int poly_x3[] = { 260 + (int) (scale * 260), 280 + (int) (scale * 280), 320 + (int) (scale * 320), 320
                            + (int) (scale * 320) };
            int poly_x4[]={330 + (int) (scale * 330),330 + (int) (scale * 330),350 + (int) (scale * 350),370
                            + (int) (scale * 370)};
            int poly_y4[]={170 + (int) (scale * 170),150 + (int) (scale * 150),150 + (int) (scale * 150),170
                            + (int) (scale * 170)};
           graphic.fillPolygon(poly_x2, poly_y2, n2);
           graphic.fillPolygon(poly_x3, poly_y2, n2);
           graphic.fillPolygon(poly_x4, poly_y4, n2);
                vehicleFeature = " *Vehicle Feature:* SUV \n";
               
            }

            customerName = " Customer Name: " + itsCustomerName.getText() + "\n";
            debitCard = " Credit Card: " + itsCreditCard.getText() + "\n";
            daysrented = Integer.parseInt (itsDaysRented.getText());
            //calculating renting cost for the given days
            rentingCost = (double)daysrented * PRICE_PER_DAY;
            startingDate  = " Starting Date: " +(String)itsStartMonth.getSelectedItem() 
                + "/" + (String)itsStartDay.getSelectedItem() 
                + "/" + (String)itsStartHour.getSelectedItem()+";"; 
            finalDate  = " Final Date: " + (String)itsEndMonth.getSelectedItem() 
                + "/" + (String)itsEndDay.getSelectedItem() 
                + "/" + (String)itsEndHour.getSelectedItem() + ".\n";
            output.setText(customerName + debitCard + vehicleFeature
                      + startingDate + finalDate + " Renting Cost: " + rentingCost +"\n\n");
            output.setEditable(false);        
        } 
        //reseting buttton
        else if (e.getSource() == reset) 
        { 
            String def = ""; 
            itsCustomerName.setText(def); 
            itsCreditCard.setText(def); 
            output.setText(def); 
            itsStartMonth.setSelectedIndex(0); 
            itsStartDay.setSelectedIndex(0); 
            itsStartHour.setSelectedIndex(0);
            itsEndMonth.setSelectedIndex(0); 
            itsEndDay.setSelectedIndex(0); 
            itsEndHour.setSelectedIndex(0);
            //a graphic "clear" to reset the previous car
            Graphics res = displayCar.getGraphics();
            res.setColor(Color.white);
            
            res.fillRect(0,0,980,490);
        } 
    } 
} 
  
// Driver Code with the main method. 
class CarRentol { 
  
    public static void main(String[] args) throws Exception 
    { 
        CarRentalView rent = new CarRentalView();
    } 
} 
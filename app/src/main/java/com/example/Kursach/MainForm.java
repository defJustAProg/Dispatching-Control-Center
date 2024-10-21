/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.example.Kursach;
import com.example.Kursach.App.EnergyObject;
import static com.example.Kursach.App.energyObjects;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;
/**
 *
 * @author Admin
 */
public class MainForm extends javax.swing.JFrame {

    /**
     * Creates new form MainForm
     */
    public short powerValue;
    public short frequencyValue;
    public String gresPATH;
    public String gesPATH;
    public String vesPATH;
    public String gresOrangePATH;
    public String gesOrangePATH;
    public String vesOrangePATH;
    
    public static Map<String, JLabel> labelMap = new HashMap<>();
    
    public MainForm(App.EnergyObject[] energyObjects) {
        
        
        
        
        
        powerValue = 0;
        frequencyValue = 0;
        gresPATH = "file:///C:/Users/Admin/Documents/NetBeansProjects/Kursach/app/src/main/resources/gres.png";
        gesPATH = "file:///C:/Users/Admin/Documents/NetBeansProjects/Kursach/app/src/main/resources/ges.png";
        vesPATH = "file:///C:/Users/Admin/Documents/NetBeansProjects/Kursach/app/src/main/resources/ves.png";
        gresOrangePATH = "file:///C:/Users/Admin/Documents/NetBeansProjects/Kursach/app/src/main/resources/gres-orange.png";
        gesOrangePATH = "file:///C:/Users/Admin/Documents/NetBeansProjects/Kursach/app/src/main/resources/ges-orange.png";
        vesOrangePATH = "file:///C:/Users/Admin/Documents/NetBeansProjects/Kursach/app/src/main/resources/ves-orange.png"; 
        initComponents();
        
        labelMap.put("kagaGES_MAP", kagaGES_MAP);
        labelMap.put("avzyanGES_MAP", avzyanGES_MAP);
        labelMap.put("karlamanGRES_MAP", karlamanGRES_MAP);
        labelMap.put("mechetlinGES_MAP", mechetlinGES_MAP);
        labelMap.put("newsterCHP_MAP", newsterCHP_MAP);
        labelMap.put("pavlovGES_MAP", pavlovGES_MAP);
        labelMap.put("priufimCHP_MAP", priufimCHP_MAP);
        labelMap.put("salavatCHP_MAP", salavatCHP_MAP);
        labelMap.put("sibayGCHP_MAP", sibayGCHP_MAP);
        labelMap.put("slakGES_MAP", slakGES_MAP);
        labelMap.put("sterCHP_MAP", sterCHP_MAP);
        labelMap.put("tupkilWPP_MAP", tupkilWPP_MAP);
        labelMap.put("ufimCHP_1_MAP", ufimCHP_1_MAP);
        labelMap.put("ufimCHP_2_MAP", ufimCHP_2_MAP);
        labelMap.put("ufimCHP_3_MAP", ufimCHP_3_MAP);
        labelMap.put("ufimCHP_4_MAP", ufimCHP_4_MAP);
        labelMap.put("umaguzGES_MAP", umaguzGES_MAP);
        labelMap.put("uzanGES_MAP", uzanGES_MAP);
        labelMap.put("zatonCHP_MAP", zatonCHP_MAP);
        labelMap.put("zauralCHP_MAP", zauralCHP_MAP);
        
        labelMap.put("kagaGES", kagaGES);
        labelMap.put("avzyanGES", avzyanGES);
        labelMap.put("karlamanGRES", karlamanGRES);
        labelMap.put("mechetlinGES", mechetlinGES);
        labelMap.put("newsterCHP", newsterCHP);
        labelMap.put("pavlovGES", pavlovGES);
        labelMap.put("priufimCHP", priufimCHP);
        labelMap.put("salavatCHP", salavatCHP);
        labelMap.put("sibayGCHP", sibayGCHP);
        labelMap.put("slakGES", slakGES);
        labelMap.put("sterCHP", sterCHP);
        labelMap.put("tupkilWPP", tupkilWPP);
        labelMap.put("ufimCHP_1", ufimCHP_1);
        labelMap.put("ufimCHP_2", ufimCHP_2);
        labelMap.put("ufimCHP_3", ufimCHP_3);
        labelMap.put("ufimCHP_4", ufimCHP_4);
        labelMap.put("umaguzGES", umaguzGES);
        labelMap.put("uzanGES", uzanGES);
        labelMap.put("zatonCHP", zatonCHP);
        labelMap.put("zauralCHP", zauralCHP);
        
        initObjectsOnMap();
    }
    
    private void initObjectsOnMap(){
        short count = 0;
        String PATH = "";
        for(Map.Entry<String, JLabel> entry : labelMap.entrySet()){
            if(entry.getKey().endsWith("_MAP")){
                for(EnergyObject mapObject: energyObjects){
                    if(mapObject.programmNameOnMap.equals(entry.getKey())){
                        if(mapObject.type.equals("ges"))
                            PATH = "file:///C:/Users/Admin/Documents/NetBeansProjects/Kursach/app/src/main/resources/ges.png";
                        else if(mapObject.type.equals("gres"))
                            PATH = "file:///C:/Users/Admin/Documents/NetBeansProjects/Kursach/app/src/main/resources/gres.png";
                        else if(mapObject.type.equals("ves"))
                            PATH = "file:///C:/Users/Admin/Documents/NetBeansProjects/Kursach/app/src/main/resources/ves.png";
                        entry.getValue().setText("<html><body>"
                            + "<table style='border-collapse: collapse;'>"
                            + "<tr>"
                            + "<td style='vertical-align: middle;'><img src='" + PATH + "' width='30' height='30' /></td>" // Указываем размеры изображения
                            + "<td style='vertical-align: middle; padding-left: 0px;'>"
                            + "<span style='font-size:8px; font-weight:bold;'>P:"+powerValue+" MWt</span><br/>" // Первая строка текста
                            + "<span style='font-size:8px;'>f: "+frequencyValue+" Hz</span>" // Вторая строка текста
                            + "</td>"
                            + "</tr>"
                            + "</table>"
                            + "</body></html>");
                    }
                }
            }
        }        
    }
    
    private JPanel getInformationPanel(EnergyObject object){
        JPanel panel = new javax.swing.JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        JLabel label = new JLabel(object.description);
        panel.add(label);
        JButton button1 = new JButton("Отключить");
        
        button1.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            // Действие при нажатии кнопки "Отключить"
            
            }
        });
        
        JButton button2 = new JButton("Подключить");
        
        button2.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            // Действие при нажатии кнопки "Подключить"
            
            }
        });
        
        panel.add(button1);
        panel.add(button2);
        return panel;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        MAPJlabel = new javax.swing.JLabel();
        avzyanGES_MAP = new javax.swing.JLabel();
        kagaGES_MAP = new javax.swing.JLabel();
        karlamanGRES_MAP = new javax.swing.JLabel();
        mechetlinGES_MAP = new javax.swing.JLabel();
        newsterCHP_MAP = new javax.swing.JLabel();
        pavlovGES_MAP = new javax.swing.JLabel();
        priufimCHP_MAP = new javax.swing.JLabel();
        salavatCHP_MAP = new javax.swing.JLabel();
        sibayGCHP_MAP = new javax.swing.JLabel();
        slakGES_MAP = new javax.swing.JLabel();
        sterCHP_MAP = new javax.swing.JLabel();
        tupkilWPP_MAP = new javax.swing.JLabel();
        ufimCHP_1_MAP = new javax.swing.JLabel();
        ufimCHP_2_MAP = new javax.swing.JLabel();
        ufimCHP_3_MAP = new javax.swing.JLabel();
        ufimCHP_4_MAP = new javax.swing.JLabel();
        umaguzGES_MAP = new javax.swing.JLabel();
        uzanGES_MAP = new javax.swing.JLabel();
        zatonCHP_MAP = new javax.swing.JLabel();
        zauralCHP_MAP = new javax.swing.JLabel();
        label1 = new java.awt.Label();
        jPanel2 = new javax.swing.JPanel();
        controllerPanel = new javax.swing.JPanel();
        prosessControlPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        frequencyControlPanel = new javax.swing.JPanel();
        frequencies = new javax.swing.JPanel();
        karlamanGRES = new javax.swing.JLabel();
        mechetlinGES = new javax.swing.JLabel();
        pavlovGES = new javax.swing.JLabel();
        priufimCHP = new javax.swing.JLabel();
        ufimCHP_3 = new javax.swing.JLabel();
        tupkilWPP = new javax.swing.JLabel();
        zatonCHP = new javax.swing.JLabel();
        ufimCHP_2 = new javax.swing.JLabel();
        ufimCHP_4 = new javax.swing.JLabel();
        ufimCHP_1 = new javax.swing.JLabel();
        slakGES = new javax.swing.JLabel();
        newsterCHP = new javax.swing.JLabel();
        sterCHP = new javax.swing.JLabel();
        avzyanGES = new javax.swing.JLabel();
        kagaGES = new javax.swing.JLabel();
        uzanGES = new javax.swing.JLabel();
        salavatCHP = new javax.swing.JLabel();
        umaguzGES = new javax.swing.JLabel();
        zauralCHP = new javax.swing.JLabel();
        sibayGCHP = new javax.swing.JLabel();
        frecquenciesLabel = new javax.swing.JLabel();
        informationPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(MAXIMIZED_BOTH);
        getContentPane().setLayout(new java.awt.GridLayout(1, 2, 30, 0));

        jPanel1.setLayout(new java.awt.BorderLayout(10, 10));

        jLayeredPane1.setPreferredSize(new java.awt.Dimension(733, 930));

        MAPJlabel.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        ImageIcon imageIcon = new ImageIcon("C:\\Users\\Admin\\Documents\\NetBeansProjects\\Kursach\\app\\src\\main\\resources\\Bashkortostan.png");
        MAPJlabel.setIcon(imageIcon);

        avzyanGES_MAP.setText("jLabel4");
        avzyanGES_MAP.setPreferredSize(new java.awt.Dimension(150, 50));
        avzyanGES_MAP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                avzyanGES_MAPMouseClicked(evt);
            }
        });

        kagaGES_MAP.setText("jLabel1");
        kagaGES_MAP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kagaGES_MAPMouseClicked(evt);
            }
        });

        karlamanGRES_MAP.setText("jLabel5");
        karlamanGRES_MAP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                karlamanGRES_MAPMouseClicked(evt);
            }
        });

        mechetlinGES_MAP.setText("jLabel5");
        mechetlinGES_MAP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mechetlinGES_MAPMouseClicked(evt);
            }
        });

        newsterCHP_MAP.setText("jLabel5");
        newsterCHP_MAP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                newsterCHP_MAPMouseClicked(evt);
            }
        });

        pavlovGES_MAP.setText("jLabel5");
        pavlovGES_MAP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pavlovGES_MAPMouseClicked(evt);
            }
        });

        priufimCHP_MAP.setText("jLabel5");
        priufimCHP_MAP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                priufimCHP_MAPMouseClicked(evt);
            }
        });

        salavatCHP_MAP.setText("jLabel5");
        salavatCHP_MAP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salavatCHP_MAPMouseClicked(evt);
            }
        });

        sibayGCHP_MAP.setText("jLabel5");
        sibayGCHP_MAP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sibayGCHP_MAPMouseClicked(evt);
            }
        });

        slakGES_MAP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                slakGES_MAPMouseClicked(evt);
            }
        });

        sterCHP_MAP.setText("jLabel5");
        sterCHP_MAP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sterCHP_MAPMouseClicked(evt);
            }
        });

        tupkilWPP_MAP.setText("jLabel5");
        tupkilWPP_MAP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tupkilWPP_MAPMouseClicked(evt);
            }
        });

        ufimCHP_1_MAP.setText("jLabel5");
        ufimCHP_1_MAP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ufimCHP_1_MAPMouseClicked(evt);
            }
        });

        ufimCHP_2_MAP.setText("jLabel5");
        ufimCHP_2_MAP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ufimCHP_2_MAPMouseClicked(evt);
            }
        });

        ufimCHP_3_MAP.setText("jLabel5");
        ufimCHP_3_MAP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ufimCHP_3_MAPMouseClicked(evt);
            }
        });

        ufimCHP_4_MAP.setText("jLabel5");
        ufimCHP_4_MAP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ufimCHP_4_MAPMouseClicked(evt);
            }
        });

        umaguzGES_MAP.setText("jLabel5");
        umaguzGES_MAP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                umaguzGES_MAPMouseClicked(evt);
            }
        });

        uzanGES_MAP.setText("jLabel5");
        uzanGES_MAP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                uzanGES_MAPMouseClicked(evt);
            }
        });

        zatonCHP_MAP.setText("jLabel5");
        zatonCHP_MAP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                zatonCHP_MAPMouseClicked(evt);
            }
        });

        zauralCHP_MAP.setText("jLabel5");
        zauralCHP_MAP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                zauralCHP_MAPMouseClicked(evt);
            }
        });

        jLayeredPane1.setLayer(MAPJlabel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(avzyanGES_MAP, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane1.setLayer(kagaGES_MAP, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane1.setLayer(karlamanGRES_MAP, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane1.setLayer(mechetlinGES_MAP, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane1.setLayer(newsterCHP_MAP, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane1.setLayer(pavlovGES_MAP, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane1.setLayer(priufimCHP_MAP, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane1.setLayer(salavatCHP_MAP, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane1.setLayer(sibayGCHP_MAP, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane1.setLayer(slakGES_MAP, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane1.setLayer(sterCHP_MAP, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane1.setLayer(tupkilWPP_MAP, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane1.setLayer(ufimCHP_1_MAP, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane1.setLayer(ufimCHP_2_MAP, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane1.setLayer(ufimCHP_3_MAP, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane1.setLayer(ufimCHP_4_MAP, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane1.setLayer(umaguzGES_MAP, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane1.setLayer(uzanGES_MAP, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane1.setLayer(zatonCHP_MAP, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane1.setLayer(zauralCHP_MAP, javax.swing.JLayeredPane.PALETTE_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(tupkilWPP_MAP, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(zatonCHP_MAP, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(ufimCHP_1_MAP, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addComponent(salavatCHP_MAP, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(63, 63, 63)
                                .addComponent(kagaGES_MAP, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(avzyanGES_MAP, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addComponent(slakGES_MAP, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(umaguzGES_MAP, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)
                                .addComponent(sibayGCHP_MAP, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGap(223, 223, 223)
                        .addComponent(ufimCHP_3_MAP, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(priufimCHP_MAP, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addComponent(ufimCHP_2_MAP, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(ufimCHP_4_MAP, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(newsterCHP_MAP, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(sterCHP_MAP, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(uzanGES_MAP, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGap(355, 355, 355)
                        .addComponent(zauralCHP_MAP, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addGap(347, 347, 347)
                                .addComponent(pavlovGES_MAP, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addGap(120, 120, 120)
                                .addComponent(karlamanGRES_MAP, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mechetlinGES_MAP, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(445, Short.MAX_VALUE))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                    .addContainerGap(33, Short.MAX_VALUE)
                    .addComponent(MAPJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 883, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(82, Short.MAX_VALUE)))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(karlamanGRES_MAP, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pavlovGES_MAP, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(mechetlinGES_MAP, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 183, Short.MAX_VALUE)
                        .addComponent(tupkilWPP_MAP, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ufimCHP_2_MAP, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addGap(138, 138, 138)
                                .addComponent(ufimCHP_1_MAP, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(priufimCHP_MAP, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ufimCHP_3_MAP, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addGap(154, 154, 154)
                                .addComponent(zatonCHP_MAP, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(29, 29, 29)
                        .addComponent(ufimCHP_4_MAP, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(slakGES_MAP, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(umaguzGES_MAP, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(zauralCHP_MAP, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sterCHP_MAP, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(uzanGES_MAP, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(newsterCHP_MAP, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(salavatCHP_MAP, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(kagaGES_MAP, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(avzyanGES_MAP, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sibayGCHP_MAP, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(338, Short.MAX_VALUE))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addComponent(MAPJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 751, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 227, Short.MAX_VALUE)))
        );

        jPanel1.add(jLayeredPane1, java.awt.BorderLayout.CENTER);

        label1.setAlignment(java.awt.Label.CENTER);
        label1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        label1.setText("Карта генерирующих мощностей");
        jPanel1.add(label1, java.awt.BorderLayout.NORTH);

        getContentPane().add(jPanel1);

        jPanel2.setLayout(new java.awt.GridLayout(2, 1, 20, 20));

        controllerPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Контроль"));
        controllerPanel.setLayout(new java.awt.GridLayout(1, 2, 20, 0));

        prosessControlPanel.setLayout(new java.awt.GridLayout(6, 1, 0, 10));

        jLabel2.setText("jLabel2");
        prosessControlPanel.add(jLabel2);

        jLabel3.setText("jLabel3");
        prosessControlPanel.add(jLabel3);

        jButton1.setText("Резерв");
        prosessControlPanel.add(jButton1);

        jButton2.setText("Сброс");
        prosessControlPanel.add(jButton2);

        jButton3.setText("Переток");
        prosessControlPanel.add(jButton3);

        jButton4.setText("График");
        prosessControlPanel.add(jButton4);

        controllerPanel.add(prosessControlPanel);

        frequencyControlPanel.setLayout(new java.awt.BorderLayout(15, 20));

        frequencies.setLayout(new java.awt.GridLayout(5, 4, 5, 15));

        karlamanGRES.setText("КрлмнГРЭС");
        frequencies.add(karlamanGRES);

        mechetlinGES.setText("МчтлнГЭС");
        frequencies.add(mechetlinGES);

        pavlovGES.setText("ПвлвскГЭС");
        frequencies.add(pavlovGES);

        priufimCHP.setText("ПриуфимТЭЦ");
        frequencies.add(priufimCHP);

        ufimCHP_3.setText("УфимТЭЦ-3");
        frequencies.add(ufimCHP_3);

        tupkilWPP.setText("ВЭС-Тюпкиль");
        frequencies.add(tupkilWPP);

        zatonCHP.setText("ЗатонТЭЦ");
        frequencies.add(zatonCHP);

        ufimCHP_2.setText("УфаТЭЦ-2");
        frequencies.add(ufimCHP_2);

        ufimCHP_4.setText("УфимТЭЦ-4");
        frequencies.add(ufimCHP_4);

        ufimCHP_1.setText("УфимТЭЦ-1");
        frequencies.add(ufimCHP_1);

        slakGES.setText("СлкскГЭС");
        frequencies.add(slakGES);

        newsterCHP.setText("Нов-СтерТЭЦ");
        frequencies.add(newsterCHP);

        sterCHP.setText("СтерТЭЦ");
        frequencies.add(sterCHP);

        avzyanGES.setText("АвзнГЭС");
        frequencies.add(avzyanGES);

        kagaGES.setText("КагаГЭС");
        frequencies.add(kagaGES);

        uzanGES.setText("УзянГЭС");
        frequencies.add(uzanGES);

        salavatCHP.setText("СлвтТЭЦ");
        frequencies.add(salavatCHP);

        umaguzGES.setText("ЮмгзГЭС");
        frequencies.add(umaguzGES);

        zauralCHP.setText("ЗауралТЭЦ");
        frequencies.add(zauralCHP);

        sibayGCHP.setText("СибайГТЭС");
        frequencies.add(sibayGCHP);

        frequencyControlPanel.add(frequencies, java.awt.BorderLayout.CENTER);

        frecquenciesLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        frecquenciesLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        frecquenciesLabel.setText("Контроль синхронизации");
        frequencyControlPanel.add(frecquenciesLabel, java.awt.BorderLayout.PAGE_START);

        controllerPanel.add(frequencyControlPanel);

        jPanel2.add(controllerPanel);

        informationPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Информация"));
        informationPanel.setLayout(new javax.swing.BoxLayout(informationPanel, javax.swing.BoxLayout.Y_AXIS));
        jPanel2.add(informationPanel);

        getContentPane().add(jPanel2);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void avzyanGES_MAPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_avzyanGES_MAPMouseClicked
        for(EnergyObject object: energyObjects){
            if(object.programmNameOnMap.equals(Thread.currentThread().getStackTrace()[1].getMethodName().replaceAll("(.*?MAP).*", "$1"))){
                this.informationPanel.removeAll();
                this.informationPanel.add(getInformationPanel(object));
                revalidate();
                repaint();
                break;
            }
        }
    }//GEN-LAST:event_avzyanGES_MAPMouseClicked

    private void kagaGES_MAPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kagaGES_MAPMouseClicked
        for(EnergyObject object: energyObjects){
            if(object.programmNameOnMap.equals(Thread.currentThread().getStackTrace()[1].getMethodName().replaceAll("(.*?MAP).*", "$1"))){
                this.informationPanel.removeAll();
                this.informationPanel.add(getInformationPanel(object));
                revalidate();
                repaint();
                break;
            }
        }
    }//GEN-LAST:event_kagaGES_MAPMouseClicked

    private void karlamanGRES_MAPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_karlamanGRES_MAPMouseClicked
        for(EnergyObject object: energyObjects){
            if(object.programmNameOnMap.equals(Thread.currentThread().getStackTrace()[1].getMethodName().replaceAll("(.*?MAP).*", "$1"))){
                this.informationPanel.removeAll();
                this.informationPanel.add(getInformationPanel(object));
                revalidate();
                repaint();
                break;
            }
        }
    }//GEN-LAST:event_karlamanGRES_MAPMouseClicked

    private void mechetlinGES_MAPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mechetlinGES_MAPMouseClicked
        for(EnergyObject object: energyObjects){
            if(object.programmNameOnMap.equals(Thread.currentThread().getStackTrace()[1].getMethodName().replaceAll("(.*?MAP).*", "$1"))){
                this.informationPanel.removeAll();
                this.informationPanel.add(getInformationPanel(object));
                revalidate();
                repaint();
                break;
            }
        }
    }//GEN-LAST:event_mechetlinGES_MAPMouseClicked

    private void newsterCHP_MAPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newsterCHP_MAPMouseClicked
        for(EnergyObject object: energyObjects){
            if(object.programmNameOnMap.equals(Thread.currentThread().getStackTrace()[1].getMethodName().replaceAll("(.*?MAP).*", "$1"))){
                this.informationPanel.removeAll();
                this.informationPanel.add(getInformationPanel(object));
                revalidate();
                repaint();
                break;
            }
        }
    }//GEN-LAST:event_newsterCHP_MAPMouseClicked

    private void pavlovGES_MAPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pavlovGES_MAPMouseClicked
        for(EnergyObject object: energyObjects){
            if(object.programmNameOnMap.equals(Thread.currentThread().getStackTrace()[1].getMethodName().replaceAll("(.*?MAP).*", "$1"))){
                this.informationPanel.removeAll();
                this.informationPanel.add(getInformationPanel(object));
                revalidate();
                repaint();
                break;
            }
        }
    }//GEN-LAST:event_pavlovGES_MAPMouseClicked

    private void priufimCHP_MAPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_priufimCHP_MAPMouseClicked
        for(EnergyObject object: energyObjects){
            if(object.programmNameOnMap.equals(Thread.currentThread().getStackTrace()[1].getMethodName().replaceAll("(.*?MAP).*", "$1"))){
                this.informationPanel.removeAll();
                this.informationPanel.add(getInformationPanel(object));
                revalidate();
                repaint();
                break;
            }
        }
    }//GEN-LAST:event_priufimCHP_MAPMouseClicked

    private void salavatCHP_MAPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salavatCHP_MAPMouseClicked
        for(EnergyObject object: energyObjects){
            if(object.programmNameOnMap.equals(Thread.currentThread().getStackTrace()[1].getMethodName().replaceAll("(.*?MAP).*", "$1"))){
                this.informationPanel.removeAll();
                this.informationPanel.add(getInformationPanel(object));
                revalidate();
                repaint();
                break;
            }
        }
    }//GEN-LAST:event_salavatCHP_MAPMouseClicked

    private void sibayGCHP_MAPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sibayGCHP_MAPMouseClicked
        for(EnergyObject object: energyObjects){
            if(object.programmNameOnMap.equals(Thread.currentThread().getStackTrace()[1].getMethodName().replaceAll("(.*?MAP).*", "$1"))){
                this.informationPanel.removeAll();
                this.informationPanel.add(getInformationPanel(object));
                revalidate();
                repaint();
                break;
            }
        }
    }//GEN-LAST:event_sibayGCHP_MAPMouseClicked

    private void slakGES_MAPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_slakGES_MAPMouseClicked
        for(EnergyObject object: energyObjects){
            if(object.programmNameOnMap.equals(Thread.currentThread().getStackTrace()[1].getMethodName().replaceAll("(.*?MAP).*", "$1"))){
                this.informationPanel.removeAll();
                this.informationPanel.add(getInformationPanel(object));
                revalidate();
                repaint();
                break;
            }
        }
    }//GEN-LAST:event_slakGES_MAPMouseClicked

    private void sterCHP_MAPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sterCHP_MAPMouseClicked
        for(EnergyObject object: energyObjects){
            if(object.programmNameOnMap.equals(Thread.currentThread().getStackTrace()[1].getMethodName().replaceAll("(.*?MAP).*", "$1"))){
                this.informationPanel.removeAll();
                this.informationPanel.add(getInformationPanel(object));
                revalidate();
                repaint();
                break;
            }
        }
    }//GEN-LAST:event_sterCHP_MAPMouseClicked

    private void tupkilWPP_MAPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tupkilWPP_MAPMouseClicked
        for(EnergyObject object: energyObjects){
            if(object.programmNameOnMap.equals(Thread.currentThread().getStackTrace()[1].getMethodName().replaceAll("(.*?MAP).*", "$1"))){
                this.informationPanel.removeAll();
                this.informationPanel.add(getInformationPanel(object));
                revalidate();
                repaint();
                break;
            }
        }
    }//GEN-LAST:event_tupkilWPP_MAPMouseClicked

    private void ufimCHP_1_MAPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ufimCHP_1_MAPMouseClicked
        for(EnergyObject object: energyObjects){
            if(object.programmNameOnMap.equals(Thread.currentThread().getStackTrace()[1].getMethodName().replaceAll("(.*?MAP).*", "$1"))){
                this.informationPanel.removeAll();
                this.informationPanel.add(getInformationPanel(object));
                revalidate();
                repaint();
                break;
            }
        }
    }//GEN-LAST:event_ufimCHP_1_MAPMouseClicked

    private void ufimCHP_2_MAPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ufimCHP_2_MAPMouseClicked
        for(EnergyObject object: energyObjects){
            if(object.programmNameOnMap.equals(Thread.currentThread().getStackTrace()[1].getMethodName().replaceAll("(.*?MAP).*", "$1"))){
                this.informationPanel.removeAll();
                this.informationPanel.add(getInformationPanel(object));
                revalidate();
                repaint();
                break;
            }
        }
    }//GEN-LAST:event_ufimCHP_2_MAPMouseClicked

    private void ufimCHP_3_MAPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ufimCHP_3_MAPMouseClicked
        for(EnergyObject object: energyObjects){
            if(object.programmNameOnMap.equals(Thread.currentThread().getStackTrace()[1].getMethodName().replaceAll("(.*?MAP).*", "$1"))){
                this.informationPanel.removeAll();
                this.informationPanel.add(getInformationPanel(object));
                revalidate();
                repaint();
                break;
            }
        }
    }//GEN-LAST:event_ufimCHP_3_MAPMouseClicked

    private void ufimCHP_4_MAPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ufimCHP_4_MAPMouseClicked
        for(EnergyObject object: energyObjects){
            if(object.programmNameOnMap.equals(Thread.currentThread().getStackTrace()[1].getMethodName().replaceAll("(.*?MAP).*", "$1"))){
                this.informationPanel.removeAll();
                this.informationPanel.add(getInformationPanel(object));
                revalidate();
                repaint();
                break;
            }
        }
    }//GEN-LAST:event_ufimCHP_4_MAPMouseClicked

    private void umaguzGES_MAPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_umaguzGES_MAPMouseClicked
        for(EnergyObject object: energyObjects){
            if(object.programmNameOnMap.equals(Thread.currentThread().getStackTrace()[1].getMethodName().replaceAll("(.*?MAP).*", "$1"))){
                this.informationPanel.removeAll();
                this.informationPanel.add(getInformationPanel(object));
                revalidate();
                repaint();
                break;
            }
        }
    }//GEN-LAST:event_umaguzGES_MAPMouseClicked

    private void uzanGES_MAPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_uzanGES_MAPMouseClicked
        for(EnergyObject object: energyObjects){
            if(object.programmNameOnMap.equals(Thread.currentThread().getStackTrace()[1].getMethodName().replaceAll("(.*?MAP).*", "$1"))){
                this.informationPanel.removeAll();
                this.informationPanel.add(getInformationPanel(object));
                revalidate();
                repaint();
                break;
            }
        }
    }//GEN-LAST:event_uzanGES_MAPMouseClicked

    private void zatonCHP_MAPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_zatonCHP_MAPMouseClicked
        for(EnergyObject object: energyObjects){
            if(object.programmNameOnMap.equals(Thread.currentThread().getStackTrace()[1].getMethodName().replaceAll("(.*?MAP).*", "$1"))){
                this.informationPanel.removeAll();
                this.informationPanel.add(getInformationPanel(object));
                revalidate();
                repaint();
                break;
            }
        }
    }//GEN-LAST:event_zatonCHP_MAPMouseClicked

    private void zauralCHP_MAPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_zauralCHP_MAPMouseClicked
        for(EnergyObject object: energyObjects){
            if(object.programmNameOnMap.equals(Thread.currentThread().getStackTrace()[1].getMethodName().replaceAll("(.*?MAP).*", "$1"))){
                this.informationPanel.removeAll();
                this.informationPanel.add(getInformationPanel(object));
                revalidate();
                repaint();
                break;
            }
        }
    }//GEN-LAST:event_zauralCHP_MAPMouseClicked

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel MAPJlabel;
    public javax.swing.JLabel avzyanGES;
    private javax.swing.JLabel avzyanGES_MAP;
    private javax.swing.JPanel controllerPanel;
    private javax.swing.JLabel frecquenciesLabel;
    private javax.swing.JPanel frequencies;
    private javax.swing.JPanel frequencyControlPanel;
    private javax.swing.JPanel informationPanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JLabel kagaGES;
    private javax.swing.JLabel kagaGES_MAP;
    public javax.swing.JLabel karlamanGRES;
    private javax.swing.JLabel karlamanGRES_MAP;
    private java.awt.Label label1;
    public javax.swing.JLabel mechetlinGES;
    private javax.swing.JLabel mechetlinGES_MAP;
    public javax.swing.JLabel newsterCHP;
    private javax.swing.JLabel newsterCHP_MAP;
    public javax.swing.JLabel pavlovGES;
    private javax.swing.JLabel pavlovGES_MAP;
    public javax.swing.JLabel priufimCHP;
    private javax.swing.JLabel priufimCHP_MAP;
    private javax.swing.JPanel prosessControlPanel;
    public javax.swing.JLabel salavatCHP;
    private javax.swing.JLabel salavatCHP_MAP;
    public javax.swing.JLabel sibayGCHP;
    private javax.swing.JLabel sibayGCHP_MAP;
    public javax.swing.JLabel slakGES;
    private javax.swing.JLabel slakGES_MAP;
    public javax.swing.JLabel sterCHP;
    private javax.swing.JLabel sterCHP_MAP;
    public javax.swing.JLabel tupkilWPP;
    private javax.swing.JLabel tupkilWPP_MAP;
    public javax.swing.JLabel ufimCHP_1;
    private javax.swing.JLabel ufimCHP_1_MAP;
    public javax.swing.JLabel ufimCHP_2;
    private javax.swing.JLabel ufimCHP_2_MAP;
    public javax.swing.JLabel ufimCHP_3;
    private javax.swing.JLabel ufimCHP_3_MAP;
    public javax.swing.JLabel ufimCHP_4;
    private javax.swing.JLabel ufimCHP_4_MAP;
    public javax.swing.JLabel umaguzGES;
    private javax.swing.JLabel umaguzGES_MAP;
    public javax.swing.JLabel uzanGES;
    private javax.swing.JLabel uzanGES_MAP;
    public javax.swing.JLabel zatonCHP;
    private javax.swing.JLabel zatonCHP_MAP;
    public javax.swing.JLabel zauralCHP;
    private javax.swing.JLabel zauralCHP_MAP;
    // End of variables declaration//GEN-END:variables
}

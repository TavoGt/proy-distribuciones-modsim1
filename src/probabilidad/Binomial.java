/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package probabilidad;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.text.DecimalFormat;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

/**
 *
 * @author TAVO
 */
public class Binomial extends javax.swing.JFrame {

    int nExitos = 0;
    double resultTotal = 0;
    double[][] arreglo;
    int poblacion = 0;
    int nMuestra = 0;
    double media = 0;
    double desviacion = 0;
    double pExito = 0;
    int nExitosMayor=0;

    /**
     * Creates new form Ventana
     */
    public Binomial() {
        initComponents();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        this.setDefaultCloseOperation(HIDE_ON_CLOSE);
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNMuestra = new javax.swing.JTextField();
        txtNExitos = new javax.swing.JTextField();
        txtPExito = new javax.swing.JTextField();
        txtExitosMayor = new javax.swing.JTextField();
        btnCalcular = new javax.swing.JButton();
        lblResultado = new javax.swing.JLabel();
        txtResultado = new javax.swing.JTextField();
        btnGraficar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtMedia = new javax.swing.JTextField();
        txtDesviacion = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtPoblacion = new javax.swing.JTextField();
        lblPoblacion = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtMediana = new javax.swing.JTextField();
        txtFactorCorreccion = new javax.swing.JTextField();
        txtCurtosis = new javax.swing.JTextField();
        txtSesgo = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lblPoblacion1 = new javax.swing.JLabel();
        lblFormaGrafica = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(17, 17, 17));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 204, 0), new java.awt.Color(0, 204, 0)));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Numero de muestra:");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Numero inicial de éxitos:");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Probabilidad de éxito:");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Numero final de éxitos:");

        txtNMuestra.setBackground(new java.awt.Color(76, 76, 76));
        txtNMuestra.setForeground(new java.awt.Color(255, 255, 255));

        txtNExitos.setBackground(new java.awt.Color(76, 76, 76));
        txtNExitos.setForeground(new java.awt.Color(255, 255, 255));

        txtPExito.setBackground(new java.awt.Color(76, 76, 76));
        txtPExito.setForeground(new java.awt.Color(255, 255, 255));

        txtExitosMayor.setBackground(new java.awt.Color(76, 76, 76));
        txtExitosMayor.setForeground(new java.awt.Color(255, 255, 255));

        btnCalcular.setBackground(new java.awt.Color(0, 102, 102));
        btnCalcular.setForeground(new java.awt.Color(255, 255, 255));
        btnCalcular.setText("CALCULAR");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        lblResultado.setForeground(new java.awt.Color(255, 255, 255));
        lblResultado.setText("RESULTADO:");

        txtResultado.setEditable(false);
        txtResultado.setBackground(new java.awt.Color(76, 76, 76));
        txtResultado.setForeground(new java.awt.Color(255, 255, 255));

        btnGraficar.setBackground(new java.awt.Color(0, 102, 102));
        btnGraficar.setForeground(new java.awt.Color(255, 255, 255));
        btnGraficar.setText("GRAFICAR");
        btnGraficar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGraficarActionPerformed(evt);
            }
        });

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("MEDIA:");

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("DESVIACIÓN:");

        txtMedia.setBackground(new java.awt.Color(76, 76, 76));
        txtMedia.setForeground(new java.awt.Color(255, 255, 255));

        txtDesviacion.setBackground(new java.awt.Color(76, 76, 76));
        txtDesviacion.setForeground(new java.awt.Color(255, 255, 255));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("POBLACION:");

        txtPoblacion.setBackground(new java.awt.Color(76, 76, 76));
        txtPoblacion.setForeground(new java.awt.Color(255, 255, 255));

        lblPoblacion.setForeground(new java.awt.Color(204, 0, 0));

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("MEDIANA:");

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("FACTOR CORRECCION:");

        txtMediana.setBackground(new java.awt.Color(76, 76, 76));
        txtMediana.setForeground(new java.awt.Color(255, 255, 255));

        txtFactorCorreccion.setBackground(new java.awt.Color(76, 76, 76));
        txtFactorCorreccion.setForeground(new java.awt.Color(255, 255, 255));

        txtCurtosis.setBackground(new java.awt.Color(76, 76, 76));
        txtCurtosis.setForeground(new java.awt.Color(255, 255, 255));

        txtSesgo.setBackground(new java.awt.Color(76, 76, 76));
        txtSesgo.setForeground(new java.awt.Color(255, 255, 255));

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("CURTOSIS:");

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("SESGO:");

        lblPoblacion1.setForeground(new java.awt.Color(204, 0, 0));

        lblFormaGrafica.setForeground(new java.awt.Color(204, 0, 0));

        jLabel13.setFont(new java.awt.Font("Georgia", 0, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("DISTRIBUCIÓN DE BINOMIAL");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(lblResultado)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCurtosis, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtResultado)
                                .addComponent(txtMedia)
                                .addComponent(txtDesviacion)
                                .addComponent(txtMediana)
                                .addComponent(txtFactorCorreccion)
                                .addComponent(txtSesgo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblPoblacion1, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                            .addComponent(lblPoblacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblFormaGrafica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtNMuestra, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtPExito, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtExitosMayor, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtNExitos, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(60, 60, 60)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPoblacion, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnGraficar, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(jLabel13)))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNMuestra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txtPoblacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPExito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNExitos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtExitosMayor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnGraficar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblResultado)
                            .addComponent(txtResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtMedia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(txtDesviacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFactorCorreccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(lblFormaGrafica, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMediana, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSesgo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCurtosis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(49, 49, 49))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(lblPoblacion, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblPoblacion1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        resultTotal = 0;
        txtResultado.setText("");
        double resultTmp = 0;
        int rango = 0;
        nMuestra = Integer.parseInt(txtNMuestra.getText()); //n
        //pExito = Double.parseDouble(txtPExito.getText()); //p
        double pFracaso = 1 - pExito; //q
        double mediana = 0;
        

        if (!"".equals(txtNExitos.getText())) {
            pExito = Double.parseDouble(txtPExito.getText()); //p
            nExitos = Integer.parseInt(txtNExitos.getText()); //x
            //double pFracaso = Double.parseDouble(txtPFracaso.getText()); //q
            
            if ("".equals(txtExitosMayor.getText())) {
                resultTotal = calcularProbabilidad(nMuestra, nExitos, pExito, pFracaso);
            } else {
                nExitosMayor = Integer.parseInt(txtExitosMayor.getText());
                rango = nExitosMayor - nExitos;
                arreglo = new double[rango + 1][2];
                for (int i = nExitos; i <= nExitosMayor; i++) {
                    resultTmp = calcularProbabilidad(nMuestra, i, pExito, pFracaso);
                    resultTotal += resultTmp;
                    arreglo[i - nExitos][0] = i;
                    arreglo[i - nExitos][1] = resultTmp;
                }
            }

            txtResultado.setText("" + resultTotal);
        }

        media = calcularMedia(nMuestra, pExito);
        txtMedia.setText("" + media);

        if ("".equals(txtPoblacion.getText())) { //Poblacion infinita
            desviacion = calcularDesvInfinita(nMuestra, pExito);
            //txtDesviacion.setText("");
            lblPoblacion.setText("POBLACIÓN INFINITA");
        } else {
            poblacion = Integer.parseInt(txtPoblacion.getText());
            if (((double)nMuestra / (double)poblacion) > 0.05) { //Poblacion infinita
                desviacion = calcularDesvInfinita(nMuestra, pExito);
                lblPoblacion.setText("POBLACIÓN INFINITA");
            } else { //Poblacion finita
                lblPoblacion.setText("POBLACIÓN FINITA");
                desviacion = factorCorreccion(poblacion, nMuestra) * calcularDesvInfinita(nMuestra, pExito);
                txtFactorCorreccion.setText("" + factorCorreccion(poblacion, nMuestra));
            }
        }
        
        mediana = calcularMediana(nExitos, nExitosMayor);
        txtDesviacion.setText("" + desviacion);
        txtSesgo.setText(""+ calcularSesgo(pExito, nMuestra));
        txtCurtosis.setText(""+ calcularCurtosis(pExito, nMuestra));
        
        txtMediana.setText(""+mediana);
        
        if(media < mediana){
            lblFormaGrafica.setText("SESGO NEGATIVO");
        }else if(media == mediana) {
            lblFormaGrafica.setText("SESGO NULO");
        }else{
            lblFormaGrafica.setText("SESGO POSITIVO");
        }
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void btnGraficarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGraficarActionPerformed
        if(!"".equals(txtResultado.getText())){
            try {
                graficar(arreglo);
            } catch (Exception e) {
            }
            
        }
    }//GEN-LAST:event_btnGraficarActionPerformed
    
    private double calcularProbabilidad(int nMuestra, int nExitos, double pExito, double pFracaso) {
        return (factorialN(nMuestra) * (Math.pow(pExito, nExitos)) * (Math.pow(pFracaso, nMuestra - nExitos)))
                / (factorialN(nExitos) * factorialN(nMuestra - nExitos));
    }

    private long factorialN(int n) {
        long factorial = 1;
        while (n != 0) {
            factorial = factorial * n;
            n--;
        }

        return factorial;
    }

    private double calcularMedia(int n, double p) {
        return n * p;
    }

    private double factorCorreccion(int N, int n) {
        return Math.sqrt(((double)N - n) / ((double)N - 1));
    }

    private double calcularDesvInfinita(int n, double p) {
        return Math.sqrt(n * p * (1 - p));
    }
    
    private double calcularSesgo(double p, int n){
        return ((1-p)-p)/(Math.sqrt(n*p*(1-p)));
    }
    
    private double calcularCurtosis(double p, int n){
        return 3+((1-6*p*(1-p))/Math.sqrt(n*p*(1-p)));
    }
    
    private double calcularMediana(int n1, int n2){
        int suma = 0;
        int cont = 0;
        for (int i = n1; i <= n2; i++) {
            suma += i;
            cont++;
        }
        
        return ((double)suma/(double)cont);
    }
    
    private void graficar(double[][] arr) {
        //JFreeChart chart = new ChartFactory.createPieDataset();
        XYSeries series = new XYSeries("Producto A");

        // Introduccion de datos
        //PROBABILIDAD DE EXITO
        for (int i = 0; i < arr.length; i++) {
            series.add(arr[i][0], arr[i][1]);
        }
        //series.add(x, y);
        //series.add(2, 6);
        //series.add(3, 3);
        //series.add(4, 10);

        //PROBABILIDAD DE FRACASO
        XYSeriesCollection dataset = new XYSeriesCollection();
        dataset.addSeries(series);

        JFreeChart chart = ChartFactory.createXYLineChart(
                "PROBABILIDAD BINOMIAL", // Título
                "Exitos (n)", // Etiqueta Coordenada X
                "Probabilidad de éxito", // Etiqueta Coordenada Y
                dataset, // Datos
                PlotOrientation.VERTICAL,
                true, // Muestra la leyenda de los productos (Producto A)
                false,
                false
        );

        ChartFrame frame = new ChartFrame("Ejemplo Grafica Lineal", chart);
        frame.pack();
        frame.setVisible(true);
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Binomial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Binomial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Binomial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Binomial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Binomial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnGraficar;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblFormaGrafica;
    private javax.swing.JLabel lblPoblacion;
    private javax.swing.JLabel lblPoblacion1;
    private javax.swing.JLabel lblResultado;
    private javax.swing.JTextField txtCurtosis;
    private javax.swing.JTextField txtDesviacion;
    private javax.swing.JTextField txtExitosMayor;
    private javax.swing.JTextField txtFactorCorreccion;
    private javax.swing.JTextField txtMedia;
    private javax.swing.JTextField txtMediana;
    private javax.swing.JTextField txtNExitos;
    private javax.swing.JTextField txtNMuestra;
    private javax.swing.JTextField txtPExito;
    private javax.swing.JTextField txtPoblacion;
    private javax.swing.JTextField txtResultado;
    private javax.swing.JTextField txtSesgo;
    // End of variables declaration//GEN-END:variables
}

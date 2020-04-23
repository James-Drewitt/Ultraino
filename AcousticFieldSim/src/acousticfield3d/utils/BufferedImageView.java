package acousticfield3d.utils;

import java.awt.Component;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;

/**
 *
 * @author Asier
 */
public class BufferedImageView extends javax.swing.JFrame {

    public static void showImage(String title, BufferedImage image, Component centeredOn){
        BufferedImageView biv = new BufferedImageView(title, image);
        biv.setLocationRelativeTo(centeredOn);
        biv.setVisible(true);
    }
    
    /** Creates new form BufferedImageView */
    public BufferedImageView(String title, BufferedImage image) {
        super(title);
        initComponents();
        label.setIcon( new ImageIcon(image));
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Image");

        jScrollPane1.setViewportView(label);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 467, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 336, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label;
    // End of variables declaration//GEN-END:variables

}

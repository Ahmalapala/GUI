import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Desktop;
import java.io.File;

public class MyFrame implements ActionListener{
    JButton btn;
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Specify a file to save");
        frame.setLocationRelativeTo(null); 
        frame.setLayout(new FlowLayout());

        JButton btn = new JButton("Upload file");
        btn.setFocusable(false);
        btn.addActionListener (new ActionListener(){
            public void actionPerformed(ActionEvent evt) {
                if(evt.getSource()==btn){
        
                    JFileChooser file_upload = new JFileChooser();
                    //file_upload.showOpenDialog(null);
                    //int response = file_upload.showOpenDialog(null);
                    int response_2 = file_upload.showSaveDialog(null);
        
                    if(response_2 == JFileChooser.APPROVE_OPTION){
                        File file_path = new File(file_upload.getSelectedFile().getAbsolutePath());
                        System.out.println(file_path);
                        try {
                            Desktop.getDesktop().open(file_path);
                          } catch (Exception e) {
                            e.printStackTrace();
                          }
                    }
                }
            }
        });

        frame.add(btn);

        frame.pack();
        frame.setVisible(true);    
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        
    }
    /*MyFrame(){

    }*/



}

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class MyFrame extends JFrame implements ActionListener{
    JButton btn;
    public static void main() {
        
    }
    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Demo");
        this.setLocationRelativeTo(null);
        this.setLayout(new FlowLayout());

        btn = new JButton("Upload file");
        btn.setFocusable(false);
        btn.addActionListener(this);

        this.add(btn);

        this.pack();
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent evt) {
        if(evt.getSource()==btn){

            JFileChooser file_upload = new JFileChooser();
            //file_upload.showOpenDialog(null);
            //int response = file_upload.showOpenDialog(null);
            int response_2 = file_upload.showSaveDialog(null);

            if(response_2 == JFileChooser.APPROVE_OPTION){
                File file_path = new File(file_upload.getSelectedFile().getAbsolutePath());
                System.out.println(file_path);
            }
        }
    }
}

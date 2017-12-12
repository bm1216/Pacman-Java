import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.WindowConstants;


public class Pacman {

  public Pacman() {
    initUI();
  }

  private void initUI() {
    JFrame jFrame = new JFrame();
    jFrame.add(new Board());

    jFrame.setTitle("Pacman");
    jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    jFrame.setSize(380, 420);
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
  }

  public static void main(String[] args) {
    EventQueue.invokeLater(Pacman::new);
  }

}

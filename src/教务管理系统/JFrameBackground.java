package �������ϵͳ;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
 
public class JFrameBackground {
 
 private JFrame frame = new JFrame("����ͼƬ����");
 
 public static void main(String[] args) {
  new JFrameBackground();
 }
 
 @SuppressWarnings("deprecation")
public JFrameBackground() {
	 ImageIcon background = new ImageIcon("src/team_twww_jwgl_image/1.jpg");// ����ͼƬ
  JLabel label = new JLabel(background);// �ѱ���ͼƬ��ʾ��һ����ǩ����
  // �ѱ�ǩ�Ĵ�Сλ������ΪͼƬ�պ�����������
  label.setBounds(0, 0, background.getIconWidth(),
    background.getIconHeight());
  // �����ݴ���ת��ΪJPanel���������÷���setOpaque()��ʹ���ݴ���͸��
  JPanel imagePanel = (JPanel) frame.getContentPane();
  imagePanel.setOpaque(false);
  // ���ݴ���Ĭ�ϵĲ��ֹ�����ΪBorderLayout
  //imagePanel.setLayout(new FlowLayout());
  //imagePanel.add(new JButton("���԰�ť"));
 frame.getLayeredPane().add(label, new Integer(Integer.MIN_VALUE));
  frame.getLayeredPane().setLayout(null);
  // �ѱ���ͼƬ��ӵ��ֲ㴰�����ײ���Ϊ����
  
  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  frame.setSize(402, 410);
  frame.setResizable(false);
  frame.setVisible(true);
 // frame:setAlwaysOnTop(true);
 }


}
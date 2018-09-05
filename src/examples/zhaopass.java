package examples;

import javax.swing.JOptionPane;

/**
 *
 * @author lileilei
 */
public class zhaopass extends javax.swing.JFrame {

    /**
     *用户忘记了自己的密码，需要输入用户名校验安全问题，通过邮箱后台找回
     */
    public zhaopass() {
        initComponents();
        String user= Readtext.read();
        String[] uStrings=user.split(",");
        if (uStrings.length>0) {
			textField1.setText(uStrings[0]);
		}
    }
    @SuppressWarnings("unchecked")
    private void initComponents() {
    	this.setTitle("找回密码");
        label1 = new java.awt.Label();
        textField1 = new java.awt.TextField();
        label2 = new java.awt.Label();
        textField2 = new java.awt.TextField();
        label3 = new java.awt.Label();
        textField3 = new java.awt.TextField();
        label4 = new java.awt.Label();
        textField4 = new java.awt.TextField();
        button1 = new java.awt.Button();
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        label1.setText("用户名");
        textField1.setText("textField1");
        textField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                textField1FocusLost(evt);
            }
        });
        label2.setText("安全问题");
        label3.setText("答案");
        label4.setText("邮箱");
        button1.setLabel("找回");
        button1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button1MouseClicked(evt);
            }
        });
        textField2.setEditable(false);
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textField1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textField2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(textField3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(textField4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap(154, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(label1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textField1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65)
                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(120, Short.MAX_VALUE))
        );
        pack();
    }
    //输入用户名后，光标离开用户名的栏目，就去后台数据去查询这个用户名是否存在，存在，则自动填充安全问题
    private void textField1FocusLost(java.awt.event.FocusEvent evt) {
    	Selectsql mysql=new Selectsql();
        String username=textField1.getText();
        if (username.length()<6) {
        	JOptionPane.showMessageDialog(null, "请检验你的用户名是否合法","找回失败",JOptionPane.ERROR_MESSAGE);
        }else {
			String sql="SELECT anwser,email,promble FROM `user` WHERE username='"+username+"';";
			String ziduan="promble";
			String shujuku=mysql.Chaxun(sql,ziduan);
			if (shujuku.equals("")) {
				JOptionPane.showMessageDialog(null, "请检验你的用户名是否存在","找回失败",JOptionPane.ERROR_MESSAGE);
			}else {
				textField2.setText(shujuku);
			}
		}
    }
    /*
     * 找回密码点击后，
     * 如果匹配成功，则后台会根据提供的邮箱发送一封邮件，带着最新生成的用户密码
     * 生成新的用户名密码可以直接登录
     */
    private void button1MouseClicked(java.awt.event.MouseEvent evt) {
    	Selectsql mysql=new Selectsql();
        String username=textField1.getText();
        String  anwser=textField3.getText();
        String  email=textField4.getText();
        String problme=textField2.getText();
        if (username.equals("")) {
        	JOptionPane.showMessageDialog(null, "用户名不能为空","找回失败",JOptionPane.ERROR_MESSAGE);
		}else if (anwser.equals("")) {
			JOptionPane.showMessageDialog(null, "安全问题的答案不能为空","找回失败",JOptionPane.ERROR_MESSAGE);
		}else if (email.equals("")) {
			JOptionPane.showMessageDialog(null, "邮箱不能为空","找回失败",JOptionPane.ERROR_MESSAGE);
		}else {
			String sql="SELECT * FROM `user` WHERE username='"+username+"' and email='"+email+"' AND promble='"+problme+"' AND anwser='"+anwser+"';";
			String ziduan="email";
			String shujuku=mysql.Chaxun(sql,ziduan);
			if (shujuku.equals("")) {
				JOptionPane.showMessageDialog(null, "答案或者邮箱与用户名不匹配","找回失败",JOptionPane.ERROR_MESSAGE);
			}else {
				JOptionPane.showMessageDialog(null, "请在邮箱查看重置之后的密码登录","找回成功",JOptionPane.ERROR_MESSAGE);
				this.setVisible(false);
				loginusername login_user=new loginusername();
				login_user.setVisible(true);
			}
		}
    }
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(zhaopass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(zhaopass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(zhaopass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(zhaopass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new zhaopass().setVisible(true);
            }
        });
    }
    private java.awt.Button button1;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.TextField textField1;
    private java.awt.TextField textField2;
    private java.awt.TextField textField3;
    private java.awt.TextField textField4;
}

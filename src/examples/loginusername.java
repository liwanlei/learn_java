package examples;
import java.awt.List;
import java.awt.event.MouseEvent;
import java.io.IOException;

import javax.swing.JOptionPane;
/*
 * @author lileilei
 */
public class loginusername extends javax.swing.JFrame {
    /**
     * Creates new form NewJFrame
     */
    public loginusername() {
        initComponents();
        String usernam=Readtext.read();
        String[] shuju=usernam.split(",");
        if (shuju.length==1){
        	username.setText(shuju[0].toString());
        }else if (shuju.length>1) {
			username.setText(shuju[0].toString());
			password.setText(shuju[1].toString());
			try {
				
			if (shuju[2].equals("1")) {
				remberpassword.setSelected(true);
			}
			if (shuju[3].equals("1")) {
				zidonglogin.setSelected(true);
			}
			}
         catch (Exception e) {
			// TODO: handle exception
		}
		}else {
			
		}
    }
    @SuppressWarnings("unchecked")
    private void initComponents() {
    	this.setTitle("登录");
        login = new java.awt.Button();
        username = new java.awt.TextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        reg = new javax.swing.JLabel();
        resetpassword = new javax.swing.JLabel();
        remberpassword = new javax.swing.JCheckBox();
        zidonglogin = new javax.swing.JCheckBox();
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        login.setBackground(new java.awt.Color(0, 153, 255));
        login.setLabel("安全登录");
        login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                try {
					loginMouseClicked(evt);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });
        jLabel1.setText("密码");
        jLabel2.setText("账号");
        reg.setText("注册账号");
        reg.addMouseListener(new java.awt.event.MouseAdapter() {
        	public void mouseClicked(java.awt.event.MouseEvent evt) {
        		regMouseClicked(evt);
        	}
        });
        resetpassword.setText("忘记");
        resetpassword.addMouseListener(new java.awt.event.MouseAdapter() {
        	public void mouseClicked(java.awt.event.MouseEvent evt) {
        		resetpasswordMouseClicked(evt);
        	}
        });
        remberpassword.setText("记住密码");
        remberpassword.setToolTipText("");
        zidonglogin.setText("自动登录");
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(username, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(password, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(remberpassword)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(zidonglogin))
                    .addComponent(login, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(resetpassword)
                    .addComponent(reg))
                .addContainerGap(94, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(reg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(username, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resetpassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(remberpassword)
                    .addComponent(zidonglogin))
                .addGap(22, 22, 22)
                .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(169, Short.MAX_VALUE))
        );

        resetpassword.getAccessibleContext().setAccessibleDescription("");
        pack();
    }// </editor-fold>//GEN-END:initComponents
    //注册界面的切换
    protected void regMouseClicked(MouseEvent evt) {
		this.setVisible(false);
		new reg().setVisible(true);
	}
	private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameActionPerformed

    private void remberpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_remberpasswordActionPerformed
        // TODO add your handling code here:
    }
    private void resetpasswordMouseClicked(java.awt.event.MouseEvent evt) {
        this.setVisible(false);
        zhaopass zhaopas=new zhaopass();
        zhaopas.setVisible(true);
    }
//登录按钮
    private void loginMouseClicked(java.awt.event.MouseEvent evt) throws IOException {
    	String  user_name=username.getText();
    	String  user_password=password.getText();
    	boolean remeber=remberpassword.isSelected();
    	boolean zidong=zidonglogin.isSelected();
    	if (user_name.length()==0) {
    		JOptionPane.showMessageDialog(null, "用户名不能为空","用户名不合法",JOptionPane.ERROR_MESSAGE);
    	}
    	else if (user_name.length()<6) {
    		JOptionPane.showMessageDialog(null, "用户名不能长度不能小于6","用户名不合法",JOptionPane.ERROR_MESSAGE);
    	}else if (user_name.length()>18) {
    		JOptionPane.showMessageDialog(null, "用户名不能长度不能长于18","用户名不合法",JOptionPane.ERROR_MESSAGE);
		}
    	else if (remeber==false && zidong==true) {
    		JOptionPane.showMessageDialog(null, "自动登录必须记住密码","自动登录",JOptionPane.ERROR_MESSAGE);
		}
    	else {
			if (user_password.length()==0) {
				JOptionPane.showMessageDialog(null, "密码不能为空","密码不合法",JOptionPane.ERROR_MESSAGE);
			}
			else if (user_password.length()<6) {
				JOptionPane.showMessageDialog(null, "密码不能小于6","密码不合法",JOptionPane.ERROR_MESSAGE);
			}else if (user_password.length()>18) {
				JOptionPane.showMessageDialog(null, "密码不能长于18","密码不合法",JOptionPane.ERROR_MESSAGE);
			}else {
				boolean return1=check(user_name,user_password);
				if (return1==true) {
					this.setVisible(false);
					shouye shouy = new shouye();
					shouy.setVisible(true);
					Readtext readtext=new Readtext();
					if(remeber ==true || zidong==true){
						String remeber1=user_name+","+password+","+"1,1";
						readtext.wirte(remeber1);
					}else {
						readtext.wirte(user_name);
					}
				}else {
					JOptionPane.showMessageDialog(null, "用户名或者密码错误","登录失败",JOptionPane.ERROR_MESSAGE);
				};
			}
		}
    }
//校验用户名密码
    private boolean check(String user_name, String user_password) {
    	Selectsql mysql=new Selectsql();
		String sql="SELECT password FROM `user` WHERE username='"+user_name+"';";
		String ziduan="password";
		String shujuku=mysql.Chaxun(sql,ziduan);
		Makemd5 m = new Makemd5();
		String mdString=m.getMD5Str(user_password);
		if (shujuku.equals("")) {
			return false;
		}
		else if (shujuku.equals(mdString)) {
			return true;
		} else {
			return false;
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
            java.util.logging.Logger.getLogger(loginusername.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loginusername.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loginusername.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loginusername.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loginusername().setVisible(true);
            }
        });
    }
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private java.awt.Button login;
    private javax.swing.JPasswordField password;
    private javax.swing.JLabel reg;
    private javax.swing.JCheckBox remberpassword;
    private javax.swing.JLabel resetpassword;
    private java.awt.TextField username;
    private javax.swing.JCheckBox zidonglogin;
}
/**
 * java版 monkey小工具
 */
package studay;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import javax.smartcardio.Card;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import sun.launcher.resources.launcher;

/**
 * @author lileilei
 *monkeytool.java
*2018年9月7日
 */
public class monkeytool {
	//界面
	public void jiemian() {
		Frame f=new Frame("雷子的monkey小工具--java版本");
		f.setVisible(true);
		f.setSize(712,474);
		f.setLocationRelativeTo(null);
		f.setResizable(false); 
		f.addWindowListener(new WindowAdapter() {
	            public void windowClosing(WindowEvent e) {
	                System.exit(0);
	            }
		  });
		 f.setLayout(new FlowLayout(FlowLayout.LEFT));
		Panel Carpane = new Panel();
		Panel ctro = new Panel();
		Panel title=new Panel();
		Panel rslu_all=new Panel();
		Panel monkey=new Panel();
		Panel event_monkey=new Panel();
		Panel even_moneky=new Panel();
		Panel suiji_mokery=new Panel();
		Panel eb_monkey=new Panel();
		Panel monkey_btn=new Panel();
		Button button=new Button("开始测试");
		Button monkey_button=new Button("启动monkey测试");
		monkey_btn.add(monkey_button,BorderLayout.CENTER);
		Label name=new Label("测试包名");
		TextField packname=new TextField(15);
		suiji_mokery.add(name,BorderLayout.WEST);
		suiji_mokery.add(packname,BorderLayout.WEST);
		Label zhong_num=new Label("随机事件数");
		TextField zhong_num_cell=new TextField(15);
		suiji_mokery.add(zhong_num,BorderLayout.WEST);
		suiji_mokery.add(zhong_num_cell,BorderLayout.WEST);
		Label jiange_time=new Label("间隔");
		JComboBox<Integer> jiange_times=new JComboBox<Integer>();
		jiange_times.addItem(500);
		jiange_times.addItem(1000);
		jiange_times.addItem(1500);
		suiji_mokery.add(jiange_time,BorderLayout.WEST);
		suiji_mokery.add(jiange_times,BorderLayout.WEST);
		Label nagive_event=new Label("导航事件百分比:");
		TextField nagive_event_num = new TextField(5);
		event_monkey.add(nagive_event, BorderLayout.WEST);
		event_monkey.add(nagive_event_num,BorderLayout.WEST);
		Label toche_event=new Label("触摸事件百分比:");
		TextField toch_event_num=new TextField(5);
		event_monkey.add(toche_event, BorderLayout.WEST);
		event_monkey.add(toch_event_num,BorderLayout.WEST);
		Label hua_event=new Label("滑动事件百分比:");
		TextField hua_event_num=new TextField(5);
		event_monkey.add(hua_event, BorderLayout.WEST);
		event_monkey.add(hua_event_num,BorderLayout.WEST);
		Label gui_event=new Label("轨迹球事件百分比:");
		TextField guiji_num=new TextField(5);
		even_moneky.add(gui_event, BorderLayout.WEST);
		even_moneky.add(guiji_num,BorderLayout.WEST);
		Label system_event=new Label("系统事件百分比:");
		TextField system_num=new TextField(5);
		even_moneky.add(system_event, BorderLayout.WEST);
		even_moneky.add(system_num,BorderLayout.WEST);
		Label activy_event=new Label("activity切换百分比:");
		TextField acticity=new TextField(5);
		even_moneky.add(activy_event, BorderLayout.WEST);
		even_moneky.add(acticity,BorderLayout.WEST);
		Label event_num=new Label("事件量:");
		TextField eve_num=new TextField(5);
		eb_monkey.add(event_num, BorderLayout.WEST);
		eb_monkey.add(eve_num,BorderLayout.WEST);
		Label log_path=new Label("日志路径：");
		TextField log_path_num=new TextField(15);
		eb_monkey.add(log_path, BorderLayout.WEST);
		eb_monkey.add(log_path_num,BorderLayout.WEST);
		Label monkey_label=new Label("monkey事件测试",Label.CENTER);
		monkey.add(monkey_label);
		TextArea textArea=new TextArea(15, 0);
		textArea.disable();
		TextField textField=new TextField(20);
		Label labeltitle=new Label("启动时间测试",Label.CENTER);
		title.add(labeltitle);
		Label label =new Label("packename");
		Label label2=new Label("Activity");
		Label num=new Label("次数");
		Label result=new Label("结果");
		Label xing=new Label("启动测试结果展示");
		TextField numtext=new TextField(20);
		TextField textField2=new TextField(20);
		ctro.add(button,BorderLayout.SOUTH);
		Carpane.add(label,BorderLayout.WEST);
		Carpane.add(textField,BorderLayout.WEST);
		Carpane.add(label2,BorderLayout.WEST);
		Carpane.add(textField2,BorderLayout.WEST);
		Carpane.add(num,BorderLayout.WEST);
		Carpane.add(numtext,BorderLayout.WEST);
		rslu_all.add(xing, BorderLayout.EAST);
		rslu_all.add(textArea,BorderLayout.EAST);
		f.add(title,BorderLayout.CENTER);
		f.add(Carpane, BorderLayout.CENTER);
		f.add(rslu_all, BorderLayout.AFTER_LAST_LINE);
		f.add(ctro, BorderLayout.CENTER);
		f.add(monkey,BorderLayout.CENTER);
		f.add(suiji_mokery, BorderLayout.CENTER);
		f.add(event_monkey, BorderLayout.CENTER);
		f.add(even_moneky,  BorderLayout.CENTER);
		f.add(eb_monkey, BorderLayout.CENTER);
		f.add(monkey_btn, BorderLayout.SOUTH);
		monkey_button.addMouseListener(new java.awt.event.MouseAdapter(){
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				String monkey_packname=packname.getText();
				String zhongzhi_num=zhong_num_cell.getText();
				int jiange=(int) jiange_times.getSelectedItem();
				String daohanmg=nagive_event_num.getText();
				String toch=toch_event_num.getText();
				String hudong=hua_event_num.getText();
				String guiji=guiji_num.getText();
				String system=system_num.getText();
				String activy=acticity.getText();
				String event=eve_num.getText();
				String path=log_path_num.getText();
				if (monkey_packname.isEmpty()) {
					JOptionPane.showMessageDialog(null,"包名不能为空");
				} else {
					if (zhongzhi_num.isEmpty()) {
						JOptionPane.showMessageDialog(null,"种子数不能为空");
					} else {
						try {
							int zhongzi=Integer.parseInt(zhongzhi_num);
							if (event.isEmpty()) {
								JOptionPane.showMessageDialog(null,"事件量不能为空");
								
							} else {
								try {
									int event_nu=Integer.parseInt(event);
									try {
										int daohang_num=Integer.parseInt(daohanmg);
										try {
											int touchu=Integer.parseInt(toch);
											try {
												int huadong=Integer.parseInt(hudong);
												try {
													int guijinum=Integer.parseInt(guiji);
													try {
														int xitong=Integer.parseInt(system);
														try {
															int aciti=Integer.parseInt(activy);
															int baifenbi=aciti+guijinum+xitong+huadong+touchu+daohang_num;
															if (baifenbi>100) {
																JOptionPane.showMessageDialog(null,"事件百分比最大为100%");
															} else {
																monkey_button.setEnabled(false);
																button.setEnabled(false);
																Monkey monkey2=new Monkey();
																List<String> f_rest = monkey2.excectmonkey(monkey_packname,zhongzhi_num,jiange,toch, guiji, system, activy,path,event,hudong,daohanmg);
																if (f_rest.equals(null)) {
																	JOptionPane.showMessageDialog(null,"monkey出错了");
																	monkey_button.setEnabled(true);
																	button.setEnabled(true);
																} else {
																	for (String string : f_rest) {
																		System.out.println(string);
																	}
																	JOptionPane.showMessageDialog(null,"monkey测试完成，测试日志路径："+path);
																	monkey_button.setEnabled(true);
																	button.setEnabled(true);
																}
															}
														} catch (Exception e) {
															JOptionPane.showMessageDialog(null,"activity事件百分比必须为正整数");
														}
													} catch (Exception e) {
														JOptionPane.showMessageDialog(null,"系统事件百分比必须为正整数");
													}
												} catch (Exception e) {
													JOptionPane.showMessageDialog(null,"轨迹球事件百分比必须为正整数");
												}
											} catch (Exception e) {
												JOptionPane.showMessageDialog(null,"滑动事件百分比必须为正整数");
											}
										} catch (Exception e) {
											JOptionPane.showMessageDialog(null,"触摸事件百分比必须为正整数");
										}
									} catch (Exception e) {
										JOptionPane.showMessageDialog(null,"导航事件百分比必须为正整数");
									}
								} catch (Exception e) {
									JOptionPane.showMessageDialog(null,"事件量必须为正整数");
								}
							}
						} catch (Exception e) {
							JOptionPane.showMessageDialog(null,"种子数必须为正整数");
						}
					}
				}
			}

			
		});
		button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
            	String packname = textField.getText();
        		String activity = textField2.getText();
        		String num=numtext.getText();
        		if (packname.length()<=0) {
        			JOptionPane.showMessageDialog(null,"包名不能为空");
        		}else {
        			if (activity.length()<=0) {
        				JOptionPane.showMessageDialog(null,"启动包名不能为空");
        			} else {
        				if (num.toString().equals("")) {
        					JOptionPane.showMessageDialog(null,"启动次数不能为空");
        				} else {
        					try {
        						int num_start=Integer.parseInt(num);
        						String cmd = "adb shell am start -W "+packname+"/"+activity;
        						String back="adb shell am force-stop "+packname;
        						for (int i = 0; i <num_start; i++) {
        							Monkey mo1=new Monkey();
        							List<String> resul_t = mo1.systemcmd(cmd,back);
        							if (resul_t.isEmpty()==true) {
        								JOptionPane.showMessageDialog(null,"执行异常,请检查你的环境");
        								break;
        							} else {
        								textArea.append(resul_t.get(0)+"\n");
        								button.setEnabled(false);
        								monkey_button.setEnabled(false);
        							}
        						}
        						button.setEnabled(true);
        						monkey_button.setEnabled(true);
        					} catch (Exception e2) {
        						JOptionPane.showMessageDialog(null,"启动次数应该是正整数");
        					}
        				}
        			}
        		}
                }
            });	
	}
	
	/**
	 * 1.把python实现的小工具，现在用java来实现
	 * 2.学习awt的包。掌握其使用
	 */
	public static void main(String[] args) {
		monkeytool bne=new monkeytool();
		bne.jiemian();
	}
	}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package specialpane;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JSplitPane;
import javax.swing.WindowConstants;

/**
 *
 * @author user
 */
public class SpecialPane {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame fr=new JFrame();
        fr.setSize(500,500);
        fr.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        JButton bt1=new JButton("1");
        JButton bt2=new JButton("2");
        JSplitPane jSplitPane=new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,bt1,bt2);
        jSplitPane.setOneTouchExpandable(true); //箭頭
        jSplitPane.setDividerLocation(400);//這行要work的話要先指定jsplitPane的大小,值為0~1之間實為左邊所佔的比例,值不在0~1時為絕對值(ex. 500乘80%=400,左邊佔80%)
        jSplitPane.setResizeWeight(0.6);
        fr.add(jSplitPane);
        fr.setVisible(true);
    }
    
}

package au.edu.usc.bict_explorer.rules;
import com.sun.glass.ui.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.scene.*;
import javafx.scene.control.Label;
import java.awt.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.net.URL;
import java.util.ResourceBundle;

public class ListCourses  {

    @FXML
    private Label l1;
    @FXML
    private Label l2;
    @FXML
    private Label l3;
    @FXML
    private Label l4;
    @FXML
    private Label l5;
    @FXML
    private Label l6;
    @FXML
    private Label l7;
    @FXML
    private Label l8;
    @FXML
    private Label l9;
    @FXML
    private Label l10;
    @FXML
    private Label t1;
    @FXML
    private Label t2;
    @FXML
    private Label t3;
    @FXML
    private Label t4;
    @FXML
    private Label t5;

    @FXML
    private void initialize()throws IOException {
        File file = new File("D:\\bict-explorer-USC-Sg080-master\\src\\au\\edu\\usc\\bict_explorer\\rules\\bict.txt");

        BufferedReader br = new BufferedReader(new FileReader(file));

        String st;
        int count =0;
        int flag=0,f2=0;
        StringTokenizer stoken ;
        while ((st = br.readLine()) != null){
            stoken = new StringTokenizer(st,"#");

            while (stoken.hasMoreElements()) {
                flag=0;
                    if(count==1) {
                        String st1 = stoken.nextToken();
                        l1.setText(st1);
                        t1.setText(st1);
                        flag=1;
                    }
                if(count==2) {
                    l2.setText(stoken.nextToken());
                    flag=1;
                }
                if(count==4) {
                    String st1 = stoken.nextToken();
                    l3.setText(st1);
                t2.setText(st1);
                    flag=1;
                }
                if(count==5) {
                    l4.setText(stoken.nextToken());
                    flag=1;
                }
                if(count==7) {
                    String st1 = stoken.nextToken();
                    l5.setText(st1);
                    t3.setText(st1);

                    flag=1;
                }
                if(count==8) {
                    l6.setText(stoken.nextToken());
                    flag=1;
                }
                if(count==10) {
                    String st1 = stoken.nextToken();

                    l7.setText(st1);
                    t4.setText(st1);
                    flag=1;
                }
                if(count==11) {
                    l8.setText(stoken.nextToken());
                    flag=1;
                }
                if(count==13) {
                    String st1 = stoken.nextToken();
                    l9.setText(st1);
                    t5.setText(st1);
                    flag=1;
                }
                if(count==14) {
                    l10.setText(stoken.nextToken());
                    flag=1;
                }


                    if(flag==0) {
                        stoken.nextToken();
                    }
                    count++;


            }

        }

    }

    public void readfile () throws IOException  {
     //   System.out.println("CALLLLLLLLLLLLLLLLLLLLL");

        File file = new File("D:\\bict-explorer-USC-Sg080-master\\src\\au\\edu\\usc\\bict_explorer\\rules\\bict.txt");

        BufferedReader br = new BufferedReader(new FileReader(file));

        String st;
        int count =0;
        StringTokenizer stoken ;
        while ((st = br.readLine()) != null){
            stoken = new StringTokenizer(st,"#");

              System.out.println(st);
        }
    }

}

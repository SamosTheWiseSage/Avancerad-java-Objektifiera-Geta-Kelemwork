import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import com.eclipsesource.json.*;

public class TrueGui extends JFrame {
    private JPanel panel;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JTextField textField6;
    private JTextField textField7;
    private JTextField textField8;
    private JTextField textField9;
    private JTextField textField10;
    private JTextField textField11;
    private JTextField textField12;
    private JTextField textField13;
    private JTextField textField14;
    private JTextField textField15;
    private JTextField textField16;
    private JTextField textField17;
    private JTextField textField18;
    private JTextField textField19;
    private JTextField textField20;
    private JTextField textField21;
    private JTextField textField22;
    private JTextField textField23;
    private JTextField textField24;
    private JTextField textField25;
    private JTextField textField26;
    private JTextField textField27;
    private JTextField textField28;
    private JTextField textField29;
    private JTextField textField30;
    private JTextField textField31;
    private JTextField textField32;
    private JTextField textField33;
    private JTextField textField34;
    private JTextField textField35;
    private JTextField textField36;
    private JTextField textField37;
    private JTextField textField38;
    private JTextField textField39;
    private JTextField textField40;
    private JTextField textField41;
    private JTextField textField42;
    private JTextField textField43;
    private JTextField textField44;
    private JTextField textField45;
    private JTextField textField46;
    private JTextField textField47;
    private JTextField textField48;
    private JTextField textField49;
    private JTextField textField50;
    private JTextField textField51;
    private JTextField textField52;
    private JTextField textField53;
    private JTextField textField54;
    private JTextField textField55;
    private JTextField textField56;
    private JTextField textField57;
    private JTextField textField58;
    private JTextField textField59;
    private JTextField textField60;
    private JTextField textField61;
    private JTextField textField62;
    private JTextField textField63;
    private JTextField textField64;

    public static ArrayList<String> aryL = new ArrayList<>();
    public static ArrayList<String> listArray = new ArrayList<>();
    public static Scanner sc;
    public static String url ="src/sample.json";
    public static JFileChooser j = new JFileChooser("src");
    private int amountOfCol = 0, amountOfRow = 0 ;

    TrueGui() {
        try {

            j.showOpenDialog(null);
            System.out.println(j.getSelectedFile().getPath());
            url = j.getSelectedFile().getPath();
        } catch (Exception e){
            System.out.println("no file buddy");
        }
        if (j.getSelectedFile().getPath().equals("/Users/samoswise/IdeaProjects/ObjektivAssignment/src/sample.json")) {
            //System.out.println("hello");
            try{
                File f = new File(url);
                sc = new Scanner(f);
                String page = "";
                while (sc.hasNext()) {
                    String line = sc.nextLine();
                    // System.out.println(line);
                    page+= line;
                    //System.out.println(line.length());
                }
                sc.close();
                JsonValue jv = Json.parse(page);
                JsonArray ja = jv.asArray();
                //JsonObject jo =  ja.get(0).asObject();
                //System.out.println(jo.names().size());
                for (int i = 0 ;  i < ja.size() -1; i++) {
                    // System.out.println(array[i]+"\n");
                    JsonObject j = ja.get(i).asObject();

                    ArrayList<String>alphabet = new ArrayList<>();
                    alphabet.add(String.valueOf(j.get("A")));
                    alphabet.add(String.valueOf(j.get("B")));
                    alphabet.add(String.valueOf(j.get("C")));
                    alphabet.add(String.valueOf(j.get("D")));
                    alphabet.add(String.valueOf(j.get("E")));
                    alphabet.add(String.valueOf(j.get("F")));
                    alphabet.add(String.valueOf(j.get("G")));
                    alphabet.add(String.valueOf(j.get("H")));
                    Collections.sort(alphabet);
                    listArray.addAll(alphabet);

                    //System.out.println(listArray);
                }
                panel.removeAll();
                panel= new JPanel();
                panel.setLayout(new GridLayout(44,8));
                setContentPane(panel);
                for (var s:
                        listArray) {
                    JTextField jt= new JTextField();
                    panel.add(jt);

                }
            }catch (Exception e){
                System.out.println("ERROR"+e.toString());
            }


            int i=0;
            for (Component jt : panel.getComponents()) {
                ((JTextField)jt).setText(listArray.get(i).replaceAll("\"", ""));
                i++;
            }}

        else {

            try{  System.out.println("hello hello this is me");
                File f = new File(url);
                sc = new Scanner(f);
                while (sc.hasNext()) {
                    String line = sc.nextLine();
                    String[] array = line.split(",", 8);
                    //  System.out.println(array[0]);
                    listArray.addAll(Arrays.asList(array));
                    // System.out.println(listArray);
                    //  System.out.println(line);

                }  int i=0;
                panel.removeAll();
                panel= new JPanel();
                panel.setLayout(new GridLayout(44,8));
                setContentPane(panel);
                for (var s:
                        listArray) {
                    JTextField jt= new JTextField();

                    panel.add(jt);

                }
                panel.setVisible(true);
                //-----------------------------------

                for (Component jt : panel.getComponents()) {
                    ((JTextField)jt).setText(listArray.get(i));
                    i++;
                }
            }catch (Exception e){
                System.out.println("ERROR"+e.toString());
            }

            sc.close();
        }

        // ska form aktivera
        setContentPane(panel);
        setTitle("test");
        setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

    }

    public static void main(String[] args) {

        new TrueGui();
    }
}

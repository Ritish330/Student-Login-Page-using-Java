import java.awt.*;

import javax.swing.JPasswordField;

public class LoginPage extends Frame {
    private Label lb1, lb2, lb3, lb4, lb5, lb6, lb7;
    JPasswordField t2;
    TextField t1;
    Button b1, b2;
    Choice branch;
    Panel p1, p2;
    private List sk;
    private CheckboxGroup cg;
    private Checkbox c1, c2, c3, c4, c5;

    public LoginPage() {
        lb1 = new Label(" LOGIN PAGE ");

        lb2 = new Label("User ID: ");
        t1 = new TextField(10);
        
        lb3 = new Label("Password");
        t2 = new JPasswordField(10);
        
        lb4 = new Label("Branch: ");

        lb5 = new Label("Skills: ");
        
        lb6 = new Label("Gender: ");
        
        lb7 = new Label("Hobbies: ");
        
        p1 = new Panel();
        branch = new Choice();
        branch.addItem("Computer Science & Engg.");
        branch.addItem("Electronics & Communication Engg.");
        branch.addItem("Information Technology Engg.");
        p1.add(lb4);
        
        p1.add(branch);
        add(p1);
        
        sk = new List(5, true);
        sk.add("Linux", 1);
        sk.add("Windows", 2);
        sk.add("MS Access", 3);
        sk.add("Oracle", 4);
        sk.add("C Programming", 5);
        sk.add("JAVA", 6);
        sk.add("Python", 7);

        cg = new CheckboxGroup();
        c1 = new Checkbox("M", cg, false);
        c2 = new Checkbox("F", cg, false);
        c3 = new Checkbox("Health");
        c4 = new Checkbox("sports");
        c5 = new Checkbox("social");

        b1 = new Button("SAVE");
        b2 = new Button("RESET");
    }

    public void launchFrame() {
        add(lb1);

        add(lb2);
        add(t1);
        
        add(lb3);
        add(t2);
        
        add(lb6);
        add(c1);
        add(c2);
        
        add(lb7);
        add(c3);
        add(c4);
        add(c5);

        add(lb4);
        add(p1);

        add(lb5);
        add(sk);
        
        add(b1);
        add(b2);
        setLayout(new FlowLayout());
        setSize(720, 720);
        setVisible(true);
        
        
    }

    public static void main(String args[]) {
        LoginPage lp = new LoginPage();
        lp.launchFrame();
        lp.setBackground (Color.black); 
    }
}
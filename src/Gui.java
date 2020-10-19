import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.regex.Pattern;

/**
 * Gui
 *
 * @author Nicolas Feige
 * @version 1.0
 * @date todo
 */


public class Gui extends JFrame {
    private Pattern pattern = Pattern.compile("(-?[0-9]{0,8}|)");

    private JPanel hauptPanel = new JPanel();
    private JPanel abschnitt1Panel = new JPanel();
    private JPanel startPanel = new JPanel();
    private JPanel startSplitPanel = new JPanel();
    private JButton startBttn = new JButton("Start");
    private JLabel titelZahlenEingabe = new JLabel("Zahlen eingeben: ");
    private JPanel operatorEingabePanel = new JPanel();
    private JTextField zahlEingabe1 = new JTextField();
    private JTextField zahlEingabe2 = new JTextField();
    private JTextField zahlEingabe3 = new JTextField();
    private JTextField zahlEingabe4 = new JTextField();
    private JTextField zahlEingabe5 = new JTextField();
    private JTextField resultatEingabe = new JTextField();

    private JPanel operatorPlatzhalterPanel1 = new JPanel();
    private JPanel operatorPlatzhalterPlatzhalterPanel11 = new JPanel();
    private JPanel operatorPlatzhalterPlatzhalterPanel12 = new JPanel();
    private JTextField operatorEingabePlatz1 = new JTextField();

    private JPanel operatorPlatzhalterPanel2 = new JPanel();
    private JPanel operatorPlatzhalterPlatzhalterPanel21 = new JPanel();
    private JPanel operatorPlatzhalterPlatzhalterPanel22 = new JPanel();
    private JTextField operatorEingabePlatz2 = new JTextField();

    private JPanel operatorPlatzhalterPanel3 = new JPanel();
    private JPanel operatorPlatzhalterPlatzhalterPanel31 = new JPanel();
    private JPanel operatorPlatzhalterPlatzhalterPanel32 = new JPanel();
    private JTextField operatorEingabePlatz3 = new JTextField();

    private JPanel operatorPlatzhalterPanel4 = new JPanel();
    private JPanel operatorPlatzhalterPlatzhalterPanel41 = new JPanel();
    private JPanel operatorPlatzhalterPlatzhalterPanel42 = new JPanel();
    private JTextField operatorEingabePlatz4 = new JTextField();

    private JPanel operatorPlatzhalterPanel5 = new JPanel();
    private JPanel operatorPlatzhalterPlatzhalterPanel51 = new JPanel();
    private JPanel operatorPlatzhalterPlatzhalterPanel52 = new JPanel();
    private JTextField operatorEingabePlatz5 = new JTextField();

    public Gui() {
        super("Rechenoperatoren Rechner");
        init();
    }

    private void init() {
        getContentPane().add(hauptPanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setSize(530, 150);
        setResizable(false);

        hauptPanel.setLayout(new GridLayout(2, 1));
        hauptPanel.add(abschnitt1Panel);
        abschnitt1Panel.setLayout(new GridLayout(2, 1));
        abschnitt1Panel.add(titelZahlenEingabe);
        operatorEingabePanel.setLayout(new GridLayout(1, 11));
        abschnitt1Panel.add(operatorEingabePanel);
        operatorEingabePanel.add(zahlEingabe1);
        operatorEingabePanel.add(operatorPlatzhalterPanel1);

        operatorPlatzhalterPanel1.setLayout(new GridLayout(1, 3));
        operatorPlatzhalterPanel1.add(operatorPlatzhalterPlatzhalterPanel11);
        operatorPlatzhalterPanel1.add(operatorEingabePlatz1);
        operatorEingabePlatz1.setEnabled(false);
        operatorPlatzhalterPanel1.add(operatorPlatzhalterPlatzhalterPanel12);

        operatorEingabePanel.add(zahlEingabe2);

        operatorEingabePanel.add(operatorPlatzhalterPanel2);
        operatorPlatzhalterPanel2.setLayout(new GridLayout(1, 3));
        operatorPlatzhalterPanel2.add(operatorPlatzhalterPlatzhalterPanel21);
        operatorPlatzhalterPanel2.add(operatorEingabePlatz2);
        operatorEingabePlatz2.setEnabled(false);
        operatorPlatzhalterPanel2.add(operatorPlatzhalterPlatzhalterPanel22);

        operatorEingabePanel.add(zahlEingabe3);

        operatorEingabePanel.add(operatorPlatzhalterPanel3);
        operatorPlatzhalterPanel3.setLayout(new GridLayout(1, 3));
        operatorPlatzhalterPanel3.add(operatorPlatzhalterPlatzhalterPanel31);
        operatorPlatzhalterPanel3.add(operatorEingabePlatz3);
        operatorEingabePlatz3.setEnabled(false);
        operatorPlatzhalterPanel3.add(operatorPlatzhalterPlatzhalterPanel32);

        operatorEingabePanel.add(zahlEingabe4);



        operatorEingabePanel.add(operatorPlatzhalterPanel5);
        operatorPlatzhalterPanel5.setLayout(new GridLayout(1, 3));
        operatorPlatzhalterPanel5.add(operatorPlatzhalterPlatzhalterPanel51);
        operatorPlatzhalterPanel5.add(operatorEingabePlatz5);
        operatorEingabePlatz5.setEnabled(false);
        operatorEingabePlatz5.setText("=");
        operatorPlatzhalterPanel5.add(operatorPlatzhalterPlatzhalterPanel52);

        operatorEingabePanel.add(resultatEingabe);


        hauptPanel.add(startPanel);
        startPanel.setLayout(new GridLayout(2, 1));
        startPanel.add(startSplitPanel);
        startPanel.add(startBttn);
        startBttn.setFont(new Font("SansSerif", Font.BOLD, 12));


        startBttn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int counter = 0;
                ArrayList<Integer> zahlen = new ArrayList<>();
                if (!zahlEingabe1.getText().isEmpty()) {
                    zahlen.add(Integer.parseInt(zahlEingabe1.getText()));
                }
                if (!zahlEingabe2.getText().isEmpty()) {
                    zahlen.add(Integer.parseInt(zahlEingabe2.getText()));
                }
                if (!zahlEingabe3.getText().isEmpty()) {
                    zahlen.add(Integer.parseInt(zahlEingabe3.getText()));
                }
                if (!zahlEingabe4.getText().isEmpty()) {
                    zahlen.add(Integer.parseInt(zahlEingabe4.getText()));
                }


                if (zahlen.size() < 2) {
                    JOptionPane.showMessageDialog(null, "Es müssen mindestens zwei Zahlen eingegeben werden!");
                } else if (resultatEingabe.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Es muss ein Resultat angegeben sein!");
                } else if (!pattern.matcher(zahlEingabe1.getText()).matches() || !pattern.matcher(zahlEingabe2.getText()).matches() || !pattern.matcher(zahlEingabe3.getText()).matches() || !pattern.matcher(zahlEingabe4.getText()).matches() || !pattern.matcher(zahlEingabe5.getText()).matches() || !pattern.matcher(resultatEingabe.getText()).matches()) {
                    JOptionPane.showMessageDialog(null, "Es müssen zahlen von 0-9 eingegeben werden!");
                } else {
                    Rechner rechner = new Rechner(zahlen, Integer.parseInt(resultatEingabe.getText()));
                    rechner.ausrechnen();
                }
            }
        });
    }
}

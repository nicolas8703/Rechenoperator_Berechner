import javax.swing.*;
import java.util.ArrayList;
import java.util.Vector;

/**
 * Rechner
 *
 * @author Nicolas Feige
 * @version 1.0
 * @date todo
 */


public class Rechner {
    ArrayList<Integer> zahlen;
    double ergebnis;
    int zahl1;
    int zahl2;
    int zahl3;
    int zahl4;
    int zahl5;


    public Rechner(ArrayList<Integer> zahlen, double ergebnis) {
        this.zahlen = zahlen;
        this.ergebnis = ergebnis;

        int zahlenSize = zahlen.size();

        if (zahlenSize >= 2) {
            zahl1 = zahlen.get(0);
            zahl2 = zahlen.get(1);
        }
        if (zahlenSize >= 3) {
            zahl3 = zahlen.get(2);
        }
        if (zahlenSize >= 4) {
            zahl4 = zahlen.get(3);
        }
        if (zahlenSize == 5) {
            zahl5 = zahlen.get(4);
        }

    }

    public void ausrechnen() {
        ArrayList<String> operator1 = new ArrayList<>();
        operator1.add("+");
        operator1.add("-");
        operator1.add("*");
        operator1.add("/");

        ArrayList<String> operator2 = new ArrayList<>();
        operator2.add("+");
        operator2.add("-");
        operator2.add("*");
        operator2.add("/");

        ArrayList<String> operator3 = new ArrayList<>();
        operator3.add("+");
        operator3.add("-");
        operator3.add("*");
        operator3.add("/");

        ArrayList<String> operator4 = new ArrayList<>();
        operator4.add("+");
        operator4.add("-");
        operator4.add("*");
        operator4.add("/");

        if (zahlen.size() == 5) {
            for (int i = 0; i < operator1.size(); i++) {
                for (int j = 0; j < operator2.size(); j++) {
                    for (int k = 0; k < operator3.size(); k++) {
                        for (int l = 0; l < operator4.size(); l++) {
                            System.out.println(zahl1 + operator1.get(i) + zahl2 + operator2.get(j) + zahl3 + operator3.get(k) + zahl4 + operator4.get(l) + zahl5);
                        }
                    }
                }
            }
        }
        if (zahlen.size() == 4) {
            for (int i = 0; i < operator1.size(); i++) {
                for (int j = 0; j < operator2.size(); j++) {
                    for (int k = 0; k < operator3.size(); k++) {
                        auswerten(zahl1, zahl2, zahl3, zahl4, operator1.get(i), operator2.get(j), operator3.get(k));
                    }
                }
            }
        }
        if (zahlen.size() == 3) {
            for (int i = 0; i < operator1.size(); i++) {
                for (int j = 0; j < operator2.size(); j++) {
                    auswerten(zahl1, zahl2, zahl3, operator1.get(i), operator2.get(j));
                }
            }
        }
        if (zahlen.size() == 2) {
            for (int i = 0; i < operator1.size(); i++) {
                auswerten(zahl1, zahl2, operator1.get(i));
            }
        }
    }

    public int auswerten(double zahl1, double zahl2, String operator) {
        if (operator == "+") {
            if (ergebnis == zahl1 + zahl2) {
                JOptionPane.showMessageDialog(null, zahl1 + " + " + zahl2 + " = " + ergebnis);
                return 0;
            }
        }
        if (operator == "-") {
            if (ergebnis == zahl1 - zahl2) {
                JOptionPane.showMessageDialog(null, zahl1 + " - " + zahl2 + " = " + ergebnis);
                return 0;
            }
        }
        if (operator == "*") {
            if (ergebnis == zahl1 * zahl2) {
                JOptionPane.showMessageDialog(null, zahl1 + " * " + zahl2 + " = " + ergebnis);
                return 0;
            }
        }
        if (operator == "/") {
            if (ergebnis == zahl1 / zahl2) {
                JOptionPane.showMessageDialog(null, zahl1 + " / " + zahl2 + " = " + ergebnis);
                return 0;
            }
        }
        return 0;
    }

    public int auswerten(double zahl1, double zahl2, double zahl3, String operator1, String operator2) {
        if (operator1 == "+") {
            if (operator2 == "+") {
                if (ergebnis == zahl1 + zahl2 + zahl3) {
                    JOptionPane.showMessageDialog(null, zahl1 + " " + operator1 + " " + zahl2 + " " + operator2 + " " + zahl3 + " = " + ergebnis);
                    return 0;
                }
            }
            if (operator2 == "-") {
                if (ergebnis == zahl1 + zahl2 - zahl3) {
                    JOptionPane.showMessageDialog(null, zahl1 + " " + operator1 + " " + zahl2 + " " + operator2 + " " + zahl3 + " = " + ergebnis);
                    return 0;
                }
            }
            if (operator2 == "*") {
                if (ergebnis == zahl1 + zahl2 * zahl3) {
                    JOptionPane.showMessageDialog(null, zahl1 + " " + operator1 + " " + zahl2 + " " + operator2 + " " + zahl3 + " = " + ergebnis);
                    return 0;
                }
            }
            if (operator2 == "/") {
                if (ergebnis == zahl1 + zahl2 / zahl3) {
                    JOptionPane.showMessageDialog(null, zahl1 + " " + operator1 + " " + zahl2 + " " + operator2 + " " + zahl3 + " = " + ergebnis);
                    return 0;
                }
            }
        }
        if (operator1 == "-") {
            if (operator2 == "+") {
                if (ergebnis == zahl1 - zahl2 + zahl3) {
                    JOptionPane.showMessageDialog(null, zahl1 + " " + operator1 + " " + zahl2 + " " + operator2 + " " + zahl3 + " = " + ergebnis);
                    return 0;
                }
            }
            if (operator2 == "-") {
                if (ergebnis == zahl1 - zahl2 - zahl3) {
                    JOptionPane.showMessageDialog(null, zahl1 + " " + operator1 + " " + zahl2 + " " + operator2 + " " + zahl3 + " = " + ergebnis);
                    return 0;
                }
            }
            if (operator2 == "*") {
                if (ergebnis == zahl1 - zahl2 * zahl3) {
                    JOptionPane.showMessageDialog(null, zahl1 + " " + operator1 + " " + zahl2 + " " + operator2 + " " + zahl3 + " = " + ergebnis);
                    return 0;
                }
            }
            if (operator2 == "/") {
                if (ergebnis == zahl1 - zahl2 / zahl3) {
                    JOptionPane.showMessageDialog(null, zahl1 + " " + operator1 + " " + zahl2 + " " + operator2 + " " + zahl3 + " = " + ergebnis);
                    return 0;
                }
            }
        }
        if (operator1 == "*") {
            if (operator2 == "+") {
                if (ergebnis == zahl1 * zahl2 + zahl3) {
                    JOptionPane.showMessageDialog(null, zahl1 + " " + operator1 + " " + zahl2 + " " + operator2 + " " + zahl3 + " = " + ergebnis);
                    return 0;
                }
            }
            if (operator2 == "-") {
                if (ergebnis == zahl1 * zahl2 - zahl3) {
                    JOptionPane.showMessageDialog(null, zahl1 + " " + operator1 + " " + zahl2 + " " + operator2 + " " + zahl3 + " = " + ergebnis);
                    return 0;
                }
            }
            if (operator2 == "*") {
                if (ergebnis == zahl1 * zahl2 * zahl3) {
                    JOptionPane.showMessageDialog(null, zahl1 + " " + operator1 + " " + zahl2 + " " + operator2 + " " + zahl3 + " = " + ergebnis);
                    return 0;
                }
            }
            if (operator2 == "/") {
                if (ergebnis == zahl1 * zahl2 / zahl3) {
                    JOptionPane.showMessageDialog(null, zahl1 + " " + operator1 + " " + zahl2 + " " + operator2 + " " + zahl3 + " = " + ergebnis);
                    return 0;
                }
            }
        }
        if (operator1 == "/") {
            if (operator2 == "+") {
                if (ergebnis == zahl1 / zahl2 + zahl3) {
                    JOptionPane.showMessageDialog(null, zahl1 + " " + operator1 + " " + zahl2 + " " + operator2 + " " + zahl3 + " = " + ergebnis);
                    return 0;
                }
            }
            if (operator2 == "-") {
                if (ergebnis == zahl1 / zahl2 - zahl3) {
                    JOptionPane.showMessageDialog(null, zahl1 + " " + operator1 + " " + zahl2 + " " + operator2 + " " + zahl3 + " = " + ergebnis);
                    return 0;
                }
            }
            if (operator2 == "*") {
                if (ergebnis == zahl1 / zahl2 * zahl3) {
                    JOptionPane.showMessageDialog(null, zahl1 + " " + operator1 + " " + zahl2 + " " + operator2 + " " + zahl3 + " = " + ergebnis);
                    return 0;
                }
            }
            if (operator2 == "/") {
                if (ergebnis == zahl1 / zahl2 / zahl3) {
                    JOptionPane.showMessageDialog(null, zahl1 + " " + operator1 + " " + zahl2 + " " + operator2 + " " + zahl3 + " = " + ergebnis);
                    return 0;
                }
            }
        }
        return 0;
    }

    public int auswerten(double zahl1, double zahl2, double zahl3, double zahl4, String operator1, String operator2, String operator3) {
        if (operator1 == "+") {
            if (operator2 == "+") {
                if (operator3 == "+") {
                    if (ergebnis == zahl1 + zahl2 + zahl3 + zahl4) {
                        JOptionPane.showMessageDialog(null, zahl1 + " " + operator1 + " " + zahl2 + " " + operator2 + " " + zahl3 + " " + operator3 + " " + zahl4 + " = " + ergebnis);
                        return 0;
                    }
                }
                if (operator3 == "-") {
                    if (ergebnis == zahl1 + zahl2 + zahl3 - zahl4) {
                        JOptionPane.showMessageDialog(null, zahl1 + " " + operator1 + " " + zahl2 + " " + operator2 + " " + zahl3 + " " + operator3 + " " + zahl4 + " = " + ergebnis);
                        return 0;
                    }
                }
                if (operator3 == "*") {
                    if (ergebnis == zahl1 + zahl2 + zahl3 * zahl4) {
                        JOptionPane.showMessageDialog(null, zahl1 + " " + operator1 + " " + zahl2 + " " + operator2 + " " + zahl3 + " " + operator3 + " " + zahl4 + " = " + ergebnis);
                        return 0;
                    }
                }
                if (operator3 == "/") {
                    if (ergebnis == zahl1 + zahl2 + zahl3 / zahl4) {
                        JOptionPane.showMessageDialog(null, zahl1 + " " + operator1 + " " + zahl2 + " " + operator2 + " " + zahl3 + " " + operator3 + " " + zahl4 + " = " + ergebnis);
                        return 0;
                    }
                }
            }
            if (operator2 == "-") {
                if (operator3 == "+") {
                    if (ergebnis == zahl1 + zahl2 - zahl3 + zahl4) {
                        JOptionPane.showMessageDialog(null, zahl1 + " " + operator1 + " " + zahl2 + " " + operator2 + " " + zahl3 + " " + operator3 + " " + zahl4 + " = " + ergebnis);
                        return 0;
                    }
                }
                if (operator3 == "-") {
                    if (ergebnis == zahl1 + zahl2 - zahl3 - zahl4) {
                        JOptionPane.showMessageDialog(null, zahl1 + " " + operator1 + " " + zahl2 + " " + operator2 + " " + zahl3 + " " + operator3 + " " + zahl4 + " = " + ergebnis);
                        return 0;
                    }
                }
                if (operator3 == "*") {
                    if (ergebnis == zahl1 + zahl2 - zahl3 * zahl4) {
                        JOptionPane.showMessageDialog(null, zahl1 + " " + operator1 + " " + zahl2 + " " + operator2 + " " + zahl3 + " " + operator3 + " " + zahl4 + " = " + ergebnis);
                        return 0;
                    }
                }
                if (operator3 == "/") {
                    if (ergebnis == zahl1 + zahl2 - zahl3 / zahl4) {
                        JOptionPane.showMessageDialog(null, zahl1 + " " + operator1 + " " + zahl2 + " " + operator2 + " " + zahl3 + " " + operator3 + " " + zahl4 + " = " + ergebnis);
                        return 0;
                    }
                }
            }
            if (operator2 == "*") {
                if (operator3 == "+") {
                    if (ergebnis == zahl1 + zahl2 * zahl3 + zahl4) {
                        JOptionPane.showMessageDialog(null, zahl1 + " " + operator1 + " " + zahl2 + " " + operator2 + " " + zahl3 + " " + operator3 + " " + zahl4 + " = " + ergebnis);
                        return 0;
                    }
                }
                if (operator3 == "-") {
                    if (ergebnis == zahl1 + zahl2 * zahl3 - zahl4) {
                        JOptionPane.showMessageDialog(null, zahl1 + " " + operator1 + " " + zahl2 + " " + operator2 + " " + zahl3 + " " + operator3 + " " + zahl4 + " = " + ergebnis);
                        return 0;
                    }
                }
                if (operator3 == "*") {
                    if (ergebnis == zahl1 + zahl2 * zahl3 * zahl4) {
                        JOptionPane.showMessageDialog(null, zahl1 + " " + operator1 + " " + zahl2 + " " + operator2 + " " + zahl3 + " " + operator3 + " " + zahl4 + " = " + ergebnis);
                        return 0;
                    }
                }
                if (operator3 == "/") {
                    if (ergebnis == zahl1 + zahl2 * zahl3 / zahl4) {
                        JOptionPane.showMessageDialog(null, zahl1 + " " + operator1 + " " + zahl2 + " " + operator2 + " " + zahl3 + " " + operator3 + " " + zahl4 + " = " + ergebnis);
                        return 0;
                    }
                }
            }
            if (operator2 == "/") {
                if (operator3 == "+") {
                    if (ergebnis == zahl1 + zahl2 / zahl3 + zahl4) {
                        JOptionPane.showMessageDialog(null, zahl1 + " " + operator1 + " " + zahl2 + " " + operator2 + " " + zahl3 + " " + operator3 + " " + zahl4 + " = " + ergebnis);
                        return 0;
                    }
                }

                if (operator3 == "-") {
                    if (ergebnis == zahl1 + zahl2 / zahl3 - zahl4) {
                        JOptionPane.showMessageDialog(null, zahl1 + " " + operator1 + " " + zahl2 + " " + operator2 + " " + zahl3 + " " + operator3 + " " + zahl4 + " = " + ergebnis);
                        return 0;
                    }
                }
                if (operator3 == "*") {
                    if (ergebnis == zahl1 + zahl2 / zahl3 * zahl4) {
                        JOptionPane.showMessageDialog(null, zahl1 + " " + operator1 + " " + zahl2 + " " + operator2 + " " + zahl3 + " " + operator3 + " " + zahl4 + " = " + ergebnis);
                        return 0;
                    }
                }
                if (operator3 == "/") {
                    if (ergebnis == zahl1 + zahl2 / zahl3 / zahl4) {
                        JOptionPane.showMessageDialog(null, zahl1 + " " + operator1 + " " + zahl2 + " " + operator2 + " " + zahl3 + " " + operator3 + " " + zahl4 + " = " + ergebnis);
                        return 0;
                    }
                }
            }
        }
        if (operator1 == "-") {
            if (operator2 == "+") {
                if (operator3 == "+") {
                    if (ergebnis == zahl1 - zahl2 + zahl3 + zahl4) {
                        JOptionPane.showMessageDialog(null, zahl1 + " " + operator1 + " " + zahl2 + " " + operator2 + " " + zahl3 + " " + operator3 + " " + zahl4 + " = " + ergebnis);
                        return 0;
                    }
                }
                if (operator3 == "-") {
                    if (ergebnis == zahl1 - zahl2 + zahl3 - zahl4) {
                        JOptionPane.showMessageDialog(null, zahl1 + " " + operator1 + " " + zahl2 + " " + operator2 + " " + zahl3 + " " + operator3 + " " + zahl4 + " = " + ergebnis);
                        return 0;
                    }
                }
                if (operator3 == "*") {
                    if (ergebnis == zahl1 - zahl2 + zahl3 * zahl4) {
                        JOptionPane.showMessageDialog(null, zahl1 + " " + operator1 + " " + zahl2 + " " + operator2 + " " + zahl3 + " " + operator3 + " " + zahl4 + " = " + ergebnis);
                        return 0;
                    }
                }
                if (operator3 == "/") {
                    if (ergebnis == zahl1 - zahl2 + zahl3 / zahl4) {
                        JOptionPane.showMessageDialog(null, zahl1 + " " + operator1 + " " + zahl2 + " " + operator2 + " " + zahl3 + " " + operator3 + " " + zahl4 + " = " + ergebnis);
                        return 0;
                    }
                }
            }
            if (operator2 == "-") {
                if (operator3 == "+") {
                    if (ergebnis == zahl1 - zahl2 - zahl3 + zahl4) {
                        JOptionPane.showMessageDialog(null, zahl1 + " " + operator1 + " " + zahl2 + " " + operator2 + " " + zahl3 + " " + operator3 + " " + zahl4 + " = " + ergebnis);
                        return 0;
                    }
                }
                if (operator3 == "-") {
                    if (ergebnis == zahl1 - zahl2 - zahl3 - zahl4) {
                        JOptionPane.showMessageDialog(null, zahl1 + " " + operator1 + " " + zahl2 + " " + operator2 + " " + zahl3 + " " + operator3 + " " + zahl4 + " = " + ergebnis);
                        return 0;
                    }
                }
                if (operator3 == "*") {
                    if (ergebnis == zahl1 - zahl2 - zahl3 * zahl4) {
                        JOptionPane.showMessageDialog(null, zahl1 + " " + operator1 + " " + zahl2 + " " + operator2 + " " + zahl3 + " " + operator3 + " " + zahl4 + " = " + ergebnis);
                        return 0;
                    }
                }
                if (operator3 == "/") {
                    if (ergebnis == zahl1 - zahl2 - zahl3 / zahl4) {
                        JOptionPane.showMessageDialog(null, zahl1 + " " + operator1 + " " + zahl2 + " " + operator2 + " " + zahl3 + " " + operator3 + " " + zahl4 + " = " + ergebnis);
                        return 0;
                    }
                }
            }
            if (operator2 == "*") {
                if (operator3 == "+") {
                    if (ergebnis == zahl1 - zahl2 * zahl3 + zahl4) {
                        JOptionPane.showMessageDialog(null, zahl1 + " " + operator1 + " " + zahl2 + " " + operator2 + " " + zahl3 + " " + operator3 + " " + zahl4 + " = " + ergebnis);
                        return 0;
                    }
                }
                if (operator3 == "-") {
                    if (ergebnis == zahl1 - zahl2 * zahl3 - zahl4) {
                        JOptionPane.showMessageDialog(null, zahl1 + " " + operator1 + " " + zahl2 + " " + operator2 + " " + zahl3 + " " + operator3 + " " + zahl4 + " = " + ergebnis);
                        return 0;
                    }
                }
                if (operator3 == "*") {
                    if (ergebnis == zahl1 - zahl2 * zahl3 * zahl4) {
                        JOptionPane.showMessageDialog(null, zahl1 + " " + operator1 + " " + zahl2 + " " + operator2 + " " + zahl3 + " " + operator3 + " " + zahl4 + " = " + ergebnis);
                        return 0;
                    }
                }
                if (operator3 == "/") {
                    if (ergebnis == zahl1 - zahl2 * zahl3 / zahl4) {
                        JOptionPane.showMessageDialog(null, zahl1 + " " + operator1 + " " + zahl2 + " " + operator2 + " " + zahl3 + " " + operator3 + " " + zahl4 + " = " + ergebnis);
                        return 0;
                    }
                }
            }
            if (operator2 == "/") {
                if (operator3 == "+") {
                    if (ergebnis == zahl1 - zahl2 / zahl3 + zahl4) {
                        JOptionPane.showMessageDialog(null, zahl1 + " " + operator1 + " " + zahl2 + " " + operator2 + " " + zahl3 + " " + operator3 + " " + zahl4 + " = " + ergebnis);
                        return 0;
                    }
                }

                if (operator3 == "-") {
                    if (ergebnis == zahl1 - zahl2 / zahl3 - zahl4) {
                        JOptionPane.showMessageDialog(null, zahl1 + " " + operator1 + " " + zahl2 + " " + operator2 + " " + zahl3 + " " + operator3 + " " + zahl4 + " = " + ergebnis);
                        return 0;
                    }
                }
                if (operator3 == "*") {
                    if (ergebnis == zahl1 - zahl2 / zahl3 * zahl4) {
                        JOptionPane.showMessageDialog(null, zahl1 + " " + operator1 + " " + zahl2 + " " + operator2 + " " + zahl3 + " " + operator3 + " " + zahl4 + " = " + ergebnis);
                        return 0;
                    }
                }
                if (operator3 == "/") {
                    if (ergebnis == zahl1 - zahl2 / zahl3 / zahl4) {
                        JOptionPane.showMessageDialog(null, zahl1 + " " + operator1 + " " + zahl2 + " " + operator2 + " " + zahl3 + " " + operator3 + " " + zahl4 + " = " + ergebnis);
                        return 0;
                    }
                }
            }
        }
        if (operator1 == "*") {
            if (operator2 == "+") {
                if (operator3 == "+") {
                    if (ergebnis == zahl1 * zahl2 + zahl3 + zahl4) {
                        JOptionPane.showMessageDialog(null, zahl1 + " " + operator1 + " " + zahl2 + " " + operator2 + " " + zahl3 + " " + operator3 + " " + zahl4 + " = " + ergebnis);
                        return 0;
                    }
                }
                if (operator3 == "-") {
                    if (ergebnis == zahl1 * zahl2 + zahl3 - zahl4) {
                        JOptionPane.showMessageDialog(null, zahl1 + " " + operator1 + " " + zahl2 + " " + operator2 + " " + zahl3 + " " + operator3 + " " + zahl4 + " = " + ergebnis);
                        return 0;
                    }
                }
                if (operator3 == "*") {
                    if (ergebnis == zahl1 * zahl2 + zahl3 * zahl4) {
                        JOptionPane.showMessageDialog(null, zahl1 + " " + operator1 + " " + zahl2 + " " + operator2 + " " + zahl3 + " " + operator3 + " " + zahl4 + " = " + ergebnis);
                        return 0;
                    }
                }
                if (operator3 == "/") {
                    if (ergebnis == zahl1 * zahl2 + zahl3 / zahl4) {
                        JOptionPane.showMessageDialog(null, zahl1 + " " + operator1 + " " + zahl2 + " " + operator2 + " " + zahl3 + " " + operator3 + " " + zahl4 + " = " + ergebnis);
                        return 0;
                    }
                }
            }
            if (operator2 == "-") {
                if (operator3 == "+") {
                    if (ergebnis == zahl1 * zahl2 - zahl3 + zahl4) {
                        JOptionPane.showMessageDialog(null, zahl1 + " " + operator1 + " " + zahl2 + " " + operator2 + " " + zahl3 + " " + operator3 + " " + zahl4 + " = " + ergebnis);
                        return 0;
                    }
                }
                if (operator3 == "-") {
                    if (ergebnis == zahl1 * zahl2 - zahl3 - zahl4) {
                        JOptionPane.showMessageDialog(null, zahl1 + " " + operator1 + " " + zahl2 + " " + operator2 + " " + zahl3 + " " + operator3 + " " + zahl4 + " = " + ergebnis);
                        return 0;
                    }
                }
                if (operator3 == "*") {
                    if (ergebnis == zahl1 * zahl2 - zahl3 * zahl4) {
                        JOptionPane.showMessageDialog(null, zahl1 + " " + operator1 + " " + zahl2 + " " + operator2 + " " + zahl3 + " " + operator3 + " " + zahl4 + " = " + ergebnis);
                        return 0;
                    }
                }
                if (operator3 == "/") {
                    if (ergebnis == zahl1 * zahl2 - zahl3 / zahl4) {
                        JOptionPane.showMessageDialog(null, zahl1 + " " + operator1 + " " + zahl2 + " " + operator2 + " " + zahl3 + " " + operator3 + " " + zahl4 + " = " + ergebnis);
                        return 0;
                    }
                }
            }
            if (operator2 == "*") {
                if (operator3 == "+") {
                    if (ergebnis == zahl1 * zahl2 * zahl3 + zahl4) {
                        JOptionPane.showMessageDialog(null, zahl1 + " " + operator1 + " " + zahl2 + " " + operator2 + " " + zahl3 + " " + operator3 + " " + zahl4 + " = " + ergebnis);
                        return 0;
                    }
                }
                if (operator3 == "-") {
                    if (ergebnis == zahl1 * zahl2 * zahl3 - zahl4) {
                        JOptionPane.showMessageDialog(null, zahl1 + " " + operator1 + " " + zahl2 + " " + operator2 + " " + zahl3 + " " + operator3 + " " + zahl4 + " = " + ergebnis);
                        return 0;
                    }
                }
                if (operator3 == "*") {
                    if (ergebnis == zahl1 * zahl2 * zahl3 * zahl4) {
                        JOptionPane.showMessageDialog(null, zahl1 + " " + operator1 + " " + zahl2 + " " + operator2 + " " + zahl3 + " " + operator3 + " " + zahl4 + " = " + ergebnis);
                        return 0;
                    }
                }
                if (operator3 == "/") {
                    if (ergebnis == zahl1 * zahl2 * zahl3 / zahl4) {
                        JOptionPane.showMessageDialog(null, zahl1 + " " + operator1 + " " + zahl2 + " " + operator2 + " " + zahl3 + " " + operator3 + " " + zahl4 + " = " + ergebnis);
                        return 0;
                    }
                }
            }
            if (operator2 == "/") {
                if (operator3 == "+") {
                    if (ergebnis == zahl1 * zahl2 / zahl3 + zahl4) {
                        JOptionPane.showMessageDialog(null, zahl1 + " " + operator1 + " " + zahl2 + " " + operator2 + " " + zahl3 + " " + operator3 + " " + zahl4 + " = " + ergebnis);
                        return 0;
                    }
                }
                if (operator3 == "-") {
                    if (ergebnis == zahl1 * zahl2 / zahl3 - zahl4) {
                        JOptionPane.showMessageDialog(null, zahl1 + " " + operator1 + " " + zahl2 + " " + operator2 + " " + zahl3 + " " + operator3 + " " + zahl4 + " = " + ergebnis);
                        return 0;
                    }
                }
                if (operator3 == "*") {
                    if (ergebnis == zahl1 * zahl2 / zahl3 * zahl4) {
                        JOptionPane.showMessageDialog(null, zahl1 + " " + operator1 + " " + zahl2 + " " + operator2 + " " + zahl3 + " " + operator3 + " " + zahl4 + " = " + ergebnis);
                        return 0;
                    }
                }
                if (operator3 == "/") {
                    if (ergebnis == zahl1 * zahl2 / zahl3 / zahl4) {
                        JOptionPane.showMessageDialog(null, zahl1 + " " + operator1 + " " + zahl2 + " " + operator2 + " " + zahl3 + " " + operator3 + " " + zahl4 + " = " + ergebnis);
                        return 0;
                    }
                }
            }
        }
        if (operator1 == "/") {
            if (operator2 == "+") {
                if (operator3 == "+") {
                    if (ergebnis == zahl1 / zahl2 + zahl3 + zahl4) {
                        JOptionPane.showMessageDialog(null, zahl1 + " " + operator1 + " " + zahl2 + " " + operator2 + " " + zahl3 + " " + operator3 + " " + zahl4 + " = " + ergebnis);
                        return 0;
                    }
                }
                if (operator3 == "-") {
                    if (ergebnis == zahl1 / zahl2 + zahl3 - zahl4) {
                        JOptionPane.showMessageDialog(null, zahl1 + " " + operator1 + " " + zahl2 + " " + operator2 + " " + zahl3 + " " + operator3 + " " + zahl4 + " = " + ergebnis);
                        return 0;
                    }
                }
                if (operator3 == "*") {
                    if (ergebnis == zahl1 / zahl2 + zahl3 * zahl4) {
                        JOptionPane.showMessageDialog(null, zahl1 + " " + operator1 + " " + zahl2 + " " + operator2 + " " + zahl3 + " " + operator3 + " " + zahl4 + " = " + ergebnis);
                        return 0;
                    }
                }
                if (operator3 == "/") {
                    if (ergebnis == zahl1 / zahl2 + zahl3 / zahl4) {
                        JOptionPane.showMessageDialog(null, zahl1 + " " + operator1 + " " + zahl2 + " " + operator2 + " " + zahl3 + " " + operator3 + " " + zahl4 + " = " + ergebnis);
                        return 0;
                    }
                }
            }
            if (operator2 == "-") {
                if (operator3 == "+") {
                    if (ergebnis == zahl1 / zahl2 - zahl3 + zahl4) {
                        JOptionPane.showMessageDialog(null, zahl1 + " " + operator1 + " " + zahl2 + " " + operator2 + " " + zahl3 + " " + operator3 + " " + zahl4 + " = " + ergebnis);
                        return 0;
                    }
                }
                if (operator3 == "-") {
                    if (ergebnis == zahl1 / zahl2 - zahl3 - zahl4) {
                        JOptionPane.showMessageDialog(null, zahl1 + " " + operator1 + " " + zahl2 + " " + operator2 + " " + zahl3 + " " + operator3 + " " + zahl4 + " = " + ergebnis);
                        return 0;
                    }
                }
                if (operator3 == "*") {
                    if (ergebnis == zahl1 / zahl2 - zahl3 * zahl4) {
                        JOptionPane.showMessageDialog(null, zahl1 + " " + operator1 + " " + zahl2 + " " + operator2 + " " + zahl3 + " " + operator3 + " " + zahl4 + " = " + ergebnis);
                        return 0;
                    }
                }
                if (operator3 == "/") {
                    if (ergebnis == zahl1 / zahl2 - zahl3 / zahl4) {
                        JOptionPane.showMessageDialog(null, zahl1 + " " + operator1 + " " + zahl2 + " " + operator2 + " " + zahl3 + " " + operator3 + " " + zahl4 + " = " + ergebnis);
                        return 0;
                    }
                }
            }
            if (operator2 == "*") {
                if (operator3 == "+") {
                    if (ergebnis == zahl1 / zahl2 * zahl3 + zahl4) {
                        JOptionPane.showMessageDialog(null, zahl1 + " " + operator1 + " " + zahl2 + " " + operator2 + " " + zahl3 + " " + operator3 + " " + zahl4 + " = " + ergebnis);
                        return 0;
                    }
                }
                if (operator3 == "-") {
                    if (ergebnis == zahl1 / zahl2 * zahl3 - zahl4) {
                        JOptionPane.showMessageDialog(null, zahl1 + " " + operator1 + " " + zahl2 + " " + operator2 + " " + zahl3 + " " + operator3 + " " + zahl4 + " = " + ergebnis);
                        return 0;
                    }
                }
                if (operator3 == "*") {
                    if (ergebnis == zahl1 / zahl2 * zahl3 * zahl4) {
                        JOptionPane.showMessageDialog(null, zahl1 + " " + operator1 + " " + zahl2 + " " + operator2 + " " + zahl3 + " " + operator3 + " " + zahl4 + " = " + ergebnis);
                        return 0;
                    }
                }
                if (operator3 == "/") {
                    if (ergebnis == zahl1 / zahl2 * zahl3 / zahl4) {
                        JOptionPane.showMessageDialog(null, zahl1 + " " + operator1 + " " + zahl2 + " " + operator2 + " " + zahl3 + " " + operator3 + " " + zahl4 + " = " + ergebnis);
                        return 0;
                    }
                }
            }
            if (operator2 == "/") {
                if (operator3 == "+") {
                    if (ergebnis == zahl1 / zahl2 / zahl3 + zahl4) {
                        JOptionPane.showMessageDialog(null, zahl1 + " " + operator1 + " " + zahl2 + " " + operator2 + " " + zahl3 + " " + operator3 + " " + zahl4 + " = " + ergebnis);
                        return 0;
                    }
                }
                if (operator3 == "-") {
                    if (ergebnis == zahl1 / zahl2 / zahl3 - zahl4) {
                        JOptionPane.showMessageDialog(null, zahl1 + " " + operator1 + " " + zahl2 + " " + operator2 + " " + zahl3 + " " + operator3 + " " + zahl4 + " = " + ergebnis);
                        return 0;
                    }
                }
                if (operator3 == "*") {
                    if (ergebnis == zahl1 / zahl2 / zahl3 * zahl4) {
                        JOptionPane.showMessageDialog(null, zahl1 + " " + operator1 + " " + zahl2 + " " + operator2 + " " + zahl3 + " " + operator3 + " " + zahl4 + " = " + ergebnis);
                        return 0;
                    }
                }
                if (operator3 == "/") {
                    if (ergebnis == zahl1 / zahl2 / zahl3 / zahl4) {
                        JOptionPane.showMessageDialog(null, zahl1 + " " + operator1 + " " + zahl2 + " " + operator2 + " " + zahl3 + " " + operator3 + " " + zahl4 + " = " + ergebnis);
                        return 0;
                    }
                }
            }
        }
        return 0;
    }
}
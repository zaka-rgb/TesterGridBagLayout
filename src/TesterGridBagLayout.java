import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class TesterGridBagLayout {
public static void main(String[] args) {
JPanel panel = new JPanel();
/* On ajoute un gridbagLauout au panel */
panel.setLayout(new GridBagLayout());
// Le gridBagConstraints va d�finir la position et la taille des �l�ments
GridBagConstraints gc = new GridBagConstraints();
/*
* le parametre fill sert � d�finir comment le composant sera rempli
* GridBagConstraints.BOTH permet d'occuper tout l'espace disponible
* horizontalement et verticalement GridBagConstraints.HORIZONTAL
* maximise horizontalement GridBagConstraints.VERTICAL maximise
* verticalement
*/
gc.fill = GridBagConstraints.BOTH;
/* insets d�finir la marge entre les composant new
* Insets(margeSup�rieure, margeGauche, margeInf�rieur, margeDroite)
*/
gc.insets = new Insets(5, 5, 5, 5);
/*
* La propri�t� anchor permet de sp�cifier un point d'ancrage � un
* composant � l'int�rieur de sa (ou ses) cellule(s)
*/
/* ipady permet de savoir o� on place le composant s'il n'occupe pas la
* totalit� de l'espace disponnible
*/
gc.ipady = gc.anchor = GridBagConstraints.CENTER;
/* weightx d�finit le nombre de cases en abscisse */
gc.weightx = 3;
/* weightx d�finit le nombre de cases en ordonn�e */
gc.weighty = 3;
/*
* pour dire qu'on ajoute un composant en position (i, j), on d�finit
* gridx=i et gridy=j
*/
gc.gridx = 0;
gc.gridy = 0;
/* On ajoute le composant au panel en pr�cisant le GridBagConstraints */
panel.add(new JButton("0,0"), gc);
gc.gridx = 1;
gc.gridy = 0;
panel.add(new JButton("1,0"), gc);
gc.gridx = 2;
gc.gridy = 0;
panel.add(new JButton("2,0"), gc);
gc.gridx = 0;
gc.gridy = 1;
panel.add(new JButton("0,1"), gc);
gc.gridx = 1;
gc.gridy = 1;
/*
* On peut d�finir un composant qui prend plusieurs cases � l'aide de
* gridwidth
*/
gc.gridwidth = 2;
panel.add(new JButton("1,1"), gc);
gc.gridx = 0;
gc.gridy = 2;
gc.gridwidth = 3;
panel.add(new JButton("0,3"), gc);
/* D�finition de la fen�tre */
JFrame f = new JFrame();
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
f.add(panel);
f.setSize(500, 300);
f.setLocationRelativeTo(null);
f.setVisible(true);
}
}
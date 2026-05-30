
package telas;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class Login extends JFrame {

    public Login() {

        setTitle("JOGO LEGAL");
        setSize(500, 350);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        JPanel painel = new JPanel();
        painel.setBackground(new Color(24, 26, 27));
        painel.setLayout(null);

        JLabel titulo = new JLabel("JOGO LEGAL");
        titulo.setForeground(Color.WHITE);
        titulo.setFont(new Font("Arial", Font.BOLD, 30));
        titulo.setBounds(140, 30, 250, 40);

        JLabel subtitulo = new JLabel("Faça login para continuar");
        subtitulo.setForeground(Color.LIGHT_GRAY);
        subtitulo.setBounds(160, 70, 200, 20);

        JTextField usuario = new JTextField();
        usuario.setBounds(125, 120, 250, 35);
        usuario.setBorder(new LineBorder(Color.GRAY, 1));

        JPasswordField senha = new JPasswordField();
        senha.setBounds(125, 170, 250, 35);
        senha.setBorder(new LineBorder(Color.GRAY, 1));

        JButton entrar = new JButton("ENTRAR");
        entrar.setBounds(170, 235, 160, 40);
        entrar.setFocusPainted(false);
        entrar.setFont(new Font("Arial", Font.BOLD, 14));
        entrar.setBackground(new Color(0, 120, 215));
        entrar.setForeground(Color.WHITE);

        painel.add(titulo);
        painel.add(subtitulo);
        painel.add(usuario);
        painel.add(senha);
        painel.add(entrar);

        add(painel);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Login::new);
    }
}
package br.com.brunodorea.ui.custom.button;

import javax.swing.*;
import java.awt.event.ActionListener;

public class ResetButton extends JButton {
    public ResetButton(final ActionListener actionListener) {
        this.setText("Resetar Jogo");
        this.addActionListener(actionListener);
    }
}
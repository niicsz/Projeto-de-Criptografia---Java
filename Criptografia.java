package com.mycompany.criptografia;

import javax.swing.*;

public class Criptografia {
    public static void main(String[] args) {
        int chave = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de saltos = "));
        int escolha = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 para Cifrar ou 2 para Decifrar = "));

        if (escolha != 1 && escolha != 2) {
            System.out.println("Escolha incorreta, tente novamente!! ");
            return;
        }

        switch (escolha) {
            case 1 ->  {
                String msg = JOptionPane.showInputDialog("Digite a frase que deseja Cifrar : ");
                String msgCifrada = criptografar(msg, chave);
                JOptionPane.showMessageDialog(null, "mensagem CRIPTOGRADA = " + msgCifrada);
                System.out.println("Msg criptografada: " + msgCifrada);
            }
            case 2 ->  {
                String msg = JOptionPane.showInputDialog("Digite a frase que deseja Decifrar: ");
                String textoPuro = descriptografar(msg, chave);
                JOptionPane.showMessageDialog(null, "mensagem DESCRIPTOGRADA = " + textoPuro);
                System.out.println("Msg original: " + textoPuro);
            }
            default -> System.out.println("Escolha Inválida = " + escolha);
        }
    }

    public static String criptografar(String msg, int chave) {
        String msgCript = "";
        for (int i = 0; i < msg.length(); i++) {
            msgCript += (char) (msg.charAt(i) + chave);
        }
        return msgCript;
    }

    public static String descriptografar(String msgCript, int chave) {
        String msg = "";
        for (int i = 0; i < msgCript.length(); i++) {
            msg += (char) (msgCript.charAt(i) - chave);
        }
        return msg;
    }
}

package Control;

import Model.*;
import View.Janela;

public class Controle {
    private Janela view;
    private double x;
    private OperacaoMatematica operacao;
    
    public Controle(Janela view) {
        this.view = view;
    }

    // Métodos para os dígitos (0-9)
    public void controleVar0() { view.getTxt_input().setText(view.getTxt_input().getText() + "0"); }
    public void controleVar1() { view.getTxt_input().setText(view.getTxt_input().getText() + "1"); }
    public void controleVar2() { view.getTxt_input().setText(view.getTxt_input().getText() + "2"); }
    public void controleVar3() { view.getTxt_input().setText(view.getTxt_input().getText() + "3"); }
    public void controleVar4() { view.getTxt_input().setText(view.getTxt_input().getText() + "4"); }
    public void controleVar5() { view.getTxt_input().setText(view.getTxt_input().getText() + "5"); }
    public void controleVar6() { view.getTxt_input().setText(view.getTxt_input().getText() + "6"); }
    public void controleVar7() { view.getTxt_input().setText(view.getTxt_input().getText() + "7"); }
    public void controleVar8() { view.getTxt_input().setText(view.getTxt_input().getText() + "8"); }
    public void controleVar9() { view.getTxt_input().setText(view.getTxt_input().getText() + "9"); }
    
    // Métodos para as operações
    public void controleSoma() {
        x = Double.parseDouble(view.getTxt_input().getText());
        operacao = new Soma();
        view.getTxt_input().setText("");
    }
    
    public void controleSubtracao() {
        x = Double.parseDouble(view.getTxt_input().getText());
        operacao = new Subtracao();
        view.getTxt_input().setText("");
    }
    
    public void controleMultiplicacao() {
        x = Double.parseDouble(view.getTxt_input().getText());
        operacao = new Multiplicacao();
        view.getTxt_input().setText("");
    }
    
    public void controleDivisao() {
        x = Double.parseDouble(view.getTxt_input().getText());
        operacao = new Divisao();
        view.getTxt_input().setText("");
    }
    
    public void controleResultado() {
        double y = Double.parseDouble(view.getTxt_input().getText());
        double resultado = operacao.calcular(x, y);
        view.getTxt_input().setText(String.valueOf(resultado));
    }
    
    public void controleLimpar() {
        view.getTxt_input().setText("");
    }
}
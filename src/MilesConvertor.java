import java.awt.*;
import java.awt.event.*;

public class MilesConvertor extends Frame {
    TextField input = new TextField(10);
    Label output = new Label();

    public MilesConvertor() {
        super("Miles Convertor");
        setSize(300, 200);
        setLayout(null);
        setVisible(true);
        setResizable(false);
        setLocationRelativeTo(null);

        Label prompt = new Label("Enter distance in kilometers: ");

        Button convert_button = new Button("Convert");
        convert_button.addActionListener(e -> convert());
        Button quit_button = new Button("Quit");
        quit_button.addActionListener(e -> System.exit(0));

        prompt.setBounds(20, 50, 180, 20);
        input.setBounds(200, 50, 60, 20);
        output.setBounds(20, 80, 260, 20);
        output.setAlignment(Label.CENTER);
        convert_button.setBounds(85, 120, 60, 20);
        quit_button.setBounds(155, 120, 60, 20);

        add(prompt);
        add(input);
        add(output);
        add(convert_button);
        add(quit_button);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {dispose();}
        });
    }

    public void convert() {
        try {
            double kilometers = Double.parseDouble(input.getText());
            double miles = kilometers * 0.6214;
            output.setText(String.format("%.2f kilometers = %.2f miles", kilometers, miles));
        } catch (NumberFormatException e) {
            output.setText("Please enter a valid number");
        }
    }

    public static void main(String[] args) {
        new MilesConvertor();
    }
}

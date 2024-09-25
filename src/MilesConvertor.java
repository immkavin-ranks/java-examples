import java.awt.*;
import java.awt.event.*;

public class MilesConvertor extends Frame {
    TextField input = new TextField(10);
    Label output = new Label("");

    public MilesConvertor() {
        super("Miles Convertor");
        setSize(300, 200);
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(10, 10));

        Panel inputPanel = new Panel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        Label prompt = new Label("Enter distance in kilometers:");
        inputPanel.add(prompt);
        inputPanel.add(input);

        Panel buttonPanel = new Panel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        Button convert_button = new Button("Convert");
        convert_button.addActionListener(e -> convert());
        Button quit_button = new Button("Quit");
        quit_button.addActionListener(e -> System.exit(0));
        buttonPanel.add(convert_button);
        buttonPanel.add(quit_button);

        output.setAlignment(Label.CENTER);

        add(inputPanel, BorderLayout.NORTH);
        add(output, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {dispose();}
        });
        setVisible(true);
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
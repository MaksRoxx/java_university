package practice8;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class task2 {

    public static void main(String[] args) {
        // Установите путь к изображению в коде
        String imagePath = "src/practice8/images/3.jpg"; // Замените на ваш путь

        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Отображение изображения");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(800, 600);

            JLabel label = new JLabel();
            try {
                Image image = ImageIO.read(new File(imagePath));
                label.setIcon(new ImageIcon(image));
            } catch (IOException e) {
                e.printStackTrace();
            }

            frame.add(label, BorderLayout.CENTER);
            frame.setVisible(true);
        });
    }
}



package Day17;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.util.*;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;

class ShapeItem {

    private Shape shape;
    private Color color;

    public ShapeItem(Shape shape, Color color) {
        super();
        this.shape = shape;
        this.color = color;
    }

    public Shape getShape() {
        return shape;
    }

    public void setShape(Shape shape) {
        this.shape = shape;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
    class ShapesPanel extends JPanel {

        private List<ShapeItem> shapes;
        private Random rand = new Random();
        private SwingWorker<Boolean, Integer> worker;

        public ShapesPanel(List<ShapeItem> shapesList) {
            this.shapes = shapesList;
            worker = new SwingWorker<Boolean, Integer>() {

                @Override
                protected Boolean doInBackground() throws Exception {
                    while (true) {
                        Thread.sleep(200);
                        int dim = rand.nextInt(300);
                        publish(dim);
                        return true;
                    }
                }

                @Override
                protected void done() {
                    Boolean Status;
                    try {
                        Status = get();
                        System.out.println(Status);
                        super.done();                    //To change body of generated methods, choose Tools | Templates.
                    } catch (InterruptedException ex) {
                        Logger.getLogger(ShapesPanel.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (Exception ex) {
                        Logger.getLogger(ShapesPanel.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }

                @Override
                protected void process(List<Integer> chunks) {
                    int mostRecentValue = chunks.get(chunks.size() - 1);
                    System.out.println(mostRecentValue);
                    Color color2 = Color.LIGHT_GRAY;
                    ShapeItem tmpShape = shapes.get(mostRecentValue);
                    if (tmpShape.getColor() == Color.RED) {
                        tmpShape.setColor(color2);
                    }
                    repaint();
                }

            };
            worker.execute();

            addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    Color color1 = Color.LIGHT_GRAY;
                    for (ShapeItem item : shapes) {
                        if (item.getColor() == Color.BLUE) {
                            if (item.getShape().contains(e.getPoint())) {
                                item.setColor(color1);
                            }
                        }
                    }
                    repaint();
                }
            });
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

            Graphics2D g2 = (Graphics2D) g.create();

            for (ShapeItem item : shapes) {
                g2.setColor(item.getColor());
                g2.fill(item.getShape());
            }

            g2.dispose();
        }

        @Override
        public Dimension getPreferredSize() {
            return new Dimension(500, 500);
        }

        private Color getRandomColor() {
            return new Color(rand.nextFloat(), rand.nextFloat(),
                    rand.nextFloat());
        }
    }
public class MultiThreadingGameDriver {

    public static final Color DEFAULT_COLOR1 = Color.BLUE;
    public static final Color DEFAULT_COLOR2 = Color.RED;

    public MultiThreadingGameDriver() {
        List<ShapeItem> shapes = new ArrayList<ShapeItem>();

        int Total = 10;
        for (int i = 1; i <= Total; i++) {
            for (int j = 1; j <= Total; j++) {
                if ((i + j) % 2 == 0) {

                    shapes.add(new ShapeItem(new Ellipse2D.Double(i * 25, j * 25, 20, 20),
                            DEFAULT_COLOR1));
                } else {
                    shapes.add(new ShapeItem(new Rectangle2D.Double(i * 25, j * 25, 20, 20),
                            DEFAULT_COLOR2));
                }
            }
        }

        JFrame frame = new JFrame("Bubble Pop Quest!!");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ShapesPanel panel = new ShapesPanel(shapes);
        frame.add(panel);
        frame.setLocationByPlatform(true);
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new MultiThreadingGameDriver();
            }
        });
    }
}

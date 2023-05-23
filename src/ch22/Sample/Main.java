package ch22.Sample;

import ch22.Sample.command.*;
import ch22.Sample.drawer.*;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

// 다중상속 안돼서 windowadapter 말고 windowlistener 사용해야함.
public class Main extends JFrame implements MouseMotionListener, WindowListener {
    // 그리기 이력 
    private MacroCommand history = new MacroCommand();
    // 그리는 영역 
    private DrawCanvas canvas = new DrawCanvas(400, 400, history);
    // 삭제 버튼
    private JButton clearButton  = new JButton("clear");

    // 생성자 
    public Main(String title) {
        super(title);

        //리스너 등록
        this.addWindowListener(this);

        // (1) 리스너 클래스를 만들어서 등록
        // canvas.addMouseMotionListener(this);

        // (2) 익명의 내부 클래스를 이용해서 등록
    //     canvas.addMouseMotionListener(new MouseMotionListener() {
    //         @Override
    //         public void mouseMoved(MouseEvent e) {
    //         }

    //         @Override
    //         public void mouseDragged(MouseEvent e) {
    //             Command cmd = new DrawCommand(canvas, e.getPoint());

    //             history.append(cmd);
    //             cmd.execute();
    // }
    //     });

        //(3) 익명의 내부 클래스와 어댑터를 이용해서 등록
        canvas.addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseDragged(MouseEvent e) {
                Command cmd = new DrawCommand(canvas, e.getPoint());

                history.append(cmd);
                cmd.execute();
            }
        });


        
        clearButton.addActionListener(e -> {
            history.clear();
            canvas.repaint();
        });

        Box buttonBox = new Box(BoxLayout.X_AXIS);
        buttonBox.add(clearButton);
        Box mainBox = new Box(BoxLayout.Y_AXIS);
        mainBox.add(buttonBox);
        mainBox.add(canvas);
        getContentPane().add(mainBox);

        pack();
        setVisible(true);
    }

    // MouseMotionListener용
    @Override
    public void mouseMoved(MouseEvent e) {
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        Command cmd = new DrawCommand(canvas, e.getPoint());
        history.append(cmd);
        cmd.execute();
    }

    // WindowListener용 
    @Override
    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }

    @Override public void windowActivated(WindowEvent e) {}
    @Override public void windowClosed(WindowEvent e) {}
    @Override public void windowDeactivated(WindowEvent e) {}
    @Override public void windowDeiconified(WindowEvent e) {}
    @Override public void windowIconified(WindowEvent e) {
        System.out.println("미니마이즈 되었습니다.");
    }
    @Override public void windowOpened(WindowEvent e) {}

    public static void main(String[] args) {
        new Main("Command Pattern Sample");
    }
}

import javax.swing.JFrame; 

public class GameFrame extends JFrame  {

    GameFrame(){
        
       /*  GamePanel panel = new GamePanel();
        this.add(panel); */ 

        this.add(new GamePanel());
        this.setTitle("Snake");  
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false); 
        this.pack();  //fits all components that we add to the frame
        this.setVisible(true);
        this.setLocationRelativeTo(null); //window appears in the middle of the screen
    }
}

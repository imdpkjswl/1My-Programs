import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.security.PublicKey;
import java.util.Random;

public class playGame extends JPanel implements KeyListener, ActionListener
{
    private int snakexlength[] = new int[750];
    private int snakeylength[] = new int[750];
    private int enemyxposition[]={25,50,75,100,125,150,175,200,225,250,275,300,325,350,375,400,425,450,475,500,525,550,575,600,625,650,675,700,725,750,775,800,825,850};
    private int enemyyposition[]={75,100,125,150,175,200,225,250,275,300,325,350,375,400,425,450,475,500,525,550,575,600,625,650};

    private boolean left = false;
    private boolean right = false;
    private boolean up = false;
    private boolean down = false;

    private ImageIcon titleImage;
    private ImageIcon rightmouth;
    private ImageIcon leftmouth;
    private ImageIcon upmouth;
    private ImageIcon downmouth;
    private ImageIcon snakeimage;
    private ImageIcon enemyicon;

    private Random random = new Random();

    private Timer timer;

    private int delay =100;                                         //Used to change the speed of the snake
    private int lengthofsnake=3;                                    //Default size of the snake
    private int moves=0;
    private int score=0;
    private int xpos=random.nextInt(34);
    private int ypos=random.nextInt(23);

    public playGame()
    {
        addKeyListener(this);
        setFocusable(true);                             //Used to focus the components present inside the game play area i.e. snake arrays
        setFocusTraversalKeysEnabled(false);            //Used for changing the focusabiltity of objects in the frame
        timer = new Timer(delay, this);
        timer.start();
    }

    public void paint(Graphics g)
    {
        if(moves==0)    //To check if the game has just started and set the default position of the snake
        {
            snakexlength[2]=50;
            snakexlength[1]=75;
            snakexlength[0]=100;

            snakeylength[2]=100;
            snakeylength[1]=100;
            snakeylength[0]=100;

        }


        //create title image border
        g.setColor(Color.white);
        g.drawRect(24,10,851,55);

        //create title image
        titleImage=new ImageIcon("snaketitle.jpg");
        titleImage.paintIcon(this,g,25,11);

        //create gameplay border
        g.setColor(Color.white);
        g.drawRect(24,74,851,577);

        //create gameplay background
        g.setColor(Color.black);
        g.fillRect(25,75,850,575);

        g.setColor(Color.white);
        g.drawString("SCORES: "+score,700,30);

        g.setColor(Color.white);
        g.drawString("LENGTH OF SNAKE: "+lengthofsnake,700,50);



        rightmouth = new ImageIcon("rightmouth.png");                   // default snake image
        rightmouth.paintIcon(this,g,snakexlength[0],snakeylength[0]);       //painticon is used to paint icon at a specific location


        //DetectInitialFaceDirectionOfSnake
        for(int a=0;a<lengthofsnake;a++)
        {
            if(a==0&right)
            {
                rightmouth = new ImageIcon("rightmouth.png");
                rightmouth.paintIcon(this,g,snakexlength[a],snakeylength[a]);
            }

            if(a==0&left)
            {
                leftmouth = new ImageIcon("leftmouth.png");
                leftmouth.paintIcon(this,g,snakexlength[a],snakeylength[a]);
            }

            if(a==0&up)
            {
                upmouth = new ImageIcon("upmouth.png");
                upmouth.paintIcon(this,g,snakexlength[a],snakeylength[a]);
            }

            if(a==0&down)
            {
                downmouth = new ImageIcon("rightmouth.png");
                downmouth.paintIcon(this,g,snakexlength[a],snakeylength[a]);
            }

            if(a!=0)
            {
                snakeimage = new ImageIcon("snakeimage.png");
                snakeimage.paintIcon(this,g,snakexlength[a],snakeylength[a]);
            }
        }

        enemyicon = new ImageIcon("enemy.png");
        enemyicon.paintIcon(this,g,enemyxposition[xpos],enemyyposition[ypos]);


        if((enemyxposition[xpos]==snakexlength[0])&&(enemyyposition[ypos]==snakeylength[0]))
        {
            score++;
            lengthofsnake++;
            xpos=random.nextInt(34);
            ypos=random.nextInt(23);
        }

        for(int b=1;b<=lengthofsnake;b++)
        {
            if((snakexlength[b]==snakexlength[0])&&(snakeylength[b]==snakeylength[0]))
            {
                right=false;
                left=false;
                up=false;
                down=false;

                g.setColor(Color.white);
                g.setFont(new Font("aerial",Font.BOLD,25));
                g.drawString("GAME OVER!",300,300);

                g.setColor(Color.white);
                g.setFont(new Font("aerial",Font.BOLD,25));
                g.drawString("PRESS SPACE TO RESTART",350,340);
            }
        }

        g.dispose();        //used to clear resources at each frame

    }


    @Override
    public void actionPerformed(ActionEvent e)
    {
        timer.start();

        if(right)
        {
            for(int r=lengthofsnake-1;r>=0;r--)     //making body of snake follow the head
            {
                snakeylength[r+1]=snakeylength[r];
            }

            for(int r=lengthofsnake;r>=0;r--)
            {
                if(r==0)
                {
                    snakexlength[r]=snakexlength[r]+25;     // if snake moves to right, increase size
                }
                else
                {
                    snakexlength[r]=snakexlength[r-1];      //if snake moves to left, dont let it turn left but put left face to output
                }

                if(snakexlength[r]>850)             //if snake crosses the frame by moving towards right , bring it from left
                {
                    snakexlength[r]=25;
                }

                repaint();
            }
        }

        if(left)
        {
            for(int r=lengthofsnake-1;r>=0;r--)     //making body of snake follow the head
            {
                snakeylength[r+1]=snakeylength[r];
            }

            for(int r=lengthofsnake;r>=0;r--)
            {
                if(r==0)
                {
                    snakexlength[r]=snakexlength[r]-25;
                }
                else
                {
                    snakexlength[r]=snakexlength[r-1];
                }

                if(snakexlength[r]<25)
                {
                    snakexlength[r]=850;
                }

                repaint();
            }
        }

        if(up)
        {
            for (int r = lengthofsnake - 1; r >=0; r--)     //making body of snake follow the head
            {
                snakexlength[r + 1] = snakexlength[r];
            }

            for (int r = lengthofsnake; r >= 0; r--)
            {
                if (r == 0)
                {
                    snakeylength[r] = snakeylength[r] - 25;
                } else
                {
                    snakeylength[r] = snakeylength[r - 1];
                }

                if (snakeylength[r] < 75)
                {
                    snakeylength[r] = 625;
                }

                repaint();
            }
        }

        if (down)
        {
            for (int r = lengthofsnake - 1; r >= 0; r--)     //making body of snake follow the head
            {
                snakexlength[r + 1] = snakexlength[r];
            }

            for (int r = lengthofsnake; r >= 0; r--)
            {
                if (r == 0)
                {
                    snakeylength[r] = snakeylength[r] + 25;
                } else
                {
                    snakeylength[r] = snakeylength[r - 1];
                }

                if (snakeylength[r] > 625)
                {
                    snakeylength[r] = 75;
                }

                repaint();
            }

        }

    }

    @Override
    public void keyTyped(KeyEvent e) {              //gets activated when key is typed

    }

    @Override
    public void keyPressed(KeyEvent e) {        //Gets activated when key is pressed

        if(e.getKeyCode()==KeyEvent.VK_SPACE)
        {
            moves=0;
            score=0;
            lengthofsnake=3;
            repaint();
        }

        if(e.getKeyCode()== KeyEvent.VK_RIGHT)
        {
            moves++;
            right = true;

            if(!left)
            {
                right=true;
            }
            else
            {
                left=true;
                right=false;
            }

            up = false;
            down = false;
        }

        if(e.getKeyCode()== KeyEvent.VK_LEFT)
        {
            moves++;
            left=true;

            if(!right)
            {
                left=true;
            }
            else
            {
                right=true;
                left=false;
            }

            up = false;
            down = false;
        }


        if(e.getKeyCode()== KeyEvent.VK_UP)
        {
            moves++;
            up=true;

            if(!down)
            {
                up=true;
            }
            else
            {
                down=true;
                up=false;
            }

            left = false;
            right = false;
        }


        if(e.getKeyCode()== KeyEvent.VK_DOWN)
        {
            moves++;
            down=true;

            if(!up)
            {
                down=true;
            }
            else
            {
                down=false;
                up=true;
            }

            left = false;
            right = false;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {                   // gets activated when key is released

    }
}
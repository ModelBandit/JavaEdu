package FractalTree;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
 
class FractalTree extends JFrame implements ActionListener{
	
	public boolean countOnOff;	// 다양한 가지색의 표현을 위한 옵션의 On/Off 확인을 위한 변수 
	public boolean randOnOff;	// 고정/랜덤 그리기의 구분을 위한 변수
	
	public int angle;	 // 각도
	public int height;	 // 가지높이
	public int length;	 // 가지길이 (랜덤선택시 자동으로 값을줌)
	public double scale; // 가지기울기 (랜덤선택시 자동으로 값을줌)
	public int thick;    // 가지굵기
	public int count;    // 마지막 가지에 도달했는지 확인하기 위한 변수
	public int setX;     // x좌표
	public int setY;     // y좌표
	
	final int posX = 120; // 컴포넌트들의 x위치를 조정하기 위한 값
	final int posY = 0;   // 컴포넌트들의 y위치를 조정하기 위한 값(미사용)
	
	final int scrWidth = 1120; 		// 화면의 넓이
	final int scrHeight = 720; 		// 화면의 높이
	final int componentWidth = 100; // 컴포넌트들의 사이즈 조정을 위한 넓이
	final int componentHeight = 30; // 컴포넌트들의 사이즈 조정을 위한 높이
	
	Font font;
	Color myColor;
	
	JLabel notify[]; // 컴포넌트들의 기능 알림을 위한 라벨
	JLabel scrNotify; // 화면 사이즈의 알림을 위한 라벨
	
	JButton exitButton; // 종료버튼
	JButton randButton; // 랜덤 프렉탈 나무 그리기 버튼
	JButton drawButton; // 고정 프렉탈 나무 그리기 버튼
	JButton flagButton; // 옵션 On/Off를 위한 버튼
	
	JTextField angleText; // 초기각을 설정하기 위한 텍스트필드
	JTextField heightText; // 가지의 높이 설정을 위한 텍스트필드
	JTextField lengthText; // 가지 길이의 설정을 위한 텍스트필드
	JTextField setXText; // 초기 x좌표의 설정을 위한 텍스트필드
	JTextField setYText; // 초기 y좌표의 설정을 위한 텍스트필드
	
    public FractalTree() {
    	
        setTitle("Fractal Tree");
        setLayout(null); // 컴포넌트들의 자유배치를 위해 레이아웃을 null로 설정 
        setSize(scrWidth,scrHeight); // 화면의 사이즈를 설정한다
        setBackground(Color.white); // 배경색을 흰색
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        count = 0;
        countOnOff = false;
        randOnOff = false;
        
        //////////////////////////////////////컴포넌트 추가////////////////////////////////////////////
        font = new Font("굴림",Font.BOLD,16); // 폰트설정(굴림체,굵은글씨,글자크기16)
        
        // 알림 레이블 설정
        notify = new JLabel[5];
        
        for(int i=0; i<5; i++){
        	notify[i] = new JLabel();
        	notify[i].setFont(font);
        	notify[i].setBounds(scrWidth-posX-50, (((scrHeight/2)+120)+(i*40)), componentWidth, componentHeight);
        }
        
        notify[0].setText("  각도");
        notify[1].setText("  깊이");
        notify[2].setText("  길이");
        notify[3].setText("x좌표");
        notify[4].setText("y좌표");
        
        for(int i=0; i<5; i++){
        	this.add(notify[i]);
        }
        
        scrNotify = new JLabel("현재 스크린의 크기 : "+scrWidth+" X "+scrHeight);
        scrNotify.setFont(font);
        scrNotify.setBounds((scrWidth/2)-500, scrHeight-70, componentWidth+200, componentHeight);
        add(scrNotify);
        //
        
        // 버튼설정
        exitButton = new JButton("종료");
        exitButton.setBounds(scrWidth-posX, (scrHeight/2)-40, componentWidth, componentHeight);
        add(exitButton);
        
        flagButton = new JButton("옵션");
        flagButton.setBounds(scrWidth-posX, (scrHeight/2), componentWidth, componentHeight);
        add(flagButton);
        
        randButton = new JButton("랜덤그리기");
        randButton.setBounds(scrWidth-posX, (scrHeight/2)+40, componentWidth, componentHeight);
        add(randButton);
        
        drawButton = new JButton("일반그리기");
        drawButton.setBounds(scrWidth-posX, (scrHeight/2)+80, componentWidth, componentHeight);
        add(drawButton);
        //
        
        // 텍스트필드 설정
        angleText = new JTextField(10);
        angleText.setBounds(scrWidth-posX, (scrHeight/2)+120, componentWidth, componentHeight);
        angleText.setText("-90"); // 초기의 가지를 수직으로 그리기 위해 초기각의 값을 -90 으로 설정
        add(angleText);
        
        heightText = new JTextField(10);
        heightText.setBounds(scrWidth-posX, (scrHeight/2)+160, componentWidth, componentHeight);
        heightText.setText("0"); // 초기 가지의 높이값은 0 (사용자가 입력)
        add(heightText);
        
        lengthText = new JTextField(10);
        lengthText.setBounds(scrWidth-posX, (scrHeight/2)+200, componentWidth, componentHeight);
        lengthText.setText("0"); // 초기 가지의 길이값은 0 (사용자가 입력)
        add(lengthText);
        
        setXText = new JTextField(10);
        setXText.setBounds(scrWidth-posX, (scrHeight/2)+240, componentWidth, componentHeight);
        setXText.setText("520"); // 초기 x좌표의 위치는 554
        add(setXText);
        
        setYText = new JTextField(10);
        setYText.setBounds(scrWidth-posX, (scrHeight/2)+280, componentWidth, componentHeight);
        setYText.setText("690"); // 초기 y좌표의 위치는 690
        add(setYText);
        //
        ///////////////////////////////////////////////////////////////////////////////////////////
        
        exitButton.addActionListener(this); // 각 버튼에 액션이벤트 설정
        flagButton.addActionListener(this);
        randButton.addActionListener(this);
        drawButton.addActionListener(this);
        
        setVisible(true);
    }
    
    //파일 저장 함수
    
    
    //일반 나무그리기 함수
    private void drawTree(Graphics g, int x1, int y1, double angle, int height, int count) {
    	count++;
    	Graphics2D g2=(Graphics2D)g;
    	g2.setStroke(new BasicStroke(5,BasicStroke.CAP_ROUND,0)); // 나무가지 굵기를 설정한다(끝이 둥근모양)
    	// 매끄러운 그림의 표현을 위해 안티앨리어싱 사용
    	g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
    	
    	if (height == 0){return;}
    	if(count>=this.height){ // 초기에 설정해둔 height의 값에 도달했을시(마지막 가지를 그릴때)
    		if(countOnOff==true){ // 옵션 버튼이 On 상태일시
    			int red = 1 + (int)(Math.random()*255);
        		int green = 1 + (int)(Math.random()*255);
        		int blue = 1 + (int)(Math.random()*255);
        		myColor = new Color(red,green,blue);
        		g.setColor(myColor);
        		g2.setStroke(new BasicStroke(14,BasicStroke.CAP_ROUND,0));
    		}
    		else{
    			g.setColor(new Color(0,255,0));
        		g2.setStroke(new BasicStroke(14,BasicStroke.CAP_ROUND,0));
    		}
    	}
    	
        int x2 = x1 + (int) (Math.cos(Math.toRadians(angle)) * height * length); // 다음 x좌표의 생성
        int y2 = y1 + (int) (Math.sin(Math.toRadians(angle)) * height * length); // 다음 y좌표의 생성
        g.drawLine(x1, y1, x2, y2); // 주어진 좌표로 가지를 그린다
        
//        x,y 좌표마다 번호를 달아주는 기능
//        if(countOnOff == true){
//        	g.setColor(Color.red);
//            g.drawString(Integer.toString(count), x1, y1-5);
//        }
        
        g.setColor(new Color(138,62,12));
        drawTree(g, x2, y2, angle - 20, height - 1, count); // 고정프랙탈나무의 기울기값은 20으로 고정(좌측)
        drawTree(g, x2, y2, angle + 20, height - 1, count); // 고정프랙탈나무의 기울기값은 20으로 고정(우측)
    }
    //
    
    // 랜덤 나무 그리기 메서드
    private void drawRandTree(Graphics g, int x1, int y1, double angle, int height, int count) {
    	count++;
    	
    	thick = 3+(int)(Math.random()*5); // 두께의 랜덤값
    	length = 2+(int)(Math.random()*11); // 길이의 랜덤값
    	scale = 10.0+Math.random()*20.0; // 기울기의 랜덤값
    	
    	Graphics2D g2=(Graphics2D)g;
    	g2.setStroke(new BasicStroke(thick,BasicStroke.CAP_ROUND,0)); // 나무가지 굵기를 설정한다(끝이 둥근모양)
    	// 매끄러운 그림의 표현을 위해 안티앨리어싱 사용
    	g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
    	
    	if (height == 0){return;}
    	if(count>=this.height){ // 초기에 설정해둔 height의 값에 도달했을시(마지막 가지를 그릴때)
    		if(countOnOff==true){ // 옵션 버튼이 On 상태일시
    			int red = 1 + (int)(Math.random()*255);
        		int green = 1 + (int)(Math.random()*255);
        		int blue = 1 + (int)(Math.random()*255);
        		myColor = new Color(red,green,blue);
        		g.setColor(myColor);
        		g2.setStroke(new BasicStroke(14,BasicStroke.CAP_ROUND,0));
    		}
    		else{
    			g.setColor(new Color(255,0,0));
        		g2.setStroke(new BasicStroke(14,BasicStroke.CAP_ROUND,0));
    		}
    	}
    	
        int x2 = x1 + (int) (Math.cos(Math.toRadians(angle)) * height * length); // 다음 x좌표의 생성
        int y2 = y1 + (int) (Math.sin(Math.toRadians(angle)) * height * length); // 다음 y좌표의 생성
        
        g.drawLine(x1, y1, x2, y2); // 주어진 좌표로 다음 가지를 그린다

        g.setColor(new Color(138,62,12));
        drawRandTree(g, x2, y2, angle - scale, height - 1, count); // 랜덤프랙탈나무의 기울기값은 20으로 고정(좌측)
        drawRandTree(g, x2, y2, angle + scale, height - 1, count); // 랜덤프랙탈나무의 기울기값은 20으로 고정(좌측)
    }
    
    //버튼의 액션이벤트 처리소
    @Override public void actionPerformed(ActionEvent e){
    	if(e.getSource() == exitButton){ // 종료버튼을 누를시
    		System.exit(0);
    	}
    	
    	if(e.getSource() == flagButton){ // 옵션 버튼을 누를시
    		if(countOnOff==false){
    			countOnOff=true;
    		}
    		else{
    			countOnOff=false;
    		}
    	}
    	
    	if(e.getSource() == randButton){ // 랜덤그리기 버튼을 누를시
    		this.setVisible(false); // 새로운 그림을 다시 보여주기 위해 화면을 잠시 가린다
    		
    		randOnOff = true;
    		// 랜덤 그리기에서는 가지의 길이와 기울기는 랜덤으로 주어진다(텍스트필드에서 얻어 오지 않음)
    		angle = Integer.parseInt(angleText.getText()); // 텍스트필드에서의 문자열을 정수형으로 파싱
    		height = Integer.parseInt(heightText.getText()); // 텍스트필드에서의 문자열을 정수형으로 파싱
    		setX = Integer.parseInt(setXText.getText());   // 텍스트필드에서의 문자열을 정수형으로 파싱
        	setY = Integer.parseInt(setYText.getText());   // 텍스트필드에서의 문자열을 정수형으로 파싱
    		
    		this.repaint(); // 화면을 다시 그린다
    		this.setVisible(true); // 가렸던 화면을 다시 보여준다
    	}
    	
    	if(e.getSource() == drawButton){
    		this.setVisible(false);
    		
    		randOnOff = false;
    		angle = Integer.parseInt(angleText.getText());
        	height = Integer.parseInt(heightText.getText());
        	length = Integer.parseInt(lengthText.getText());
        	setX = Integer.parseInt(setXText.getText());
        	setY = Integer.parseInt(setYText.getText());
        	
        	this.repaint();
        	this.setVisible(true);
    	}
    }
    //
    
    @Override
    public void paint(Graphics g) { // 랜덤그리기 혹은 고정그리기 버튼을 누를시 호출
    	//8bit Gray Level의 영상출력을 위한 BufferedImage 생성 (java2D 그래픽스 서적 참고-조나단 크누드센 저)
        //여기서 영상의 크기는 1024 x 1024 이다
        BufferedImage image = new BufferedImage(1024, 1024, BufferedImage.TYPE_BYTE_GRAY);
    	Graphics print_image = image.createGraphics(); // 1024x1024의 메모리 할당
    	
    	if(randOnOff==true){		// 랜덤그리기 버튼을 눌렀을시
    		g.setFont(font);
    		print_image.setFont(font); // 영상을 파일에 출력하기 위함
    		g.setColor(Color.black);
    		print_image.setColor(Color.black);
    		// 초기 x,y의 좌표를 출력
    		g.drawString(setXText.getText()+" , "+setYText.getText(), Integer.parseInt(setXText.getText())+8, Integer.parseInt(setYText.getText()));
    		print_image.drawString(setXText.getText()+" , "+setYText.getText(), Integer.parseInt(setXText.getText())+8, Integer.parseInt(setYText.getText()));
    		g.setColor(new Color(138,62,12)); // 초기 가지색의 설정(갈색)
    		print_image.setColor(new Color(138,62,12));
    		drawRandTree(g, setX, setY, angle, height, count); // 랜덤 프렉탈 나무 그리기 시작
    		drawRandTree(print_image, setX, setY, angle, height, count);
    		
    		try{
                File file = new File("./랜덤프랙탈.bmp");
                ImageIO.write(image, "bmp", file);
            }
            catch (Exception e){e.printStackTrace();}
    	}
    	else{  // 고정그리기 버튼을 눌렀을시
    		g.setFont(font);
    		print_image.setFont(font);
    		g.setColor(Color.black);
    		print_image.setColor(Color.black);
    		g.drawString(setXText.getText()+" , "+setYText.getText(), Integer.parseInt(setXText.getText())+8, Integer.parseInt(setYText.getText()));
    		print_image.drawString(setXText.getText()+" , "+setYText.getText(), Integer.parseInt(setXText.getText())+8, Integer.parseInt(setYText.getText()));
    		g.setColor(new Color(138,62,12));
    		print_image.setColor(new Color(138,62,12));
            drawTree(g, setX, setY, angle, height, count);
            drawTree(print_image, setX, setY, angle, height, count);// 고정 프렉탈 나무 그리기 시작
            
            try{
                File file = new File("./고정프랙탈.bmp");
                ImageIO.write(image, "bmp", file);
            }
            catch (Exception e){e.printStackTrace();}
    	}
    }

//     더블버퍼링 기법 사용(별 차이가 없어서 주석처리함)  
    @Override public void update(Graphics g){
    	this.setVisible(true);
    }
}

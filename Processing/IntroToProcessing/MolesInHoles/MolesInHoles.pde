int moleX = mouseX;
int moleY = mouseY;

void drawMole(int mouseX,int mouseY){
  noStroke();
  fill(125, 93, 43);
  ellipse(mouseX, mouseY, 60, 60); // face
  fill(255, 237, 209);
  ellipse(mouseX, mouseY+10, 33, 28); 
  fill(0, 0, 0);
  ellipse(mouseX-10, mouseY-15, 10, 10); // eyes
  ellipse(mouseX+10, mouseY-15, 10, 10);
  ellipse(mouseX, mouseY-5, 10, 10); // nose
  ellipse(mouseX, mouseY+10, 20, 5); // mouth

  }


void draw() {

if(mousePressed){
  
  drawMole(mouseX,mouseY);
  
}
}






void setup() {
  size(400, 400);
  background(78, 166, 51); // green grass
  fill(0, 0, 0);
  ellipse(200, 200, 100, 30); // holes!
  ellipse(70, 119, 100, 30);
  ellipse(300, 60, 100, 30);
  ellipse(297, 350, 100, 30);
  
  
}






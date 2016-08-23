  int xpos = 10;
  int speed = 2;
  int ypos = 10;
  
void setup(){
  size(400,400);

}

void draw(){
  
    xpos = xpos+speed;
    ypos = ypos+speed;
  background(255,255,255);
  ellipse(xpos,ypos,50,50);
  fill(0,0,0);
  
 if (xpos > 400){
 speed = -speed;
 }
 if (xpos < 0){
   speed = -speed;
 }
    if (ypos > 400){
 speed = -speed;
 }
 if (ypos < 0){
   speed = -speed;
 }
}

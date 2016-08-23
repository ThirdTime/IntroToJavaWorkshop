 void setup() {
  size(800, 800);
}

void draw() {
  
   //2. make it a nice color
fill(136,0,170);
   //3. if the mouse is pressed, fill the circle with a different color          
if(mousePressed)
{
  fill(102,0,102);
}
else
{
  fill(136,0,170);
}
   //1. draw an ellipse
   ellipse(400,400,500,500);

}

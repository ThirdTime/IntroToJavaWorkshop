
void setup()
{
  //another day, another program
size(300,300);
fill(255,2211,51);
//face
ellipse(150,150,99,99);
fill(0,0,0);
//left eye
ellipse(135,135,15,15);
//right eye
ellipse(165,135,15,15);
//mouth
line(165,170,135,170);
//body
line(150,200,150,300);
line(150,250,100,200);
line(150,250,200,200);
}

void draw(){
  if(mousePressed)
  {
  text("help",168,205);

}
  else
  {
    text("this is so ugly",168,100);
  }
}

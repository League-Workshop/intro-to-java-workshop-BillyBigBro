PImage catPic;
void setup(){
size(1000, 1000);
}
void draw(){

catPic = loadImage ("cat.png");
catPic.resize(1000,1000);
background(catPic);
if(mousePressed){
   println(mouseX, mouseY);
}
fill(#FF0000);
  ellipse(503,240, 80, 80);
  ellipse(688, 233, 80, 80);
 
  fill(#00FFFF);
  line(507, 254, 603, 396);
  strokeWeight(8);
  line(693, 247, 782, 374);
}


void keyPressed(){
}
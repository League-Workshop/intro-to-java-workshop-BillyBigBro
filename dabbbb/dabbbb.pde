PImage rainbow;
  PImage unicorn;

void setup(){
  rainbow = loadImage("gay.jpeg");
    unicorn = loadImage("uni.png");
    size(1000, 1000);
    rainbow.resize(width,height);
  background(rainbow);



}

void draw(){
background(rainbow);
  unicorn.resize(500,500);
  image(unicorn, mouseX,mouseY);

}
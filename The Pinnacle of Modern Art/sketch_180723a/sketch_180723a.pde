void setup(){
  size(1920,2080);
}

void draw() {
  background(#f95454);
  fill(#00cc00);
  rect(100,100,100,100);
fill(#0000FF);
  ellipse(300,300,100,100);
fill(#FF0000);
  triangle(500,500,500,500,200,200);
  println(mouseX);
  println(mouseY);
  println();
}
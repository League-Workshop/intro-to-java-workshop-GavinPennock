PImage mustache;
PImage baseball;
void setup(){
  size (800,800);
baseball =
loadImage ("baseball.jpeg");
baseball.resize(800,800);
  
}
void draw(){
  background(baseball);
  mustache =
  loadImage ("moustache.png");
  image (mustache,0,400);
}

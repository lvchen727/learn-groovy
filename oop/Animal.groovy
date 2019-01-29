import groovy.transform.ToString;

// part of OOP tutorial

@ToString(includeNames = true, includeFields = true)
class Animal{
  def name;
  def sound;


  def run(){
    println("$name runs");
  }


  def makeSound(){
    println("$name says $sound");

  }


  def Animal(name, sound){
    this.name = name;
    this.sound = sound;
  }
}
class Dog extends Animal{


// part of OOP tutorial 
  
  def owner;

  def Dog(name, sound, owner){

    super(name, sound);

    this.owner = owner;
  }


  def makeSound(){
    println("$name says bark and $sound");
  }
}
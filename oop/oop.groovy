class GroovyOOPTut{


    // see Animal.groovy and Dog.groovy
    static void main(String[] args){

       def king = new Animal('King', 'Growl');

       println("$king.name says $king.sound");


       king.setSound('Grrr');


       println("$king.name says $king.sound");

       king.run();

       println(king.toString());



       def grover = new Dog("Grover", "Grrr", "Chen");

       king.makeSound();
       grover.makeSound();

    }

}
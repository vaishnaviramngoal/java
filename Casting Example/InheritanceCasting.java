public class InheritanceCasting {
    public static void main(String[] args) {
        
        // Upcasting 
        
        Dog Dog = new Dog();
        Animal animalDog = Dog; 
        animalDog.sound(); 

        
        Cat cat = new Cat();
        Animal animalCat = cat; 
        animalCat.sound(); 

        
        // Downcasting  
        
        
        Animal animal = new Dog(); 
        Dog specificDog = (Dog) animal; 
        specificDog.breed(); 

        
        Animal animal1 = new Cat(); 
        Cat specificCat = (Cat) animal1; 
        specificCat.scratch(); 
    }
}

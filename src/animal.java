//Animal is parent class of Cat and Dog. They have different “walk” behaviors (function).
//(Polymorphism)

class animal {
    public void animalWalk() {
        System.out.println("Animal walk in different way");
    }
}

class Cat extends animal {
    public void animalWalk() {
        System.out.println("Cat walks");
    }
}

class Dog extends animal {
    public void animalWalk() {
        System.out.println("Dog runs");
    }
}

class Main {
    public static void main(String[] args){
        animal newAnimal = new animal();
        animal newCat = new Cat();
        animal newDog = new Dog();
        newAnimal.animalWalk();
        newCat.animalWalk();
        newDog.animalWalk();
    }
}
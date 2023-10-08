package podyplomowe;

public class MyCat {
        public static void main(String[]args){
            Cat firstCat = new Cat();
            firstCat.name = "Bonifacy";
            firstCat.color = "black";
            firstCat.age = 5;
            firstCat.hungry = true;

//            Meet my cat. My cat is awesome.
            System.out.println(firstCat.name + " say hi to our new friend.");
            firstCat.meow();
            firstCat.meetMyCat();
            firstCat.feed();
        }
}

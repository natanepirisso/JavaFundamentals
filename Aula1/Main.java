public class Main {
    public static void main() {
        Character pessoa1 = new Character("Josh");
        pessoa1.walk();
    }
}
class Character {
    String firstName;
    public Character(String firstName){
        this.firstName = firstName;
    }
    public void walk(){
        System.out.println(this.firstName + " " + "está andando");
    }
}

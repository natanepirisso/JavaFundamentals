package aula_1;
class Character {
    String firstName;
    public Character(String firstName){
        this.firstName = firstName;
    }
    public void walk(){
        System.out.println(this.firstName + " " + "está andando");
    }
}


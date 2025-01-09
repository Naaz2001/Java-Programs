class Player {
    public void function1() {
        System.out.println("Player class..");
    }
}
class Cricket_Player extends Player{
    public void function2(){
        System.out.println("Cricket player function..");
    }
}
class Football_Player extends Player{
    public void function3() {
        System.out.println("Football player function...");
    }
}
class Hockey_Player extends Player{
    public void function4() {
        System.out.println("Hockey player function....");
    }
}

public class PlayerInfo{
    public static void main(String[] args) {
        Cricket_Player obj1 = new Cricket_Player();
        obj1.function1();
        obj1.function2();
        Football_Player obj2 = new Football_Player();
        obj2.function1();
        obj2.function3();
        Hockey_Player obj3 = new Hockey_Player();
        obj3.function1();
        obj3.function4();
        System.out.println("Name : Sheebanaaz Makandar \t SAP : 500117989");
    }
}

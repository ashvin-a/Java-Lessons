class Animal {

    String Cap = "Animals rock";

    void Run() {
        System.out.println("TEstin2");
    }
}

class Class extends Animal {
    
    void Test(){
        System.out.println("Testing1");
    }

    void Run() {
        System.out.println(super.Cap);
    }

}

public class HelloWorld extends Class {
    public static void main(String args[]) {
        System.out.println("You are so cool vscode!!!!");
        Class t = new Class();
        Animal An = new Animal();
        t.Test();
        t.Run();
        An.Run();

    }
}

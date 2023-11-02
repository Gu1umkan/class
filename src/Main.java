import java.util.Arrays;
public class Main {
    public static void main(String[] args) {

        MyClass myClass = new MyClass("Gulumkan", "Uson kyzy", 21, "Plov", "java", "English");
        getInfo(myClass);
        MyClass myClass1 = new MyClass();
        myClass1.name = "Zarina";
        myClass1.surname = "Akmatova";
        myClass1.age = 20;
        myClass1.favoriteFood = "Manty";
        myClass1.lesson = new String[]{"English", "JS"};
        getInfo(myClass1);
    }
    public static void getInfo(MyClass myClass){
        System.out.println(STR."""
                Name : \{myClass.name}
                Surname: \{myClass.surname}
                Age:\{myClass.age}
                Favorite food : \{myClass.favoriteFood}
                Lesson: \{ Arrays.toString(myClass.lesson)}
                """);
                }
}
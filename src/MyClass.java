import java.util.Arrays;
public class MyClass {
    String name;
    String surname;
    int age;
    String[] lesson;
    String  favoriteFood;

    public MyClass(String name, String surname,int age,String favoriteFood,String ...lesson){
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.favoriteFood = favoriteFood;
        this.lesson = lesson;
    }
    public MyClass(){}

}

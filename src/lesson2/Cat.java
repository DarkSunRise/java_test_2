package lesson2;

/**
 * Created by Viktoriya.D on 6/26/2017.
 */
public class Cat extends Animals {
    Cat(double age, String name, String gender) {
        super(age, name, gender);
    }
    Cat(){
    }
    void voice (){
        for (int i=0; i<age;i++){
            System.out.println("Meow!");
        }
    }
    @Override
    public String toString() {
        return "I'm a cat :" + "\n" + "My age = " + age + "," + "\n" + "My name is " + name + ", " + '\n' + "My gender = " + gender;
    }
}
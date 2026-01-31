public class Person {
    String name;
    int age;
    String gender;
    Person (String name) {
        this.name = name;
    }
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    public void printNameAgeGender() {
        System.out.println(name +  " is of " + age + " years and is a " + gender);
    }

    public static void main(String[] args) {
        Person person1 = new Person("Shyam");
        person1.printNameAgeGender();

        Person person2 = new Person("Ram", 28, "Male");
        person2.printNameAgeGender();

    }
}

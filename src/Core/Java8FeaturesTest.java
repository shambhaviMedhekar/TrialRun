package Core;
/*@FunctionalInterface
interface Square{
    int calculate(int x);
}*/

import java.util.ArrayList;
import java.util.List;

public class Java8FeaturesTest {
    public static void main(String args[]){
        //Old school
        /*
        Runnable runnable=new Runnable() {
            @Override
            public void run() {
                System.out.println("Runnable");
            }
        };

        //Lambda Expression for runnable
        Runnable runnable1=()->System.out.println("Runnable");

        */

        //Java 8 Functional interface
        /*
        Square square= x -> x*x;//implementation of the interface
        //old school
        Square sq=new Square() {
            @Override
            public int calculate(int x) {
                return x*x;
            }
        };

        //System.out.println("sqaure: "+square.calculate(10));
        */


        List<User> users=new ArrayList<User>();
        users.add(new User("Shambhavi",27));
        users.add(new User("Suhas",60));
        users.add(new User("Sarita",50));


        /*
        //Oldschool implementation of collections.sort method
        Collections.sort(users, new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return o1.getAge()-o2.getAge();
            }
        });
        //Java 8 implementation of sort
        users.sort((u1,u2)->  u1.getAge()-u2.getAge());
        */
        //forEach uses Consumer interface

        //users.forEach(user -> System.out.println(user.getName()));

        /*
        //Function interface
        Function<Integer,Double> cToF=(celcius)->new Double((celcius*9/5)+32);
        System.out.println(cToF.apply(12));
        //Predicate interface
        Predicate<User> userAbove30 = user -> user.getAge()>30;
        User user=new User("Shambhavi",32);
        System.out.println(userAbove30.test(user));
        */
/*
        //Type 1:
        //Normal forloop:
        System.out.println("Normal for loop:");
        for(int number:list){
            Java8FeaturesTest.print(number);
        }
        System.out.println();
        //lambda expression
        System.out.println("lambda:");
        list.forEach(num->Java8FeaturesTest.print(num));
        System.out.println();
        //Method reference
        System.out.println("Method reference:");
        list.forEach(Java8FeaturesTest::print);

        //Type 2:
        System.out.println("Reference to an instance :");
        final MyComparator myComparator=new MyComparator();
        //lambda
        Collections.sort(list,(a,b)->myComparator.compare(a,b));

        //Method reference
        Collections.sort(list,myComparator::compare);
        */
/*

        //Type 3:
        System.out.println("Reference to an instance method of arbitrary object of particular type:");
        List<Person> people=new ArrayList<Person>();
        people.add(new Person("Shambhavi"));
        people.add(new Person("Shambhavi1"));
        people.add(new Person("Shambhavi2"));
        //Normal
        for(final Person person:people){
            System.out.println(person.getName());
        }
        //Lambda
        people.forEach(person -> System.out.println(person.getName()));

        //Method reference
        people.forEach(Person::printName);
*/


        //Optional

        /*User user=new User("Shambhavi",77);
        Optional<User> userOpt=Optional.ofNullable(user);
        System.out.println(userOpt.isPresent());*/
        

        //Streams
        //Normal
        List<User> userList=new ArrayList<User>();
        for(User user: users){
            if(user.getAge()>20){
                userList.add(user);
            }
        }
        users.stream()
                .filter(user -> user.getAge()>30)
                .map(User::getName)
                .forEach(u -> System.out.println(u));
       // userList1.forEach(u -> System.out.println(u));


    }
    public static void print(final int num){
        System.out.print(" "+num);
}
    private static class MyComparator{
        public int compare(final Integer a,final Integer b){
            return a.compareTo(b);
        }
    }

}
class Person{

    private String name;
    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void printName(){
        System.out.println(name);
    }
}
class User{
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



}

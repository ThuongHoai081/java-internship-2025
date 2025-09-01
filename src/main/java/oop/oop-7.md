# Liệt kê những điểm mà class làm được mà abstract class và inteface không làm được. Tương tự cho abstract class và interface

## 1. Class

- Tạo đối tượng trực tiếp bằng `new`.
- Có **constructor đầy đủ** và gọi ngay khi khởi tạo đối tượng.
- Sử dụng ngay mà không cần lớp con kế thừa.

#### Ví dụ:

```java
    class Dog {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    public void bark() {
        System.out.println(name + " is barking!");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Lucky");  // tạo đối tượng trực tiếp
        dog.bark();
    }
}
```

## 2. Abstract Class

- Vừa có phương thức có thân vừa có phương thức trừu tượng.
- Có constructor để khởi tạo giá trị chung cho lớp con.
- Có thể chứa biến instance mà lớp con kế thừa.

#### Ví dụ:

```java
    abstract class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    // phương thức trừu tượng → lớp con phải triển khai
    public abstract void makeSound();

    // phương thức có sẵn code
    public void sleep() {
        System.out.println(name + " is sleeping...");
    }
}

class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: Meow!");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal cat = new Cat("Kitty"); // tạo từ lớp con
        cat.makeSound();
        cat.sleep();
    }
}
```

## 3. Interface

- Một class có thể implement nhiều interface (đa kế thừa hành vi).
- Có thể chứa default method và static method (Java 8+).
- Dùng để định nghĩa hợp đồng (contract) mà các lớp phải tuân thủ.

### Ví dụ:

```java
    interface Flyable {
    void fly();
}

interface Swimmable {
    void swim();
}

// Một class implement nhiều interface cùng lúc
class Duck implements Flyable, Swimmable {
    @Override
    public void fly() {
        System.out.println("Duck is flying!");
    }

    @Override
    public void swim() {
        System.out.println("Duck is swimming!");
    }
}

public class Main {
    public static void main(String[] args) {
        Duck duck = new Duck();
        duck.fly();
        duck.swim();
    }
}
```
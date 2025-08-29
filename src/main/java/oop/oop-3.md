# Kế thừa là gì?

**Kế thừa (Inheritance)** là cơ chế trong OOP cho phép một lớp mới (lớp con) kế thừa các thuộc tính và phương thức từ
một lớp hiện có (lớp cha). Lớp con có thể tái sử dụng, mở rộng hoặc ghi đè (override) các phương thức của lớp cha, giúp
tổ chức mã nguồn rõ ràng và hiệu quả hơn.

## Ví dụ về kế thừa trong Java

```java
// Lớp cha
class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

// Lớp con kế thừa lớp Animal
class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }

    // Ghi đè phương thức eat
    @Override
    void eat() {
        System.out.println("Dog is eating");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();  // Output: Dog is eating (ghi đè phương thức)
        dog.bark(); // Output: Dog is barking
    }
}

```
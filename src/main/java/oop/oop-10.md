# Anonymous class là gì, lúc nào thì ta nên dùng anonymous class?

## 1. Khái niệm

- **Anonymous class (lớp ẩn danh)** là một lớp **không có tên**, được khai báo và khởi tạo **ngay tại chỗ**.
- Thường dùng để **triển khai nhanh một interface hoặc lớp abstract** mà không cần tạo một class riêng biệt.
- Anonymous class thường xuất hiện trong **sự kiện, callback, hoặc truyền hành vi (behavior) vào phương thức**.
- Anonymous Class trong Java có thể được tạo ra bằng hai cách sau:
    - Sử dụng class (abstract hoặc concrete)
    - Sử dụng interface

---

## 2. Cú pháp

```java
InterfaceOrAbstractClass reference=new InterfaceOrAbstractClass(){
// override các phương thức abstract
@Override
public void someMethod(){
        System.out.println("Implemented in anonymous class");
        }
        };
```

---

## 3. Đặc điểm

- Không có tên riêng.
- Thường được **khởi tạo ngay khi khai báo**.
- Chỉ dùng **một lần**, không tái sử dụng.
- Có thể **override phương thức của interface hoặc abstract class**.
- Không thể có **constructor riêng**.
- Không thể khai báo **static** (trừ static final constants).

---

## 4. Khi nào nên dùng Anonymous Class?

- Triển khai nhanh **interface hoặc abstract class** mà không muốn tạo class riêng.
- **Callback hoặc xử lý sự kiện** trực tiếp tại chỗ (GUI, Swing, Android,...).
- Khi lớp **chỉ được sử dụng một lần** và không cần tái sử dụng.
- Giúp code **ngắn gọn, trực tiếp, dễ đọc** trong các tình huống đơn giản.

---

## 5. Ví dụ

a. Triển khai interface

```java
interface Greeting {
    void sayHello();
}

public class Main {
    public static void main(String[] args) {
        // Tạo anonymous class triển khai interface Greeting
        Greeting g = new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("Hello from anonymous class!");
            }
        };
        g.sayHello();
    }
}
```

b. Triển khai abstract class

```java
abstract class Animal {
    abstract void makeSound();
}

public class Main {
    public static void main(String[] args) {
        // Tạo anonymous class triển khai abstract class Animal
        Animal dog = new Animal() {
            @Override
            void makeSound() {
                System.out.println("Woof woof");
            }
        };
        dog.makeSound();
    }
}

```

---

## 6. Lưu ý

- Nếu logic phức tạp hoặc sử dụng nhiều lần → nên tạo class riêng biệt thay vì anonymous class.
- Không thể có constructor riêng.
- Không thể khai báo static, trừ constants.
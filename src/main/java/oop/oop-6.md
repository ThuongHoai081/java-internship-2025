# So sánh sự khác biệt giữa class, abstract class và interface.

| Tiêu chí             | Class (Lớp thường)                        | Abstract Class (Lớp trừu tượng)                   | Interface (Giao diện)                                   |
|----------------------|-------------------------------------------|---------------------------------------------------|---------------------------------------------------------|
| **Định nghĩa**       | Khuôn mẫu chi tiết để tạo đối tượng       | Khuôn mẫu chưa hoàn chỉnh, có thể chứa code chung | Bản hợp đồng quy định hành vi (method)                  |
| **Khởi tạo**         | Có thể khởi tạo đối tượng trực tiếp       | Không khởi tạo trực tiếp                          | Không khởi tạo trực tiếp                                |
| **Phương thức**      | Có thân                                   | Có thể có **thân** hoặc **trừu tượng**            | Chỉ chứa **trừu tượng** (Java 7) / có default (Java 8+) |
| **Thuộc tính**       | Có đầy đủ (private, protected, public...) | Có đầy đủ                                         | Chỉ có **hằng số** (`public static final`)              |
| **Kế thừa**          | Kế thừa đơn (1 class cha)                 | Kế thừa đơn (1 abstract class)                    | Một class có thể implement **nhiều interface**          |
| **Mục đích sử dụng** | Tạo đối tượng cụ thể                      | Định nghĩa lớp nền tảng, chia sẻ logic chung      | Định nghĩa hành vi mà lớp phải tuân theo                |
| **Từ khóa khai báo** | `class`                                   | `abstract class`                                  | `interface`                                             |

---

## Ví dụ minh họa

```java
// Class
class Car {
    void drive() {
        System.out.println("Car is driving");
    }
}

// Abstract Class
abstract class Animal {
    abstract void makeSound();  // phương thức trừu tượng
    void eat() {                // phương thức thường
        System.out.println("Animal is eating");
    }
}

// Interface
interface Flyable {
    void fly(); // phương thức trừu tượng
}

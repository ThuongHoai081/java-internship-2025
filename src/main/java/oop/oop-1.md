# Lập trình hướng đối tượng (OOP) là gì?

**Lập trình hướng đối tượng (Object-Oriented Programming - OOP)** là phương pháp lập trình dựa trên khái niệm **đối
tượng (object)**, trong đó **dữ liệu** và các **hành vi liên quan** được đóng gói trong cùng một đối tượng. OOP giúp tổ
chức mã nguồn một cách **rõ ràng, dễ hiểu, dễ bảo trì** và **tái sử dụng**, đồng thời **mô hình hóa các thực thể trong
thế giới thực** dưới dạng các đối tượng **tương tác với nhau**.

### Khác với các hướng lập trình khác:

- **Lập trình hướng thủ tục (Procedural Programming):** tập trung vào các hàm và thủ tục để xử lý dữ liệu, trong đó dữ
  liệu và hàm được tách rời nhau. Phù hợp cho chương trình nhỏ nhưng khó bảo trì khi dự án phức tạp.
- **Lập trình hàm (Functional Programming):** tập trung vào các hàm thuần túy và dữ liệu bất biến, hạn chế các tác dụng
  phụ (side-effect), thường dùng `map`, `reduce`, `filter`. Giúp code dễ kiểm thử nhưng có thể khó đọc với lập trình
  viên OOP truyền thống.
- **Lập trình hướng đối tượng (OOP):** gắn dữ liệu và hành vi vào các đối tượng, hỗ trợ **kế thừa, đa hình, đóng gói,
  trừu tượng**, giúp mã nguồn dễ bảo trì, tái sử dụng và phù hợp với các dự án lớn.

**Ví dụ về OOP trong Java:**

```java
class Animal {
    void speak() {
        System.out.println("Animal speaks");
    }
}

class Dog extends Animal {
    @Override
    void speak() {
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.speak(); // Output: Dog barks
    }
}

# Interface là gì?

Trong lập trình hướng đối tượng (OOP), **interface (giao diện)** là một khái niệm quan trọng dùng để định nghĩa một tập
hợp các phương thức mà một lớp phải triển khai. Interface không chứa bất kỳ cài đặt nào cho các phương thức này, mà chỉ
định nghĩa **tên, kiểu trả về và tham số của chúng**. Điều này giúp tạo ra một hợp đồng giữa các lớp, đảm bảo rằng các
lớp tuân theo cùng một giao diện sẽ có cùng các phương thức.

### Đặc điểm của Interface trong Java

1. **Không có thân phương thức**  
   Interface chỉ định nghĩa phương thức, lớp triển khai phải viết phần thân.

   ```java
   public interface Animal {
       void makeSound();
       void eat(String food);
   }
   ```

2. **Không thể tạo đối tượng**  
   Interface chỉ là bản thiết kế, không thể `new` trực tiếp.
    ```
   // Sai - không thể khởi tạo interface
    // Animal a = new Animal(); // Lỗi
   ```
3. **Một lớp có thể triển khai nhiều Interface**  
   Hỗ trợ **đa kế thừa hành vi.**

   ```java
   public class Dog implements Animal, Domestic {
       @Override
       public void makeSound() {
           System.out.println("Bark");
       }

       @Override
       public void eat(String food) {
           System.out.println("Dog eats " + food);
       }

       @Override
       public void playWithOwner() {
           System.out.println("Playing with owner");
       }
   }
   ```

4. **Interface có thể kế thừa interface khác**  
   Một interface có thể extends một hoặc nhiều interface khác.

   Các lớp triển khai sẽ phải cài đặt tất cả phương thức của interface cha và con.

   ```java
   public interface Pet extends Animal {
       void play();
   }
   ```

5. **Hỗ trợ đa hình (Polymorphism)**  
   Có thể dùng biến kiểu interface để tham chiếu đến đối tượng của lớp triển khai.

   ```java
   public class Main {
       public static void main(String[] args) {
           Animal myAnimal = new Dog();
           myAnimal.makeSound(); // In ra: Bark
       }
   }
   ```

6. **Từ Java 8 trở đi**
    - **Default methods**: có cài đặt mặc định.
    - **Static methods**: gọi trực tiếp qua tên interface.

   ```java
   public interface Animal {
       default void sleep() {
           System.out.println("Animal is sleeping");
       }

       static void info() {
           System.out.println("This is an animal.");
       }
   }
   ```

### Khi nào nên dùng Interface?

- Khi muốn định nghĩa **hợp đồng (contract)** về hành vi mà nhiều lớp khác nhau có thể thực hiện, ngay cả khi chúng *
  *không liên quan** trong cây thừa kế.  
  (Ví dụ: `Flyable` cho chim, máy bay, siêu nhân).
- Khi cần **đa kế thừa hành vi**, vì một lớp có thể implement nhiều interface cùng lúc trong khi chỉ kế thừa được một
  abstract class.
- Khi muốn đảm bảo tính **tách biệt và linh hoạt** giữa định nghĩa và cài đặt.  
  → Code phụ thuộc vào interface thay vì class cụ thể (nguyên lý Dependency Inversion trong SOLID).
- Khi xây dựng **API hoặc framework**, interface cho phép các developer khác tự do implement theo cách của họ.
- Khi chỉ cần định nghĩa **hành vi trừu tượng**, không cần quản lý trạng thái (instance variables).

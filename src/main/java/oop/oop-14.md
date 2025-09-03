# Từ khoá super có tác dụng gì, khi nào thì ta bắt buộc phải dùng nó?

Từ khoá `super` trong Java được sử dụng để **tham chiếu đến lớp cha (superclass)** của một lớp con (subclass). Nó có ba
tác
dụng chính:

1. **Sử dụng từ khóa super để tham chiếu trực tiếp đến biến instance của lớp cha gần nhất**:
   Khi một lớp con có biến instance cùng tên với biến instance của lớp cha, ta có thể sử dụng `super` để truy cập
   biến instance của lớp cha.

   ```java
   class Parent {
       int value = 10;
   }

   class Child extends Parent {
       int value = 20;

       void display() {
           System.out.println("Value from Child: " + value); // 20
           System.out.println("Value from Parent: " + super.value); // 10
       }
   }
   ```
2. **Sử dụng từ khóa super để gọi phương thức của lớp cha**:
   Khi một lớp con ghi đè (override) phương thức của lớp cha, ta có thể sử dụng `super` để gọi phương thức của lớp cha.

    ```java
    class Parent {
         void show() {
              System.out.println("Show from Parent");
         }
    }
    
    class Child extends Parent {
         void show() {
              System.out.println("Show from Child");
         }
    
         void display() {
              show(); // Gọi phương thức của lớp con
              super.show(); // Gọi phương thức của lớp cha
         }
    }
    ```
3. **Sử dụng từ khóa super để gọi constructor của lớp cha**:
   Trong constructor của lớp con, ta có thể sử dụng `super()` để gọi constructor của lớp cha. Điều này đặc biệt hữu ích
   khi lớp cha không có constructor mặc định (không tham số) hoặc khi ta muốn khởi tạo các biến instance của lớp cha
   với các giá trị cụ thể.

    ```java
    class Parent {
         Parent(int x) {
              System.out.println("Parent constructor called with value: " + x);
         }
    }
    
    class Child extends Parent {
         Child(int x) {
              super(x); // Gọi constructor của lớp cha
              System.out.println("Child constructor called with value: " + x);
         }
    }
    ```

### Bắt buộc phải dùng `super` trong các trường hợp sau:

- Khi lớp cha và lớp con có **cùng tên thuộc tính**, muốn truy xuất đến thuộc tính của lớp cha.
- Khi lớp con **ghi đè phương thức**, nhưng vẫn cần gọi phương thức gốc từ lớp cha.
- Khi lớp cha **không có constructor mặc định (không tham số)**, hoặc muốn gọi một constructor cụ thể của lớp cha trong
  constructor của lớp con.
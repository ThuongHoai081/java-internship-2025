# Từ khoá final có tác dụng gì khi áp dụng nó lên: biến, field, parametter của hàm, method và class?

Từ khóa `final` trong Java được sử dụng để **hạn chế người dùng thay đổi** giá trị biến, hành vi của phương thức hoặc
khả năng kế thừa lớp. `final` có thể được áp dụng trong nhiều ngữ cảnh:

1. **Biến final**: giá trị của biến **không thể thay đổi** sau khi đã được khởi tạo.
2. **Phương thức final**: phương thức **không thể bị ghi đè (override)** trong lớp con.
3. **Lớp final**: lớp **không thể bị kế thừa** bởi lớp khác.
4. **Biến static final trống**: biến final chưa được khởi tạo ngay khi khai báo; phải được khởi tạo trong static block
   hoặc constructor.

---

### 1. Biến final (Final variable)

- Khi một biến được khai báo với `final`, giá trị **không thể thay đổi** sau khi gán.
- Trở thành **hằng số**.

```java
final int MAX_VALUE=100;
        MAX_VALUE=200; // Lỗi: không thể thay đổi giá trị của biến final
        System.out.println(MAX_VALUE); // Output: 100
```

### 2. Phương thức final (Final method)

- Khi một phương thức được khai báo với `final`, nó **không thể bị ghi đè** trong lớp con.
- Đảm bảo hành vi của phương thức không bị thay đổi.

```java
class Parent {
    final void display() {
        System.out.println("This is a final method.");
    }
}

class Child extends Parent {
    void display() { // Lỗi: không thể ghi đè phương thức final
        System.out.println("Trying to override final method.");
    }
}
```

### 3. Lớp final (Final class)

- Khi một lớp được khai báo với `final`, nó **không thể bị kế thừa** bởi bất kỳ lớp nào khác.
- Đảm bảo rằng lớp không thể bị mở rộng.

```java
final class Utility {
    static void performAction() {
        System.out.println("Performing action.");
    }
}

class ExtendedUtility extends Utility { // Lỗi: không thể kế thừa lớp final
}
```

### 4. Biến static final trống (Blank final variable)

- Biến `final` có thể không được khởi tạo ngay khi khai báo, nhưng **phải được khởi tạo một lần duy nhất** trong
  constructor hoặc static block.
- Đảm bảo rằng biến được khởi tạo trước khi sử dụng.

```java
class Example {
    final int instanceVar; // Biến final trống
    static final int staticVar; // Biến static final trống

    // Khởi tạo biến instanceVar trong constructor
    Example(int value) {
        this.instanceVar = value;
    }

    // Khởi tạo biến staticVar trong static block
    static {
        staticVar = 50;
    }

    void display() {
        System.out.println("Instance Var: " + instanceVar);
        System.out.println("Static Var: " + staticVar);
    }
}

public class Main {
    public static void main(String[] args) {
        Example example = new Example(10);
        example.display();
        // Output:
        // Instance Var: 10
        // Static Var: 50
    }
}
```

### 5. Tham số final (Final parameter):

- Khi một tham số của phương thức được khai báo với `final`, giá trị của tham số **không thể thay đổi** trong thân
  phương thức.
- Đảm bảo rằng tham số giữ nguyên giá trị ban đầu khi được truyền vào.

```java
void display(final int number){
        number=20; // Lỗi: không thể thay đổi giá trị của tham số final
        System.out.println(number);
        }
        display(10); // Output: 10
```

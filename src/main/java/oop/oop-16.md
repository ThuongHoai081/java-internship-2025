# Từ khoá static dùng để làm gì? tại sao từ một static method, ta không thể truy cập được đến non-static method?

Từ khoá `static` trong Java được sử dụng để khai báo các thành phần (biến, phương thức, khối) thuộc về lớp thay vì thuộc
về đối tượng của lớp đó. Điều này có nghĩa là các thành phần `static` có thể được truy cập mà không cần phải tạo một thể
hiện (instance) của lớp.

- Ví dụ:

```java
class MyClass {
    static int staticVar = 10;   // Biến static thuộc về lớp
    int nonStaticVar = 20;       // Biến non-static thuộc về đối tượng

    static void staticMethod() {
        System.out.println("Static method");
    }

    void nonStaticMethod() {
        System.out.println("Non-static method");
    }
}

// Truy cập static
MyClass.staticMethod();
        System.out.println(MyClass.staticVar);

// Truy cập non-static
        MyClass obj=new MyClass();
        obj.nonStaticMethod();
        System.out.println(obj.nonStaticVar);

```

### Tại sao từ một `static method`, ta không thể truy cập được đến `non-static method`?

- Lý do chính là vì:
    - `static method` gắn liền với class, không thuộc về bất kỳ đối tượng (instance) nào.
    - `non-static method` gắn liền với một đối tượng cụ thể và cần ngữ cảnh của đối tượng đó để được gọi.
- Khi gọi một `static method`, không có đối tượng nào tồn tại sẵn để tham chiếu, nên nó không thể truy cập trực tiếp đến
  các thành phần `non-static`.
- Ví dụ:

```java
public class MyClass {
    static void staticMethod() {
        // nonStaticMethod(); // Lỗi: không thể gọi non-static method từ static method
    }

    void nonStaticMethod() {
        System.out.println("Non-static method called");
    }
}
```

Trong ví dụ trên, nếu cố gắng gọi `nonStaticMethod()` từ `staticMethod()` thì sẽ gặp lỗi biên dịch vì `staticMethod()`
không có ngữ cảnh của một đối tượng cụ thể để gọi `nonStaticMethod()`.

Để gọi `nonStaticMethod()`, cần tạo một instance của `MyClass` và sử dụng instance đó để gọi phương thức.

```java
public class MyClass {
    static void staticMethod() {
        MyClass obj = new MyClass();
        obj.nonStaticMethod(); // Gọi qua đối tượng cụ thể
    }

    void nonStaticMethod() {
        System.out.println("Non-static method called");
    }
}
```

- Ngược lại: Trong một `non-static method`, có thể gọi cả static và non-static vì nó luôn chạy trong ngữ cảnh của một
  đối tượng.

```java
class MyClass {
    static int staticVar = 10;
    int nonStaticVar = 20;

    void nonStaticMethod() {
        System.out.println(staticVar);      // OK: static thuộc về class
        System.out.println(nonStaticVar);   // OK: thuộc về đối tượng hiện tại
    }
}
```
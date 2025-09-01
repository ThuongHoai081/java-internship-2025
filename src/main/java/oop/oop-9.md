# Annotation là gì? Giải thích ý nghĩa của @Override, @Deprecated

## 1. Annotation là gì?

- **Annotation** trong Java là một dạng **siêu dữ liệu (metadata)** cung cấp thông tin bổ sung về chương trình mà không
  ảnh hưởng đến logic của chương trình.
- Nó không trực tiếp ảnh hưởng đến logic của chương trình, nhưng giúp:
    - Truyền thông tin cho compiler (trình biên dịch).
    - Truyền thông tin cho JVM (máy ảo Java).
    - Truyền thông tin cho framework/thư viện (ví dụ Spring, JUnit).
- **Annotation** thường được đặt trước **class, method, field, parameter…** và bắt đầu bằng ký tự `@`.

---

## 2. @Override

- Báo cho **compiler** biết rằng phương thức này **ghi đè (override)** một phương thức từ lớp cha hoặc interface.
- Giúp compiler phát hiện lỗi khi method không thực sự ghi đè (ví dụ viết sai tên hoặc tham số).
- Làm code dễ hiểu và rõ ràng hơn.

**Ví dụ:**

```java
class Animal {
    void sound() {
        System.out.println("Some sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Woof woof");
    }
}
```

```java
class Dog extends Animal {
    @Override
    void soound() { // sai chính tả(soound thay vì sound) → compiler báo lỗi
        System.out.println("Woof");
    }
}
```

- Có @Override → Nếu viết sai tên method hoặc sai tham số → compiler sẽ báo lỗi.

- Không có @Override → Compiler **KHÔNG** báo lỗi, nhưng method đó không override, mà chỉ được coi như một method mới
  trong class con.

---

## 3. @Deprecated

- Đánh dấu một **class, method** hoặc field là **không nên dùng nữa (lỗi thời).**
- Khi sử dụng, IDE sẽ **cảnh báo** cho lập trình viên.
- Thường dùng khi **API đã có phiên bản mới thay thế.**

**Ví dụ:**

```java
class OldApi {
    @Deprecated
    void oldMethod() {
        System.out.println("This method is deprecated");
    }
}

class Test {
    public static void main(String[] args) {
        OldApi api = new OldApi();
        api.oldMethod(); // IDE cảnh báo: Method is deprecated
    }
}
```

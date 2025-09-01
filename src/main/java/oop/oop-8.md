# Một số ngôn ngữ như C++ hỗ trợ đa thừa kế nhưng Java thì không. Theo bạn, lý do là tại sao?

Java không hỗ trợ đa thừa kế class vì muốn tránh **diamond problem**, giữ cho ngôn ngữ **đơn giản, rõ ràng** và thay thế
bằng **interface** để vẫn đáp ứng được tính đa hình.

## 1. Vấn đề "diamond problem" (vấn đề hình thoi)

Giả sử có sơ đồ kế thừa:

```
    A
   / \
  B   C
   \ /
    D
```

- Lớp `B` và `C` đều kế thừa từ lớp `A`.
- Lớp `D` lại kế thừa cả `B` và `C`.

**Câu hỏi đặt ra:** nếu lớp `A` có một phương thức `print()` thì khi `D` gọi `print()` sẽ thực hiện phiên bản nào?
của `B`, của `C` hay của `A`?

Trong C++, điều này gây nhiều nhầm lẫn và khó kiểm soát. Lập trình viên phải dùng kỹ thuật **virtual inheritance** để
giải quyết, nhưng lại làm ngôn ngữ phức tạp và khó bảo trì.

## 2. Đơn giản hóa ngôn ngữ

Java được thiết kế với mục tiêu: **đơn giản, an toàn và dễ sử dụng hơn C++**.

- Việc chỉ cho phép **kế thừa đơn** (một class chỉ kế thừa một class) giúp tránh mơ hồ.
- Giúp lập trình viên tập trung vào tính rõ ràng và nhất quán.

## 3. Sử dụng Interface để thay thế

Java đưa ra giải pháp:

- **Class** chỉ được kế thừa đơn.
- Nếu cần đa thừa kế hành vi → dùng **interface**.
- Từ Java 8, interface có thể có `default method`, cho phép chứa sẵn code mà không gây ra vấn đề "diamond problem". Nếu
  có trùng lặp phương thức, lập trình viên **bắt buộc phải override** để rõ ràng.

- Ví dụ: `Duck` có thể "đa thừa kế" hành vi mà không gặp vấn đề **diamond problem**

```java
interface Flyable {
    void fly();
}

interface Swimmable {
    void swim();
}

class Duck implements Flyable, Swimmable {
    @Override
    public void fly() {
        System.out.println("Duck is flying");
    }

    @Override
    public void swim() {
        System.out.println("Duck is swimming");
    }
}
```

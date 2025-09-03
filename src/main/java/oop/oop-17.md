# Tìm hiểu và giải thích SOLID Principles

**SOLID** là viết tắt của 5 nguyên tắc thiết kế hướng đối tượng do **Robert C. Martin và Michael Feathers** đề xuất. Nhờ
áp dụng SOLID, lập trình viên có thể viết ra những đoạn code dễ đọc, dễ hiểu và dễ bảo trì.

### 5 nguyên tắc SOLID bao gồm:

- **Single Responsibility Principle (SRP)**  – Nguyên tắc trách nhiệm đơn lẻ.
- **Open/Closed Principle (OCP)** – Nguyên tắc mở/đóng.
- **Liskov Substitution Principle (LSP)** – Nguyên tắc thay thế Liskov.
- **Interface Segregation Principle (ISP)** – Nguyên tắc phân tách giao diện.
- **Dependency Inversion Principle (DIP)** – Nguyên tắc đảo ngược phụ thuộc.

### 1. Single Responsibility Principle (SRP) – Nguyên tắc trách nhiệm đơn lẻ

- Mỗi lớp chỉ nên có một trách nhiệm duy nhất.
- Ví dụ: Một lớp `Invoice` chỉ nên chịu trách nhiệm về việc quản lý hóa đơn, không nên bao gồm cả việc gửi email hay in
  ấn hóa đơn.

```java
class Invoice {
    private String invoiceNumber;
    private double amount;

    public Invoice(String invoiceNumber, double amount) {
        this.invoiceNumber = invoiceNumber;
        this.amount = amount;
    }

    public void calculateTotal() {

    }
}

class InvoicePrinter {
    public void print(Invoice invoice) {

    }
}
```

### 2. Open/Closed Principle (OCP) – Nguyên tắc mở/đóng

- Không sửa đổi lớp có sẵn, thay vào đó hãy mở rộng bằng kế thừa. Điều này khiến chương trình có nhiều lớp hơn, nhưng bù
  lại ta không cần kiểm thử lại các lớp cũ mà chỉ tập trung vào các lớp mới.
- Tuy nhiên, việc mở rộng chức năng thường đi kèm với việc viết thêm code. Để thiết kế module dễ dàng mở rộng mà không
  cần sửa đổi code nhiều, ta cần tách biệt phần dễ thay đổi khỏi phần khó thay đổi, đảm bảo không ảnh hưởng đến những
  phần còn lại.
- Ví dụ: Nếu muốn thêm một loại hình thanh toán mới có thể mở rộng hệ thống mà không cần thay đổi mã nguồn hiện có.

```java
interface PaymentMethod {
    void pay(double amount);
}

class CreditCardPayment implements PaymentMethod {
    public void pay(double amount) {

    }
}

class PayPalPayment implements PaymentMethod {
    public void pay(double amount) {

    }
}
```

### 3. Liskov Substitution Principle (LSP) – Nguyên tắc thay thế Liskov

- Các lớp con phải có thể thay thế cho lớp cha mà không làm thay đổi tính đúng đắn của chương trình.
- Nguyên tắc này quy định rằng các lớp con phải kế thừa và duy trì hành vi cơ bản của lớp cha.
- Nếu vi phạm nguyên tắc này, chương trình có thể gặp lỗi khi sử dụng các đối tượng của lớp con thay thế cho các đối
  tượng của lớp cha.
- Ví dụ:

```java
class Bird {
    public void fly() {

    }
}

class Sparrow extends Bird {
    public void fly() {

    }
}

class Ostrich extends Bird {
    public void fly() {
        throw new UnsupportedOperationException("Ostriches can't fly");
    }
}
```

- Trong ví dụ trên, lớp `Ostrich` vi phạm nguyên tắc LSP vì nó không thể thay thế cho lớp `Bird` mà không làm thay đổi
  hành vi của chương trình.
- Để tuân thủ nguyên tắc LSP, ta có thể tách lớp `Bird` thành hai lớp riêng biệt: `FlyingBird` và `NonFlyingBird`.

```java
class Bird {
    // Common properties and methods for all birds
}

class FlyingBird extends Bird {
    public void fly() {

    }
}

class NonFlyingBird extends Bird {
    // No fly method
}

class Sparrow extends FlyingBird {
    public void fly() {

    }
}

class Ostrich extends NonFlyingBird {
    // No fly method
}
```

### 4. Interface Segregation Principle (ISP) – Nguyên tắc phân tách giao diện

- Thay vì sử dụng một giao diện (interface) lớn, hãy tách thành nhiều giao diện nhỏ hơn với các mục đích cụ thể. Chia
  nhỏ interface lớn này thành các interface con, mỗi interface chỉ chứa methods liên quan chặt chẽ với nhau. Nhờ vậy,
  việc implements và quản lý trở nên dễ dàng, hiệu quả hơn.
- Ví dụ: Thay vì có một interface `Worker` với nhiều phương thức, ta có thể tách nó thành các interface nhỏ hơn
  như `Eater`, `Sleeper`, và `Worker`.

```java
interface Eater {
    void eat();
}

interface Sleeper {
    void sleep();
}

interface Worker {
    void work();
}

class Human implements Eater, Sleeper, Worker {
    public void eat() {

    }

    public void sleep() {

    }

    public void work() {

    }
}
```

### 5. Dependency Inversion Principle (DIP) – Nguyên tắc đảo ngược phụ thuộc

- Các module cấp cao không nên phụ thuộc vào các module cấp thấp. Cả hai nên phụ thuộc vào abstractions (sự trừu tượng).
- Abstractions không nên phụ thuộc vào chi tiết (implementation) mà chi tiết nên phụ thuộc vào abstractions.
- Điều này giúp giảm sự phụ thuộc giữa các module, làm cho hệ thống dễ bảo trì và mở rộng hơn.
- Ví dụ: Thay vì một lớp `UserService` trực tiếp tạo đối tượng `UserRepository`, ta có thể sử dụng Dependency Injection
  để cung cấp `UserRepository` từ bên ngoài.

```java
interface UserRepository {
    void save(User user);
}

class DatabaseUserRepository implements UserRepository {
    public void save(User user) {

    }
}

class UserService {
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void registerUser(User user) {
        userRepository.save(user);
    }
}
```

- Trong ví dụ trên, `UserService` không phụ thuộc trực tiếp vào `DatabaseUserRepository`, mà thay vào đó phụ thuộc vào
  interface `UserRepository`. Điều này cho phép dễ dàng thay đổi hoặc mở rộng `UserRepository` mà không ảnh hưởng đến
  `UserService`.
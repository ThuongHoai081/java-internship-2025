# Tìm hiểu, giải thích Design Pattern là gì và giải thích mục đích/ý nghĩa của vài pattern (tuỳ chọn)

### 1. Design Pattern là gì?

- **Design Pattern (Mẫu thiết kế)** là các giải pháp tái sử dụng được cho các vấn đề phổ biến trong thiết kế phần mềm.
  Chúng là những mô hình hoặc khuôn mẫu đã được kiểm chứng qua thời gian, giúp các nhà phát triển phần mềm giải quyết
  các vấn đề thiết kế một cách hiệu quả và nhất quán.
- Design Pattern không phải là mã nguồn cụ thể mà là các khái niệm trừu tượng, giúp định hướng cách tổ chức và cấu trúc
  mã nguồn.
- Design Pattern trong OOP thường biểu thị mối quan hệ và tương tác giữa Class, Object với nhau (Class với Object, Class
  với Class, Object với Object, …) dựa trên 2 nguyên lý thiết kế đối tượng nổi tiếng:
    - **Program to an interface not implementation** ( Lập trình hướng đến các Interface và tính trừu tượng).
    - **Object Composition over inheritance** (Sử dụng Composition thay vì Inheritance – kế thừa).

### 2. Mục đích/Ý nghĩa của Design Pattern

Giải pháp hiệu quả, đã được kiểm chứng: giúp xử lý vấn đề nhanh chóng, thay vì tự tìm giải pháp tốn kém thời gian.

- **Dễ hiểu mã nguồn:** lập trình viên dễ nắm bắt quan hệ giữa các module, đọc code người khác nhanh hơn.

- **Hỗ trợ teamwork:** thành viên trong nhóm dễ trao đổi, phối hợp, phát triển dự án thuận lợi.

- **Tối ưu và chuẩn hóa:** các pattern đã qua kiểm nghiệm trong software engineering, áp dụng cho cả phát triển và
  testing.

- **Tăng tốc độ phát triển:** nhờ có sẵn mô hình, không phải xây dựng lại từ đầu.

- **Linh hoạt và dễ bảo trì:** dễ dàng thay đổi, mở rộng, xử lý rủi ro khi hệ thống lớn dần và có yêu cầu mới.

### 3. Phân loại design pattern:

- Creational Patterns (Nhóm khởi tạo – 5 mẫu)
    - Singleton
    - Factory Method
    - Abstract Factory
    - Builder
    - Prototype
- Structural Patterns (Nhóm cấu trúc – 7 mẫu)
    - Adapter
    - Bridge
    - Composite
    - Decorator
    - Facade
    - Flyweight
    - Proxy
- Behavioral Patterns (Nhóm hành vi – 11 mẫu)
    - Chain of Responsibility
    - Command
    - Interpreter
    - Iterator
    - Mediator
    - Memento
    - Observer
    - State
    - Strategy
    - Template Method
    - Visitor

### 4. Ví dụ về một số Design Pattern phổ biến

- **Singleton Pattern:**
    - Mục đích: Đảm bảo một lớp chỉ có một thể hiện duy nhất và cung cấp một điểm truy cập toàn cục đến thể hiện đó.
    - Ví dụ: Quản lý kết nối cơ sở dữ liệu, nơi chỉ cần một kết nối duy nhất trong toàn bộ ứng dụng.

```java
  public class Singleton {
    private static Singleton instance;
    private final DataSource dataSource;

    private Singleton() {
        // Cấu hình connection pool
        HikariConfig config = new HikariConfig();
        config.setJdbcUrl("jdbc:mysql://localhost:3306/mydb");
        config.setUsername("root");
        config.setPassword("123456");
        config.setMaximumPoolSize(10); // số connection tối đa
        config.setMinimumIdle(2);      // số connection nhàn rỗi
        this.dataSource = new HikariDataSource(config);
    }

    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public Connection getConnection() throws SQLException {
        return dataSource.getConnection();
    }
}
```

- **Factory Method Pattern:**
    - Mục đích: Định nghĩa một giao diện để tạo đối tượng, nhưng để các lớp con quyết định lớp nào sẽ được khởi tạo.
    - Ví dụ: Hệ thống quản lý phương tiện giao thông, nơi có thể tạo các loại phương tiện khác nhau như xe đạp, ô tô, xe
      máy.

```java
 // Product interface
interface IAnimal {
    void speak();
}

// Concrete Products
class Dog implements IAnimal {
    public void speak() {
        System.out.println("Woof woof");
    }
}

class Cat implements IAnimal {
    public void speak() {
        System.out.println("Meow meow");
    }
}

class Duck implements IAnimal {
    public void speak() {
        System.out.println("Quack quack");
    }
}

// Enum để quản lý loại Animal
enum AnimalType {
    Dog, Cat, Duck
}

// Simple Factory
public class AnimalFactory {
    public static IAnimal CreateAnimal(AnimalType type) {
        IAnimal animal = null;
        switch (type) {
            case Cat:
                animal = new Cat();
                break;
            case Dog:
                animal = new Dog();
                break;
            case Duck:
                animal = new Duck();
                break;
        }
        return animal;
    }
}

// Client code
public class Main {
    public static void main(String[] args) {
        IAnimal dog = AnimalFactory.CreateAnimal(AnimalType.Dog);
        dog.speak(); // Woof woof

        IAnimal cat = AnimalFactory.CreateAnimal(AnimalType.Cat);
        cat.speak(); // Meow meow

        IAnimal duck = AnimalFactory.CreateAnimal(AnimalType.Duck);
        duck.speak(); // Quack quack
    }
}

```

- **Strategy Pattern:**
    - Mục đích: Định nghĩa một họ các thuật toán, đóng gói từng thuật toán và làm cho chúng có thể hoán đổi cho nhau.
      Strategy cho phép thuật toán thay đổi độc lập với các khách hàng sử dụng nó.
    - Ví dụ: Tính phí vận chuyển bằng nhiều cách (Air, Road).

```java
interface ShippingStrategy {
    double calculate(double weight);
}

class AirShipping implements ShippingStrategy {
    public double calculate(double weight) {
        return weight * 10;
    }
}

class RoadShipping implements ShippingStrategy {
    public double calculate(double weight) {
        return weight * 5;
    }
}

class ShippingService {
    private ShippingStrategy strategy;

    public ShippingService(ShippingStrategy strategy) {
        this.strategy = strategy;
    }

    public double getCost(double weight) {
        return strategy.calculate(weight);
    }
}
```

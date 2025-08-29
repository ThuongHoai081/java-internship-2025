# Class là gì, Object là gì, giải thích mối quan hệ giữa chúng?

### 1. Class là gì?

**Class (lớp)** là một khuôn mẫu hoặc bản thiết kế để tạo ra các đối tượng (objects). Nó định nghĩa các thuộc tính (
properties) và phương thức (methods) mà các đối tượng của lớp đó sẽ có. Class giúp tổ chức mã nguồn theo cách có cấu
trúc và dễ quản lý hơn.

### 2. Object là gì?

**Object (đối tượng)** là một thể hiện cụ thể của một class. Khi tạo một object từ một class, tức là đang tạo ra một
thực thể có các thuộc tính và phương thức được định nghĩa trong class đó.

### 3. Mối quan hệ giữa Class và Object:

- Class là khuôn mẫu, còn Object là thực thể cụ thể được tạo ra từ khuôn mẫu đó. **Một class có thể tạo ra nhiều object
  khác nhau, mỗi object có thể có các giá trị thuộc tính riêng biệt.**
- **Ví dụ:** Một class "Car" có thể có các thuộc tính như màu sắc, kiểu dáng và phương thức như "startEngine()" và "
  stopEngine(). Từ class "Car", có thể tạo ra nhiều object như "myCar", "yourCar", mỗi object có các thuộc tính khác
  nhau
  như màu sắc và kiểu dáng.

### Ví dụ về Class và Object

```java
// Class định nghĩa khuôn mẫu cho các ô tô
public class Car {
    // Thuộc tính (properties)
    String color;
    String model;

    // Constructor để tạo object
    public Car(String color, String model) {
        this.color = color;
        this.model = model;
    }

    // Phương thức (methods)
    public void startEngine() {
        System.out.println(model + " engine started.");
    }

    public void stopEngine() {
        System.out.println(model + " engine stopped.");
    }
}

// Lớp Main để tạo object
public class Main {
    public static void main(String[] args) {
        // Tạo các object từ class Car
        Car myCar = new Car("Red", "Sedan");
        Car yourCar = new Car("Blue", "SUV");

        // Gọi phương thức trên từng object
        myCar.startEngine();   // Output: Sedan engine started.
        yourCar.startEngine(); // Output: SUV engine started.

        myCar.stopEngine();    // Output: Sedan engine stopped.
        yourCar.stopEngine();  // Output: SUV engine stopped.
    }
}

   
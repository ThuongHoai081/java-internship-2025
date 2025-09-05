# Bạn hiểu gì về DI và IOC?

`Dependency Injection (DI)` và `Inversion of Control (IoC)` là hai khái niệm quan trọng trong lập trình Java. **DI**
giúp giảm sự phụ thuộc giữa các thành phần trong ứng dụng, tạo tính linh hoạt và tùy biến. **IoC** cho phép framework
quản lý việc tạo và cung cấp dependency, tạo điều kiện cho việc quản lý phức tạp hóa ứng dụng

### 1. DI (Dependency Injection):

- `Dependency Injection(DI)` là một mẫu thiết kế phần mềm trong đó các phụ thuộc của một đối tượng được cung cấp từ bên
  ngoài thay vì được tạo ra bên trong đối tượng đó. Điều này giúp giảm sự phụ thuộc chặt chẽ giữa các lớp và làm cho mã
  dễ bảo trì và kiểm thử hơn.
- Có ba loại chính của DI:
    - `Constructor Injection`: Dependency được tiêm vào thông qua constructor của lớp.
    - `Setter Injection`: Dependency được tiêm vào thông qua các phương thức setter.
    - `Interface Injection`: Các lớp cần dependency phải implement một giao diện có phương thức để tiêm dependency.
- Ví dụ:

```java
public interface Outfit {
    void wear();
}

public class Bikini implements Outfit {
    public void wear() {
        System.out.println("Đã mặc Bikini");
    }
}

public class Girl {
    private Outfit outfit;

    public Girl(Outfit outfit) {
        this.outfit = outfit;
    }

    public void dressUp() {
        outfit.wear();
    }
}
```

Trong ví dụ này, lớp `Girl` không tạo ra một `Outfit` mà nó cần. Thay vào đó, nó chấp nhận một `Outfit` thông qua
constructor của nó. Điều này làm giảm sự phụ thuộc của `Girl` vào một cụ thể `Outfit`, tạo điều kiện cho tính linh hoạt
và tùy biến.

### 2. IOC (Inversion of Control):

- `Inversion of Control (IoC)` là một nguyên tắc lập trình, trong đó luồng điều khiển trong ứng dụng không được quyết
  định
  bởi ứng dụng mà được quyết định bởi một framework hoặc container bên ngoài.
- **IoC** thường đi kèm với **DI**, nơi các dependency được quản lý và cung cấp bởi một framework hoặc container.
  Framework sẽ
  quản lý việc tạo và quản lý các đối tượng và phụ thuộc.
- Ví dụ:

```java
public class Girl {
    private Outfit outfit;

    public Girl(Outfit outfit) {
        this.outfit = outfit;
    }

    public void dressUp() {
        outfit.wear();
    }
}

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Girl girl = context.getBean(Girl.class);
        girl.dressUp();
    }
```

Trong ví dụ trên, `ApplicationContext` là một phần của framework Spring, nó quản lý việc tạo và cung cấp các đối tượng.
Spring Framework quản lý việc tạo ra đối tượng `Girl` và cung cấp `Outfit` thông qua DI. Không cần tự tạo đối
tượng `Girl`,
Spring sẽ làm điều đó và cung cấp `Outfit`.
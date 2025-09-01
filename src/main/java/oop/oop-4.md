# Abstract class là gì?

Trong lập trình hướng đối tượng (OOP), một **abstract class** (lớp trừu tượng) là một lớp không thể được khởi tạo trực
tiếp và thường được sử dụng như một khuôn mẫu cho các lớp con. Abstract class có thể chứa các **phương thức trừu tượng (
abstract methods)** - những phương thức không có phần thân và phải được các lớp con triển khai.

## Đặc điểm của Abstract Class

**1. Có thể chứa phương thức trừu tượng (abstract method)**

- Phương thức chỉ khai báo mà không có thân (implementation).

- Các lớp con kế thừa phải override lại.
- Ví dụ:
    ```java
    abstract class Animal {
        abstract void makeSound(); // Phương thức trừu tượng
    }
    ```

**2. Có thể chứa phương thức thông thường (concrete method)**

- Có thể có phần thân và thực hiện chức năng cụ thể.
- Ví dụ:
    ```java
   public abstract class Animal {
        public abstract void makeSound();

        public void eat(String food) {
            System.out.println("Eating " + food);
        }
    }
    ```

**3. Không thể khởi tạo trực tiếp**

`Animal a = new Animal(); // ❌ Lỗi`

**4. Có thể có biến instance, constructor:**

- Dùng để chia sẻ logic cho các lớp con.
- Ví dụ:
    ```java
    abstract class Animal {
        String name;

        public Animal(String name) {
            this.name = name;
        }
    }
    ```

**5. Lớp con phải triển khai (implement) các phương thức trừu tượng**

- Ví dụ:
   ```java
   class Dog extends Animal {
        public Dog(String name) {
            super(name);
        }

        @Override
        void makeSound() {
            System.out.println("Woof");
        }
    }
   ```

**6. Một lớp có thể kế thừa 1 abstract class duy nhất (vì Java chỉ hỗ trợ đơn kế thừa lớp).**

### Khi nào nên dùng Abstract Class?

- Khi muốn định nghĩa **khuôn mẫu chung** cho một nhóm lớp có mối quan hệ chặt chẽ.  
  (Ví dụ: `Animal` → `Dog`, `Cat`, `Bird`...)

- Khi có **một phần hành vi mặc định** có thể dùng chung cho nhiều lớp con,  
  nhưng vẫn muốn ép các lớp con phải cài đặt những hành vi đặc thù.  
  (Ví dụ: tất cả động vật đều có thể `eat()`, nhưng cách `makeSound()` thì khác nhau).

- Khi cần **chia sẻ biến instance hoặc constructor** cho các lớp con.

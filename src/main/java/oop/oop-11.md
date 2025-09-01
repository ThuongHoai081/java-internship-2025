# Generic là gì, sử dụng generic có tác dụng gì?

## 1. Khái niệm

**Generic** là cơ chế cho phép viết **class, interface hoặc method tổng quát** mà không cần cố định kiểu dữ liệu. Thay
vì viết riêng cho `Integer`, `String`, `Double`, bạn có thể viết **một phiên bản duy nhất**.

### Cú pháp cơ bản:

```java
class Box<T> {
    private T content;

    public void setContent(T content) {
        this.content = content;
    }

    public T getContent() {
        return content;
    }
}
```

- `T` là **type parameter (tham số kiểu)**, có thể đặt tên khác như `E`, `K`, `V` tùy ngữ cảnh.
- Khi sử dụng, `T` sẽ được thay thế bởi kiểu dữ liệu cụ thể.

```java
Box<Integer> intBox=new Box<>();
        intBox.setContent(123);

        Box<String> strBox=new Box<>();
        strBox.setContent("Hello");
```

### Các ký hiệu thông dụng trong Generic:

`T` – Type: đại diện cho một kiểu dữ liệu tổng quát.

`E` – Element: đại diện cho một phần tử trong một collection (ví dụ ArrayList<E>).

`K` – Key: đại diện cho key trong cấu trúc key-value (ví dụ HashMap<K, V>).

`V` – Value: đại diện cho value trong cấu trúc key-value (ví dụ HashMap<K, V>).

---

### 2. Tác dụng của Generic

**a. Tăng tính an toàn về kiểu dữ liệu (Type Safety)**

- Không cần ép kiểu thủ công, tránh lỗi `ClassCastException`.
- Ví dụ:

```java
Box<String> box=new Box<>();
        box.setContent("Hello");
        String s=box.getContent(); // Không cần ép kiểu: String s = (String) box.getContent(); 
```

**b. Tái sử dụng code (Code Reusability)**

- Một class/method có thể làm việc với nhiều kiểu dữ liệu khác nhau.
- Tránh viết nhiều class giống nhau chỉ khác kiểu dữ liệu.

**c. Dễ đọc, dễ bảo trì**

- Code rõ ràng hơn vì kiểu dữ liệu đã được xác định từ đầu.

**d. Hỗ trợ Collections trong Java**

- Ví dụ: `ArrayList<String>` hay `HashMap<String, Integer>` đều dùng Generic để quản lý kiểu dữ liệu an toàn.

---

### 3. Ví dụ với phương thức Generic

```java
public class Util {
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.println(element);
        }
    }
}

    // Sử dụng:
    Integer[] numbers = {1, 2, 3};
    String[] names = {"Alice", "Bob"};

Util.printArray(numbers);
        Util.printArray(names);
```

---

### 4. Generic với Collections

```java
import java.util.ArrayList;
import java.util.HashMap;

public class Example {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");

        HashMap<String, Integer> map = new HashMap<>();
        map.put("Alice", 25);
        map.put("Bob", 30);

        System.out.println(list);
        System.out.println(map);
    }
}
```

- `ArrayList<String>`: Chỉ chứa `String`.
- `HashMap<String, Integer>`: Key là `String`, value là `Integer`.

---

### 5. Ràng buộc Generic (Bounded Type Parameters)

- Có thể giới hạn kiểu dữ liệu mà tham số kiểu có thể nhận.
- Ví dụ: Chỉ cho phép các kiểu con của `Number`.

```java
class NumericBox<T extends Number> {
    private T number;

    public void setNumber(T number) {
        this.number = number;
    }

    public T getNumber() {
        return number;
    }
}
```

### 6. Wildcards trong Generics

- **Wildcards (?)** cho phép đại diện cho một kiểu bất kỳ mà không cần biết chính xác là kiểu nào. Thường dùng với
  Collections để viết code linh hoạt.

**a. Unbounded Wildcard (?):** Không giới hạn kiểu, dùng khi chỉ đọc dữ liệu.

```java
public void printList(List<?> list){
        for(Object obj:list){
        System.out.println(obj);
        }
        }
```

- `list` có thể là `List<String>`, `List<Integer>`…

**b. Upper Bounded Wildcard (? extends Type)**

- Chỉ cho phép kiểu là Type hoặc con của Type.
- Dùng khi muốn đọc dữ liệu nhưng không sửa.

```java
public void processNumbers(List<?extends Number> list){
        for(Number n:list){
        System.out.println(n);
        }
        }
```

- `list` có thể là `List<Integer>`, `List<Double>`…
- Không thể thêm phần tử (ngoại trừ null).

**c. Lower Bounded Wildcard (? super Type)**

- Chỉ cho phép kiểu là Type hoặc cha của Type.
- Dùng khi muốn thêm dữ liệu vào Collection.

```java
public void addIntegers(List<? super Integer>list){
        list.add(10);
        list.add(20);
        }
```

- `list` có thể là `List<Integer>`, `List<Number>`, `List<Object>`…
- **Không thể đọc chính xác kiểu ra**, chỉ biết là Object trở lên.
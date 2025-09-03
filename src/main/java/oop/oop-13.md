# Từ khoá instanceof dùng để làm gì?

- Toán tử `instanceof` trong Java được dùng để **kiểm tra một đối tượng có phải là thể hiện (instance) của một lớp, lớp
  con hoặc interface** nào đó hay không.
- Kết quả trả về:
    - `true` nếu đối tượng thuộc kiểu cần kiểm tra.
    - `false` nếu không phải.

#### 1. Cú pháp:

```java
if(object instanceof ClassName){
        // Thực hiện nếu object là thể hiện của ClassName
        }
```

#### 2. Ví dụ:

```java
class Animal {
}

class Dog extends Animal {
}

public class Main {
    public static void main(String[] args) {
        Animal a = new Animal();
        Dog d = new Dog();

        System.out.println(a instanceof Animal); // true
        System.out.println(d instanceof Dog);    // true
        System.out.println(d instanceof Animal); // true (Dog kế thừa Animal)
        System.out.println(a instanceof Dog);    // false
    }
}
```

#### 3. Với interface:

```java
interface Pet {
}

class Cat implements Pet {
}

public class Main {
    public static void main(String[] args) {
        Cat c = new Cat();
        System.out.println(c instanceof Pet); // true
    }
}
```

#### 4. Trường hợp đặc biệt:

```java
Object obj=null;
        System.out.println(obj instanceof Object); // false
```

- `instanceof` rất hữu ích trong các tình huống như kiểm tra kiểu trước khi ép kiểu (casting) hoặc trong các cấu trúc
  điều
  kiện để xử lý các đối tượng khác nhau dựa trên kiểu của chúng.

#### 5. `instanceof` từ Java 14 trở đi (Pattern Matching):

- Từ Java 14 trở đi, có thể sử dụng `instanceof` kết hợp với khai báo biến để giảm bớt việc ép kiểu thủ công:

```java
if(obj instanceof String str){
        // Ở đây str đã được khai báo và ép kiểu thành String
        System.out.println("String length: "+str.length());
        }
```

- Trong ví dụ trên, nếu `obj` là một `String`, nó sẽ được tự động ép kiểu và gán cho biến `str` bên trong khối `if`.
- Điều này giúp mã nguồn trở nên ngắn gọn và dễ đọc hơn.
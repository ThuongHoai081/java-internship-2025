# Giải thích khối lệnh try-catch và try-catch-resource.

### 1. Khối lệnh try-catch:

- Khối lệnh try-catch là cơ chế cơ bản nhất để xử lý ngoại lệ trong Java.
- `try` chứa đoạn code có khả năng gây ra ngoại lệ.
- `catch` dùng để bắt ngoại lệ và xử lý chúng. Có thể có nhiều catch để bắt nhiều loại ngoại lệ khác nhau.
- `finally` (không bắt buộc) luôn được thực thi dù có ngoại lệ hay không, thường dùng để dọn dẹp tài nguyên (đóng file,
  đóng kết nối DB...).

- Cú pháp cơ bản của `try-catch` như sau:

```java
try{
// Code that might throw an exception
        }catch(ExceptionType e){
// Code to handle the exception
        }finally{
// Optional block to release resources or cleanup code
        }

```

- Ví dụ:

```java
public class TryCatchExample {
    public static void main(String[] args) {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("example.txt"));
            String line = reader.readLine();
            System.out.println("Read line: " + line);
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            // Clean up and close the reader
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    System.out.println("Failed to close reader: " + e.getMessage());
                }
            }
        }
    }
}
```

### 2. Khối lệnh try-with-resources:

- Được giới thiệu từ Java 7 để đơn giản hóa việc quản lý tài nguyên.
- Dùng khi làm việc với các tài nguyên (file, socket, database connection, …) cần phải đóng lại sau khi sử dụng.
- Khi khai báo tài nguyên trong dấu ngoặc `try(...)`, Java sẽ tự động gọi phương thức `close()` cho tài nguyên đó sau
  khi
  khối `try` kết thúc, dù có ngoại lệ hay không.
- Điều kiện: tài nguyên phải implement interface `AutoCloseable` (hoặc `Closeable`).
- Không cần viết `finally` để đóng tài nguyên thủ công.
- Cú pháp cơ bản của `try-with-resources` như sau:

```java
try(ResourceType resource=new ResourceType()){
// Code that might throw an exception
        }catch(ExceptionType e){
// Handle exceptions
        }
```

- Ví dụ:

```java
public class TryWithResourcesExample {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("example.txt"))) {
            String line = reader.readLine();
            System.out.println("Read line: " + line);
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
```

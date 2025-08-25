# Java Internship 2025

## Guide

### Create the new project
- Create new repository from github and clone the repository to your local machine
- Create new project inside the folder (alternatively you create the project first and then push it to the repository)

### Config Codecov
- Create a new Codecov account and link it to your GitHub account
- Create a new repository in Codecov and link it to the GitHub repository you just created
- Configure your new project, you should see the data is empty, just visit the Configuration tab --> General and find the token, something like below and copy it

```md
CODECOV_TOKEN=000070cd-c11f-49f0-a1ab-ac7ca9d0bf72
```

### Config the build on CircleCI
- Create the .circle/config.yml with the same content as the one in this repository, push it to the repository
- Set up the CircleCI project to use the config file you just created and build it
- The build completed failed, don't worry, open the Project Setting --> Environment variables and create new variable with name is `CODECOV_TOKEN` and the value above
- Rebuild the project, it should be successful now

### Create the badges
- Create the Readme.md file
- For CircleCI, goto project settings --> Status badges and copy the markdown code, paste it to the Readme.md file
- For Codecov, goto the repository Configuration --> Badges and Graphs --> copy the markdown code, paste it to the Readme.md file

### Test everything works
- Make a changes to the code, commit and push it to the repository
- Wait for the build completed in a few seconds, refresh the repository (it shows the file Readme.md by default), observer the changes. (sometimes, the badges take time to update)

## Badges

### Build status

[![CircleCI](https://dl.circleci.com/status-badge/img/gh/voquanghoa/java-internship-2025/tree/main.svg?style=svg)](https://app.circleci.com/pipelines/github/ThuongHoai081/java-internship-2025?branch=main)

### Codecov

[![codecov](https://codecov.io/gh/voquanghoa/java-internship-2025/graph/badge.svg?token=RKKS73IELY)](https://app.codecov.io/github/ThuongHoai081/java-internship-2025)

## Exercise

### Basic

1. Viết chương trình tìm ước số chung lớn nhất, bội số chung nhỏ nhất của hai số tự nhiên
2. Viết chương trình tìm tổng các chữ số của một số nguyên
3. Viết chương trình nhận vào một số nguyên và trả về cách phân tích số đó ra tích của thừa số nguyên tố. Ví dụ nhập vào 600 thì cần phải trả về `2 * 2 * 2 * 3 * 5 * 5`
4. Số fibonaci là dãy số bắt đầu từ 1 1 và sau đó, số tiếp theo bằng 2 số trước cộng lại. Tức là `1 1 2 3 5 8 ....`. Nhập vào số nguyên n, in ra danh sách những số fibonaci không lớn hơn n.
5. Viết phương trình tính giai thừa `n!` của một số
6. Viết chương trình nhận vào một số nguyên từ 1 -- 12, cho ra tên của tháng tương ứng
7. Số 23 khi viết nhị phân sẽ là 10111 khi viết ngược lại thành 11101 và nó thành số 29. Nhập số nguyên n và tìm số m bằng cách viết ngược thứ tự số binary như trên.
8. Viết chương trình dịch số thập phân thành số la mã

### String

1. Kiểm tra chuỗi ký tự có đối xứng hay không. (Ví dụ abcdcba là đối xứng)
2. Tính tổng của các số nguyên trong chuỗi. Ví dụ abc 123 def 33 mn 3.221 sẽ in ra 380 với 380 = 123+33+3+221
3. Viết chương trình kiểm tra một chuỗi string có phải là sự lặp lại của một chuỗi string bất kỳ nào đó hay không:
4. Nhận vào một chuổi ký tự chứa toàn các chữ cái (a-z, A-Z). Rút gọn chuỗi bằng cách ở những nơi chữ cái lặp lại, ta viết số lần lặp. Ví dụ abcccceeeeeefd sẽ viết thành abc4e6fd, abbbbbbbbbbbbbc viết là ab13c
5. Đảo ngược bài trên, ví dụ nhận vào ab13c trả về abbbbbbbbbbbbbc
6. Một Barcode EAN 13 có 13 con số được coi là hợp lệ nếu: tổng của các số ở vị trí lẻ + 3*(tổng các số ở vị trí chẳn) là một số chia hết cho 10.
   Ví dụ mã barcode 8938505974194 ta có (8+3+5+5+7+1+4) + 3 * (9+8+0+9+4+9) = 150. 150 chia hết cho 10 nên mã 8938505974194 là hợp lệ.

Viết chương trình kiểm tra tính hợp lệ của một barcode. 
Hint: Bạn tìm xung quanh vài sản phẩm gì đó, lấy barcode của nó làm happy testcase, cố tình sửa sai vài chữ số để làm unhappy testcase. 

### Array

1. Viết chương trình tìm tổng của các số chẵn và trừ đi tổng các số lẻ trong một mảng số nguyên
2. Viết chương trình sử dụng phương pháp tìm kiếm nhị phân để tìm kiếm một số nguyên từ một mảng số nguyên đã sắp xếp (tăng dần hoặc giảm dần), trả về vị trí nếu tìm thấy hoặc -1 nếu không tìm thấy
3. Viết chương trình đảo ngược các phần tử trong một mảng số nguyên (yêu cầu: in-place, không sử dụng mảng phụ)
4. Viết chương trình nhận vào 2 mảng các số nguyên đã sắp xếp, tạo mảng số nguyên từ 2 mảng số nguyên đã cho và giữ nguyên thứ tự đã sắp xếp. (Yêu cầu: không dùng thêm thao tác sort)
5. Một mảng số nguyên n phần tử có giá trị từ 1 đến n, bỏ bớt một giá trị bất kỳ rồi sắp xếp ngẫu nhiên. Viết chương trình nhận vào mảng số nguyên của quá trình trên và truy tìm số đã bị bỏ bớt.

### Stream

Tất cả các bài dưới đều dùng stream, không dùng vòng lặp. Ngoại trừ bài 1 ra thì tất cả các bài còn lại đều ở dạng 1 câu lệnh duy nhất.

1. Viết lại chương trình ở bài Array 1
2. Viết lại chương trình ở bài Array 5
3. Viết chương trình dùng stream để đọc các chữ số của một số nguyên, kết quả là một chuỗi string. Ví dụ nhập vào 123 thì kết quả là "One, Two, Three"
4. Viết chương trình nhập vào mảng số nguyên, sắp xếp mảng số nguyên đó tăng dần theo thứ tự từ điển.

Ví dụ mảng số nguyên là [1, 9, 23, 123, 100, 45, 43] thì kết quả là [1, 100, 23, 43, 45, 9]

Hint: Chuyển số thành chuỗi rồi dùng hàm compareTo trong lớp String

5. Viết chương trình nhận vào một mảng của các số nguyên, tìm danh sách những số có nhiều chữ số nhất rồi tính tổng của chúng.

Ví dụ mảng đầu vào [1, 32, 444, 555, 12, 33] thì có [444, 555] đều có 3 chữ số và nhiều nhất, do đó tổng cần tìm là 444 + 555 = 999

Hint: Được phép chuyển số thành string rồi dùng hàm length() để lấy số chữ số

### OOP:

Trả lời bằng cách tạo file có tên là oop-X.md với x là số thứ tự của câu hỏi (tham khảo định dạng markdown https://www.markdownguide.org/basic-syntax/) để trả lời những câu hỏi về oop dưới đây. Bạn được phép tham khảo bất kỳ nguồn nào (trang web, tài liệu, chatbot, thậm chí bài của người khác) nhưng cố gắng chỉ những gì mà bạn chắc chắn hiểu và bạn hãy tự tay soạn thảo câu trả lời. Với những gì bạn không thực sự hiểu, hãy viết chúng dưới dạng câu hỏi. Cố gắng thay vì chỉ tìm hiểu lý thuyết rồi trả lời câu hỏi, hãy cố gắng thử viết ví dụ với chúng trên IDE

1. Hướng đối tượng là gì
2. Class là gì, Object là gì, giải thích mối quan hệ giữa chúng
3. Kế thừa là gì
4. Abstract class là gì
5. Interface là gì
6. So sánh sự khác biệt giữa class, abstract class và interface.
7. Liệt kê những điểm mà class làm được mà abstract class và inteface không làm được. Tương tự cho abstract class và interface
8. Một số ngôn ngữ như C++ hỗ trợ đa thừa kế nhưng Java thì không. Theo bạn, lý do là tại sao
9. Annotation là gì, giải thích ý nghĩa của @Override, @Deprecated
10. Anonymous class là gì, lúc nào thì ta nên dùng anonymous class
11. Generic là gì, sử dụng generic có tác dụng gì
12. Từ khoá final có tác dụng gì khi áp dụng nó lên: biến, field, parametter của hàm, method và class
13. Từ khoá instanceof dùng để làm gì
14. Từ khoá super có tác dụng gì, khi nào thì ta bắt buộc phải dùng nó
15. Từ khoá this có tác dụng gì, khi nào thì ta bắt buộc phải dùng nó
16. Từ khoá static dùng để làm gì, tại sao từ một static method, ta không thể truy cập được đến non-static method
17. Tìm hiểu và giải thích SOLID Principles
18. Tìm hiểu, giải thích Design Pattern là gì và giải thích mục đích/ý nghĩa của vài pattern (tuỳ chọn)
19. Giải thích khối lệnh try-catch và try-catch-resource
20. Bạn hiểu gì về DI và IOC

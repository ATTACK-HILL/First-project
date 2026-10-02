 Actors
   ├── OWNER làm gì?
   ├ Toàn quyền — quản lý tài khoản người dùng khác, thêm/sửa/xóa mọi dữ liệu, xem mọi báo cáo.
   ├── MANAGER làm gì?
   ├ Quản lý sản phẩm, nhà cung cấp; tạo phiếu nhập/xuất; xem báo cáo. Không được đổi quyền người khác
   ├── VIEWER làm gì?
   └ Chỉ xem danh sách, tồn kho, báo cáo — không sửa được gì.

| Chức năng                 | OWNER | MANAGER | VIEWER |
| ------------------------- | :---: | :-----: | :----: |
| Đăng nhập                 |   ✅   |    ✅    |    ✅   |
| Xem sản phẩm              |   ✅   |    ✅    |    ✅   |
| Thêm/sửa/xóa sản phẩm     |   ✅   |    ✅    |    ❌   |
| Quản lý danh mục          |   ✅   |    ✅    |    ❌   |
| Xem nhà cung cấp          |   ✅   |    ✅    |    ✅   |
| Thêm/sửa/xóa nhà cung cấp |   ✅   |    ✅    |    ❌   |
| Xem khách hàng            |   ✅   |    ✅    |    ✅   |
| Nhập kho                  |   ✅   |    ✅    |    ❌   |
| Xuất kho                  |   ✅   |    ✅    |    ❌   |
| Xem tồn kho               |   ✅   |    ✅    |    ✅   |
| Xem báo cáo               |   ✅   |    ✅    |    ✅   |
| Quản lý người dùng        |   ✅   |    ❌    |    ❌   |
| Thay đổi quyền            |   ✅   |    ❌    |    ❌   |


- Product gồm thuộc tính gì?
product gồm thuộc tính:
+ id
+ name_product
+ 
+ số lượng tồn
+ ngưỡng cảnh báo
method:
+ tăng tồn()
+ giảm tồn()
+ tồn thấp()
+ compareTo()

- Category gồm gì?
+ id
+ name
+ description

- Supplier gồm gì?
+ id
+ name
+ address
+ phone
+ email

- Customer gồm gì?
+ id
+ name
+ phone
+ address
+ email

- Nhập kho hoạt động thế nào?
nhà cung cấp -> kiểm tra hợp lệ -> cập nhật tồn kho
- Xuất kho hoạt động thế nào?
người nhận -> kiểm tra hợp lệ -> cập nhật tồn kho

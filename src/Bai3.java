import java.util.Arrays;

public class Bai3 {
    public static void main(String[] args) {
//
//    }
//    /* ko trả về gì */ public static void getNumber (int a, int b, String c){
//        System.out.println(a+b+c);
//
//    }
        //Khởi tạo 1 hàm trong java
        int[] arr = new int[5];
        int size = 0;
        size = push(arr, 10, size);
        size = push(arr, 1, size);
        size = push(arr, 3, size);
        size = push(arr, -5, size);

        System.out.println(Arrays.toString(arr));
        System.out.println(" Vị trí : " + search(arr, 3, size));
        size = delete(arr, 3, size);
        System.out.println("Mảng sau khi xóa " + Arrays.toString(arr));

    }


    public static int push(int[] arr, int element, int size) {
        arr[size] = element;
        size++;
        return size;
    }

    // Tìm kiếm giá trị trong mảng
    public static int search(int[] arr, int element, int size) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == element) {
                return i;
            }
        }
        return -1;
    }

    // Xóa giá trị trong mảng
    public static int delete(int[] arr, int element, int size) {
        int index = search(arr, element, size);
        for (int i = index; i < size; i++) {
            arr[i] = arr[i + 1];
        }
        size--;
        return size;
    }
    // cách nhập thêm giá trị vào mảng
//    public static int add(int[] arr, int element, int size){
//        for (int i = 0; i < size; i++) {
//            if (size < arr.length){
//                int index1 = push(arr, element, size);
//
//            }


//}
//    }
//    2. Thực hành : Tìm giá trị trong mảng

}

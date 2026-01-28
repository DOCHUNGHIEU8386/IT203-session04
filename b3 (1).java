public class b3 {
    static void maxQuantityOfBooks(String[] names, int[] quantities){
        int max = quantities[0];
        // For-each
        for(int q : quantities){
            if(q > max){
                max = q;
            }
        }
        System.out.println("Sach co so luong nhieu nhat (" + max + ")");
        for(int i = 0 ; i < quantities.length ; i++){
            if(quantities[i] == max){
                System.out.println(names[i]);
            }
        }
    }

    static void  minQuantityOfBooks(String[] names, int[] quantities){
        int min = quantities[0];
        // for
        for(int i = 0 ; i < quantities.length ; i++){
            if(quantities[i] < min){
                min = quantities[i];
            }
        }
        System.out.println("Sach co so luong it nhat (" + min + ")");
        for(int i = 0 ; i <quantities.length ; i++){
            if(quantities[i] == min){
                System.out.println(names[i]);
            }
        }
    }

    public static void main(String[] args){
        String[] names = {"Lap trinh Java", "Co so du lieu", "Cau truc du lieu", "Lap trinh Web", "Mang may tinh"};
        int[] quantities = {12, 5, 12, 3, 3};

        maxQuantityOfBooks(names, quantities);
        System.out.println("---------------");
        minQuantityOfBooks(names, quantities);
    }
}

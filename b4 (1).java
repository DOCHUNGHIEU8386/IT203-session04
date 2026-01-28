public class b4 {
    // Bubble sort
    static void sortBooks(int[] arr){
        for(int i = 0 ; i < arr.length - 1 ; i++){
            for(int j = 0 ; j < arr.length - i - 1 ; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    static void displayBooks(int arr[]){
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i]);
            if(i < arr.length - 1){
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args){
        int[] books = {1203, 501, 2301, 150, 999};

        System.out.print("Truoc khi sap xep :" );
        displayBooks(books);

        sortBooks(books);

        System.out.print("Sau khi sap xep :");
        displayBooks(books);
    }
}

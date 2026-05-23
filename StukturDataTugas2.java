/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Arrays;

public class StukturDataTugas2
{
	public static void main(String[] args) {
		//panggil method untuk menampilkan tugas 1,2, dan 3
		System.out.println("=========== Soal no 1 ============");
		tugasStack();
		
		//panggil method untuk menampilkan tugas 1,2, dan 3
		System.out.println("=========== Soal no 2 ============");
		tugasQueue();
		
		//panggil method untuk menampilkan tugas 1,2, dan 3
		System.out.println("=========== Soal no 3 ============");
		tugasQuickShort();
	}
	
	//=========== Soal no 1 ============
	static void tugasStack() {
	    //buat object untuk menyimpan Integer
	    Stack<Integer> stack = new Stack<>();
	    
	    //data minimal 8 angka tipe data integer bebas
	    int[] data = {12, 14, 34, 23, 56, 90, 76, 56};
	    
	    System.out.println("Proses PUSH:");
	    //loop setiap angka menggunakan stack dengan push()
	    for (int i: data) {
	        stack.push(i);  // push = memasukkan data ke tumpukan paling atas stack
	        System.out.println("Push " + i + " -> Isi Stack: " + stack);
	    }
	    System.out.println("\nIsi stack sebelum POP:" + stack);
	    //pop = untuk mengambil data paling atas sebuah stack LIFO = Last In First Out
	    System.out.println("Pop " + stack.pop() + "-> Isi Stack: " + stack);
	    System.out.println("Pop " + stack.pop() + "-> Isi Stack: " + stack);
	    
	    System.out.println("\nIsi stack setelah POP:" + stack);
	}
	
	//=========== Soal no 2 ============
	static void tugasQueue() {
	    //buat object untuk menyimpan Integer dengan Queue pakai LinkedList
	    Queue<Integer> queue = new LinkedList<>();
	    
	    //data minimal 8 angka tipe data integer bebas
	    int[] data = {12, 14, 34, 23, 56, 90, 76, 56};
	    
	    System.out.println("Proses ENQUEUE:");
	    //loop setiap angka menggunakan queue dengan add()
	    for (int i: data) {
	        queue.add(i);  // add  = memasukkan data di belakang antrian
	        System.out.println("Enqueue " + i + " -> Isi Queue: " + queue);
	    }
	    System.out.println("\nIsi Queue sebelum Dequeue:" + queue);
	    //poll = untuk mengambil data  dan menghapus data paling depan FIFO = First In First Out
	    System.out.println("Dequeue " + queue.poll() + "-> Isi Queue: " + queue);
	    System.out.println("Dequeue " + queue.poll() + "-> Isi Queue: " + queue);
	    
	    System.out.println("\nIsi Queue setelah Dequeue:" + queue);
	}
	
	//=========== Soal no 3 ============
	static void tugasQuickShort(){
	    //data minimal 8 angka tipe data integer bebas
	    int[] arr = {12, 14, 34, 23, 56, 90, 76, 56};
	    
	    System.out.println("Data sebelum diurutkan: " + Arrays.toString(arr));
	    //panggil fungsi quickShort dari index 0 samapai akhir Arrays
	    quickShort(arr, 0, arr.length - 1);
	    
	    System.out.println("Data sesudah diurutkan: " + Arrays.toString(arr));
    	}
    	
	    // Fungsi rekursif untuk Quick short
	    static void quickShort(int[] arr, int low, int high){
	        
	    if (low < high) { //kondisi berhenti rekursif
	    //pi = index pivot setelah partisi
	        int pi = partition(arr, low, high);
	        
	        //urutkan bagian kiri pivot
	        quickShort(arr, low, pi - 1);
	        
	        //urutkan bagian kanan pivot
	        quickShort(arr, pi + 1, high);
	    }
	    
	}
	//fungsi untuk memisahkan array berdasarkan pivot
	static int partition(int[] arr, int low, int high) {
	    // Pilih pivot = elemen paling kanan
	    int pivot = arr[high];
	    //i = index untuk angka yang lebih  kecil dari pivot
	    int i = low - 1;
	    
	    //loop dari nilai low sampai sebelum high
	    for (int j = low; j < high; j++){
	        //jika angka sekarang lebih kecil dari pivot maka..
	        if(arr[j] < pivot){
	            i++; // geser index i dan tukar arr[i] agar angka kecil berada pada paling kiri
	            int temp = arr[i];
	            arr[i] = arr[j];
	            arr[j] = temp;
	        }
	    }
	    // tukar pivot ke posisi  yang benar yaitu setelah semua angka kecil diurutkan
	    int temp = arr[i + 1];
	    arr[i + 1] = arr[high];
	    arr[high] = temp;
	    
	    //kembalikan index pivot
	    return i + 1;
	}
	
}
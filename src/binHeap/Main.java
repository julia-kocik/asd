package binHeap;


public class Main {

    static class MinHeap {
        int[] heap = new int[100];
        int size = 0;

        void insert(int x) {
            heap[size] = x;
            int i = size;
            size++;

            while (i > 0) {
                int parent = (i - 1) / 2;

                if (heap[i] < heap[parent]) {
                    swap(i, parent);
                    i = parent;
                } else {
                    break;
                }
            }
        }

        int delMin() {
            int min = heap[0];

            heap[0] = heap[size - 1];
            size--;

            heapifyDown(0);

            return min;
        }

        void heapifyDown(int i) {
            while (true) {
                int left = 2 * i + 1;
                int right = 2 * i + 2;
                int smallest = i;

                if (left < size && heap[left] < heap[smallest]) {
                    smallest = left;
                }

                if (right < size && heap[right] < heap[smallest]) {
                    smallest = right;
                }

                if (smallest != i) {
                    swap(i, smallest);
                    i = smallest;
                } else {
                    break;
                }
            }
        }

        void construct(int[] arr) {
            size = arr.length;

            for (int i = 0; i < arr.length; i++) {
                heap[i] = arr[i];
            }

            for (int i = (size - 2) / 2; i >= 0; i--) {
                heapifyDown(i);
            }
        }

        void swap(int i, int j) {
            int temp = heap[i];
            heap[i] = heap[j];
            heap[j] = temp;
        }

        String heapToString() {
            String result = "";

            for (int i = 0; i < size; i++) {
                result += heap[i];

                if (i < size - 1) {
                    result += ",";
                }
            }

            return result;
        }
    }

    public static void main(String[] args) {
        //int[] S = {5,18,12,16,1,14,10,0};
        int[] S = {15,17,3,0,16,2,19,5};

        MinHeap h1 = new MinHeap();

        for (int x : S) {
            h1.insert(x);
        }

        System.out.println("Binary Heap:");
        System.out.println(h1.heapToString());

        h1.delMin();
        System.out.println(h1.heapToString());

        MinHeap h2 = new MinHeap();
        h2.construct(S);
        System.out.println(h2.heapToString());
    }
}
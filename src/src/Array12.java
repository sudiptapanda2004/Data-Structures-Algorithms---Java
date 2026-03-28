// Printing sub-arrays - continuous part of a array

public static void printSubarrays(int numbers[]) {
    int ts = 0;                            // ts = n*(n+1)/2
    for (int i=0; i< numbers.length; i++) {
        // int start = numbers[i];
        for (int j=i; j<numbers.length; j++) {
            // int end = numbers[j];
            System.out.print("[");          // array starting bracket for output format

            for (int k=i; k<=j; k++) {      // this loop's task is only to print
                System.out.print(numbers[k]);
                if (k < j) System.out.print(" ");   // space in between for output format
            }
            ts++;
            System.out.println("]");        // array ending bracket for output format
        }
        System.out.println();
    }
    System.out.println("The total no. of sub-arrays printed are : "+ts);
}

void main() {
    int numbers[] = {1,2,3,4,5};

    System.out.println("A");
    printSubarrays(numbers);
}
// reverse of ana array

public static void reverse(int numbers[]) {
    int first = 0, last = numbers.length-1;

    while (first < last) {
        // classical swap method
        int temp = numbers[last];
        numbers[last] = numbers[first];
        numbers[first] = temp;

        first++;
        last--;
    }
}

void main() {
    int numbers[] = {2,4,6,8,10};
    System.out.println("Array given : "+Arrays.toString(numbers));
    /* here we used Arrays.toString method because an array cannot be concatenated with a string directly,
    which is the message ("Array given : ") here.
     */
    reverse(numbers);
    System.out.println("The reversed array is : "+Arrays.toString(numbers));

      // printing the output array using loop instead of inbuilt method
      /*  reverse(numbers);
        for (int i=0; i<numbers.length; i++) {
        System.out.print(numbers[i]+" ");
        }
        System.out.println();

       */


}
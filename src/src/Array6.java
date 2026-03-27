// linear search 2

public static int linearSearch(String menu[], String key) {
    for (int i=0; i< menu.length; i++) {
        if (menu[i].equals(key)) {      // string comparisons -> use .equals()
            return i;
        }
    }
    return -1;
}

void main() {
    String menu[] = {"rice","dal","paneer","mix-veg","roti","chicken","fish"};
    // System.out.println(menu[]);              // this way is incorrect
    System.out.println(Arrays.toString(menu));  // this is the correct way
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the item you want to eat: ");
    String key = sc.next();

    int index = linearSearch(menu, key);
    if(index==-1) {
        System.out.print("Not Found");
    }
    else {
        System.out.println("The "+key+" is at index : "+index);
    }

}
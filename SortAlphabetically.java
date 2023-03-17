public static void sort(ArrayList<String> list){
        String hold = null;
        int size = list.size();
        while(size != 0){
            for(int index = 1; index < size; index++){
                if(list.get(index - 1).substring(0,1).compareTo(list.get(index).substring(0,1)) > -1){ //Swap <, or > for order
                    hold = list.get(index - 1);
                    list.set(index - 1, list.get(index));
                    list.set(index, hold);
                }
            }
            size--;
        }
    }

// public static String[] sortByAlphabet(String[] arr){
    //     String hold;
    //     String string1;
    //     String string2;
    //     String ss1;
    //     String ss2;
    //     char s1;
    //     char s2;
    //     int value1 = 0;
    //     int value2 = 0;
        
    //     for (int i = 0; i < arr.length; i++){
    //         for (int j = i; j < arr.length; j++){
    //             string1 = arr[i];
    //             string2 = arr[j];
    //             ss1 = string1.toLowerCase();
    //             ss2 = string2.toLowerCase();
    //             s1 = ss1.charAt(0);
    //             s2 = ss2.charAt(0);
    //             value1 = s1;
    //             value2 = s2;
    //             //Switch < to > for alphabetical order, and reverse
    //             if(value2 > value1){
    //                 hold = arr[i];
    //                 arr[i] = arr[j];
    //                 arr[j] = hold;
    //             }
    //         }
    //     }
    //     return arr;
    // }

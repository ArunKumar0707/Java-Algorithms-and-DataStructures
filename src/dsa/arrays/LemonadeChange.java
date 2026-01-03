package dsa.arrays;

public class LemonadeChange {

    public static boolean lemonadeChange(int[] bills) {
        //     int[] change = new int [11];
        //     for(int i = 0 ; i < bills.length ; i++){
        //         if(bills[i] == 5){
        //            ++change[5];
        //         }else if(bills[i] == 10 && change[5] > 0){
        //             if(change[5] >= 1) {
        //             --change[5];
        //             ++change[10];
        //             } else{
        //                 return false;
        //             }
        //         } else if(bills[i] == 20){
        //             if(change[10] >= 1 && change[5] >= 1) {
        //                 --change[10];
        //                 --change[5];
        //             } else if(change[5] >= 3) {
        //                  change[5] -= 3;
        //             }else{
        //                 return false;
        //             }
        //         } else {
        //             return false;
        //         }
        //         if(change[10] < 0 || change[5] < 0) return false;
        //     }
        //     return true;
        int five = 0;
        int ten = 0;
        for (int bill : bills) {
            if (bill == 5) {
                five++;
            } else if (bill == 10) {
                if (five > 0) {
                    five--;
                    ten++;
                } else {
                    return false;
                }
            } else if (five > 0 && ten > 0) {
                five--;
                ten--;
            } else if (five >= 3) {
                five -= 3;
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] bills1 = {5, 5, 5, 10, 20};
        System.out.println(lemonadeChange(bills1));

        int[] bills2 = {5, 5, 10, 10, 20};
        System.out.println(lemonadeChange(bills2));
    }
}


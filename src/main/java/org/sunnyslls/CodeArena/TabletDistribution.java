package org.sunnyslls.CodeArena;

import java.util.Scanner;

/**
 * Created by sunny on 27/7/17.
 *
 *
 * Therasa is a Nurse. She wants to give some tablets to the patients in her practice. All the patients sit in a line and each of them has a rating score according to his or her health score. Therasa wants to give at least 1 tablet for each patient. Patients get jealous of their immediate neighbors, so if two patients sit next to each other then the one with the higher rating must get more tablets. Therasa wants to save money, so she wants to minimize the total number of tablets.

 Input
 The first line of the input is an integer N, the number of patients in Therasa’s practice. Each of the following N lines contains an integer indicates the health score of each patient.

 Output
 Output a single line containing the minimum number of tablets Therasa must give.

 Constraints
 1 <= N <= 100000
 1 <= health score <= 100000

 SAMPLE INPUT
 3
 1
 2
 2
 SAMPLE OUTPUT
 4
 Explanation
 Here 1, 2, 2 is the health score. Note that when two patients have equal health score they are allowed to have different number of tablets. Hence optimal distribution will be 1, 2, 1.
 */

public class TabletDistribution {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        final int N = scanner.nextInt();

        Patient[] arr = new Patient[N];

        for(int i = 0; i < N; i++){
            arr[i].rating = scanner.nextInt();
            arr[i].value = 1;
        }

        int total = 0;
        for(int i = 1; i < N; i++){
            if(arr[i].rating > arr[i-1].rating && arr[i].value <= arr[i-1].value){
                arr[i].value++;
            }else if(arr[i].rating < arr[i-1].rating && arr[i].value >= arr[i-1].value){
                arr[i-1].value++;
            }else if(arr[i].rating == arr[i-1].rating && arr[i].value == arr[i-1].value){
                arr[i-1].value++;
            }
        }

        for(int i = 0; i < N; i++){
            total += arr[i].value;
        }
        System.out.println(total);
    }

    static class Patient{
        int rating;
        int value;
    }
}

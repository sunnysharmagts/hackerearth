package org.sunnyslls.IndiaHacks2017;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * Created by sunny on 24/7/17.
 */
public class RoundTableKillers {

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int K = s.nextInt();
        int X = s.nextInt();
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < N; i++) {
            list.add(i+1);
        }
        int counter = X-1;
        int kill;
        while(list.size() > 1){
            int manWithGun = list.get(counter);
            int whomToKill = manWithGun % K;
            if(whomToKill > 0){
                System.out.println(list.size() +" "+counter +" "+whomToKill);
                kill = counter + whomToKill;
                int size = list.size();
                if(kill >= size){
                    kill = kill-size;
                }
                System.out.println("Man with gun "+manWithGun +" to kill "+list.get(kill));
                list.remove(kill);
                counter = kill;
            }else{
                counter++;
            }
            if(counter >= list.size()){
                counter = counter-list.size();
            }
        }
        System.out.println(list.get(0));
    }
}

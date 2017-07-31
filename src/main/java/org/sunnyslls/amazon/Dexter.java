package org.sunnyslls.amazon;

/**
 * Dexter has you on his kill table now. He gives you one last chance to survive. He gives you a problem to solve. If you solve the problem correctly, he will let you go, else he will kill you.

 You are given
 N
 N integers
 a
 1
 ,
 a
 2
 ,
 ,
 .
 .
 .
 ,
 a
 N
 a1,a2,,...,aN. Consider an
 N
 N-dimensional hyperspace. Let
 (
 x
 1
 ,
 x
 2
 ,
 .
 .
 .
 ,
 x
 N
 )
 (x1,x2,...,xN) be a point in this hyperspace and all
 x
 i
 xi for
 i
 ∈
 [
 1
 ,
 N
 ]
 i∈[1,N] are integers. Now, Dexter gives you a set which contains all the points such that
 0
 ≤
 x
 i
 ≤
 a
 i
 0≤xi≤ai for
 i
 ∈
 [
 1
 ,
 N
 ]
 i∈[1,N]. Find the number of ways to select two points
 A
 A and
 B
 B from this set, such that the midpoint of
 A
 A and
 B
 B also lies in this set.

 As the required number can be really large, find the answer modulo
 10
 9
 +
 7
 109+7.

 Note: The two selected points can be same.

 Input
 First line of input contains a single integer
 N
 N, representing the number of dimensions in the hyperspace. The second line contains
 N
 N integers, the
 i
 t
 h
 ith of them representing
 a
 i
 ai, as defined in the problem.

 Output
 The output contains a single integer, the answer to the problem, modulo
 10
 9
 +
 7
 109+7.

 Constraints
 1
 ≤
 N
 ≤
 10
 5
 1≤N≤105
 0
 ≤
 a
 i
 ≤
 10
 9
 *
 */

import java.util.*;

class Dexter {

    private static final Set<Coordinate> set = new HashSet<>();
    static int count;

    public static void main(String args[] ) throws Exception {

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        List<Integer> dList = new ArrayList<>();
        for(int i = 0; i < N; i++){
            dList.add(scanner.nextInt());
        }
        Collections.sort(dList);
        List<Coordinate> mainList = new ArrayList<>();
        Dexter d = new Dexter();
        d.enumerate(dList.get(dList.size()-1), new ArrayList<>(), mainList);
        System.out.println(mainList);
        set.addAll(mainList);
        d.findMidPoint(mainList, 0, 0);
        System.out.println(count);
    }

    public void enumerate(int n, List<Integer> list, List<Coordinate> mainList){
        if(list.size() >= 2){
            mainList.add(new Coordinate(list.get(0), list.get(1)));
            return;
        }

        for(int i = 0; i <=n; i++){
            if(list.isEmpty() && i == n) return;
            list.add(i);
            enumerate(n, list, mainList);
            list.remove(list.size()-1);
        }
    }

    public void findMidPoint(List<Coordinate> mainList, int k, int index){
        if(k >= mainList.size()-1 || index == mainList.size()){
            return;
        }

        for(int i = k; i < mainList.size(); i++) {
            Coordinate A = mainList.get(i);
            Coordinate B = mainList.get(index);

            int midPointA = (A.x + A.y) / 2;
            int midPointB = (B.x + B.y) / 2;
            if(set.contains(new Coordinate(midPointA, midPointB))){
                count++;
            }
            findMidPoint(mainList, k, index + 1);
        }
    }

    static class Coordinate{
        int x;
        int y;

        Coordinate(int x, int y){
            this.x = x;
            this.y = y;
        }

        @Override
        public int hashCode() {
            int tmp = (y+((x+1)/2));
            return x +(tmp * tmp);
        }

        @Override
        public boolean equals(Object o) {
            Coordinate c = (Coordinate)o;
            return c.x == x && c.y == y;
        }

        @Override
        public String toString() {
            return "("+x +","+y+")";
        }
    }
}

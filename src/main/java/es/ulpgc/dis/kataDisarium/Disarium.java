package es.ulpgc.dis.kataDisarium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Disarium {

    public boolean isDisarium(int number) {
        String stringNumber = String.valueOf(number);
        int sum=0;
        int position = 0;
        while(position < stringNumber.length()){
            sum += Math.pow(Integer.valueOf(stringNumber.substring(position,position+1)),position+1);
            position++;
        }
        return sum==number;
    }

    public List<Integer> calculateDisarium(int lowerLimit, int higherLimit) {

        List<Integer> list = new ArrayList<Integer>();
        for (int i = lowerLimit; i <= higherLimit; i++) {
            if(isDisarium(i)){
                list.add(i);
            }

        }
        return list;
    }


}

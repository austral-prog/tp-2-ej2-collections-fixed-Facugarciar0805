package com.collections;

import java.util.List;

public class Lists {
    public static Integer indexOf(String color, List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(color)) {
                return i;
            }
        }
        return -1;
    }
    public static Integer indexOfByIndex(String color, List<String> list, int index) {
        for (int i = index; i < list.size(); i++) {
            if (list.get(i).equals(color)) {
                return i;
            }
        }
        return -1;
    }
    public static Integer indexOfEmpty(List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).isEmpty()) {
                return i;
            }
        }
        return -1;
    }
    public static Integer put(String color, List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).isEmpty()) {
                list.set(i, color);
                return i;
            }
        }
        return -1;
    }
    public static Integer remove(String color, List<String> list) {
        int counter = 0;
        for(int i = 0; i<list.size(); i++){
            if(list.get(i).equals(color)){
                list.set(i,"");
                counter++;
            }
        }
        return counter;
    }

}

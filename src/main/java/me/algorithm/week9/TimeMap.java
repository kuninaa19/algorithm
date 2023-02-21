package me.algorithm.week9;

import java.util.*;

public class TimeMap {
    private final Map<String, List<List<Object>>> hashMap;

    public TimeMap() {
        hashMap = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {
        if (!hashMap.containsKey(key)) {
            List<List<Object>> initValues = new ArrayList<>();

            hashMap.put(key, initValues);
        }

        List<List<Object>> values = hashMap.get(key);
        List<Object> v = new ArrayList<>(Arrays.asList(value, timestamp));

        values.add(v);
    }

    public String get(String key, int timestamp) {
        String result = "";

        if (!hashMap.containsKey(key)) {
            return result;
        }

        List<List<Object>> values = hashMap.get(key);
        int l = 0;
        int r = values.size() - 1;

        while (l <= r) {
            int m = (l + r) / 2;

            List<Object> v = values.get(m);
            int timestampPrev = (Integer) v.get(1);

            if (timestampPrev <= timestamp) {
                result = (String) v.get(0);

                l = m + 1;
            } else {
                r = m - 1;
            }
        }

        return result;
    }
}
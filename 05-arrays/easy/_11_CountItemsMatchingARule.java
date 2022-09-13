package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _11_CountItemsMatchingARule {
    public static void main(String[] args) {

        List<List<String>> items = new ArrayList<>();
        items.add(Arrays.<String>asList("phone", "blue", "pixel"));
        items.add(Arrays.<String>asList("computer", "silver", "lenovo"));
        items.add(Arrays.<String>asList("phone", "gold", "iphone"));
        String ruleKey = "color", ruleValue = "silver";
//        System.out.println(items);
        int countMatch = countMatches(items,ruleKey,ruleValue);
        System.out.println(countMatch);
    }
    private static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int rk;
        if (ruleKey.equals("type")){
            rk = 0;
        } else if (ruleKey.equals("color")){
            rk = 1;
        }else{
            rk = 2;
        }
        int count = 0;
//        int len = items.size();
        for (List<String> item : items) {
            if (item.get(rk).equals(ruleValue)) {
                count++;
            }
        }
        return count;
    }
}
import java.util.List;
public class E04_CountItemsMatchingRule {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count=0,key;

        //way of switch case
        key = switch (ruleKey) {
            case "type" -> 0;
            case "color" -> 1;
            default -> 2;
        };
        for(int i=0; i<items.size() ; i++){
            if(ruleValue.equals(items.get(i).get(key))){
                count++;
            }
        }
        return count;
    }
    
}

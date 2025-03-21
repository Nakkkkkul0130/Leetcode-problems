class Solution {
    public List<String> findAllRecipes(String[] recipes, List<List<String>> ingredients, String[] supplies) {
        HashSet<String> hs = new HashSet<>(); 
        List<String> l = new ArrayList<>(); 

        for (String s : supplies) {
            hs.add(s);
        }

        boolean flag = true; 
        while (flag) {
            flag = false; 

            for (int i = 0; i < recipes.length; i++) {
                String recipe = recipes[i];

                if (hs.contains(recipe)) continue;

                boolean canMake = true; 

                for (String ing : ingredients.get(i)) {
                    if (!hs.contains(ing)) {
                        canMake = false;
                        break;
                    }
                }

                if (canMake) {
                    hs.add(recipe);
                    l.add(recipe);
                    flag = true; 
                }
            }
        }

        return l; 
    }
}

class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> pascal = new ArrayList<>();
        int i;
        for( i=0;i<=rowIndex;i++)
        {
            List<Integer> row = new ArrayList<>();
            row.add(1);

            for(int j=1;j<i;j++)
            {
                row.add(pascal.get(i-1).get(j-1) + pascal.get(i-1).get(j));
            }
            if(i!=0)
            row.add(1);

            pascal.add(row);
        }
        return pascal.get(rowIndex);
    }
}

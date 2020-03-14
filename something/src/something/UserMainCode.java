package something;

public class UserMainCode {
	public static int checkUnique(String str)
	{
	int[] count = new int[300];
    
    
    int i;
    for (i = 0; i < str.length(); i++) {
             count[(int)str.charAt(i)]++;
    }
    int n = i;
    int cnt=0;
    
    for (i = 0; i < n; i++) 
    {
        if (count[(int)str.charAt(i)] == 1) 
        {
             cnt++;
        }
        }
	return cnt;
	}
}
public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int e = n;
        int s = 1;
        int m = s + (e-s)/2;
        while ( s < e ) {
            
            if(isBadVersion(m)){
                e = m;

            } else {
                s = m + 1;
            }
            m = s + (e-s)/2;
        }
        return m;
    }
}

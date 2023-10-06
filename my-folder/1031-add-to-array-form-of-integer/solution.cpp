class Solution {
public:
    vector<int> addToArrayForm(vector<int>& num, int k) {
        int carry=0;
        for (int i = num.size()-1; i>=0 || k>0 || carry>0; i--) {
            if(k==0 && carry==0) break;
            int sum=0;
            int x=i>=0?num[i]:0;
            sum=x+k%10+carry;
            carry=sum/10;
            if(i>=0){
                num[i]=sum%10;
            }
            else{
                num.emplace(num.begin(),sum%10);
            }
            k/=10;
        }

        return num;
    }
};

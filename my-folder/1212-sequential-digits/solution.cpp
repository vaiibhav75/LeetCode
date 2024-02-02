class Solution {
public:
    vector<int> sequentialDigits(int low, int high) {
        vector<int> ans;

        for (int i = 2; i < 11; i++) {
            long long val = 1;
            long long map = 1;

            for (int j = 1; j < i; j++) {
                long long x = val % 10;
                val *= 10;
                val += (x + 1);

                map *= 10;
                map += 1;
            }

            for (int j = 0; j < 10 - i; j++) {
                if (val >= low && val <= high) {
                    ans.push_back(static_cast<int>(val));
                }
                val += map;
            }
        }

        return ans;
    }
};


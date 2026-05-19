class Solution {
public:
    int getSum(int a, int b) {
        //   1 0 0
        //   1 1 1
        // 1 0 1 1

        while(b != 0){
            unsigned carry = (unsigned)(a & b);

            a = a ^ b;

            b = carry << 1;
        }

        return a;
    }
};

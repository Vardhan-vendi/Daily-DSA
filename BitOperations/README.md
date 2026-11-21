1.   n & (n-1)  ----> make the RSB to '0'
                ----> n-1   ===> RSB --->0
                            ===> right part alter bits
                            ===> left part same

2.  n & -n      ---> get RSB only
                --->  -n    ===> RSB --->1
                            ===> right part same i.e; 0
                            ===> left part alter bits

3. for any odd numbers ,LSB is always '1'
        (n & 1) == 0 -->even
                != 0 --> odd

4. for any power of
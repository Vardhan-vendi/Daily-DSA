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

4. for any power of 2 ,it only holds only 1 bit , in its  entire bit pattern .
        powOf2 ===> n>0 AND( n & (n-1)) ==0 i.e; making RSB to '0' 

5. to git the right most set bit , we need to get the position ,i.e; the power value of the 2 
        to get that power , use 'log base 2' i.e;
                        n = log 2 with base 2

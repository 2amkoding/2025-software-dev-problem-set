```plaintext
## using vimMotions ayyy~

Input: height = [1,8,6,2,5,4,8,3,7]
                 L               R 
        index =  0,1,2,3,4,5,6,7,8

width:  R - L == 8 - 0 == 8
//because the indices increase from L to R, so R-L  gives the positive # of distance between 2 heights

area = H * W

L vs R, we want the shorter height to prevent overflow

area = min(height[l], height[r]) * (R-L)

maxArea == 1 * 8 == 8

two pointers
        height = [1,8,6,2,5,4,8,3,7]
                    L             R 
        index =   0,1,2,3,4,5,6,7,8
area == 7 * 7 == 49
maxArea == 48 //

```
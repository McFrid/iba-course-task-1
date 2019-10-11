package by.iba;

class Fibonacci {

    long F(int order) {
        if (order<=0)
        {
            if(order==0)
            {
                return 0;
            }
            else
            if(order==-1)
            {return -1;}
            else {
                return F(order + 1) + F(order + 2);
            }
        }
        else {
            if(order==0)
            {
                return 0;
            }
            else
            if(order==1)
            {return 1;}
            else {
                return F(order - 1) + F(order - 2);
            }
        }
    }


}

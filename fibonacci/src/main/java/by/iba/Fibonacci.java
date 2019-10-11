package by.iba;

class Fibonacci {

    long F(float order) {
        if(order == 0)
            return 0;
        if(Math.abs(order) < 3)
            return (long)Math.signum(order);
        return F(order-Math.signum(order)) + F(order-2*Math.signum(order));
    }
}
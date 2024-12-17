#include<bits/stdc++.h>
using namespace std;
double e=1e-9,dx=.5;
double a=2,b=4;


inline double f(double x)
{
    return 1.0/((x-1)*(x-1));
}

int main()
{
    double x=a,sum=0;
    while(x+dx<=b+e)
    {
        sum+=dx*.5*(f(x+dx)+f(x));
        x=x+dx;
    }
    printf("%lf\n",sum);
    x=a,sum=0;
    while(x+2*dx<=b+e)
    {
        sum+=(dx/3)*(f(x)+4*f(x+dx)+f(x+2*dx));
        x+=2*dx;
    }
    printf("%lf",sum);
        
}
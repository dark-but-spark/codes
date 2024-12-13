#include<bits/stdc++.h>
using namespace std;
double e=1e-9,dx=1e-8;
double a=1,b=2;


inline double f(double x)
{
    return x*x;
}

int main()
{
    double x=a,sum=0;
    while(x<b+e)
    {
        sum+=dx*.5*(f(x+dx)+f(x));
        x=x+dx;
    }
    printf("%lf",sum);
        
}
//hcf_lcm_package.java : write a package to calculate hcf, lcm, of 2 no.

package mypackage;
public class hcf_lcm_package
{
public int hcf(int a,int b)
{
int r;
while((r=a%b)!=0)
{
a=b;
b=r;
}
return b;
}
public int lcm(int a,int b)
{
int lc;
lc=a*b/hcf(a,b);
return lc;
}
}
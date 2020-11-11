package com.test;

class A extends C
{

B b;
A(){};
A(B b){
this.b=b;
}
}

class B
{
C c;
A a;
B(){};
B(A a, C c){
this.a=a;
this.c=c;
}
}

class C
{
B b;
C(){};
C(B b)
{
this.b=b;
}
}

public class Test1 {

public static void main(String[] args) 
{
B x=new B(new A(),new C());
A a=new A(x);
C c=new C(x);
 a.b.c=c.b.a;
}

}

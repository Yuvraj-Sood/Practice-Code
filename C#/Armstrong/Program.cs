using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Armstrong
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int n, r, sum=0, t;
            Console.WriteLine("Enter a Number : ");
            n=Int32.Parse(Console.ReadLine());
            t = n;
            while(t>0)
            {
                r = t % 10;
                sum = sum + (r * r * r);
                t = t / 10;
            }
            if(sum==n)
            {
                Console.WriteLine("Armstrong Number");
            }
            else
            {
                Console.WriteLine("Not");
            }
            Console.ReadLine();
        }
    }
}

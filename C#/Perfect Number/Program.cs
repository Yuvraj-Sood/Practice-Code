using System;
using System.Collections.Generic;
using System.Diagnostics.CodeAnalysis;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Perfect_Number
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.Write("Enter a Number : ");
            int n=Int32.Parse(Console.ReadLine());
            int i,sum=0;
            for(i=1;i<n;i++)
            {
                if(n%i==0)
                {
                    sum=sum+i;
                }
            }
            if(n==sum)
            {
                Console.WriteLine("Perfect Number ");
            }
            else
            { 
                Console.WriteLine("Not");
            }
            Console.ReadLine();
        }
    }
}

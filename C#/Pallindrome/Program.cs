using Microsoft.Win32;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Pallindrome
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.Write("Enter a Number : ");
            int n=Int32.Parse(Console.ReadLine());
            int t = n, rev = 0, r;
            while(t>0)
            {
                r = t % 10;
                rev = rev * 10 + r;
                t = t / 10;
            }
            if(rev==n) 
            {
                Console.WriteLine("Pallindrome Number ");
            }
            else
            {
                Console.WriteLine("Not");
            }
            Console.ReadLine();
        }
    }
}

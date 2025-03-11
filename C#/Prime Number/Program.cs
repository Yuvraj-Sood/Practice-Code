using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Prime_Number
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.Write("Enter a Number : ");
            int n=Int32.Parse(Console.ReadLine());
            int sq=(int)(Math.Sqrt(n));
            int i,c=0;
            for(i=2;i<=sq; i++)
            {
                if(n%i==0)
                {
                    c++;
                    break;
                }
            }
            if(c==0)
            {
                Console.WriteLine("Prime Number");
            }
            else
            {
                Console.WriteLine("Not");
            }
            Console.ReadLine(); 
        }
    }
}

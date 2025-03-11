using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Prime_Number_1_200
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int i,j, c = 0;
            Console.Write("Prime Numbers From 1-200 are : ");
            for(i=1;i<=200;i++)
            {
                int t = i;
                c = 0;
                int sq = (int)(Math.Sqrt(t));
                for (j = 2; j <= sq; j++)
                {
                    if (t % j == 0)
                    {
                        c++;
                        break;
                    }
                }
                if (c == 0)
                {
                    Console.Write(i + " ");
                }
            }
            Console.ReadLine();
        }
    }
}

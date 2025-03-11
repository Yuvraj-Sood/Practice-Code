using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Perfect_Number_2_1000
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.Write("Perfect Numbers from 2-1000 are : ");
            int i,j, sum = 0;
            for(i=2; i<1000; i++)
            {
                sum = 0;
                int t = i;
                for(j=1;j<t;j++)
                {
                    if (t % j == 0)
                    {
                        sum = sum + j;
                    }
                }
                if (i == sum)
                {
                    Console.Write(i + " ");
                }
            }
            Console.ReadLine();
        }
    }
}

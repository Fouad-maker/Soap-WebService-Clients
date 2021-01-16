using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp1
{
    class Program
    {
        static void Main(string[] args)
        {
            ServiceReference1.BanqueServiceClient stub = new ServiceReference1.BanqueServiceClient();
            Console.WriteLine(stub.ConversionEuroTND(300));

            ServiceReference1.account act = stub.getAccount(4);
            Console.WriteLine("Sold" + act.sold);
            ServiceReference1.account[] acts = stub.accountList();

            foreach (var ac in acts)
            {
                Console.WriteLine("*****************");

                Console.WriteLine("sold::!!" + ac.sold);
            }

            Console.ReadLine();

        }
    }
}

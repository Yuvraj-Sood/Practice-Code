using System.Data.SqlClient;
using System.ComponentModel.DataAnnotations.Schema;
namespace WinFormsApp1
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void label2_Click(object sender, EventArgs e)
        {

        }

        private void button1_Click(object sender, EventArgs e)
        {
            SqlConnection con = new SqlConnection("server=localhost\\MSSQLSERVER01;Initial Catalog=master;Integrated Security=True");
            SqlCommand cmd = new SqlCommand("SELECT * FROM employee", con);
            con.Open();
            SqlDataReader dr;
            dr = cmd.ExecuteReader();
            while (dr.Read())
            {
                listBox1.Items.Add(dr.GetString(0));
                listBox2.Items.Add(dr.GetString(1));
            }
            con.Close();
        }
    }
}
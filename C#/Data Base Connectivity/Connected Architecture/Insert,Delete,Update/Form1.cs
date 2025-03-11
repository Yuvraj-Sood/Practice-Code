using System.Data.SqlClient;
namespace Insert_Delete_Update
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            SqlConnection con = new SqlConnection("server=localhost\\MSSQLSERVER01;Initial Catalog=master;Integrated Security=True");
            SqlCommand cmd = new SqlCommand("INSERT INTO emp VALUES('" + textBox1.Text + "','" + textBox2.Text + "','" + textBox3.Text + "')", con);
            con.Open();
            cmd.ExecuteNonQuery();
            con.Close();
        }

        private void button2_Click(object sender, EventArgs e)
        {
            SqlConnection con = new SqlConnection("server=localhost\\MSSQLSERVER01;Initial Catalog=master;Integrated Security=True");
            SqlCommand cmd = new SqlCommand("DELETE FROM emp WHERE eid = ('" + textBox1.Text + "')", con);
            con.Open();
            cmd.ExecuteNonQuery();
            con.Close();
        }

        private void button3_Click(object sender, EventArgs e)
        {
            SqlConnection con = new SqlConnection("server=localhost\\MSSQLSERVER01;Initial Catalog=master;Integrated Security=True");
            SqlCommand cmd = new SqlCommand("UPDATE emp SET ename = ('" + textBox2.Text + "') , eadd = ('" + textBox3.Text + "') WHERE eid = ('" + textBox1.Text + "')", con);
            con.Open();
            cmd.ExecuteNonQuery();
            con.Close();
        }

        private void button4_Click(object sender, EventArgs e)
        {
            SqlConnection con = new SqlConnection("server=localhost\\MSSQLSERVER01;Initial Catalog=master;Integrated Security=True");
            SqlCommand cmd = new SqlCommand("SELECT * FROM emp", con);
            con.Open();
            cmd.ExecuteReader();
            con.Close();
        }
    }
}
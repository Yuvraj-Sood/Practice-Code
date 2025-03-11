using System.Data;
using System.Data.SqlClient;
namespace Display
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            SqlConnection con = new SqlConnection();
            SqlDataAdapter da = new SqlDataAdapter("SELECT * FROM emp", con);
            DataSet ds = new DataSet();
            da.Fill(ds,"emp");
            DataGridView = ds.Tables[0];
        }
    }
}
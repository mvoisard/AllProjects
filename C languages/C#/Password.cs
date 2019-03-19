// Name:        Max Voisard
// Class:       Adv Program Using C# CIT223S
// Date:        4/3/17
// Assignment:  Chapter 9 Programming Challenge

using System;
using System.Windows.Forms;

namespace Password
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void Form1_Load(object sender, EventArgs e)
        {
        }

        private void btnPassword1_Click(object sender, EventArgs e)
        {
            lblReenter.Visible = true;      // Making label to prompt user to reenter password visible
            txtPassword2.Visible = true;    // Making text box to enter second password visible
            btnPassword2.Visible = true;    // Making the second button saying "Done" visible
            txtPassword2.Focus();           // Putting the cursor on the text box to enter password again 
        }

        private void btnPassword2_Click(object sender, EventArgs e)
        {
            if (txtPassword2.Text == txtPassword1.Text)   // If-else statement making sure passwords from both text boxes match
            {
            }
            else
            {
                MessageBox.Show("Your passwords do not match.");  // If passwords don't match, display error message saying so
            }
        }

        private void btnReset_Click(object sender, EventArgs e)
        {
            txtPassword1.Clear();              // Clearing text box for user to enter password in again
            txtPassword2.Clear();              // Clearing text box for user to enter password again
            txtPassword2.Visible = false;      // Making the second text box invisible again
            lblReenter.Visible = false;        // Making label prompting for reentering password invisible again
            btnPassword2.Visible = false;      // Making button after second text box invisible again
            txtPassword1.Focus();              // Putting cursor on first text box for user to enter password
        }
    }
}

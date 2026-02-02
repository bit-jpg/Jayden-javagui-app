// TODO: FIX THIS SHIT LATER
package guiApp;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.DefaultComboBoxModel;

public class Grades extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField Field_IDNUM;
	private JTextField Field_LRN;
	private JTextField Field_FamilyName;
	private JTextField Field_FirstName;
	private JTextField Field_MiddleName;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_10;
	private JTextField textField_5;
	private JTextField textField_13;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Grades frame = new Grades();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Grades() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1158, 762);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(4, 1, 0, 2));
		
		JPanel Panel_Header = new JPanel();
		Panel_Header.setBackground(new Color(255, 255, 255));
		contentPane.add(Panel_Header);
		Panel_Header.setLayout(null);
		
		JLabel Label_BCTLOGO = new JLabel("");
		Label_BCTLOGO.setBounds(12, 12, 50, 50);
		Label_BCTLOGO.setIcon(new ImageIcon("F:\\logo2.jpg"));
		Panel_Header.add(Label_BCTLOGO);
		
		JLabel Label_BCT = new JLabel("BAGUIO COLLEGE OF TECHNOLOGY");
		Label_BCT.setBounds(72, 12, 394, 24);
		Label_BCT.setFont(new Font("Droid Sans", Font.BOLD, 20));
		Panel_Header.add(Label_BCT);
		
		JLabel InfoText_SHS = new JLabel("SENIOR HIGH SCHOOL");
		InfoText_SHS.setBounds(943, 30, 193, 15);
		InfoText_SHS.setFont(new Font("Dialog", Font.BOLD, 12));
		InfoText_SHS.setHorizontalAlignment(SwingConstants.RIGHT);
		Panel_Header.add(InfoText_SHS);
		
		JLabel InfoText_CERT = new JLabel("CERTIFICATE OF REGISTRATION");
		InfoText_CERT.setBounds(926, 12, 210, 15);
		InfoText_CERT.setFont(new Font("Dialog", Font.BOLD, 12));
		InfoText_CERT.setHorizontalAlignment(SwingConstants.RIGHT);
		Panel_Header.add(InfoText_CERT);
		
		JLabel InfoText_RsC = new JLabel("Registrar's Copy");
		InfoText_RsC.setBounds(1009, 47, 127, 15);
		InfoText_RsC.setFont(new Font("Dialog", Font.BOLD, 12));
		InfoText_RsC.setHorizontalAlignment(SwingConstants.RIGHT);
		Panel_Header.add(InfoText_RsC);
		
		JLabel Label_SEMESTER = new JLabel("Semester");
		Label_SEMESTER.setBounds(64, 50, 70, 15);
		Panel_Header.add(Label_SEMESTER);
		
		JComboBox ComboBox_Semester = new JComboBox();
		ComboBox_Semester.setBounds(139, 45, 113, 24);
		Panel_Header.add(ComboBox_Semester);
		
		JLabel Label_SY = new JLabel("School Year");
		Label_SY.setBounds(273, 50, 83, 15);
		Panel_Header.add(Label_SY);
		
		JComboBox ComboBox_SY = new JComboBox();
		ComboBox_SY.setBounds(367, 45, 70, 24);
		Panel_Header.add(ComboBox_SY);
		
		JLabel Label_Date = new JLabel("Date");
		Label_Date.setBounds(720, 50, 40, 15);
		Panel_Header.add(Label_Date);
		
		JComboBox ComboBox_Date = new JComboBox();
		ComboBox_Date.setBounds(761, 45, 70, 24);
		Panel_Header.add(ComboBox_Date);
		
		JLabel Label_IDNO = new JLabel("ID. NO");
		Label_IDNO.setBounds(12, 84, 50, 14);
		Panel_Header.add(Label_IDNO);
		
		JLabel Label_NAME = new JLabel("Name:");
		Label_NAME.setBounds(12, 117, 45, 15);
		Panel_Header.add(Label_NAME);
		
		Field_IDNUM = new JTextField();
		Field_IDNUM.setBounds(64, 82, 86, 20);
		Panel_Header.add(Field_IDNUM);
		Field_IDNUM.setColumns(10);
		
		JLabel Label_STRAND = new JLabel("SHS STRAND");
		Label_STRAND.setBounds(168, 83, 87, 15);
		Panel_Header.add(Label_STRAND);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(260, 80, 153, 22);
		Panel_Header.add(comboBox);
		
		JLabel Label_GRADE = new JLabel("Grade");
		Label_GRADE.setBounds(517, 77, 43, 15);
		Panel_Header.add(Label_GRADE);
		
		JComboBox ComboBox_Grade = new JComboBox();
		ComboBox_Grade.setBounds(567, 74, 70, 22);
		Panel_Header.add(ComboBox_Grade);
		
		JLabel Label_LRN = new JLabel("LRN. NO");
		Label_LRN.setBounds(696, 76, 57, 15);
		Panel_Header.add(Label_LRN);
		
		Field_LRN = new JTextField();
		Field_LRN.setColumns(10);
		Field_LRN.setBounds(762, 74, 161, 20);
		Panel_Header.add(Field_LRN);
		
		Field_FamilyName = new JTextField();
		Field_FamilyName.setColumns(10);
		Field_FamilyName.setBounds(64, 115, 248, 20);
		Panel_Header.add(Field_FamilyName);
		
		Field_FirstName = new JTextField();
		Field_FirstName.setColumns(10);
		Field_FirstName.setBounds(333, 115, 248, 20);
		Panel_Header.add(Field_FirstName);
		
		Field_MiddleName = new JTextField();
		Field_MiddleName.setColumns(10);
		Field_MiddleName.setBounds(604, 115, 248, 20);
		Panel_Header.add(Field_MiddleName);
		
		JLabel Label_FIRSTNAME = new JLabel("Family Name");
		Label_FIRSTNAME.setFont(new Font("Tahoma", Font.BOLD, 11));
		Label_FIRSTNAME.setHorizontalAlignment(SwingConstants.CENTER);
		Label_FIRSTNAME.setBounds(146, 135, 82, 14);
		Panel_Header.add(Label_FIRSTNAME);
		
		JLabel Label_FIRSTNAME_1 = new JLabel("First Name");
		Label_FIRSTNAME_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		Label_FIRSTNAME_1.setHorizontalAlignment(SwingConstants.CENTER);
		Label_FIRSTNAME_1.setBounds(421, 135, 70, 15);
		Panel_Header.add(Label_FIRSTNAME_1);
		
		JLabel Label_FIRSTNAME_2 = new JLabel("Middle Name");
		Label_FIRSTNAME_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		Label_FIRSTNAME_2.setHorizontalAlignment(SwingConstants.CENTER);
		Label_FIRSTNAME_2.setBounds(690, 135, 83, 14);
		Panel_Header.add(Label_FIRSTNAME_2);
		
		JPanel Panel_Personalinformation = new JPanel();
		Panel_Personalinformation.setBackground(new Color(255, 255, 255));
		contentPane.add(Panel_Personalinformation);
		Panel_Personalinformation.setLayout(null);
		
		JLabel Label_PERSONALINFO = new JLabel("PERSONAL INFORMATION");
		Label_PERSONALINFO.setFont(new Font("Tahoma", Font.BOLD, 15));
		Label_PERSONALINFO.setBounds(10, 11, 212, 18);
		Panel_Personalinformation.add(Label_PERSONALINFO);
		
		JLabel lblNewLabel = new JLabel("Gender: ");
		lblNewLabel.setBounds(10, 41, 61, 15);
		Panel_Personalinformation.add(lblNewLabel);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Male", "Female"}));
		comboBox_1.setBounds(70, 37, 72, 22);
		Panel_Personalinformation.add(comboBox_1);
		
		JLabel Label_CIVILSTATS = new JLabel("Civil Status:");
		Label_CIVILSTATS.setBounds(157, 41, 84, 15);
		Panel_Personalinformation.add(Label_CIVILSTATS);
		
		JComboBox ComboBox_CIVILSTATS = new JComboBox();
		ComboBox_CIVILSTATS.setModel(new DefaultComboBoxModel(new String[] {"Single", "Married", "No Label", "M.U", "Bi-sexual", "Alien"}));
		ComboBox_CIVILSTATS.setBounds(249, 37, 86, 22);
		Panel_Personalinformation.add(ComboBox_CIVILSTATS);
		
		JLabel lblReligion = new JLabel("Religion");
		lblReligion.setBounds(366, 41, 70, 15);
		Panel_Personalinformation.add(lblReligion);
		
		textField = new JTextField();
		textField.setBounds(429, 39, 114, 19);
		Panel_Personalinformation.add(textField);
		textField.setColumns(10);
		
		JLabel lblReligion_1 = new JLabel("Nationaity");
		lblReligion_1.setBounds(580, 39, 74, 15);
		Panel_Personalinformation.add(lblReligion_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(653, 39, 114, 19);
		Panel_Personalinformation.add(textField_1);
		
		JLabel lblReligion_2 = new JLabel("Birthdate");
		lblReligion_2.setBounds(10, 70, 70, 15);
		Panel_Personalinformation.add(lblReligion_2);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(83, 70, 114, 19);
		Panel_Personalinformation.add(textField_2);
		
		JLabel lblReligion_3 = new JLabel("Birthplace");
		lblReligion_3.setBounds(215, 70, 72, 15);
		Panel_Personalinformation.add(lblReligion_3);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(230, 105, 200, 19);
		Panel_Personalinformation.add(textField_3);
		
		JLabel lblReligion_4 = new JLabel("Mother Touge");
		lblReligion_4.setBounds(407, 70, 99, 15);
		Panel_Personalinformation.add(lblReligion_4);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(510, 70, 114, 19);
		Panel_Personalinformation.add(textField_4);
		
		JLabel lblReligion_2_1 = new JLabel("Home Address");
		lblReligion_2_1.setBounds(10, 107, 102, 15);
		Panel_Personalinformation.add(lblReligion_2_1);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(115, 105, 100, 19);
		Panel_Personalinformation.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(292, 70, 110, 19);
		Panel_Personalinformation.add(textField_7);
		
		JLabel lblReligion_2_1_1 = new JLabel("Pernament Address");
		lblReligion_2_1_1.setBounds(10, 136, 140, 15);
		Panel_Personalinformation.add(lblReligion_2_1_1);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(445, 105, 200, 19);
		Panel_Personalinformation.add(textField_10);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(660, 105, 200, 19);
		Panel_Personalinformation.add(textField_5);
		
		JLabel lblReligion_4_1 = new JLabel("Ethnic Group");
		lblReligion_4_1.setBounds(653, 70, 90, 15);
		Panel_Personalinformation.add(lblReligion_4_1);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(749, 70, 114, 19);
		Panel_Personalinformation.add(textField_13);
		
		JPanel Panel_FamilyBackground = new JPanel();
		Panel_FamilyBackground.setBackground(new Color(255, 255, 255));
		contentPane.add(Panel_FamilyBackground);
		Panel_FamilyBackground.setLayout(null);
		
		JLabel Label_PERSONALINFO_1 = new JLabel("FAMILY BACKGROUND");
		Label_PERSONALINFO_1.setBounds(10, 11, 185, 19);
		Label_PERSONALINFO_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		Panel_FamilyBackground.add(Label_PERSONALINFO_1);
		
		JPanel Panel_EducationalBackground = new JPanel();
		Panel_EducationalBackground.setBackground(new Color(255, 255, 255));
		contentPane.add(Panel_EducationalBackground);
		Panel_EducationalBackground.setLayout(null);
		
		JLabel Label_PERSONALINFO_1_1 = new JLabel("EDUCATIONAL BACKGROUND");
		Label_PERSONALINFO_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		Label_PERSONALINFO_1_1.setBounds(10, 11, 239, 18);
		Panel_EducationalBackground.add(Label_PERSONALINFO_1_1);

	}
}
